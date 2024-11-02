public class expressioneval2 {
    public static double evaluate2() {
        double exp= ((float) 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
         return exp;
         }
         public static void main(String[] args) {
             double receive;
          
             receive= evaluate2();
     
             System.err.println("The Evalution of the Expression:"+ receive);
     
          
         }
    
}
