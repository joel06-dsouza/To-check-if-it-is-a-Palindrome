class Palindrome
{
   public static void main(String A[])
    {
       int num = 12121, reversedno = 0, remainder, originalno;
       
       originalno = num;
       while(num != 0 )
       {
           remainder = num % 10;
           reversedno = reversedno * 10 + remainder;
           num = num/10;
       }

       if(originalno == reversedno)
       {
             System.out.println(originalno +" is a palindrome");
       }     
       else  
       {     
            System.out.println(originalno +" is not a palindrome");      
       }
    }
}