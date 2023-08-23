package com.workintech.dependency.mapping;

import com.workintech.dependency.model.Developer;

public class DeveloperResponse {
    private Developer developer;
    private String message;
    private int status;

    public DeveloperResponse(Developer developer, String message, int status) {
        this.developer = developer;
        this.message = message;
        this.status = status;
    }
}
