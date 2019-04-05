package controlStatements;

class Patterns 
{
	public static void main(String[] args)
	{
		for(int i=0;i<=10;i++)
		   System.out.println(i);
		
		System.out.println("---------------------------------");
		for(int i=0;i<=10;i++)
			System.out.print(i);
		
		System.out.println();
		System.out.println("---To print 10,20,30...100--------");
		for(int i=1;i<=10;i++)
            System.out.print(i*10);
		
		System.out.println();
		System.out.println("---To print 10, 1's Horizontally---");
		for(int i=1;i<=10;i++)
            System.out.print(1);
		
		System.out.println();
		System.out.println("---To print 10, 1's vertically---");
		for(int i=55;i<=64;i++)
            System.out.println(1);
		/*for(int i=64;i>=55;i--)
            System.out.println(1);*/
		
		System.out.println();
		System.out.println("----To Print Even numbers--------");
		for(int i=2;i<=100;i+=2)
            System.out.println(i);
		
		System.out.println();
		System.out.println("-----To Print Odd numbers--------");
		for(int i=1;i<=100;i+=2)
            System.out.println(i); 
	
/*
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
		 */
		
		System.out.println();
		System.out.println("-----To Print above displayed pattern----");
		for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
					System.out.print(1);
					System.out.println();
			}
		 
		
/*
1111111111
2222222222
3333333333
4444444444
5555555555
6666666666
7777777777
8888888888
9999999999
101010101010101010101
 */
		System.out.println();
		System.out.println("-----To Print above displayed pattern----");
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
/*
5X1=5
5X2=10
5X3=15
5X4=20
5X5=25
5X6=30
5X7=35
5X8=40
5X9=45
5X10=50
*/
		System.out.println();
		System.out.println("-----To Print pattern of 5 1s table----");
		for(int i=1;i<=10;i++)
			System.out.println(5 + "X" + i + "=" + (5*i));
			
/*To print pattern of tables from 1 to 10 */
		
		System.out.println();
		System.out.println("-----To print pattern of tables from 1 to 10----");
		for(int i=1;i<=10;i++) 
		{
			for(int j=1;j<=10;j++)
			{
			System.out.println(i + "X" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
/*
12345678910
11121314151617181920
21222324252627282930
31323334353637383940
41424344454647484950
51525354555657585960
61626364656667686970
71727374757677787980
81828384858687888990
919293949596979899100
 */
		System.out.println();
		System.out.println("-----To print above displayed pattern----");
		int ctr=1;
		for(int i=1;i<=10;i++)
	       {
	            for(int j=1;j<=10;j++)
	            {
	               System.out.print(ctr++);
	            }
	             System.out.println();
	        }
		
/*
102030
405060
708090
 */
		System.out.println();
		System.out.println("-----To print above displayed pattern----");
		int val=10;
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
              System.out.print(val);
               val+=10;
             }
            System.out.println();
         }
/*
1
22
333
4444
 */	
		System.out.println();
		System.out.println("-----To print above displayed pattern----");
		for(int i=1;i<=4;i++)
        {
          for(int j=1;j<=i;j++)
          {
              System.out.print(i);
           }
          System.out.println();
         }
		
/*
1
12
123
1234
 */
		System.out.println();
		System.out.println("-----To print above displayed pattern----");
		for(int i=1;i<=4;i++)
        {
          for(int j=1;j<=i;j++)
          {
              System.out.print(j);
           }
          System.out.println();
         }
/*
1
23
456
78910
 */		  System.out.println();
		  System.out.println("-----To print above displayed pattern----");
          int cntr=1;
          for(int i=1;i<=4;i++)
          {
            for(int j=1;j<=i;j++)
             {
                System.out.print(cntr++);
             }
            System.out.println();
           }  
/*
   1
  23
 456
78910
 */		  System.out.println();
		System.out.println("-----To print above displayed pattern----");
          int cntr1=1;
          for(int i=1;i<=4;i++)
          {
        	for(int k=1;k<=4-i;k++)
        		System.out.print(" ");
        		
            for(int j=1;j<=i;j++)
             {
                System.out.print(cntr1++);
             }
            System.out.println();
           }
/*
   1 
  2 3 
 4 5 6 
7 8 9 10  
 */
          System.out.println();
  		System.out.println("-----To print above displayed pattern----");
          int cntr2=1;
          for(int i=1;i<=4;i++)
          {
        	for(int k=1;k<=4-i;k++)
        		System.out.print(" ");
        		
            for(int j=1;j<=i;j++)
             {
                System.out.print(cntr2++ + " ");
             }
            System.out.println();
           }
          
/*
1    
 2   
  3  
   4 
    5
 */		
          System.out.println();
  		System.out.println("-----To print above displayed pattern----");
          for(int i=1;i<=5;i++)
          {
            for(int j=1;j<=5;j++)
            {
                if(i==j)
                 System.out.print(j);
                else
                 System.out.print(" ");
            }
               System.out.println();
          }
          
/*
1      5
  2  4  
    3    
  2  4  
1      5
 */
          System.out.println();
  		System.out.println("-----To print above displayed pattern----");
          for(int i=1;i<=5;i++)
          {
            for(int j=1;j<=5;j++)
            {
                if(i==j|| (i+j)==6)
                 System.out.print(j);
                else
                 System.out.print("  ");
            }
               System.out.println();
          }
/*
1      1
  2  2  
    3    
  4  4  
5      5
 */
          System.out.println();
  		System.out.println("-----To print above displayed pattern----");
          for(int i=1;i<=5;i++)
          {
            for(int j=1;j<=5;j++)
            {
                if(i==j|| (i+j)==6)
                 System.out.print(i);
                else
                 System.out.print("  ");
            }
               System.out.println();
          }
/*
K     
 R    
  U   
   S  
    H 
     I
 */
          System.out.println();
  		System.out.println("-----To print above displayed pattern----");
          String name ="KRUSHI";
          for(int i=0;i<6;i++)
          {
             for(int j=0;j<6;j++)
             {
               if(i==j)
                 System.out.print(name.charAt(j));
               else
                  System.out.print(" ");
              }
             System.out.println();
           }
          
 /*
 S      Y
  U  N  
    N    
  U  N  
S      Y
  */
          System.out.println();
  		System.out.println("-----To print above displayed pattern----");
          String name1="SUNNY";
          for(int i=0;i<5;i++)
          {
             for(int j=0;j<5;j++)
             {
                if(i==j||(i+j)==4)
                 System.out.print(name1.charAt(j));
                else
                 System.out.print("  ");

              }
             
             System.out.println();
    
           }

 /*
K
KR
KRU
KRUS
KRUSH
KRUSHI
  */
          System.out.println();
  		System.out.println("-----To print above displayed pattern----");
          for(int i=1;i<=6;i++)
          {
             for(int j=1;j<=i;j++)
             {
                System.out.print(name.charAt(j-1)); 
              }
             System.out.println();
           }
          
	}
}
