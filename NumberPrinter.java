public class NumberPrinter
{
public static void main(String[] args)
{
    int Start=1000;
    int End=2000;
    int numbersPerLine=5;
    for(int i=Start;i<=End;i++)
    {
        System.out.print(i+" ");
        if((i-Start+1) % numbersPerLine==0)

        {
            System.out.println();
        }
        }
    }
}
