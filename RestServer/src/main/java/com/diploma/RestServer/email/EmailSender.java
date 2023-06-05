package com.diploma.RestServer.email;

public interface EmailSender {
    void send(String to, String email);
}
