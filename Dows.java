class Dows
{
public static void main(String[]args)
{
int n=10,i=0,sum=0;
do
{
if(i%2==0)
{
sum+=i;
}
i++;
}
while(i<=n);
System.out.println("sum is" +sum);
}
}
