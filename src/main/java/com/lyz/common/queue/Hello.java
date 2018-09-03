package com.lyz.common.queue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\ISO\\1.txt");
		StringBuffer localStr = new StringBuffer();
		InputStreamReader input = new InputStreamReader(new FileInputStream(file), "utf-8");
		BufferedReader buff = new BufferedReader(input);
		String lin = "";
		// System.out.println(buff.readLine());
		while ((lin = buff.readLine()) != null) {
			localStr.append(lin);
		}
		buff.close();
		input.close();

		System.out.println(localStr);
	}

}
