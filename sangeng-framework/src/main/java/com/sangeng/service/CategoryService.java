package com.sangeng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.domain.ResponseResult;
import com.sangeng.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2024-01-20 12:57:23
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}
