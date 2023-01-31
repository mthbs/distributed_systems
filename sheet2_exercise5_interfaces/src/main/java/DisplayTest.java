public class DisplayTest {

    public static void main(String[] args) {
        Display[] displays = new Display[4];
        displays[0] = new Publication("Hans Fritz","deutsch",6.95);
        displays[1] = new Book("Harry Potter","deutsch",12.95,"Rowling","123456789");
        displays[2] = new Publication("TestVEröff.","englisch",4.49);
        displays[3] = new Car("metallic black",120.0,5000.0);

        for(Display d : displays){
            d.print();
        }
    }

}
