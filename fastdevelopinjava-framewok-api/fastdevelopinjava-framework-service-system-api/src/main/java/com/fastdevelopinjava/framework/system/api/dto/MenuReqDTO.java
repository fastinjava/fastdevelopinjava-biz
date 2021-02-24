package com.fastdevelopinjava.framework.system.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
public class MenuReqDTO implements Serializable {

    //默认分页，第一页
    private Integer pageNum = 0;
    //默认分页大小 10
    private Integer pageSize = 10;
    //默认分页
    private Boolean pageable = true;
    private Integer menuId;
    private String menuName;
    private String menuCode;
    private String menuUrl;
    private String menuIcon;
    private Integer menuPid;
    /**
     * 菜单类型,0->目录 1->页面路由 2->按钮
     */
    private String menuType;

    /**
     * 如果是按钮类型,按钮是否可见
     */
    private String menuVisible;

    /**
     * 如果是按钮类型,按钮关联的接口
     */
    private String menuApiIds;

    /**
     * 是否删除
     */
    private String deleteFlag;

    private Date createTime;

    private Date updateTime;
}
