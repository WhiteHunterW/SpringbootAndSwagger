package com.wl.demo.service;

import com.wl.demo.entity.Area;

import java.util.List;

/**
 * 业务逻辑层的接口
 */
public interface AreaService {

    /**
     * 获取区域信息
     * @return
     */
    List<Area> getAreaList();

    /**
     * 根据id获取区域信息
     * @param areaId
     * @return
     */
    Area getAreaById(Integer areaId);
    
    
    /**
     * 添加区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    void modifyArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    void deleteArea(Integer areaId);
}
