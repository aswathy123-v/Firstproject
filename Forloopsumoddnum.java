class Forloopsumoddnum
{
public static void main(String[]args)
{
int n=10;
int sum=0;
for(int i=0;i<=n;i++)
{
if(i%2==1)
{
sum+=i;
}
}
System.out.println("sum is "+sum);
}
}