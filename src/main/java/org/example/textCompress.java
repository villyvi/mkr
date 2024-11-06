package org.example;

public class textCompress implements messagetext {
    public String process(String message) {
        return message.replaceAll("\\s+", " ").trim();
    }
}
