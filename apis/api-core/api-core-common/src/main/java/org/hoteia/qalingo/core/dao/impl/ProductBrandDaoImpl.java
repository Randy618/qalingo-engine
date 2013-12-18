/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hoteia.qalingo.core.dao.ProductBrandDao;
import org.hoteia.qalingo.core.domain.ProductBrand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("productBrandDao")
public class ProductBrandDaoImpl extends AbstractGenericDaoImpl implements ProductBrandDao {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public ProductBrand getProductBrandById(final Long productBrandId) {
        Criteria criteria = createDefaultCriteria(ProductBrand.class);
        criteria.add(Restrictions.eq("id", productBrandId));
        ProductBrand productBrand = (ProductBrand) criteria.uniqueResult();
        return productBrand;
	}

	public ProductBrand getProductBrandByCode(final Long marketAreaId, final String productBrandCode) {
        Criteria criteria = createDefaultCriteria(ProductBrand.class);
        criteria.add(Restrictions.eq("code", productBrandCode));
        ProductBrand productBrand = (ProductBrand) criteria.uniqueResult();
		return productBrand;
	}
	
    @Override
    public List<ProductBrand> findProductBrandsByCatalogCategoryCode(final String categoryCode) {
        Criteria criteria = createDefaultCriteria(ProductBrand.class);
        
        addDefaultProductBrandFetch(criteria);

        criteria.setFetchMode("productMarketings", FetchMode.JOIN);

        criteria.createAlias("productMarketings.defaultCatalogCategory", "defaultCatalogCategory", JoinType.LEFT_OUTER_JOIN);
        criteria.setFetchMode("defaultCatalogCategory", FetchMode.JOIN);

//        criteria.createAlias("productMarketings.defaultCatalogCategory.defaultParentCatalogCategory", "defaultParentCatalogCategory", JoinType.LEFT_OUTER_JOIN);
//        criteria.setFetchMode("defaultParentCatalogCategory", FetchMode.JOIN);

        criteria.add(Restrictions.or(Restrictions.eq("defaultCatalogCategory.code", categoryCode)));
//        criteria.add(Restrictions.or(Restrictions.eq("defaultParentCatalogCategory.code", categoryCode)));
        
        criteria.addOrder(Order.asc("id"));

        @SuppressWarnings("unchecked")
        List<ProductBrand> productBrands = criteria.list();
        return productBrands;
    }
    
	public void saveOrUpdateProductBrand(final ProductBrand productBrand) {
		if(productBrand.getDateCreate() == null){
			productBrand.setDateCreate(new Date());
		}
		productBrand.setDateUpdate(new Date());
		if(productBrand.getId() == null){
			em.persist(productBrand);
		} else {
			em.merge(productBrand);
		}
	}

	public void deleteProductBrand(final ProductBrand productBrand) {
		em.remove(productBrand);
	}
	
    private void addDefaultProductBrandFetch(Criteria criteria) {
        
    }
	
}