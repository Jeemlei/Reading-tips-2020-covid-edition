package readingtips.ui;
import readingtips.ui.UI;
import java.util.Scanner;

public class Konsoli implements IO {
    private Scanner lukija;

    public Konsoli() {
        lukija = new Scanner(System.in);
    }
    // @Override 
    // public int nextInt() {
    //     return lukija.nextInt();
    // }
    @Override 
    public String nextLine() {
        return lukija.nextLine();
    }
    @Override 
    public void print(String m) {
        System.out.println(m);
    }

}
