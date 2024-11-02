public class expressioneval1 {
    public static float evaluate() {
   float exp= (float) ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    return exp;
    }
    public static void main(String[] args) {
        float receive;
     
        receive= evaluate();

        System.err.println("The Evalution of the Expression:"+ receive);

     
    }
    
}
