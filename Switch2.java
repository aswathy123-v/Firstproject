class Switch2
{
   public static void main(String[]args)
  {
    String fruit="banana";
    String message;
switch (fruit)
{
case"apple":
    message="you chose an apple.";
     break;
case"banana":
    message="you picked a banana."; 
     break;
case"orange":
     message="you selected an orange.";
      break;
default:
   message="Sorry,we don't have that fruit.";
break;
}
System.out.println(message);
           
}
}