package com.codegym.dao.product;

import com.codegym.dao.IGeneralDao;
import com.codegym.model.Product;

import java.util.List;

public interface IProductDao extends IGeneralDao<Product> {
    boolean insertProductUsingProcedure(Product product);

    List<Product> findAllProductByName(String name);

    List<Product> findAllProductByCategoryId(int categoryId);
}
