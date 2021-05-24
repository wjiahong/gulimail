package com.wengjh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wengjh.gulimall.common.utils.PageUtils;
import com.wengjh.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wengjh
 * @email 958421632@qq.com
 * @date 2021-05-22 20:56:29
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

