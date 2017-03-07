package com.example.VOs;

import java.util.Date;

/**
 * Created by dmpr0116 on 07.03.2017.
 */
public class BuildingVO {
    private int id;
    private String address;
    private Date acquisiotionDate;
    private Date constructionDate;
    private Date dateOfSale;
    private boolean manageable;
    private String comment;
    private int ownerAccountId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAcquisiotionDate() {
        return acquisiotionDate;
    }

    public void setAcquisiotionDate(Date acquisiotionDate) {
        this.acquisiotionDate = acquisiotionDate;
    }

    public Date getConstructionDate() {
        return constructionDate;
    }

    public void setConstructionDate(Date constructionDate) {
        this.constructionDate = constructionDate;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public boolean isManageable() {
        return manageable;
    }

    public void setManageable(boolean manageable) {
        this.manageable = manageable;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(int ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }
}
