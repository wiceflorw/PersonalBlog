package com.wiceflow.dao;

import com.wiceflow.entity.dao.UserRoles;
import com.wiceflow.entity.dao.UserRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRolesMapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [UserRolesExample]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(UserRolesExample example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [UserRolesExample]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(UserRolesExample example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param userRolesNo [Integer](主键属性)用户角色关系编号
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("userRolesNo") Integer userRolesNo);

	/**
	 * 插入单条数据
	 *
	 * @param record [UserRoles]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(UserRoles record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [UserRoles]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(UserRoles record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [UserRolesExample]自定义条件
	 * @return [List<UserRoles>]符合自定义条件的数据
	 */
	List<UserRoles> selectByExample(UserRolesExample example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param userRolesNo [Integer](主键属性)用户角色关系编号
	 * @return [UserRoles]查询结果
	 */
	UserRoles selectByPrimaryKey(@Param("userRolesNo") Integer userRolesNo);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [UserRoles]数据对象，用于指定修改属性
	 * @param example [UserRolesExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") UserRoles record, @Param("example") UserRolesExample example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [UserRoles]数据对象，用于指定修改属性
	 * @param example [UserRolesExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") UserRoles record, @Param("example") UserRolesExample example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [UserRoles]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(UserRoles record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [UserRoles]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(UserRoles record);

}