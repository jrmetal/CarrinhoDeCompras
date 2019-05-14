package com.carrinhoDeCompras.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity()
@Table(name = "Product", uniqueConstraints = {})
@DiscriminatorValue(value = "Product")
public class Product implements Serializable {

    @Transient
    public static final String PROPERTY_ID = "ID";

    private static final long serialVersionUID = 1L;
    @Column(name = "ID", length = 255, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Transient
    public static final String PROPERTY_DESCRIPTION = "description";

    @Column(name = "Description", length = 340, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String description;

    @Transient
    public static final String PROPERTY_BAR_CODE = "barCode";

    @Column(name = "BarCode", length = 70, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String barCode;

    @Transient
    public static final String PROPERTY_STATUS = "status";

    @Column(name = "Status", length = 1, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private char status = 'A';

    @Transient
    public static final String PROPERTY_CREATE_TIME = "createdTime";

    @Column(name = "CreatedTime", length = 255, scale = 0, precision = 0, nullable = true, unique = false, insertable = true, updatable = true)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdTime;

    @Transient
    public static final String PROPERTY_MEASUREMENT = "measurement";

    @Column(name = "Measurement", length = 6, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String measurement = "UN";

    @Transient
    public static final String PROPERTY_IMG = "img";

    @Column(name = "Img", length = 240, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String img;

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

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", description=" + description + ", barCode=" + barCode + ", status=" + status + ", createdTime=" + createdTime + ", measurement=" + measurement + ", img=" + img + '}';
    }

}
