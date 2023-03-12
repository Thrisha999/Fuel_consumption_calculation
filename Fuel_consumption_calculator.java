//fuel consumption
import java.util.*;
class Fuel_consumed
{
 void fuel_consumed(int mileage)
 {
   int km;
   float fc;
   System.out.println("Enter the number of kilometers travelled :");
   Scanner sc = new Scanner(System.in);
   km = sc.nextInt();
   fc = km/mileage;
   System.out.println("Quantity of fuel consumed for "+km+" kilometers is around  "+fc+" litres");
 }
}
class Fuel_quantity
{
  void fuel_quantity(int cost)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the amount for which you want to buy a fuel :");
    int amount = scan.nextInt();
    float fq;
    fq = amount/cost;
    System.out.println("Quantity of fuel u get for "+amount+" rupees is "+fq+" litres");
  }
}
public class Fuel_consumption_calculator
{
  public static void main(String[] args)
  {
    int cost,mileage,choice;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the cost of one litre petrol :");
    cost = in.nextInt();
    System.out.println("Enter the mileage :\nMileage : Number of kilometers it can travel for one liter fuel consumption.");
    mileage = in.nextInt();
    System.out.println("Enter your choice :\n Press 1 to know amount of fuel you get for a spcific amount\nPress 2 to know the amount of fuel consumed");
    choice = in.nextInt();
    Fuel_consumed c = new Fuel_consumed();
    Fuel_quantity q = new Fuel_quantity();
    switch (choice)
    {
      case 1 : q.fuel_quantity(cost);
      break;
      case 2 : c.fuel_consumed(mileage);
      break;
      default:
        System.out.println("INVALID OPERATION....1");
        break;
    }
  }
}
