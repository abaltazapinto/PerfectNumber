//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number)
    {


        if (number < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}