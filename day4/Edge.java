package week2.day4;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.println("Snap captured");

	}
	
	public void clearCookies() {
		System.out.println("Cookies cleared");

	}

	
	public static void main(String[] args) {
	   Edge ed=new Edge();
	   ed.openURL();
	   System.out.println(ed.browserName2);
       System.out.println(ed.browserVersion2);
       ed.takeSnap();
       ed.clearCookies();
       ed.navigateBack();
       ed.closeBrowser();
       
	}

}
