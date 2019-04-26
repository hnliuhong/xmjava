package cn.xml.other;

// 1：wait(): 让线程处于冻结状态, 被wait的线程会被存储到线程池中, 而sleep仅仅是释放cpu不会释放锁. 
// 2：notify(): 唤醒当前线程池中的一个线程(任意)
// 3：notifyall(): 唤醒当前线程池中的所有线程. 

public class NotifyWait {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized ("java") {
					try {
						System.out.println("thread name:" + Thread.currentThread().getName());
						"java".wait(); // sleep
						System.out.println("notify name:" + Thread.currentThread().getName());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}

			}
		}, "A Thread").start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized ("java") {
					try {
						System.out.println("thread name:" + Thread.currentThread().getName());
						"java".wait();
						System.out.println("notify name:" + Thread.currentThread().getName());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}

			}
		}, "B Thread").start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized ("java") {
					try {
						System.out.println("thread name:" + Thread.currentThread().getName());
						"java".notify(); // "java".notifyAll();
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}

			}
		}, "C Thread").start();
	}

}
