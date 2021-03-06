public class AsteriskLogger implements Logger {
	
	private String ReturnStars(String string) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			result += "*";
		}
		return result;
	}
	
	@Override
	public void Log(String asteriskString) {
		
		String stars = ReturnStars(asteriskString);
		String result = "";
		result = "***" + asteriskString + "***";
		System.out.println("***" + stars + "***");
		System.out.println(result);
		System.out.println("***" + stars + "***");
	}
	
	@Override
	public void Error(String errorString) {
		String result = "";
		result = "ERROR: " + errorString + "";
		System.out.println(result);
	}
}
