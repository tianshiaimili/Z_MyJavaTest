package thread.product;

/**
 *消费者，采用线程，模拟消费者行为
 */
class Consumer extends Thread {
	//消费者获取产品的仓库
	private Warehouse warehouse;
	//是否需要结束线程的标志位
	private boolean running = false;

	public Consumer(Warehouse warehouse, String name) {
		super(name);
		this.warehouse = warehouse;
	}

	public void start(){
		this.running = true;
		super.start();
	}
	
	public void run() {
		Product product;
		try {
			while (running) {
				//从仓库中获取产品
				System.out.println("get product from warehouse..");
				product = warehouse.getProduct();
				System.out.println("wait 500 sec");
				sleep(500);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	/**
	 * 停止消费者线程
	 */
	public void stopConsumer(){
		System.out.println("停止消费者线程");
		synchronized (warehouse){
			this.running = false;
			//通知等待仓库的线程
			warehouse.notifyAll();
		}
	}
	//消费者线程是否在运行
	public boolean isRunning() {
		return running;
	}
	
	
}
