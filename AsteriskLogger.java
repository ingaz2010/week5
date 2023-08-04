package week05;

public class AsteriskLogger implements Logger{
	@Override
	public String log(String log) {
		return "***" + log + "***";
	}
	
	@Override
	public void error(String error) {
		System.out.println("*************************");
		System.out.println("***ERROR: "+ error + "***");
		System.out.println("*************************");
	}
}
