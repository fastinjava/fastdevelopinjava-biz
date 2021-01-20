package com.fastdevelopinjava.service.ucenter.convert.impl;

import com.fastdevelopinjava.framework.api.dto.RoleCreateDTO;
import com.fastdevelopinjava.framework.api.dto.RoleUpdateDTO;
import com.fastdevelopinjava.service.ucenter.model.RoleDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * role 实体转换类
 */
@Slf4j
@Component
public class RoleConvertImpl implements RoleConvert {

    @Override
    public RoleDO roleUpdateDTO2RoleDO(RoleUpdateDTO roleUpdateDTO) {
        if (null == roleUpdateDTO) return null;
        return new RoleDO(roleUpdateDTO.getId(), roleUpdateDTO.getRoleName(), roleUpdateDTO.getRoleCode(),roleUpdateDTO.getRoleDesc(),roleUpdateDTO.getDeleteFlag());
    }

    @Override
    public RoleDO roleCreateDTO2RoleDO(RoleCreateDTO roleCreateDTO) {
        if (null == roleCreateDTO) return null;
        return new RoleDO(roleCreateDTO.getId(), roleCreateDTO.getRoleName(), roleCreateDTO.getRoleCode(),roleCreateDTO.getRoleDesc(),roleCreateDTO.getDeleteFlag());
    }

}
