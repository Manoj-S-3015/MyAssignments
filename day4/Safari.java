package week2.day4;

public class Safari extends Browser{
	
	 public void readerMode() {
		System.out.println("Readermode enabled");

	}
	 
	 public void fullScreenMode() {
		System.out.println("Fullscreen mode enabled");

	}

	public static void main(String[] args) {
		Safari saf=new Safari();
		saf.openURL();
		System.out.println(saf.browserName3);
		System.out.println(saf.browserVersion3);
		saf.readerMode();
		saf.fullScreenMode();
		saf.closeBrowser();
		saf.navigateBack();

	}

}
