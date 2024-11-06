package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class timeAndDate implements messagetext {
    public String process(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);
        return timestamp + " - " + message;
    }
}