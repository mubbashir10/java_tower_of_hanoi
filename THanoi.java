//importing classes
import java.util.*;


public class THanoi {
 
   //static variables
   static Map<String, String> index = new HashMap<String, String>();
   static int i = 0;

   //transfer method
   public void Solve(int n, String Src, String Aux, String Dst){

      //base case   
      if (n == 1)
         //System.out.println(Src + " -> " + Dst); 
         index.put("Moves "+i,Src + " -> " + Dst);

      else{

         //A to B
         Solve(n - 1, Src, Dst, Aux);    

         //System.out.println(Src + " -> " + Dst);  
         index.put("Moves "+i,Src + " -> " + Dst);

         //B to C
         Solve(n - 1, Aux, Src, Dst); 
      }

      i++;
      
   }

   public static void main(String[] args) {
   
      //making object
      THanoi THanoi = new THanoi();  

      //calling transfer method
      THanoi.Solve(8, "Tower A", "Tower B", "Tower C");

      //looping map
      for (Map.Entry<String, String> entry : index.entrySet())
            System.out.println(entry.getKey()+" : "+entry.getValue());
   }
}