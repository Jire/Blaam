/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam;

/**
 * A <b>c</b>omponent <b>p</b>rogramming <b>i</b>nterface
 * which provides a component framework which instills a
 * concrete nexus between extensions and the application
 * environment itself.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public abstract class CPI {

	/**
	 * Retrieves the parenting {@link Server} instance
	 * from the application {@link Environment} container.
	 * @return The parenting <tt>Server</tt> instance.
	 */
	protected Server getServer() {
		return Environment.getServer();
	}

}