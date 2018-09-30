import java.util.Scanner;

public class SepThirtieth1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("enter the length of side:");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
        int i=1,j=1;
		for (i=1;i<=n;i++){
			if((i==1)||(i==n)){
				for(j=1;j<=n;j++){
					System.out.print("*");	
					System.out.print("   ");
				}
					
			System.out.println("\n");
			}
			else
			{
				for(j=1;j<=n;j++){
				if((j==1)||(j==n))	{			
					System.out.print("*");	
				    System.out.print("   ");
				}
				else
					System.out.print("    ");
					
				}
				System.out.println("\n");
			}
			
		}		
	}
}
