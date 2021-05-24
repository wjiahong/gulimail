package com.wengjh.gulimall.product.dao;

import com.wengjh.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wengjh
 * @email 958421632@qq.com
 * @date 2021-05-22 20:56:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
