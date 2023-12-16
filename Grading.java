class Grading
{
public static void main(String[]args)
{
int n=99;
float ava=0;
int i=0;
ava = n/10;
for(i=0;i<=100;i++)
{
if (ava>9)
{
System.out.println("A");
}
else if(ava>8)
{
System.out.println("B");
}
else 
{
System.out.println("FAILED");
}
}
}
}