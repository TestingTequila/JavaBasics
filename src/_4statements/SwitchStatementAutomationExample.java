package _4statements;

public class SwitchStatementAutomationExample {

	public static void main(String[] args) {

		String browserName = "Yatro";
		switch(browserName)
		{
		case "Chrome":
			System.out.println("Launch Chrome Browser...");
			break;
		case "Firefox":
			System.out.println("Launch Firefox Browser...");
			break;	
		case "IE":
			System.out.println("Launch Internet Explorer Browser...");
			break;
		case "Edge":
			System.out.println("Launch Edge Browser...");
			break;
		case "Safari":
			System.out.println("Launch Safari Browser...");
			break;
			default:
				System.out.println("Please enter a valid browser name...");
		}
	}

}
