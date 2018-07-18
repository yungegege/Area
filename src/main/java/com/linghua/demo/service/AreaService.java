package com.linghua.demo.service;

import com.linghua.demo.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 用区域id查一个区域信息
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     *插入区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     *更新区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     *根据区域id删除区域
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
