import java.time.LocalDateTime;
import java.util.Scanner;

public class UI {


    public static void visUI(){
        System.out.println("1. Add line:");
        System.out.println("2. Show line:");
        System.out.println("3. Delete line:");
        System.out.println("4. Exit");
    }

    public static void kørProgram(){
        file.opdaterFil();
        LoggingThoseActions.getLines().add(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": STARTING PROGRAM");
        file.writeToFile(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute() + ": STARTING PROGRAM");
        Scanner input = new Scanner(System.in);

        while(true){
            visUI();
            String tempsvar = input.nextLine();
            switch (tempsvar){
                case "1":
                    LoggingThoseActions.addLine();
                    break;
                    case "2":
                        LoggingThoseActions.viewLines();
                        break;
                        case "3":
                            LoggingThoseActions.removeLines();
                            break;
                            case "4":
                                LoggingThoseActions.slukProgram();
                                break;
                                default:
                                    System.out.println("forkert input");
                                    break;
            }


        }


    }

}
