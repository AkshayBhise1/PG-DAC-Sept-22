import java.util.Scanner;
class PP5{
    public static void main (String []args){
	     Scanner sc= new Scanner(System.in);
		 System.out.print("enter the last character : ");
		 char num = sc.next().charAt(0);
		 
         for(char i='A';i<=num;i++){
		
		    for(char j='A';j<=i;j++){
			   
			    System.out.print(i+" ");
			}
			
		    System.out.println();
			
		
		}

}




}