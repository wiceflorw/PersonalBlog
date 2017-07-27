package com.wiceflow.dao;

import com.wiceflow.entity.dao.Picture;
import com.wiceflow.entity.dao.PictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [PictureExample]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(PictureExample example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [PictureExample]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(PictureExample example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param pictureNo [Integer](主键属性)图片编号
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("pictureNo") Integer pictureNo);

	/**
	 * 插入单条数据
	 *
	 * @param record [Picture]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(Picture record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [Picture]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(Picture record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [PictureExample]自定义条件
	 * @return [List<Picture>]符合自定义条件的数据
	 */
	List<Picture> selectByExample(PictureExample example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param pictureNo [Integer](主键属性)图片编号
	 * @return [Picture]查询结果
	 */
	Picture selectByPrimaryKey(@Param("pictureNo") Integer pictureNo);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [Picture]数据对象，用于指定修改属性
	 * @param example [PictureExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [Picture]数据对象，用于指定修改属性
	 * @param example [PictureExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [Picture]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(Picture record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [Picture]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(Picture record);

}