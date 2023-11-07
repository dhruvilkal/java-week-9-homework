package calculate;

public class Calculator {
    public void addition(int a, int b){
        int result =a + b;
        System.out.println("Addition of " + a + " and " + b + "is :" + result);
    }
    public void subtraction (int a , int b){
        int result = a - b ;
        System.out.println("subtraction of " + a +  " and " + b + " is:" +result);
    }
    public void multiplication(int a , int b){
        int result = a * b;
        System.out.println("Multiplication of " + a + "and" + b +"is:" + result);
    }
    public void division(int a , int b){
        if(b == 0){
            System.out.println("Division by zero is not allowed");
        }else {
            int result = a / b ;
            System.out.println("Division of " + a +" by "+ b + "is:" + result);
        }
    }
}
