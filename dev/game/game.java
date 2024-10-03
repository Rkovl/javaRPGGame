package javaRPGGame.dev.game;
import java.util.Scanner;

public class game {
    static Scanner input = new Scanner(System.in);
    static int validInput;

//----------------------------------------COMMMAND LINE MANIPULATION--------------

    public static void nextInt(){
        while(!input.hasNextInt()){
            System.out.println("INPUT ERROR (Please Try Again)");
            input.next();
        }
        validInput = input.nextInt();
    }

    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void main(String[] args) {
        clear();
        System.out.println("""
THE HOLY TEN
1.) Start
2.) Load 
3.) Exit 
""");
        nextInt();
        switch (validInput) {
            case 1:
                //start();
                break;
            case 2:
                //load();
                break;
            case 3:
                //quit();
                break;
            default:
                //quit();
                break;
        }
        
    }
}
