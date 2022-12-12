package com.in.web.controller;

import java.util.Date;

public class ExceptionResponse {

    private Date time;
    private String message;
    private String details;

    public ExceptionResponse(Date time, String message, String details) {
        this.time = time;
        this.message = message;
        this.details = details;
    }

    public Date getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
