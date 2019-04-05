//write a method to find the area of the circle

package methods;

class MethodAss6
{
  public static void main(String[] args)
      {
        double areaOfCircle = calculateArea(31.25);
        System.out.println("Area of a cricle is " + areaOfCircle);
      }

 //-------------------------------------------
  static double calculateArea(double radius)
     { 
       final double PI=3.1415926535897932384626433832795028841971693993751;
       double areaValue = PI *radius*radius;
       return areaValue;
     }
}