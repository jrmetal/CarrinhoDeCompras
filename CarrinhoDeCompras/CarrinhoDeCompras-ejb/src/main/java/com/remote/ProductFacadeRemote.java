package com.remote;

import com.cantina.carbonarautilies.filtersUtilities.FilterParams;
import com.carrinhoDeCompras.DTOs.ProductDTO;
import com.carrinhoDeCompras.entities.Product;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ProductFacadeRemote {

    /**
     * @param token
     * @return
     */
    public List<Product> findAllEntities(String token);

    /**
     *
     * @param token
     * @param id
     * @return
     */
    public Product findEntityByID(String token, long id);

    /**
     *
     * @param token
     * @param ids
     * @return
     */
    public List<Product> findEntitiesByIDs(String token, long[] ids);

    /**
     *
     * @param token
     * @return
     */
    public List<ProductDTO> findAllDTOs(String token);

    /**
     *
     * @param token
     * @param id
     * @return
     */
    public ProductDTO findDTOByID(String token, long id);

    /**
     *
     * @param token
     * @param ids
     * @return
     */
    public List<ProductDTO> findDTOsByIDs(String token, long[] ids);

    /**
     *
     * @param token
     * @param filterParams
     * @return
     */
    public List<ProductDTO> findDTOsByParams(String token, FilterParams filterParams);

    /**
     *
     * @param token
     * @param nome
     * @return
     */
    public Product findBairroByNome(String token, String nome);

    /**
     *
     * @param token
     * @param product
     */
    public void create(String token, Product product);

}
