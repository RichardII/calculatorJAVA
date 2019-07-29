
import java.lang.*;
import java.util.*;
import operations.*; 

public class CalculatorCLI {

    public CalculatorCLI()
    {

    }

    public void commandLine()
    {
         Scanner in = new Scanner(System.in);  
         
         while (true) {

             System.out.print("PROMPT-Calculator>");
             String cmd = in.nextLine();

             if(cmd.equals("add")) { choixOperation(cmd); }

             System.out.println(cmd); 



             in.close();  
         }
         
    }

    public void choixOperation(String cmd)
    {
        
     switch (cmd) {

          case "add" : { System.out.println("add");
                         Addition add = new Addition(); 
                         double resultat = add.operation(4.0,6.0); 
                         System.out.println(resultat); } break;
          case "subtract" : {  } break;
          case "divide" : {  } break;
          case "multiply" : {  }  break;
          default : { System.out.println("Choix non valide ! ");}

     }
    }
        
}