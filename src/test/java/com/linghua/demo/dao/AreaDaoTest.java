package com.linghua.demo.dao;

import com.linghua.demo.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() throws Exception {
        List<Area> areaList = areaDao.queryArea();
        System.out.println(areaList.size());
    }

    @Test
    public void queryAreaById() throws Exception {
        Area area = areaDao.queryAreaById(1);
        System.out.println(area.getAreaName());
    }

    @Test
    public void insertArea() throws Exception {
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
        System.out.println(areaDao.insertArea(area));

    }

    @Test
    public void updateArea() throws Exception {
        Area area = new Area();
        area.setAreaName("西苑");
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        System.out.println(areaDao.updateArea(area));
    }

    @Test
    public void deleteArea() throws Exception {
        System.out.println(areaDao.deleteArea(3));

    }

}