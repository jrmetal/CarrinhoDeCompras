package com.facades;

import com.carrinhoDeCompras.entities.Product;
import com.remote.ProductFacadeRemote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductFacade extends AbstractFacade<Product> implements ProductFacadeRemote {

    @PersistenceContext(unitName = "PersistenciaUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFacade() {
        super(Product.class);
    }

    @Override
    public String teste() {
        return "teste123";
    }

}
