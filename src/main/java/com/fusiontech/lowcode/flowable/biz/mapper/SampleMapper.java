package com.fusiontech.lowcode.flowable.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fusiontech.lowcode.flowable.common.annotation.DBType;
import com.fusiontech.lowcode.flowable.model.enums.DBTypeEnum;
import com.fusiontech.lowcode.flowable.biz.entity.Sample;

/**
 * <p>
 * Sample
 * </p>
 *
 * @author mayike
 */
@DBType(DBTypeEnum.BIZ)
public interface SampleMapper extends BaseMapper<Sample> {

}
