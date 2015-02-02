package com.makalu.phonenum.cmdline.main;

import java.util.List;

import com.makalu.phonenum.core.service.PhoneNumAnalyzerService;
import com.makalu.phonenum.core.service.PhoneNumAnalyzerServiceImpl;
import com.makalu.phonenum.core.util.FileUtil;

public class MainClass {
	public static void main(String[] args) {
		FileUtil fileUtil = new FileUtil();
		PhoneNumAnalyzerService phoneNumAnalyzerService = new PhoneNumAnalyzerServiceImpl();
		String appBasePath = fileUtil.getAppBasePath();
		System.out.println("Reading file from: " + appBasePath);
		List<String> phoneList = fileUtil.generatePhoneList(appBasePath + "\\phonelist.txt");
		phoneNumAnalyzerService.processPhoneList(phoneList);
	}
}
