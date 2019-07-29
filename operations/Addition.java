package operations;

public class Addition extends Arithmetique
{

   public double operation(double x, double y)
   {
       
       return addition(4.0, 6.0);
   }

   public double addition(double x, double y) {
      double z = x + y;
      return z;
   }
}