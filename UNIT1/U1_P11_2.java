 //11.2 write a java program of 2d array take manually values.
   
   
   public class U1_P11_2
 {
   public static void main (Strings args[])
   
   {
      int scores[][]={{5,10,15},{20,25,30},{35,40,45}};
	   System.out.println("Manually assigned array elements :");
	   for(int i=0;i<scores.length;i++)
	   {
	     for(int j=0;j<scores[i].length;j++)
		 {
		   System.out.print(scores[i][j]+" ");
		   
		  }
		}
	}