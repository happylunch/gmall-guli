package com.happy.gmall.pms;

import com.happy.gmall.pms.entity.Brand;
import com.happy.gmall.pms.entity.Product;
import com.happy.gmall.pms.service.BrandService;
import com.happy.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
class GmallPmsApplicationTests {

	@Autowired
	ProductService service;

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
//		Product product = service.getById(1);
//		System.out.println(product.getName());
//		Brand brand = new Brand();
//		brand.setName("哈哈");
//		brandService.save(brand);
//		System.out.println("保存成功.........");

		Brand byId = brandService.getById(53);
		System.out.println(byId);
	}

}
