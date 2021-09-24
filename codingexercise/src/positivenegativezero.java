public class positivenegativezero {

    public static void main(String[] args) {
        checknumber(5);
        checknumber(-10);
        checknumber(0);
    }

    public static void checknumber(int number)
    {
        if(number>0)
        {
            System.out.println("positive");
        }
        else if(number<0)
        {
            System.out.println("Negative");
        }
        else if (number == 0)
        {
            System.out.println("zero");
        }
    }
}
