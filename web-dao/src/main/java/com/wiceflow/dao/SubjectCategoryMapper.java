package com.wiceflow.dao;

import com.wiceflow.entity.dao.SubjectCategory;
import com.wiceflow.entity.dao.SubjectCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectCategoryMapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [SubjectCategoryExample]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(SubjectCategoryExample example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [SubjectCategoryExample]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(SubjectCategoryExample example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param categoryNo [Integer](主键属性)主体类别编号
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("categoryNo") Integer categoryNo);

	/**
	 * 插入单条数据
	 *
	 * @param record [SubjectCategory]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(SubjectCategory record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [SubjectCategory]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(SubjectCategory record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [SubjectCategoryExample]自定义条件
	 * @return [List<SubjectCategory>]符合自定义条件的数据
	 */
	List<SubjectCategory> selectByExample(SubjectCategoryExample example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param categoryNo [Integer](主键属性)主体类别编号
	 * @return [SubjectCategory]查询结果
	 */
	SubjectCategory selectByPrimaryKey(@Param("categoryNo") Integer categoryNo);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [SubjectCategory]数据对象，用于指定修改属性
	 * @param example [SubjectCategoryExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") SubjectCategory record, @Param("example") SubjectCategoryExample example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [SubjectCategory]数据对象，用于指定修改属性
	 * @param example [SubjectCategoryExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") SubjectCategory record, @Param("example") SubjectCategoryExample example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [SubjectCategory]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(SubjectCategory record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [SubjectCategory]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(SubjectCategory record);

}