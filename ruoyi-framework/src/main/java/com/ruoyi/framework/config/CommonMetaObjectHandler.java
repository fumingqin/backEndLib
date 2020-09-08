package com.ruoyi.framework.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.utils.SecurityUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author sushengbuyu
 * @date 2019/1/24 16:16
 */
@Slf4j
@Component
public class CommonMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        String name = "unknown";
        try {
            name = SecurityUtils.getUsername();
        } catch (Exception e) {
            log.error("获取操作人失败");
        }
        this.setFieldValByName(BaseEntity.CREATE_BY, name, metaObject);
        this.setFieldValByName(BaseEntity.CREATE_TIME, new Date(), metaObject);
        this.setFieldValByName(BaseEntity.UPDATE_BY, name, metaObject);
        this.setFieldValByName(BaseEntity.UPDATE_TIME, new Date(), metaObject);
        this.setFieldValByName(BaseEntity.DELFLAG, BaseEntity.DELFLAG_NORMAL, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        String name = "unknown";
        try {
            name = SecurityUtils.getUsername();
        } catch (Exception e) {
            log.error("获取操作人失败");
        }
        this.setFieldValByName(BaseEntity.UPDATE_BY, name, metaObject);
        this.setFieldValByName(BaseEntity.UPDATE_TIME, new Date(), metaObject);
    }
}
