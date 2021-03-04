package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mail.credentials")
public class Credentials {
    private String username;
    private String password;
    private String authMethod;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authMethod='" + authMethod + '\'' +
                '}';
    }
}
