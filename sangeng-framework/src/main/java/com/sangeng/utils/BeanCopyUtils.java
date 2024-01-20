package com.sangeng.utils;

import com.sangeng.domain.entity.Article;
import com.sangeng.domain.vo.HotArticleVo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class BeanCopyUtils {
    private BeanCopyUtils() {

    }

    public static<V> V copyBean(Object source, Class<V> clazz) {
        //创建目标对象
        V result = null;
        try {
           result = clazz.newInstance();
            //实现属性拷贝
            BeanUtils.copyProperties(source,result);
            //返回结果
            return result;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
    public static<O,V> List<V> copyBeanList(List<O> sources,Class<V> clazz){
        List<V> resultsList = new ArrayList<>();
        for(Object source:sources){
            resultsList.add(copyBean(source,clazz));
        }
        return resultsList;
    }

    public static void main(String[] args) {
        Article article = new Article();
        article.setId(1L);
        article.setTitle("sdfasdf");
        article.setViewCount(200L);
        HotArticleVo hotArticleVo = copyBean(article, HotArticleVo.class);
        System.out.println(hotArticleVo);

    }
}
