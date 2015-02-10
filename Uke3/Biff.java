public class Biff implements Spiselig {
	int grams;
	public Biff(int grams) {
		this.grams = grams;
	}
	public int getCalories() {
		return grams * 32;
	}
}