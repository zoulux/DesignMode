package com.TemplateMethodModel;

public class TemplateMethodModel {
	public static void test() { // ��̬
		BaseTest sina = new SinaTest();
		BaseTest tencent = new TencentTest();
		sina.ask();
		tencent.ask();
	}
}
