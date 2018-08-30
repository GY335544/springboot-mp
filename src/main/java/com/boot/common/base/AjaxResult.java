package com.boot.common.base;

public class AjaxResult {

	/**
	 * 0：请求失败、后台异常、业务异常等非正常结果
	 */
	public static int SYSTEM_ERROR= 0; //0：请求失败、后台异常、业务异常等非正常结果
	
	/**
	 * 0：请求失败、后台异常、业务异常等非正常结果,字符类型
	 */
	public static String SYSTEM_ERROR_STR = "0";
	
	/**
	 * 1：请求成功
	 */
	public static int SUCCESS = 1;  //1：请求成功
	
	/**
	 * 1：请求成功,字符类型
	 */
	public static String SUCCESS_STR = "1";
	
	/**
	 * 2：表单验证不通过的信息
	 */
	public static int FORM_ERROR = 2; //2：表单验证不通过的信息
	/**
	 * 2：表单验证不通过的信息,字符类型
	 */
	public static String FORM_ERROR_STR = "2"; //2：表单验证不通过的信息
	
	/**
	 * 3：登录超时
	 */
	public static int LOGIN_TIMEOUT_ERROR = 3;  //3：登录超时
	/**
	 * 3：登录超时,字符类型
	 */
	public static String LOGIN_TIMEOUT_ERROR_STR = "3";  //3：登录超时
	
	/**
	 * 4:登录用户不存在
	 */
	public static int LOGIN_USER_NOT_FOUND = 4; //4:登录用户不存在
	
	/**
	 * 4:登录用户不存在
	 */
	public static String LOGIN_USER_NOT_FOUND_STR = "4"; //4:登录用户不存在
	
	/**
	 * 5:登录密码错误
	 */
	public static int LOGIN_USER_PASSWORD_ERROR = 5; //5:登录密码错误
	
	/**
	 * 5:登录密码错误
	 */
	public static String LOGIN_USER_PASSWORD_ERROR_STR = "5"; //5:登录密码错误
}
