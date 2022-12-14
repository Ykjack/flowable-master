package com.fusiontech.lowcode.flowable.common.annotation;

import com.fusiontech.lowcode.flowable.model.enums.DBTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mayike
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DBType {
    DBTypeEnum value() default DBTypeEnum.FLOWABLE;
}
