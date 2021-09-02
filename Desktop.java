package week3.day2;

public class Desktop implements Hardware, Software {

	public void desktopModel(String desktop) {
		System.out.println("System Model is:" + desktop);
	}

	public void softwareResources(int ram) {
		System.out.println("Size of the Ram is:" + ram);
		
	}

	public void hardwareResources(String laptop) {
		System.out.println("Laptop brand is:" + laptop);
		
	}
	public static void main(String[] args) {
		Desktop deskDetails = new Desktop();
		deskDetails.hardwareResources("Lenovo");
		deskDetails.softwareResources(16);
		deskDetails.desktopModel("Compaq");	
	}
}
