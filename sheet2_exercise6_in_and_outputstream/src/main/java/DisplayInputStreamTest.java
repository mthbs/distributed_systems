import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DisplayInputStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("sheet2_exercise6_in_and_outputstream/src/main/resources/displays.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Display[] object = (Display[]) ois.readObject();
        for(Display d : object){
            d.print();
        }

        ois.close();
        fis.close();

    }

}
