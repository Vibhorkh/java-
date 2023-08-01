class BreakContinueEg{


public static void main (String args []){
      for (int i=1;i<=10;i++) {
         if (i==5) {
             //break; //terminate 
             continue; //will skip
        }

       System.out.println(" " + 5*i + " ");
}

           System.out.println ("-------------------");

          int i=1;
          while (i<=10) {

       if (i==5) {
               i++;
             //break; //terminate
           continue; //will skip
           }

          System.out.println(" " + 5*i + " ");
          i++;

       }
     }
  }