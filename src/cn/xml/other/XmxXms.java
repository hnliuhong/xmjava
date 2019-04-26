package cn.xml.other;

import java.util.ArrayList;
import java.util.List;

public class XmxXms {
	public static void main(String[] args) throws Exception {
		List<Object> oList = new ArrayList<Object>();
		for (int i = 1; i <= 60; i++) {
			oList.add(new byte[1 * 1024 * 1024]);
			Thread.sleep(1000);
			if (i % 5 == 0) {
				System.out.println("--------------------------------------------------------------");
				System.out.println("Xmx:" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024.0 + "MB");
				System.out.println("total:" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024.0 + "MB");
				System.out.println("free:" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024.0 + "MB");
			}

		}
		Thread.sleep(1000 * 60 * 60);
	}

}
