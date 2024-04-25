package practice_3;

import java.util.HashSet;
import java.util.Set;

public class SynchronizedSet<T> {
    private final Set<T> set = new HashSet<>();

    public synchronized boolean add(T element) {
        return set.add(element);
    }

    public synchronized boolean remove(T element) {
        return set.remove(element);
    }

    public synchronized boolean contains(T element) {
        return set.contains(element);
    }

    @Override
    public synchronized String toString() {
        return set.toString();
    }
}
