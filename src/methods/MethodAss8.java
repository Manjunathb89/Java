/*write a program to find volume of a cube*/

package methods;

class MethodAss8
{
  public static void main(String[] args)
    {
	double Res = volumeOfCube(4.9);
	System.out.println("Volume of cube is " + Res);	
    }
  //----------------------------------------------------------------
    static double volumeOfCube(double l)
	{
	  double valueofcube= l*l*l;
	  return valueofcube;
	}

}