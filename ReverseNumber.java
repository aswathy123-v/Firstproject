class ReverseNumber
{
public static void main(String[]args)
{
int num=252788,rem,rev=0,tem;
tem=num;
while(num!=0)
{
rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}
System.out.println("Reversed number is"+rev);
}
}