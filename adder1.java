Scanner in = new Scanner(System.in);
System.out.println("How many intergers do you want to add?")
int num1 = in.nextInt();


public class InputLoop
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to continue or a non integer to finish");

        int total = 0;
        int count = 0;
        while (scan.hasNextInt())
        {
            System.out.println("Enter an integer to continue or a non integer to finish");
            int value = scan.nextInt();
            total += value;
            ++count;
            System.out.print("user: ");
        }
        System.out.println ("You entered " + count + " values with a total of " + total);
    }
}