/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.util.logging;

import static java.lang.System.err;
import static java.lang.System.out;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class Logger {

	public void error(String... messages) {
		for (String message : messages) {
			err.println(message);
		}
	}

	public void log(String... messages) {
		for (String message : messages) {
			out.println(message);
		}
	}

	public static Logger getLogger() {
		return new Logger();
	}

}