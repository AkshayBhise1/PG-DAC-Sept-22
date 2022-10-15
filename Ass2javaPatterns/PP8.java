import java.util.Scanner;
class PP8{
    public static void main (String []args){
	     Scanner sc= new Scanner(System.in);
		 System.out.print("enter the number : ");
		 int num = sc.nextInt();	
		 
         for(int i=num;i>=1;i--){
		    for(int j=1;j<=i;j++){
			   
			    System.out.print(" ");
			}
		
		    for(int j=i;j<=num;j++){
			   
			    System.out.print(j+" ");
			}
			
		    System.out.println();
			
		
		}

}




}