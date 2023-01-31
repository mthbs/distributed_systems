import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class DisplayOutputStreamTest {

    public static void main(String[] args) throws IOException {

        // Objekte initialisieren

        Display[] displays = new Display[4];
        displays[0] = new Publication("Hans Fritz","deutsch",6.95);
        displays[1] = new Book("Harry Potter","deutsch",12.95,"Rowling","123456789");
        displays[2] = new Publication("TestVEröff.","englisch",4.49);
        displays[3] = new Car("metallic black",120.0,5000.0);

        // Objekte auslesen

        for(Display d : displays){
            d.print();
        }

        // Objekte in einer Datei speichern

        FileOutputStream fos = new FileOutputStream("sheet2_exercise6_in_and_outputstream/src/main/resources/displays.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(displays);
        oos.close();
        fos.close();

    }

}
