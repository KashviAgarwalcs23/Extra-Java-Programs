class MyRunnable implements Runnable {
    private String threadName;
    private int threadNumber;

    public MyRunnable(String name, int number) {
        this.threadName = name;
        this.threadNumber = number;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Iteration " + i);

             if (threadNumber == 2 && i == 4) {
                System.out.println(threadName + " is terminating after iteration " + i);
                return; 
            }

               if (threadNumber == 3 && i == 2) {
                try {
                    System.out.println(threadName + " is sleeping for 2 seconds after iteration " + i);
                    Thread.sleep(2000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
       
        MyRunnable firstThreadRunnable = new MyRunnable("FIRST", 1);
        MyRunnable secondThreadRunnable = new MyRunnable("SECOND", 2);
        MyRunnable thirdThreadRunnable = new MyRunnable("THIRD", 3);

        Thread firstThread = new Thread(firstThreadRunnable);
        Thread secondThread = new Thread(secondThreadRunnable);
        Thread thirdThread = new Thread(thirdThreadRunnable);

        firstThread.setName("FIRST");
        secondThread.setName("SECOND");
        thirdThread.setName("THIRD");

        firstThread.start();
        secondThread.start();
        thirdThread.start();
System.out.println("Name: Kashvi Agarwal");
System.out.println("USN : 1BM23CS142");
    }
}
