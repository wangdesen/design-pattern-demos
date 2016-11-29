package com.wangdesen.dp.decorator.io;

import java.io.*;

/**
 * 采用了装饰者模式，对于字节流的处理，不是很清楚
 * */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
 
	/**
	 * 针对字节的read方法
	 */
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
		
	/**
	 * 针对字节数组的read方法
	 */
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}
