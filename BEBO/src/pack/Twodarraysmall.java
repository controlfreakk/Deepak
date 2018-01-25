package pack;
import java.util.Scanner;

class Twodarraysmall
{
public static void main(String[] args) {

			Scanner sn = new Scanner(System.in);
			System.out.println("enter no. of rows ");
			int n=sn.nextInt();
			System.out.println("enter no. of columns ");
			int m=sn.nextInt();
			int arr[][]=new int[n][m];
			
			
			System.out.println("enter the elements");
			for( int i=0;i<n;i++)
			{
				for( int j=0;j<m;j++)
				{
				 		arr[i][j]=sn.nextInt();
				}
			}
			int smallest=arr[0][0];
			for( int i=0;i<n;i++)
			{
				for( int j=0;j<m;j++)
				{
				 		if(smallest>arr[i][j])
				 		{
				 			smallest=arr[i][j];
				 		}	 		
				 		
		       }
			
		    }System.out.println("Smallest number is " +smallest);
	}
}