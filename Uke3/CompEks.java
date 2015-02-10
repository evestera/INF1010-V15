import java.util.*;

class CompEks {
	public static void main(String[] args) {
		ArrayList<Person> ls = new ArrayList<>();
		ls.add(new Person("Kåre"));
		ls.add(new Person("Roger"));
		ls.add(new Person("Per"));
		ls.add(new Person("Erik"));
		ls.add(new Person("Anne"));
		Collections.sort(ls);
		System.out.println(ls);

		Collections.sort(ls, new Comparator<Person>() {
			public int compare(Person a, Person b) {
				return b.getNavn().compareTo(a.getNavn());
			}
		});
		System.out.println(ls);
	}
}

class Person implements Comparable<Person> {
	private String navn;

	Person(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	@Override
	public int compareTo(Person o) {
		return navn.compareTo(o.navn);
	}

	@Override
	public String toString() {
		return navn;
	}
}