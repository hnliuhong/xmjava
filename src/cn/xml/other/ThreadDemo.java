package cn.xml.other;

public class ThreadDemo extends Thread {

	private int num = 10;

	@Override
	public void run() {
		while (num > 0) {
			// "java" this ThreadDemo.class 可能会出现-1,-2
			// new Date() i 可能会重复
			synchronized ("java") {
				try {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName() + "正在使用资源编号为:" + num);
					num--; // 可能会出现 -1 -2
				} catch (Exception e) {
					throw new RuntimeException();
				}

			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		new Thread(td).start();
		new Thread(td).start();
		new Thread(td).start();
	}
}
