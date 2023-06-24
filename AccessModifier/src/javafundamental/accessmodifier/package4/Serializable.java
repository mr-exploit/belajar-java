package javafundamental.accessmodifier.package4;

public class Serializable {
    class Test implements Serializable {

        // Variabel ini tidak akan dijaga nilainya
        transient int nilaiA;

        // Variabel ini akan dijaga nilainya
        double nilaiB;
        String nilaiC;

    }
}
