package com.wengjh.gulimall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wengjh.gulimall.common.utils.PageUtils;
import com.wengjh.gulimall.common.utils.Query;

import com.wengjh.gulimall.order.dao.OmsOrderReturnReasonDao;
import com.wengjh.gulimall.order.entity.OmsOrderReturnReasonEntity;
import com.wengjh.gulimall.order.service.OmsOrderReturnReasonService;


@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReasonEntity> implements OmsOrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderReturnReasonEntity> page = this.page(
                new Query<OmsOrderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OmsOrderReturnReasonEntity>()
        );

        return new PageUtils(page);
    }

}