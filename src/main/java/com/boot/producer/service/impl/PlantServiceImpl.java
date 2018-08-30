package com.boot.producer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.boot.producer.entity.Plant;
import com.boot.producer.mapper.PlantMapper;
import com.boot.producer.model.PlantModel;
import com.boot.producer.service.IPlantService;
import com.boot.utils.ObjectUtil;

@Service
public class PlantServiceImpl extends ServiceImpl<PlantMapper,Plant> implements IPlantService{

	@Autowired
	private PlantMapper plantMapper;

	public List<PlantModel> getAllPlant()  {
		return plantMapper.getAllPlant();
	}
	
	public List<PlantModel> getPlantByDate(String dateStr) {
		return plantMapper.getPlantByDate(dateStr);
	}
	
	@Transactional(rollbackFor = Exception.class)	
	@Override
	public boolean insert(PlantModel model){
	    if(null == model.getId()){
		   model.setId(IdWorker.getIdStr());
		}
	    Plant entity = new Plant();
		ObjectUtil.copy(model,entity);
		return this.insert(entity);			
	}
}
