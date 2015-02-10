public class RunnableEks {
	public static void main(String[] args) {
		doTenTimes(new Runnable() {
			public void run() {
				System.out.println("Hei!");
			}
		});
	}

	public static void doTenTimes(Runnable action) {
		for (int i = 0; i < 10; i++) {
			action.run();
		}
	}
}