class Grading2
{
public static void main(String[]args)
{
int n=66;
float ava=0;
int i=0;
ava = n/10;
if (ava>9)
{
System.out.println("A+");
}
else if(ava>8)
{
System.out.println("A");
}
else if(ava>7)
{
System.out.println("B+");
}
else if(ava>6)
{
System.out.println("B");
}
else if(ava>5)
{
System.out.println("C+");
}
else if(ava>4)
{
System.out.println("C");
}
else if(ava>3)
{
System.out.println("D");
}
else if(ava>2)
{
System.out.println("D");
}
else
{
System.out.println("FAILED");
}
}
}
