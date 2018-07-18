package com.linghua.demo.dao;

import com.linghua.demo.entity.Area;

import java.util.List;

public interface AreaDao {
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
    Area queryAreaById(int areaId);

    /**
     *插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     *更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     *根据区域id删除区域
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
