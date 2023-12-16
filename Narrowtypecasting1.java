class Narrowtypecasting1
{
public static void main(String[]args)
{
double d=24.9;
System.out.println("d" +d);
long l=(long)d;
System.out.println("l" +l);
float f=(float)l;
System.out.println("f" +f);
short s=(short)f;
System.out.println("s" +s);
byte b=(byte)s;
System.out.println("b" +b);
}
}