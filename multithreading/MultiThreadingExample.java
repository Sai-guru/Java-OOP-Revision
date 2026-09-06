/*
 * MULTI-THREADING
 * A thread is an independent path of execution. `start()` creates/schedules a
 * new thread; calling `run()` directly would execute on the current thread.
 */
public class MultiThreadingExample {
    static class CounterTask implements Runnable {
        private final String name;

        CounterTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int count = 1; count <= 3; count++) {
                System.out.println(name + ": " + count);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(new CounterTask("Worker A"));
        Thread second = new Thread(new CounterTask("Worker B"));
        first.start();
        second.start();
        first.join();
        second.join(); // main waits until both workers finish
        System.out.println("Both workers completed.");
    }
}
