import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Test");
        HashSet<String> set = new HashSet<>();
        Scanner eingabe = new Scanner(System.in);
        System.out.println("---Information: To quit the Session please press \'q\'---");
        while(true) {
            System.out.print("Please insert a String: ");
            String s = eingabe.next();
            if(s.equals("q"))
                break;
            set.add(s);
        }
        eingabe.close();

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
