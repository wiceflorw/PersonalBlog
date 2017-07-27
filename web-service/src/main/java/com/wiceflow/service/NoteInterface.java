package com.wiceflow.service;

import com.wiceflow.entity.dao.Subject;
import com.wiceflow.entity.dao.SubjectCategory;

import java.util.Map;

/**
 * Created by BF on 2017/7/27.
 */
public interface NoteInterface {

    /**
     * 查询文章分类及其数量
     * @return  返回类型为Map 其中SubjectCategory为数据实体类
     */
    public Map<String,SubjectCategory> QueryClassification();

    /**
     *
     * @param articles_no
     * 查询对应类型的所有文章信息
     * @return  返回类型为Map 其中Subject为文章信息
     */
    public Map<String,Subject> QueryArticles(String articles_no);

    /**
     * 根据subject_no查询页面信息，返回一个字符串
     * @param subject_no
     * @return
     */
    public String showview(String subject_no);

}
