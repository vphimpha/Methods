public class Methods {
    private static double divideNum;

    public static void main(String[] args){
        double num1 = 20.5;
        double num2 = 10.25;

        divide(num1,num2);

        double dividedNum2 = divide2(num1,num2);

        System.out.println(divideNum);
        System.out.println(divide2(num1,num2));
        System.out.println(dividedNum2);
    }

    public static void divide(double x, double y){
        double z = x/y;
        divideNum = z;
    }
    public static double divide2(double x, double y){
        double z = x/y;
        return z;
    }
}

