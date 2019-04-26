package cn.xml.other;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

class MyObject extends Object {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize--------------");
	}

}

public class Xss {

	public static void main(String[] args) throws InterruptedException {
		SoftReference<MyObject> sf = new SoftReference<MyObject>(new MyObject());
		System.out.println(sf.get());
		List<Object> oList = new ArrayList<Object>();
		for (int i = 1; i <= 64; i++) {
			System.out.println("i=" + i);
			oList.add(new byte[2 * 1024 * 1024]);
			System.gc();
		}
	}

}
