package com.sangeng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Article;
/**
 * 文章(article)表服务接口
 *
 * @author meowrain
 * @since 2024-01-20 12:57:23
 */
public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();
}
