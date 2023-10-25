public class Main {
    public static void main(String[] args) {
        //Pacients
        Pacient p1 = new Pacient();
        p1.alergies = "res";
        p1.alcada = 1.80;
        p1.cognom = "Carrión";
        p1.nom = "Davide";
        p1.genere = "Masculí";
        p1.malaltiesCroniques = "5";
        p1.medicament = "Paracetamol";
        p1.operacionsQuirurgiques = "abc";
        p1.pes = 85.5;

        Pacient p2 = new Pacient();
        p2.alergies = "res";
        p2.alcada = 1.50;
        p2.cognom = "Herreo";
        p2.nom = "Nacho";
        p2.genere = "Masculí";
        p2.malaltiesCroniques = "4";
        p2.medicament = "Paracetamol";
        p2.operacionsQuirurgiques = "abc";
        p2.pes = 30.5;

        Pacient p3 = p1;
        p2.alergies = "res";
        p2.alcada = 1.30;
        p2.cognom = "Martín";
        p2.nom = "Alex";
        p2.genere = "Masculí";
        p2.malaltiesCroniques = "3";
        p2.medicament = "Paracetamol";
        p2.operacionsQuirurgiques = "abc";

        //Fruiteria
        Fruiteria f1 = new Fruiteria();
        f1.cantidadFrutaVendida = 1;
        f1.precioFrutaVendida = 100.5f;
        f1.dineroGanadoTotal = 100000f;

        //Carta
        Carta c1 = new Carta();
        c1.puntsMana = 1;
        c1.daurada = true;
        c1.nomCarta = "Grito Grommash";
        c1.puntsAtac = 2;
        c1.puntsVida = 3;
        c1.tipusCarta = "Legendaria";
        c1.dibuixCarta = "URL";

        //Pacients
        System.out.println("Davide: " + p1.alergies);
        System.out.println("Davide: " + p1.alcada);
        System.out.println("Davide: " + p1.cognom);
        System.out.println("Davide: " + p1.nom);
        System.out.println("Davide: " + p1.genere);
        System.out.println("Davide: " + p1.malaltiesCroniques);
        System.out.println("Davide: " + p1.medicament);
        System.out.println("Davide: " + p1.operacionsQuirurgiques);
        System.out.println("Davide: " + p1.pes);

        //Espai
        System.out.println("");

        System.out.println("Nacho: " + p2.alergies);
        System.out.println("Nacho: " + p2.alcada);
        System.out.println("Nacho: " + p2.cognom);
        System.out.println("Nacho: " + p2.nom);
        System.out.println("Nacho: " + p2.genere);
        System.out.println("Nacho: " + p2.malaltiesCroniques);
        System.out.println("Nacho: " + p2.medicament);
        System.out.println("Nacho: " + p2.operacionsQuirurgiques);
        System.out.println("Nacho: " + p2.pes);

        //Espai
        System.out.println("");

        System.out.println("Alex: " + p3.alergies);
        System.out.println("Alex: " + p3.alcada);
        System.out.println("Alex: " + p3.cognom);
        System.out.println("Alex: " + p3.nom);
        System.out.println("Alex: " + p3.genere);
        System.out.println("Alex: " + p3.malaltiesCroniques);
        System.out.println("Alex: " + p3.medicament);
        System.out.println("Alex: " + p3.operacionsQuirurgiques);
        System.out.println("Alex: " + p3.pes);

        //Espai
        System.out.println("");
        //Fruiteria
        System.out.println("f1: " + f1.cantidadFrutaVendida);
        System.out.println("f1: " + f1.precioFrutaVendida);
        System.out.println("f1: " + f1.dineroGanadoTotal);

        //Espai
        System.out.println("");
        //Carta
        System.out.println("c1: " + c1.puntsMana);
        System.out.println("c1: " + c1.daurada);
        System.out.println("c1: " + c1.nomCarta);
        System.out.println("c1: " + c1.puntsAtac);
        System.out.println("c1: " + c1.puntsVida);
        System.out.println("c1: " + c1.tipusCarta);
        System.out.println("c1: " + c1.dibuixCarta);
    }

}