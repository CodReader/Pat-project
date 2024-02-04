package org.config.patproject.configuration;

import lombok.extern.slf4j.Slf4j;
import org.config.patproject.service.AddFilesInDatabaseService;

import java.io.IOException;

@Slf4j
public class StartPoint {
    public static void main(String[] args) throws IOException {
        AddFilesInDatabaseService addFilesInDatabaseService = new AddFilesInDatabaseService();
        addFilesInDatabaseService.readFile();
        log.info("Program worked successful \n " + addFilesInDatabaseService.readFile());
    }
}
