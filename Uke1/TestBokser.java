import java.util.Arrays;

class TestBokser {
	public static void main(String[] args) {
		{ // Bruk av ikke-generisk boks
			BoksTilString navn = new BoksTilString("Erik");
			System.out.println(navn.innhold());
		}

		{ // Bruk av generisk boks
			Boks<String> navn = new Boks<>("Erik");
			System.out.println(navn.innhold());

			Boks<Integer> tall = new Boks<>(35);
			System.out.println(tall.innhold());
		}
	}
}