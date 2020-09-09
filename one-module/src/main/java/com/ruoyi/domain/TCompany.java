package com.ruoyi.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;

/**
 * 公司对象 t_company
 *
 * @author ruoyi
 * @date 2020-09-09
 */
@ToString
@Data
@TableName("t_company")
public class TCompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 公司名称 */
    @Excel(name = "公司名称")
    private String name;


    /** 公司地址 */
    @Excel(name = "公司地址")
    private String address;


    /** 公司电话 */
    @Excel(name = "公司电话")
    private String tel;


    /** 车辆id */
    @Excel(name = "车辆id")
    private Long carId;


    /** 驾驶员id */
    @Excel(name = "驾驶员id")
    private Long driverId;


    /** 联系人 */
    @Excel(name = "联系人")
    private String contact;




}
