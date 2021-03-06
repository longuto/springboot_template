package com.longuto.springbootemplate.service;

import com.longuto.springbootemplate.common.base.service.IService;
import com.longuto.springbootemplate.pojo.po.SysUserRole;
import com.longuto.springbootemplate.pojo.dto.LoginUserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SysUserRoleService extends IService<SysUserRole> {

    // 根据角色id查询用户
    List<LoginUserDto> findUserByRole(Integer roleId);
}
