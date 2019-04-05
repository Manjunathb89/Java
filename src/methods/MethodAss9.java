//write a method to find volume of a cone

package methods;

class MethodAss9
{
	public static void main(String[] args)
	  {	
		double Res = areaOfCone(2.7,7.3);
		System.out.println("Volume of Cone " + Res);
	  }
 //--------------------------------------------------------------------
        static double areaOfCone(double h,double r)
	{	
	    final double PI = 3.1433;
	    double Conevalue = PI*r*r*(h/3);
	    return Conevalue;
	}
}