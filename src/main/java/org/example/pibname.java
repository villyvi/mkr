package org.example;
public class pibname implements messagetext {
    private final String authorName;

    public pibname(String authorName) {
        this.authorName = authorName;
    }

    public String process(String message) {
        return authorName + ": " + message;
    }
}