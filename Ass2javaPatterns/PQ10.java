
class PQ10{
    public static void main (String []args){
	    	
		 
         for(int i=1;i<=5;i++){
			 
		    for(int j=5;j>=i;j--){
			   
			    System.out.print(" ");
		    }
			 
			 
		    for(int j=1;j<=i;j++){
                
			    System.out.print("*");
			}
		    for(int j=5;j>=i;j--){
                if (j==5) continue;
			    System.out.print("*");
			     
			}
			
		    System.out.println();
				
	
		 
		 }	
}

}