package com.google.test_group.controller;

public class ReservationRequest {
    private String src;
    private String dest;

    public ReservationRequest() {
    }

    public ReservationRequest(String src, String dest) {
        this.src = src;
        this.dest = dest;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}