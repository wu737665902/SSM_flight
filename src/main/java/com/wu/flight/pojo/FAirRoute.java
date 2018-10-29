package com.wu.flight.pojo;


public class FAirRoute {

    private Integer id; //
    private String airportStart; //
    private String airportEnd; //
    private String airportEndSpare; //
    private double mileage; //
    private String addTime; //


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getAirportStart() {
        return airportStart;
    }

    public void setAirportStart(String airportStart) {
        this.airportStart = airportStart;
    }


    public String getAirportEnd() {
        return airportEnd;
    }

    public void setAirportEnd(String airportEnd) {
        this.airportEnd = airportEnd;
    }


    public String getAirportEndSpare() {
        return airportEndSpare;
    }

    public void setAirportEndSpare(String airportEndSpare) {
        this.airportEndSpare = airportEndSpare;
    }


    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }


    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

}
