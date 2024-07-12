package com.jcarloshg.restcrud.rest;

public class ErrorResponse {

    private int status;
    private String message;
    private long timeStamp;
    private String message02 = "FUUUUUCK";

    public ErrorResponse() {
    }

    public String getMessage02() {
        return message02;
    }

    public void setMessage02(String message02) {
        this.message02 = message02;
    }

    public ErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

}
