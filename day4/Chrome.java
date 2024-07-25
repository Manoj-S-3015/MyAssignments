package week2.day4;

public class Chrome extends Browser {
	
	public void openIncognito() {
	     System.out.println("Chrome in incognito mode");

	}
	
	public void clearCache() {
		System.out.println("Cache cleared");

	}
	
	public static void main(String[] args) {
		Chrome chr=new Chrome();
		chr.openURL();
		System.out.println(chr.browserName1);
		System.out.println(chr.browserVersion1);
		chr.openIncognito();
		chr.clearCache();
		chr.navigateBack();
		chr.closeBrowser();

	}

}
