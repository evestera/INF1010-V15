import java.util.*;

class Casting {
	public static void main(String[] args) {
		Set<Object> fruktKurv = new HashSet<>();

		fruktKurv.add(new Eple());
		fruktKurv.add(new Eple());
		fruktKurv.add(new Appelsin());
		fruktKurv.add(new Frukt());
		fruktKurv.add("Hei");

		int sum = 0;

		for (Object f : fruktKurv) {

			if (f instanceof Eple) {
				Eple e = (Eple) f;

				System.out.println("Nam!");
				System.out.println(e.farge());
			}
			if (f instanceof Appelsin) {
				System.out.println("Æsj!");
			}

			if (f instanceof Frukt) {
				sum += 1;
			}
		}

		System.out.println("Antall: " + sum);
	}
}

class Frukt {}

class Eple extends Frukt {
	public String farge() {
		return "Grønn";
	}
}

class Appelsin extends Frukt {}