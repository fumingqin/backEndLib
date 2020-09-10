package com.ruoyi.controller;

import java.util.Arrays;
import java.util.List;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ruoyi.domain.TCompany;
import com.ruoyi.mapper.TCompanyMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;

import com.ruoyi.service.ITCompanyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公司Controller
 *
 * @author ruoyi
 * @date 2020-09-09
 */
@Api(tags = "测试_公司信息管理")
@RestController
@RequestMapping("/system/company")
public class TCompanyController extends BaseController {
    @Autowired
    private ITCompanyService tCompanyService;

    @Autowired
    private TCompanyMapper tCompanyMapper;

    /**
     * 查询公司列表
     */
    @ApiOperation("获取公司列表")
    @PreAuthorize("@ss.hasPermi('system:company:list')")
    @GetMapping("/list")
    public TableDataInfo list(TCompany tCompany) {
        startPage();
        List<TCompany> list = tCompanyService.list(Wrappers.query(tCompany));
        return getDataTable(list);
    }
    
    /**
     * 导出公司列表
     */
    @ApiOperation("导出公司列表")
    @PreAuthorize("@ss.hasPermi('system:company:export')")
    @Log(title = "公司", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TCompany tCompany) {
        List<TCompany> list = tCompanyService.list(Wrappers.query(tCompany));
        ExcelUtil<TCompany> util = new ExcelUtil<TCompany>(TCompany.class);
        return util.exportExcel(list, "company");
    }

    /**
     * 获取公司详细信息
     */
    @ApiOperation("获取公司详细")
    @PreAuthorize("@ss.hasPermi('system:company:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tCompanyService.getById(id));
    }

    /**
     * 新增公司
     */
    @ApiOperation("新增公司")
    @PreAuthorize("@ss.hasPermi('system:company:add')")
    @Log(title = "公司", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TCompany tCompany)
    {
        return toAjax(tCompanyMapper.insert(tCompany));
    }

    /**
     * 修改公司
     */
    @ApiOperation("修改公司")
    @PreAuthorize("@ss.hasPermi('system:company:edit')")
    @Log(title = "公司", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TCompany tCompany)
    {
        return toAjax(tCompanyMapper.updateById(tCompany));
    }

    /**
     * 删除公司
     */
    @ApiOperation("删除公司")
    @PreAuthorize("@ss.hasPermi('system:company:remove')")
    @Log(title = "公司", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(tCompanyMapper.deleteBatchIds(Arrays.asList(ids)));
    }
}
