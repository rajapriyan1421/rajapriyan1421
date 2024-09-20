public class UniformRandomNumbers
{
public static void main(String[] args)
{
double r1=Math.random();
double r2=Math.random();
double r3=Math.random();
double r4=Math.random();
double r5=Math.random();
System.out.println(r1);
System.out.println(r2);
System.out.println(r3);
System.out.println(r4);
System.out.println(r5);
double max=Math.max(r1,r2);
max=Math.max(max,r3);
max=Math.max(max,r4);
max=Math.max(max,r5);
System.out.println("maximum value is "+max);
double min=Math.min(r1,r2);
min=Math.min(min,r3);
min=Math.min(min,r4);
min=Math.min(min,r5);
System.out.println("minimum value is "+min);
double sum=r1=r2=r3=r4=r5;
double Avg=sum/5;
System.out.println("Average value is "+Avg);
}
}
