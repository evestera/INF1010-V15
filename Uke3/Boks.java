/**
 * Hei!!!
 */
public class Boks<T> implements Beholder<T> {
	private Object[] arr = new Object[1];

	/**
	 * Main and only constructor 
	 *
	 * @param innhold Thing to store in Boks
	 */
	public Boks(T innhold) {
		arr[0] = innhold;
	}

	/**
	 * Main and only constructor 
	 *
	 * @return The thing inserted originally
	 */
	@Override
	@SuppressWarnings("unchecked")
	public T innhold() {
		return (T) arr[0];
	}

	@Override
	public String toString() {
		return "[" + arr[0] + "]";
	}
}

interface Beholder<T> {
	public T innhold();
}