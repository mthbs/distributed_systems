public class MyThread extends Thread{

    private int number;

    public MyThread(int number) {
        this.number = number;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(number);
            if(i == 4) break;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
