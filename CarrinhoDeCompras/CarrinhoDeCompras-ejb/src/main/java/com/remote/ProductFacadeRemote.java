package com.remote;

import com.carrinhoDeCompras.entities.Product;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ProductFacadeRemote {

    void create(com.carrinhoDeCompras.entities.Product product);

    void edit(com.carrinhoDeCompras.entities.Product product);

    void remove(com.carrinhoDeCompras.entities.Product product);

    com.carrinhoDeCompras.entities.Product find(Object id);

    List<Product> findAll();

    List<Product> findRange(int[] range);

    int count();
    
    Product teste();

}
