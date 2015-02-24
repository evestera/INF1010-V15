class FooBarRuntime {
	static class ShouldNotHappenException extends RuntimeException {}

	public static void main(String[] args) {
		a();
		System.out.println("Bar!");
	}

	public static void a() {
		b();
	}

	public static void b() {
		c();
	}

	public static void c() {
		System.out.println("Foo!");
		throw new ShouldNotHappenException();
	}
}