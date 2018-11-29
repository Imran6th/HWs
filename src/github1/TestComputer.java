package github1;

public class TestComputer {

	public static void main(String[] args) {
		Computer design = new Computer("1");
		
		design.computerinformation();
		
		 
		String brand = design.displayBrand();
		System.out.println("The computer I use is " + brand);
		
		Computer weight = new Computer("Intel");
		boolean windows = weight.operatingSystem();
		System.out.println("My operating is Windows is actually " + windows);
		
		
		
		
		
		

	}

}
