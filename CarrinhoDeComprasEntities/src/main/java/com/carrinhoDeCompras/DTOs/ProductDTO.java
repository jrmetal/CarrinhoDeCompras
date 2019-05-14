package com.carrinhoDeCompras.DTOs;

import java.io.Serializable;
import java.util.Date;

public class ProductDTO implements Serializable {

    private Long id;

    private String description;

    private String barCode;

    private char status;

    private Date createdTime;

    private String measurement;

    private String img;

    private boolean deletedFlag;

    public ProductDTO(Long id, String description, String barCode, char status, Date createdTime, String measurement, String img, boolean deletedFlag) {
        this.id = id;
        this.description = description;
        this.barCode = barCode;
        this.status = status;
        this.createdTime = createdTime;
        this.measurement = measurement;
        this.img = img;
        this.deletedFlag = deletedFlag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    @Override
    public String toString() {
        return "ProductDTO{" + "id=" + id + ", description=" + description + ", barCode=" + barCode + ", status=" + status + ", createdTime=" + createdTime + ", measurement=" + measurement + ", img=" + img + ", deletedFlag=" + deletedFlag + '}';
    }
}
