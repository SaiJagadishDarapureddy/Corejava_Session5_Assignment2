package types_of_Buildings;

public class Villa extends Building{

	public String furniture;
	
	Villa(int area, int floors, int year, String foundation, String furniture ){
		super(area, floors, year, foundation);
		
		this.furniture=furniture;
	}
	
	String getFurniture()
	{
		return furniture;
	}
	
	void print()
	   {
	      super.print();
	      System.out.println("Furniture: " + furniture);
	   }
	
}
