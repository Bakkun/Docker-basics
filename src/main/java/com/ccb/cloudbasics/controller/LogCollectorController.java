package com.ccb.cloudbasics.controller;

import com.ccb.cloudbasics.service.LogCollectorService;
import com.ccb.cloudbasics.service.LogCollectorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogCollectorController {
    LogCollectorService logCollectorService = new LogCollectorServiceImpl();

    @GetMapping("/logs")
    public String showLogs() {
        return logCollectorService.getAllLogs(logCollectorService.getAllFiles("src/log", ".log"));
    }
}
