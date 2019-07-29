import java.lang.*;
import java.util.*; 

/**
 * This class is used to create CLI, REPL, to implement some calculus.
 *
 */
public class Calculator {

    public static void main(String[]  args)
    {
        String arg0 = "";
        try {
             arg0 = args[0];
        }
        catch (java.lang.ArrayIndexOutOfBoundsException ex) {
              System.out.println("Commande non valide ! ");
              System.out.println("Vous pouvez utiliser soit CLI, GUI, WEB comme argument exemple : java Calculator CLI");
              System.exit(0);
              
        } 
        finally {
              System.out.println("Ce code sera executé quoi qu'il arrive");
        }
        

        switch (arg0) {

          case "CLI" : { System.out.println("CLI "); CalculatorCLI cli = new CalculatorCLI(); cli.commandLine(); } break;
          case "GUI" : { System.out.println("GUI "); } break;
          case "WEB" : { System.out.println("WEB "); } break;
          default : { 
              System.out.println("Choix non valide ! ");
              System.out.println("Vous pouvez utiliser soit CLI, GUI, WEB ");
              }
        }
    }
}
