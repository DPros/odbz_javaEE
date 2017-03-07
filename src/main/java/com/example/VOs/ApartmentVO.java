package com.example.VOs;

import java.util.Date;

/**
 * Created by dmpr0116 on 07.03.2017.
 */
public class ApartmentVO {
    private int id;
    private String number;
    private Date availableSince;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getAvailableSince() {
        return availableSince;
    }

    public void setAvailableSince(Date availableSince) {
        this.availableSince = availableSince;
    }
}