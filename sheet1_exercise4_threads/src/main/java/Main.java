import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException {


        Scanner eingabe = new Scanner(System.in);
        System.out.println("---Information: To quit the Session please press \'-1\'---");
        while(true){
            int res = eingabe.nextInt();
            if(res < 0) break;
            MyThread th = new MyThread(res);
            th.start();
        }
        eingabe.close();
    }
}
