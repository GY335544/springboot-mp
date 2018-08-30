package com.boot.producer.service;

import com.baomidou.mybatisplus.service.IService;
import com.boot.producer.entity.Plant;
import com.boot.producer.model.PlantModel;

public interface IPlantService extends IService<Plant>{
	
	/**
	 * 新增数据
	 * @param PlantModel
	 * @return boolean
	 */
	public boolean insert(PlantModel model);
}
