/**
 * @author yxz
 * @creatTime 2015��4��29������11:15:10
 * @version 1.0
 * @description 
 */
package com.myproject.model;

/**
 * @author yinxunzhi
 * @creatTime 2015��4��29������11:15:10
 * @version 1.0
 * @description ��Ӧʱ���ص�json����
 */
public class ResponseJson {
	private boolean success = false;// �Ƿ�ɹ�
	private String msg = "";// ��ʾ��Ϣ
	private Object obj = null;// ������Ϣ

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
