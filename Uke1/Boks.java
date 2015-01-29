class Boks<T> {
	private T innhold;

	public Boks(T innhold) {
		this.innhold = innhold;
	}

	public T innhold() {
		return innhold;
	}

	public String toString() {
		return "[" + innhold + "]";
	}
}
