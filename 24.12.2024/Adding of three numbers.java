public class AddThreeNumbers {
    public static int addThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        int result = addThreeNumbers(num1, num2, num3);
        System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + result);
    }
}
