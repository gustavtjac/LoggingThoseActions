import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class LoggingThoseActions {
    private static ArrayList<String> beskeder = new ArrayList<>();



    public static void addLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv din besked");
        String besked = sc.nextLine();
        beskeder.add(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": Adding line: " +"'" +besked+"'");
file.writeToFile(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": Adding line: " +"'" +besked+"'");

    }
    public static void viewLines(){
        beskeder.add(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": Viewing lines");
        int count =0;
        for(String line : beskeder){
            count++;
            System.out.println(count + ": "+line);
        }
        System.out.println("_____________________________________________________________");
        file.writeToFile(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": Viewing lines");
    }
    public static void removeLines(){
        beskeder.add(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": Removing lines");
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv det nummer besked du gerne vil slette");
        String temp = sc.nextLine();
        while (true) {
            try {
                if (Integer.parseInt(temp) - 1 >= 0 && Integer.parseInt(temp) - 1 < beskeder.size()) {
                    beskeder.remove(Integer.parseInt(temp) - 1);
                    System.out.println("Beskeden er slettet");
                    break;
                } else {
                    System.out.println("Den besked findes ikke");
                }
            } catch (Exception e) {
                System.out.println("Forkert input");
            }
        }


        file.writeToFile(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": Removing lines");
    }
    public static void slukProgram(){
        beskeder.add(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": EXIT PROGRAM");
        file.writeToFile(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": EXIT PROGRAM");
        System.exit(0);
    }
    public static ArrayList<String> getLines(){
        return beskeder;
    }




}
