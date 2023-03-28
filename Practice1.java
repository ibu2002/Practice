public class Practice1 {

  // Writing Method for Adding two double variable
    public static double addition(double number1,double number2){
        double add = number1 + number2;
        return add;
    }
  // Writing Method for Multiplying three Short variables 

    public static short multiplication(short num1, short num2, short num3) {
        short multiply = (short) (num1 * num2 * num3);
        return multiply;
    }

  //Writing method for Adding two float variable 
    public static float sum(float a, float b) {
        float result = (float) (a + b);
        return result;
    }

  //writing method for swapind two numbers
    public static void numSwap(int val1, int val2) {

      // System.out.println("The Value before swap val1 is: "+val1+"  val2 is : "+val2);
        int temp;
        temp = val1;

        val1 = val2;
        val2 = temp;
    //   System.out.println("The value after swap val1 is : "+val1+"  val2 is : "+val2);

       
    }

    public static int swapNum(int value1, int value2) {
        System.out.println("The Value before swap value1 is: "+value1+"  value2 is : "+value2);

        numSwap(value1, value2);

        System.out.println("The value after swap value1 is : "+value1+"  value2 is : "+value2);


        return 0;

    }

   

    
    public static void main(String[] args) {
        
        //calling the method name called addition
         double add = Practice1.addition(20.8362, 30.8352);
         System.out.println(add);

         //calling the method name called multiplication
         short multiply = Practice1.multiplication((short) 3,(short) 3,(short) 3);
         System.out.println(multiply);

         //calling the method name caleed sum 
         float result = Practice1.sum((float) 20.98, (float)18.98);
         System.out.println(result);

         //calling the method name called swapNum
         
         Practice1.swapNum(20,30);

        // Practice1.numSwap(10,20);

    }
}