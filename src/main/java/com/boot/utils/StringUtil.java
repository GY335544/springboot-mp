package com.boot.utils;


import java.util.Random;
import java.util.UUID;

/**
 * 
 * <p>Description: 字符串工具类</p>  
 * @author gy  
 * @date 2018年8月27日 下午3:09:09  
 * @version 1.0
 */
public class StringUtil {

    public static boolean isBlank(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }
    
    public static boolean isNotBlank(String str){
        
        return !isBlank(str);
    }
    
    public static boolean isEmpty(Object obj) {
		if(obj == null || obj.toString().length() == 0){
			return true;
		}
		return false;
	}
    
    public static boolean isNotEmpty(Object obj){
        
        return !isEmpty(obj);
    }
    
    public static String toString(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public static String restrictLength(String strSrc, int iMaxLength) {
        if (strSrc == null) {
            return null;
        }
        if (iMaxLength <= 0) {
            return strSrc;
        }
        String strResult = strSrc;
        byte[] b = null;
        int iLength = strSrc.length();
        if (iLength > iMaxLength) {
            strResult = strResult.substring(0, iMaxLength);
            iLength = iMaxLength;
        }
        while (true) {
            b = strResult.getBytes();
            if (b.length <= iMaxLength) {
                break;
            }
            iLength--;
            strResult = strResult.substring(0, iLength);
        }
        return strResult;
    }
    
    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random  random = new Random();
        StringBuffer buf = new StringBuffer();
        
        for(int i = 0 ;i < length ; i ++)
        {
         int num = random.nextInt(str.length());
         buf.append(str.charAt(num));
        }
        
        return buf.toString();
    }
	
	/**
	 * 左补齐
	 * @param target 目标字符串
	 * @param fix 补齐字符
	 * @param length 目标长度
	 * @return
	 */
	public static String lPad(String target, String fix, int length){
		if(target==null || fix ==null || !(target.length()<length))
			return target;
		StringBuffer newStr = new StringBuffer();
		for(int i=0; i<length-target.length(); i++){
			newStr.append(fix);
		}
		return newStr.append(target).toString();
	}
	
	/**
	 * 右补齐
	 * @param target 目标字符串
	 * @param fix 补齐字符
	 * @param length 目标长度
	 * @return
	 */
	public static String rPad(String target, String fix, int length){
		if(target==null || fix ==null || !(target.length()<length))
			return target;
		StringBuffer newStr = new StringBuffer();
		newStr.append(target);
		for(int i=0; i<length-target.length(); i++){
			newStr.append(fix);
		}
		return newStr.toString();
	}
	
	/**
	 * 字符串数据join操作
	 * @param strs
	 * @param spi
	 * @return
	 * @author 
	 */
	public static String join(String[] strs, String spi){
		StringBuffer buf = new StringBuffer();
		int step = 0;
		for(String str : strs){
			buf.append(str);
			if (step ++ < strs.length - 1)
				buf.append(spi);
		}
		return buf.toString();
	}
	
	/**
	 * 16位uuid数字
	 * @return
	 */
	public static String get16UUId() {
        int first = new Random(10).nextInt(8) + 1;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return first + String.format("%015d", hashCodeV);
    }
    
    public static void main(String[] args) {
        System.out.println(get16UUId());
    }
}
