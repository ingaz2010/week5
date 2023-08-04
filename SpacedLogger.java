package week05;

public class SpacedLogger implements Logger{
	@Override
	public String log(String logst) {
		String result = "";
		for(int i = 0; i < logst.length(); i++) {
			result += logst.charAt(i);
			result += " ";
		}
		return result;
	}
	@Override
	public void error(String error) {
		System.out.println("ERROR: " + log(error));
	}

}
