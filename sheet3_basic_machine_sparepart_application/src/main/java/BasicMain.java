public class BasicMain {

    public static void main(String[] args) {

        SparePart s1 = new SparePart(1l,"Schraube",2.5);
        SparePart s2 = new SparePart(2l,"Schraubenzieher",15.0);
        SparePart s3 = new SparePart(3l,"Schlüssel",10.0);
        SparePart s4 = new SparePart(4l,"Schlüsselring",10.0);
        SparePart s5 = new SparePart(5l,"Autoreifen",210.0);

        Machine bosch = new Machine("Bosch");
        bosch.addANewSparePart(s1);
        bosch.addANewSparePart(s2);
        bosch.addANewSparePart(s5);

        // calculate the price:
        double sum_bosch = 0.0;
        for(SparePart s: bosch.getSpareParts()){
            sum_bosch += s.getPrice();
        }

        Machine siemens = new Machine("Siemens");
        siemens.addANewSparePart(s1);
        siemens.addANewSparePart(s3);
        siemens.addANewSparePart(s4);

        // calculate the price:
        double sum_siemens = 0.0;
        for(SparePart s: siemens.getSpareParts()){
            sum_siemens += s.getPrice();
        }

        System.out.println("Bosch - Total SpareParts-Price: " + sum_bosch + "€");
        System.out.println("Siemens - Total SpareParts-Price: " + sum_siemens + "€");

    }
}
