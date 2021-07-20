package cn.nicollcheng.leaf.controller;

import cn.nicollcheng.leaf.service.SegmentService;
import cn.nicollcheng.leaf.service.SnowflakeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeafController {

    private final SegmentService segmentService;
    private final SnowflakeService snowflakeService;

    public LeafController(SegmentService segmentService, SnowflakeService snowflakeService) {
        this.segmentService = segmentService;
        this.snowflakeService = snowflakeService;
    }

    @RequestMapping(value = "/api/segment/get/{key}")
    public String getSegmentId(@PathVariable("key") String key) {
        return segmentService.getId(key);
    }

    @RequestMapping(value = "/api/snowflake/get/{key}")
    public String getSnowflakeId(@PathVariable("key") String key) {
        return snowflakeService.getId(key);
    }

}
