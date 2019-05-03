package com.carrinhoDeCompras.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
    public static final String PROPERTY_NOME = "nome";

    @Column(name = "Nome", length = 70, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String nome;
    
}
