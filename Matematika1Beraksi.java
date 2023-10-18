package tugas2;

public class Matematika1Beraksi {

    
    public static void main(String[] args) {
        Matematika1 matematika = new Matematika1 ();
           int pertambahan = matematika.pertambahan(20,10);
           int pengurangan = matematika.pengurangan(20, 5);
           int perkalian = matematika.perkalian(10,3);
           double pembagian = matematika.pembagian(21, 2);
           System.out.println("Pertambahan : 20+10 = " + pertambahan);
           System.out.println("pengurangan : 20-5 = " + pengurangan);
           System.out.println("perkalian : 10*3 = " + perkalian);
           System.out.println("pembagian : 21/2 = " + pembagian);

    }
}