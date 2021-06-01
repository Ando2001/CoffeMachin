import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to drink ?");
        String input = scanner.nextLine();

        Command command = Commandconverter.convert(input);

        CoffeMachin coffeeMachine = new CoffeMachin();
        Cup cup = coffeeMachine.makeproduct(command);
        System.out.println(cup);
        System.out.println();

        try {
            doSomething(input);
        }catch (DrinkTypeExpecion e){
            System.out.println(e.getMassage());
        }
    }
    public static void doSomething(String str) throws DrinkTypeExpecion {
       if(!str.startsWith("T") && !str.startsWith("S") && !str.startsWith("C")){
           throw new DrinkTypeExpecion("Input text starting with T,C,S");

       } else System.out.println(str);
    }
}



