package com.facades;

import com.cantina.carbonarautilies.EJBQLUtilities.EJBQLUtilities;
import com.cantina.carbonarautilies.filtersUtilities.FilterParams;
import com.carrinhoDeCompras.DTOs.ProductDTO;
import com.carrinhoDeCompras.entities.Product;
import com.remote.ProductFacadeRemote;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductFacade extends AbstractFacade<Product> implements ProductFacadeRemote {

    /**
     * Query simples para seleção de entidades.
     */
    private static final String ENTITY_QUERY = EJBQLUtilities.simpleEntitySelectClause(Product.class);

    private static final String DTO_QUERY = "select new " + ProductDTO.class.getCanonicalName()
            + "("
            + "  entity.id, "
            + "  entity.description, "
            + "  entity.barCode, "
            + "  entity.status, "
            + "  entity.createdTime, "
            + "  entity.measurement, "
            + "  entity.img, "
            + "  entity.deletedFlag "
            + ")"
            + "  from " + Product.class.getSimpleName() + " as entity";

    @PersistenceContext(unitName = "PersistenciaUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFacade() {
        super(Product.class);
    }

    /**
     * Return all entities of Product.
     *
     * @param token {@inheritDoc}
     *
     * @return {@inheritDoc}
     *
     */
    @Override
    public List<Product> findAllEntities(String token) {
        return (List<Product>) em.createQuery(ENTITY_QUERY).getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product findEntityByID(String token, long id) {
        return em.find(Product.class, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> findEntitiesByIDs(String token, long[] ids) {
        String query = ENTITY_QUERY + " where " + EJBQLUtilities.orListClause("entity.id", ids);
        return (List<Product>) em.createQuery(query).getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ProductDTO> findAllDTOs(String token) {
        return (List<ProductDTO>) em.createQuery(DTO_QUERY).getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductDTO findDTOByID(String token, long id) {
        String query = DTO_QUERY + " where entity.id = " + id;
        return (ProductDTO) em.createQuery(query).getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ProductDTO> findDTOsByIDs(String token, long[] ids) {
        String query = DTO_QUERY + " where " + EJBQLUtilities.orListClause("entity.id", ids);
        return (List<ProductDTO>) em.createQuery(query).getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ProductDTO> findDTOsByParams(String token, FilterParams filterParams) {

        Map<String, String> map = filterParams.getFilterParams();

        String where = EJBQLUtilities.whereClauseByParam(map);

        String query = DTO_QUERY + where;
        return (List<ProductDTO>) em.createQuery(query).getResultList();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product findBairroByNome(String token, String nome) {
        String query = ENTITY_QUERY
                + " WHERE entity.nome LIKE '"
                + nome
                + "'";
        return (Product) em.createQuery(query).getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void create(String token, Product product) {
        em.persist(product);
    }

}
