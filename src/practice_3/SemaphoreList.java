package practice_3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaphoreList<T> {
    private final List<T> list = new ArrayList<>();
    private final Semaphore semaphore = new Semaphore(1);

    public void add(T element) throws InterruptedException {
        semaphore.acquire();
        try {
            list.add(element);
        } finally {
            semaphore.release();
        }
    }

    public void remove(T element) throws InterruptedException {
        semaphore.acquire();
        try {
            list.remove(element);
        } finally {
            semaphore.release();
        }
    }

    public boolean contains(T element) throws InterruptedException {
        semaphore.acquire();
        try {
            return list.contains(element);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public synchronized String toString() {
        return list.toString();
    }
}