package week2.day4;

public class Browser {
	
	String browserName1 = "Chrome";
	float browserVersion1 = 5.1f;
	
	String browserName2 = "Edge";
	float browserVersion2 = 2.8f;
	
	String browserName3 = "Safari";
	float browserVersion3 = 9.2f;
	
	public void openURL() {
		System.out.println("URL is opened");

	}
	
	public void closeBrowser() {
		System.out.println("Closing the browser");

	}
	
	public void navigateBack() {
		System.out.println("Navigating back");

	}
	
	public static void main(String[] args) {
		Browser browse=new Browser();
		browse.openURL();
		browse.closeBrowser();
		browse.navigateBack();
		

	}

}
