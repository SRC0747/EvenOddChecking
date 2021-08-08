public class EvenOdd {
    int num;
    EvenOdd()
    {
        num=0;
    }
    EvenOdd(int x)
    {
        num=x;
    }
    void check()
    {
        if (num%2==0)
            System.out.println(num+" is Even Number.");
        else
            System.out.println(num+" is Even Number.");
    }
}
class  Test
{
    public static void main(String[] args)
    {
        EvenOdd ob=new EvenOdd(44);
        ob.check();
    }
}
