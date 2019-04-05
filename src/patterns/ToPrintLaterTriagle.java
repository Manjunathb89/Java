package patterns;

class ToPrintLaterTriagle 
{
	public static void main(String[] args) 
	{
				int num = 7;
		  		int max = (num/2);

		  		for(int i=0;i<num;i++) 
		  		{
		  			if(i<=max) 
		  			{
		  				for(int j=0;j<=i;j++) 
		  				{
		  					System.out.print("*");
		  				}
		  				System.out.println("");
		  			} 
		  			else 
		  			{ //i==4,max==3
		  				for(int k=0;k<max;k++) 
		  				{
		  					System.out.print("*");
		  				}
		  				max--;
		  			System.out.println("");	
		  			} //end else
		  		} //end i for loop
	}

}
