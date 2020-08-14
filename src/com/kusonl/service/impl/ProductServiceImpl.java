package com.kusonl.service.impl;

import com.kusonl.dao.ProductMapper;
import com.kusonl.domain.Product;
import com.kusonl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getProductList() {

        List<Product> products = productMapper.selectByExampleWithBLOBs(null);

        return products;
    }
}
