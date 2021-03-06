package com.longuto.springbootemplate.dao;

import com.longuto.springbootemplate.common.base.MyMapper;
import com.longuto.springbootemplate.pojo.po.SysUserRole;
import com.longuto.springbootemplate.pojo.dto.LoginUserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserRoleMapper extends MyMapper<SysUserRole> {

    List<LoginUserDto> findUserByRole(@Param("roleId") Integer roleId);
}