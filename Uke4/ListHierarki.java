public class ArrayList<E>
    extends AbstractList<E>
    implements List<E> {}

public abstract class AbstractList<E>
    extends AbstractCollection<E>
    implements List<E> {}

public abstract class AbstractCollection<E>
    implements Collection<E> {}

public interface Collection<E>
    extends Iterable<E> {}

public interface Iterable<T> {}

public interface List<E>
    extends Collection<E> {}







public class LinkedList<E>
    extends AbstractSequentialList<E>
    implements List<E>, Deque<E> {}

public abstract class AbstractSequentialList<E>
    extends AbstractList<E> {}

public interface Deque<E>
    extends Queue<E> {}

public interface Queue<E>
    extends Collection<E> {}