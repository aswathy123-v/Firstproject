class Arrayp5
 {
   public static void main(String[] args)
    {
     int arr[]={5, 3, 9, 8};
     int temp=0;
     System.out.println("Original elements"+arr);
     for(int i=0;i<arr.length;i++)
        {
     for(int j=i+1;j<arr.length;j++)
          {
       if(arr[i]>arr[j])
        {
          temp=arr[i];
          arr[i]= arr[j];
          arr[j]=temp;
           } 
         } 
}
for(int i=0;i<arr.length;i++)
     {
System.out.println("assignding order" +arr[j]);
}
}
}