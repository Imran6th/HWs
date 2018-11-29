package github1;

public class Computer {

 static String brand = "HP";
 int size= 15;
 String processor = "intel";
 int ram= 12;
 int hd= 1;
 static boolean windows= true;
 char grade= 'A' ;
 
public void computerinformation () {
	System.out.println(ram+ " : " +brand+ " : " +processor);
	
	}
public static String displayBrand() {
	return brand;
	
}

public static boolean operatingSystem() {
	return windows;
}

public Computer(String processor) {
	this.processor=processor;
	System.out.println("My processor is " + processor);
}



}