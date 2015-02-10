public class Matpakke implements Spiselig {
	Spiselig a, b;
	public Matpakke(Spiselig a, Spiselig b) {
		this.a = a;
		this.b = b;
	}
	public int getCalories() {
		return a.getCalories() + b.getCalories();
	}
}