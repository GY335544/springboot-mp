package com.boot.common.base;

public class BusinessException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public BusinessException(){
		super();
	}
	
	public BusinessException(String arg0){
		super(arg0);
	}
	
	public BusinessException(String arg0,Object obj){
		String msg = arg0;
		if(obj!=null){
			String str = "{0}";
				msg = msg.replace(str,obj.toString());
		}
		new BusinessException(msg);
	}
	
	public BusinessException(String arg0,Object[] objs){
		String msg = arg0;
		if(objs!=null){
			for(int i=0;i<objs.length;i++){
				String str = "{"+i+"}";
				msg = msg.replace(str, objs[i].toString());
			}
		}
		new BusinessException(msg);
	}
		
	public BusinessException(Throwable arg0){
		super(arg0);
	}
	
	public BusinessException(String arg0,Throwable arg1){
		super(arg0,arg1);
	}
	
	public BusinessException(String arg0, Throwable arg1, boolean arg2, boolean arg3){
		super(arg0,arg1,arg2,arg3);
	}

}