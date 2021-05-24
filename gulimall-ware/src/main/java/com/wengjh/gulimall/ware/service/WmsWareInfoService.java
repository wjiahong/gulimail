package com.wengjh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wengjh.gulimall.common.utils.PageUtils;
import com.wengjh.gulimall.ware.entity.WmsWareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author wengjh
 * @email 958421632@qq.com
 * @date 2021-05-22 21:52:05
 */
public interface WmsWareInfoService extends IService<WmsWareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

