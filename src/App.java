
public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		asteriskLogger.Log("Asterisk Logger");
		asteriskLogger.Error("error!");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.Log("Spaced Logger");
		spacedLogger.Error("error!");
	}

}
