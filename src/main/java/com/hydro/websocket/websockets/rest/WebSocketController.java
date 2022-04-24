package com.hydro.websocket.websockets.rest;

import com.hydro.websocket.websockets.domain.*;

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
     * @param profile The updated system settings.
     * @throws Exception
     */
    @PostMapping("/update-data")
    public void sendSystemUpdate(@RequestBody CurrentSystemSettings settings) throws Exception {
        template.convertAndSend("/topic/update-system", settings);
    }

    /**
     * Method to live control certain aspects of the hydroponics system.
     * 
     * @param cmds List of util commands to send to the hydro system.
     * @throws Exception
     */
    @PostMapping("/update-util")
    public void sendSystemUpdate(@RequestBody HydroCommand[] cmds) throws Exception {
        template.convertAndSend("/topic/util", cmds);
    }
}
