package pack;

public class Pattern2 {
public static void main(String[] args)
{
     int j;
     for(int i = 1; i <= 4; i++) 
  {
      for(j = 1; j <= 5-i; j++) 
       System.out.print(" ");
      for(j = 1; j <= 2*i-1; j++)
       if(j <= i)
      System.out.print((char)(char)(j+64)+""); 
     else
    System.out.print((char)(char)(2*i-j+64)+"");
   System.out.println(); 
  }
 }
}
