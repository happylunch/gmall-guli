package com.happy.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.happy.gmall.pms.entity.Brand;
import com.happy.gmall.pms.mapper.BrandMapper;
import com.happy.gmall.pms.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-12-25
 */
@org.apache.dubbo.config.annotation.Service
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
