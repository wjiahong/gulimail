package com.wengjh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wengjh.gulimall.common.utils.PageUtils;
import com.wengjh.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author wengjh
 * @email 958421632@qq.com
 * @date 2021-05-22 21:20:05
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

