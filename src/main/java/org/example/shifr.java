package org.example;
import java.util.Base64;

public class shifr implements messagetext{
    public String process(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
