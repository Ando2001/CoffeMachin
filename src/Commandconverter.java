import java.util.Scanner;

public class Commandconverter {
        public static Command convert(String input){
            Scanner scanner = new Scanner(System.in);
            Command command = new Command();

            String[] split =input.split(":");

            extractDrinkType(command, split);
            command.setSugarQuantity(Integer.parseInt(split[1]));
            return command;

        }
        private static void extractDrinkType(Command command, String[] split) {
            switch (split[0]) {
                case "T":
                    command.setDrinkType(DrinkType.TEA);
                    break;
                case "C":
                    command.setDrinkType(DrinkType.COFFEE);
                    break;
                case "S":
                    command.setDrinkType(DrinkType.CHOCOLATE);
                    break;
                }
            }
        }

