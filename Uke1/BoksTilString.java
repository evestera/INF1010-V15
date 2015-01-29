class BoksTilString {
	private String innhold;

	public BoksTilString(String innhold) {
		this.innhold = innhold;
	}

	public String innhold() {
		return innhold;
	}

	public String toString() {
		return "[" + innhold + "]";
	}
}
