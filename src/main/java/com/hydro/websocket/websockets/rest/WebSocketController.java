package com.hydro.websocket.websockets.rest;

import com.hydro.websocket.websockets.domain.GrowProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WebSocketController for notifications
 * 
 * @author Sam Butler
 * @since Dec 13, 2020
 */
@RestController
@CrossOrigin
@RequestMapping("/api/hydro-system")
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate template;

    /**
     * Method that will send a {@link GrowProfile} to the Pi and update the embedded
     * system settings
     * 
     * @param profile The updated grow profile.
     * @throws Exception
     */
    @PostMapping("/update-data")
    public void sendSystemUpdate(@RequestBody GrowProfile profile) throws Exception {
        template.convertAndSend("/topic/update-system", profile);
    }

    /**
     * Method to determine to turn the lights on or off.
     * 
     * @param lightsOn Status of the lights.
     * @throws Exception
     */
    @PostMapping("/lights")
    public void sendSystemUpdate(@RequestBody Boolean lightsOn) throws Exception {
        template.convertAndSend("/topic/lights", lightsOn);
    }
}
