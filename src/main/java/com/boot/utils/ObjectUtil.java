package com.boot.utils;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

/**
 * 适用于小批量数据拷贝
 * @author gy
 *
 */
public class ObjectUtil {
	
	public static <S,T> List<T> copyList(List<S> sourceList,List<T> destList,Class<T> targetClass){
		try {
			for(S s:sourceList){
				T t = targetClass.newInstance();
				ObjectUtil.copy(s,t);
				destList.add(t);
			}
			return destList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 
	 * @param source
	 * @param target
	 */
	public static void copy(Object source,Object target){
		try {
			if(source!=null){
				BeanUtils.copyProperties(target,source);
			}else{
				target = null;
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param bean
	 * @param name
	 * @param value
	 */
	public static void copy(Object bean,String name,Object value){
		try {
			if(bean!=null){
				BeanUtils.copyProperty(bean, name, value);
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
