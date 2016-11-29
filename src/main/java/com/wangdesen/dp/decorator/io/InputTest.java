package com.wangdesen.dp.decorator.io;

import java.io.*;

/**
 * 采用装饰者模式的小写转换方法测试类
 * 
 * @author wangdesen
 */
public class InputTest {
	
	public static void main(String[] args) throws IOException {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:/test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
