package tugas2;

public class Matematika1 implements NewInterface {
    @Override
  public int pertambahan(int a, int b){
    return a + b; }
    @Override
   public int pengurangan(int a, int b){
    return a - b; }
    @Override
   public int perkalian(int a, int b){
    return a * b; }
    @Override
   public double pembagian(int a, int b){
    return a / b; }
}  
