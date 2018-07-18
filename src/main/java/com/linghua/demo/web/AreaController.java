package com.linghua.demo.web;

import com.linghua.demo.entity.Area;
import com.linghua.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String,Object> map = new HashMap<>();
        List<Area> list = areaService.queryArea();
        map.put("areaList",list);
        return map;
    }

    @RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
    private Map<String,Object> getAreayById(Integer areaId){
        Map<String,Object> map = new HashMap<>();
        Area area = areaService.getAreaById(areaId);
        map.put("area",area);
        return map;
    }

    @RequestMapping(value = "/addarea", method = RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> map = new HashMap<>();
        Boolean b = areaService.addArea(area);
        map.put("success",b);
        return map;
    }

    @RequestMapping(value = "/modifyarea", method = RequestMethod.POST)
    private Map<String,Object> modifyarea(@RequestBody Area area){
        Map<String,Object> map = new HashMap<>();
        Boolean b = areaService.modifyArea(area);
        map.put("success",b);
        return map;
    }

    @RequestMapping(value = "/removearea", method = RequestMethod.GET)
    private Map<String,Object> removearea(Integer areaId){
        Map<String,Object> map = new HashMap<>();
        Boolean b = areaService.deleteArea(areaId);
        map.put("success",b);
        return map;
    }


    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    private String hello(@PathVariable("id") Integer id){
        return "hello"+id;
    }
}
