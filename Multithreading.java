class Multithreading {

  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    Thread r1 = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        counter.increment();
        System.out.println("Thread 1: " + counter.counter);
      }
    });

    Thread r2 = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        counter.increment();
        System.out.println("Thread 2: " + counter.counter);
      }
    });

    r1.start();
    r2.start();

    r1.join();
    r2.join();

    System.out.println("Counter: " + counter.counter);
  }
}

class Counter {
  int counter = 0;

  void increment() {
    synchronized (this) {
      counter++;
    }
  }
}

class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Thread Id: " + Thread.currentThread().getId());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Exception: " + e.getMessage());
      }
    }
  }
}

class RunnableThread implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Thread Id: " + Thread.currentThread().getId());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Exception: " + e.getMessage());
      }
    }
  }
}