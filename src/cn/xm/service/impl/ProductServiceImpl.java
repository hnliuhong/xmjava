package cn.xm.service.impl;

import cn.xm.dao.ProductDao;
import cn.xm.model.Product;
import cn.xm.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao = null;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public void save(Product product) {
		productDao.save(product);
	}
}
