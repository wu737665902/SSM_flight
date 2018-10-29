package com.wu.flight.pojo;


public class FFlightReportDay {

    private Integer id; //
    private Integer day; //
    private Integer flights; //
    private Integer normalFlights; //
    private Integer passengers; //
    private Integer cargoWeight; //
    private Integer rtype; //
    private String addTime; //


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }


    public Integer getFlights() {
        return flights;
    }

    public void setFlights(Integer flights) {
        this.flights = flights;
    }


    public Integer getNormalFlights() {
        return normalFlights;
    }

    public void setNormalFlights(Integer normalFlights) {
        this.normalFlights = normalFlights;
    }


    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }


    public Integer getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Integer cargoWeight) {
        this.cargoWeight = cargoWeight;
    }


    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }


    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

}
