//9 Write a  java program to find out students result/grade using IF condition.

import java.util.Scanner;
   
   public class U1_P9
   {
	   public static void main(String args[])
	   {
		   Scanner scn = new Scanner(System.in);
		   
		   
		  System.out.println("Enter gr no.:");
		  int grno = scn.nextInt();
		  scn.nextLine();
		  System.out.println("Enter name:");
		  String name = scn.nextLine();
		  System.out.println("Enter marks subject of 1:");
		  int s1 = scn.nextInt();
		  System.out.println("Enter marks subject of 2:");
		  int s2 = scn.nextInt();
		  System.out.println("Enter marks subject of 3:");
		  int s3 = scn.nextInt();
	      System.out.println("Enter marks subject of 4:");
		  int s4 = scn.nextInt();
		  System.out.println("Enter marks subject of 5:");
		  int s5 = scn.nextInt();
		  
		  int total = s1+s2+s3+s4+s5;
		  float per = total/5;
		  
		   String result,grade;
		   
		   if(per>=35)
		   {
			   result="Pass";
			   if (per>=90)
				   grade="A+";
			   else if (per>=80)
				   grade="A";
			    else if (per>=70)
				   grade="B";
			    else if (per>=60)
				   grade="C";
			    else 
				   grade="D";
		   }
		   else
		   {
			   result="Fail";
			   grade="F";
		   }
            System.out.println("\n");
			System.out.println("| STUDENT RESULT |");
			System.out.println("|----------------------|");
			System.out.println("| GR no.|"+grno);
			System.out.println("|----------------------|");
			System.out.println("| Name |"+name);
			System.out.println("|----------------------|");
			System.out.println("| Subject 1|"+s1);
			System.out.println("| Subject 2|"+s2);
			System.out.println("| Subject 3|"+s3);
			System.out.println("| Subject 4|"+s4);
			System.out.println("| Subject 5|"+s5);
			System.out.println("|----------------------|");
			System.out.println("| Total marks|"+total);
			System.out.println("| Percentage||"+per);
			System.out.println("| Grade|"+grade);
			System.out.println("| Result|"+result);
			
			scn.close();
	   }
   }
   
			
			
			
			
