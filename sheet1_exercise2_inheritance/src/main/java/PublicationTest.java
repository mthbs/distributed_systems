public class PublicationTest {

    public static void main(String[] args) {
        Publication[] publications = new Publication[3];
        publications[0] = new Publication("Hans Fritz","deutsch",6.95);
        publications[1] = new Book("Harry Potter","deutsch",12.95,"Rowling","123456789");
        publications[2] = new Publication("TestVEröff.","englisch",4.49);

        for(Publication p : publications){
            p.print();
        }
    }

}
