package ba.yzl.Exception;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LogException extends Exception {
	
	private static Logger logger = Logger.getLogger("LogException");
	
	public LogException() {
		StringWriter writer = new StringWriter();
		printStackTrace(new PrintWriter(writer));
		logger.severe(writer.toString());
	}

}
