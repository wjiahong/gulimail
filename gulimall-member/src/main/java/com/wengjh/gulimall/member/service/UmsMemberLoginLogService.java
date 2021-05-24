package com.wengjh.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wengjh.gulimall.common.utils.PageUtils;
import com.wengjh.gulimall.member.entity.UmsMemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author wengjh
 * @email 958421632@qq.com
 * @date 2021-05-22 21:43:15
 */
public interface UmsMemberLoginLogService extends IService<UmsMemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

