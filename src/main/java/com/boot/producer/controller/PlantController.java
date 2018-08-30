package com.boot.producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.sql.visitor.functions.Insert;
import com.alibaba.druid.util.StringUtils;
import com.boot.producer.model.PlantModel;
import com.boot.producer.service.impl.PlantServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="信息接口API")
@RestController
@RequestMapping("/plant")
public class PlantController {

	@Autowired
	private PlantServiceImpl plantService;
	
	@ApiOperation(value="新增数据",notes="实体model")
	@PostMapping("/insert")
	public boolean Insert(@RequestBody PlantModel model) {
		System.out.println(",,,,");
		return plantService.insert(model);
	}
	
	@ApiOperation(value="获取所有信息",notes="不需要传值")
	@GetMapping("/all")
	public List<PlantModel> getAllPlant() {
		return plantService.getAllPlant();
	}
	
	@ApiOperation(value="根据时间查询信息",notes="时间格式为yyyy,传空则查询所有")
	@GetMapping("/get/{dateStr}")
	public List<PlantModel> getPlantByDate(@PathVariable("dateStr") String dateStr) {
		return plantService.getPlantByDate(dateStr);
	}
	
}
