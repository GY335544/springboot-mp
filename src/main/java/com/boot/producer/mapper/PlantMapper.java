package com.boot.producer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boot.producer.entity.Plant;
import com.boot.producer.model.PlantModel;

public interface PlantMapper extends BaseMapper<Plant>{

	public List<PlantModel> getAllPlant();
	
	public List<PlantModel> getPlantByDate(@Param("dateStr")String dateStr);
}
