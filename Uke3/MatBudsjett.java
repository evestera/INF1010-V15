import java.util.*;

class MatBudsjett {
	public static void main(String[] args) {
		List<Spiselig> mat = new LinkedList<>();

		mat.add(new Eple());
		mat.add(new Biff(400));
		mat.add(new Matpakke(new Eple(), new Eple()));

		int sum = 0;
		for (Spiselig s : mat) {
			sum += s.getCalories();
		}
		System.out.println("Du har spist " + sum + " kalorier");

		int resultat = mat.stream()
			.map((a) -> a.getCalories())
			.reduce(0, (a, b) -> a + b);
		System.out.println(resultat);
	}
}