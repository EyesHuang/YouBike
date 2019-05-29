package com.yt.youbike;

public class Bike {
    private String name;
    private String address;
    private String totalNumber;
    private String lendNumber;
    private String returnNumber;
    private String latitude;
    private String longitude;

    public Bike(String name, String address,
                String totalNumber, String lendNumber,
                String returnNumbe, String latitude,
                String longitude) {
        this.name = name;
        this.address = address;
        this.totalNumber = totalNumber;
        this.lendNumber = lendNumber;
        this.returnNumber = returnNumbe;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTotalNumber() {
        return totalNumber;
    }

    public String getLendNumber() {
        return lendNumber;
    }

    public String getReturnNumber() {
        return returnNumber;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
