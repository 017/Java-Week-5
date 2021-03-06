public class SpacedLogger implements Logger {
	
	@Override
	public void Log(String asteriskString) {
		String result = "";
		for (int i = 0; i< asteriskString.length(); i++) {
			result += asteriskString.charAt(i) + " ";
		}
		System.out.println(result);
	}
	
	@Override
	public void Error(String errorString) {
		String result = "";
		for (int i = 0; i< errorString.length(); i++) {
			
			result += errorString.charAt(i) + " ";
		}
		
		result = "ERROR: " + result;
		System.out.println(result);
	}
}
