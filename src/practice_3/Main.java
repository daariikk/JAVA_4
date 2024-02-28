package practice_3;

public class Main {
    public static void main(String[] args) {
        // Проверка работы SynchronizedSet
        SynchronizedSet<Integer> synchronizedSet = new SynchronizedSet<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronizedSet.add(i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronizedSet.add(i);
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("SynchronizedSet содержит элементы: " + synchronizedSet);

        // Проверка работы SemaphoreList
        SemaphoreList<String> semaphoreList = new SemaphoreList<>();
        Thread thread3 = new Thread(() -> {
            try {
                semaphoreList.add("one");
                semaphoreList.add("two");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread4 = new Thread(() -> {
            try {
                semaphoreList.add("three");
                semaphoreList.add("four");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("SemaphoreList содержит элементы: " + semaphoreList);
    }
}

