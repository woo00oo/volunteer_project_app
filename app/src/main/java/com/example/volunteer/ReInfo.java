package com.example.volunteer;

public class ReInfo {
    private String publisher;
    private String name;
    private String memo;
    private String airport;
    private String pet;

    public ReInfo(String publisher, String name, String memo, String airport, String pet) {
        this.publisher = publisher;
        this.name = name;
        this.memo = memo;
        this.airport = airport;
        this.pet = pet;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getName() {
        return name;
    }

    public String getMemo() {
        return memo;
    }

    public String getAirport() {
        return airport;
    }

    public String getPet() {
        return pet;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }
}
