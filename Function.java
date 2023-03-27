/**
 * Function
 */
public class Function {

  public static double addition(double num1, double num2) {
    double add = num1 + num2;
    return add;
  }

  public static short multiply(short val1, short val2, short val3) {
    short multi = (short) (val1 * val2 * val3);
    return multi;
  }

  public static float sum(float number1, float number2) {
    float sum = number1 + number2;
    return sum;
  }

  public static int numSwap(int numA, int numB) {

    int temp = numA;

    System.out.println("Before swap: numA = " + numA + ", numB = " + numB);
    // Swapping the values of the two variable
    numA = numB;
    numB = temp;

    System.out.println("After swap: numA = " + numA + ", numB = " + numB);
    return 0;
  }

  public static void main(String[] args) {

    Function.numSwap(10, 20);

    double add = Function.addition(20.62, 56.9867);
    System.out.println(add);

    short multiplication = Function.multiply((short) 2, (short) 2, (short) 2);
    System.out.println(multiplication);

    float sum = Function.sum((float) 38.21, (float) 63.58);
    System.out.println(sum);

  }

}