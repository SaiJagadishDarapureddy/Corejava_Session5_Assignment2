package types_of_Buildings;

public class Building {

		private int area;
		private int floors;
		private int year;
		private String foundation;

	   Building(int area, int floors, int year, String foundation)
	   {
	      this.area = area;
	      this.floors = floors;
	      this.year = year;
	      this.foundation= foundation;
	   }

	   int getArea()
	   {
	      return area;
	   }

	   int getFloors()
	   {
	      return floors;
	   }

	   int getYear()
	   {
	      return year;
	   }

	   String getFoundation()
	   {
	      return foundation;
	   }

	   void print()
	   {
	      System.out.println("Area"+area+"ft  "+ "Floors"+floors+"  Year"+year +" Foundation "+foundation );
	   }
}
