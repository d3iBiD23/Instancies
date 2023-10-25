public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient();
        p1.alergies = "res";
        p1.alcada = 1.80;
        p1.cognom = "Carrión";
        p1.nom = "Davide";
        p1.genere = "Masculí";
        p1.malaltiesCroniques = "";
        p1.medicament = "Paracetamol";
        p1.operacionsQuirurgiques = "abc";
        p1.pes = 85.5;

        System.out.println("Davide: " + p1.nom);
    }
}