package com.myproject.easyui.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;

/**
 * Exception������
 * @author yinxunzhi
 * @creatTime 2015��4��29������12:18:02
 * @version 1.0
 * @description
 */
public class ExceptionUtil {
	private static final Logger logger = Logger.getLogger(ExceptionUtil.class);

	/**
	 * ���ش�����Ϣ�ַ���
	 * @author yinxunzhi
	 * @time 2015��4��29������12:18:22
	 * @param ex
	 * @return
	 */
	public static String getExceptionMessage(Exception ex) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		ex.printStackTrace(pw);
		String errorMessage = sw.toString();
		pw.close();
		try {
			sw.close();
		} catch (IOException e) {
			logger.error(e);
		}
		return errorMessage;
	}

}
