import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double power,base,result = 1;
        System.out.print("Enter a base number: ");
        base = s.nextDouble();
        System.out.print("Enter a power number: ");
        power = s.nextDouble();
        if (power < 0)
        {
            power *= -1;
            for (int i = 0; i <power;i++)
            {
                result *= base;
            }
            result = 1 / result;
        }
        else
        {
            for (int i = 0; i <power;i++)
            {
                result *= base;
            }
        }
        System.out.printf("Answer: %f", result);
    }




}
