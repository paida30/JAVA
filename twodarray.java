{
  int age[][]= {{5,10,15},{20,25,30},{35,40,45}};
  System.out.println("--3x3 Array--");
  for(int i=0;i<3;i++)
{ 
   for (int j=0;j<3;j++)
   {
     System.out.print(age[i][j]+" ");
   }
    System.out.println();
}

//individual assigning a value
  int age2[][]=new int[3][3];
  age2[0][0]=5;
  age2[0][1]=10;
  age2[0][2]=15;
  age2[0][0]=20;
  age2[0][0]=25;
  age2[0][0]=30;
  age2[0][0]=35;
  age2[0][0]=40;
  age2[0][0]=45;