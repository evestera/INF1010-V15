class FooBarCatch {
	static class HelloException extends Exception {}

	public static void main(String[] args) {
		try {
			a();
		} catch (HelloException e) {
			System.out.println("Woops! Exception happened!");
		}
		System.out.println("Bar!");
	}

	public static void a() throws HelloException {
		b();
	}

	public static void b() throws HelloException {
		c();
	}

	public static void c() throws HelloException {
		System.out.println("Foo!");
		throw new HelloException();
	}
}