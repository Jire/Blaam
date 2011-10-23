/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.util.logging;

import us.blaam.CPI;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class LoggableAPI extends CPI {

	private static final Logger logger = new Logger();

	protected void error(String... messages) {
		logger.error(messages);
	}

	protected void log(String... messages) {
		logger.log(messages);
	}

}