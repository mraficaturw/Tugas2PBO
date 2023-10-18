package tugas2;

public class BingoSong {
    String A, B, C, D, E, clap;
    
    public BingoSong(){
        this.A = "B";
        this.B = "I";
        this.C = "N";
        this.D = "G";
        this.E = "O";
        this.clap = "(clap)";
    }

    public void TextBingo(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(A+"-"+B+"-"+C+"-"+D+"-"+E);
        System.out.println(A+"-"+B+"-"+C+"-"+D+"-"+E);
        System.out.println(A+"-"+B+"-"+C+"-"+D+"-"+E);
        System.out.println("And Bingo was his name-o.");
        System.out.println();
    }
    
public void TampilanBingo(){
        for (int x = 0; x <= 5; x++){
            if (x > 0) {
                if (x == 1) this.A = clap;
                if (x == 2) this.B = clap;
                if (x == 3) this.C = clap;
                if (x == 4) this.D = clap;
                if (x == 5) this.E = clap;
            }
            TextBingo();
        }
    }
}