//Write a program to find area of a square

package methods;

class MethodAss7
{
	public static void main(String[] args)
	{	
	    double valueofsquare = areaOfSquare(6.5);
	    System.out.println("Area of Square " + valueofsquare);
      
	}
 //-------------------------------------------------
	static double areaOfSquare(double l)
        {
          double Areaofsquare = l*l;
          return Areaofsquare;
        }

}