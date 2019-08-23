public class HelloInput
{
    public static void main(String[] args)
    {
        if (args.length !=2)
        {
            System.out.println("Usage: jave HelloInput firstName lastName");
        }
        else
        {
            String firstName = args[0];
            String lastName = args[1];
            System.out.println("hello, " + firstName + "" + lastName);
        }
    }
}