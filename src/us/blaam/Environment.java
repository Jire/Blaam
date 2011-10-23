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
 * A representitive figure of the entire application environment.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public final class Environment {

	/**
	 * The {@link Server} instance encapsulated by the environment.
	 * <br />
	 * This instance is the heart of the environment which serves
	 * to form a hierarchy of all other components of the application.
	 */
	private static Server server;

	/**
	 * Gets the {@link Server} instance encapsulated by the environment.
	 * @return The instance which is the heart of the environment which
	 * serves to form a hierchy of all other components of the application.
	 */
	public static Server getServer() {
		return server;
	}

	/**
	 * Sets the {@link Server} instance encapsulated by the environment.
	 * @param server The instance which is the heart of the environment
	 * which serves to form a hierchy of all other components of the application.
	 */
	static void setServer(Server server) {
		Environment.server = server;
	}

}