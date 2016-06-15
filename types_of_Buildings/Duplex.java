package types_of_Buildings;

public class Duplex extends Building{
	
	public String furniture;
	public int poolarea;

	Duplex(int area, int floors, int year, String foundation, String furniture, int poolarea) {
		super(area, floors, year, foundation);
		
		this.furniture=furniture;
		this.poolarea=poolarea;	
	}
	String getFurniture()
	{
		return furniture;
	}
	
	int getPoolarea()
	{
		return poolarea;
	}
	void print()
	   {
	      super.print();
	      System.out.println("Furniture: " + furniture +"PoolArea"+poolarea);
	   }
	public static void main(String[] args) {
		Villa villa =new Villa(500, 2, 1995, "RCC", "Wooden");
		System.out.println("Area=  "+ villa.getArea()+" ft");
		System.out.println("Floors=  "+ villa.getFloors());
		System.out.println("Year=  " +villa.getYear());
		System.out.println("Foundation=  " +villa.getFoundation());
		System.out.println("Furniture=  " +villa.getFurniture());
		
		System.out.println("*****************************************");
		
		Duplex duplex =new Duplex(500, 2, 2000, "RCC", "Wooden", 200);
		System.out.println("Area=  "+ duplex.getArea()+" ft");
		System.out.println("Floors=  "+ duplex.getFloors());
		System.out.println("Year=  " +duplex.getYear());
		System.out.println("Foundation=  " +duplex.getFoundation());
		System.out.println("Furniture=  " +duplex.getFurniture());
		System.out.println("Swimming-Pool Area=  " +duplex.getPoolarea() + "Ft");
		
		
		
	}
}
