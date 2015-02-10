class IndreKlasser<T> {
	int a = 1;
	static int b = 2;

	private class InnerClass {
		// kan se a
		// kan se b
		// kan bruke T
	}

	private static class StaticInnerClass<T> {
		// kan se b
		// har sin egen T
	}

	public static void main(String[] args) {
		int c = 3;

		class LocalClass {
			// kan se b
			// kan se c
		}

		StaticInnerClass<String> x = new StaticInnerClass<>();

		IndreKlasser<String> y = new IndreKlasser<>();
		IndreKlasser.InnerClass z = y.new InnerClass();
	}
}