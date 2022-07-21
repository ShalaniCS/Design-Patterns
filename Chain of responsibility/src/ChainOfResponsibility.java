
public class ChainOfResponsibility {
	
	private static AbstractLogger getChainOfLoggers() {
		
		AbstractLogger emailLogger = new EmailLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		emailLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return emailLogger;
		
	}
	
	public static void main(String[] args) {
		
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.message(AbstractLogger.INFO, "Info level ");
		
		System.out.println("____________________");
		
		loggerChain.message(AbstractLogger.DEBUG, "Debug level ");
		
		System.out.println("____________________");
		
		loggerChain.message(AbstractLogger.ERROR, "Error level ");
	}

}
