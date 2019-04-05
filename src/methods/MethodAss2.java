//Write a program (using method) which takes two number and return the product

package methods;
class MethodAss2
{
	public static void main(String[] args)
	{
	   double ProductResult = productOfTwoNumbers(2.2,3.9);
	   System.out.println(ProductResult);
	}

      //------------------
      static double productOfTwoNumbers(double x1, double x2)
	{
		double prodof = x1*x2;
		return prodof;
	}
}