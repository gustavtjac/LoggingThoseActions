import java.io.*;
import java.util.Scanner;

public class file {
   protected static final String dokuNavn = "LoggedActions.txt";

    public static void opdaterFil() {


        try {
            File doku = new File(dokuNavn);
            if (doku.createNewFile()) {
                System.out.println("File created");
            }else{
                System.out.println("File loaded");
            }

        Scanner sc = new Scanner(doku);
        while (sc.hasNextLine()) {
            LoggingThoseActions.getLines().add(sc.nextLine());
        }
        sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeToFile(String text) {

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(dokuNavn,true));
            ps.println(text);
            ps.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
