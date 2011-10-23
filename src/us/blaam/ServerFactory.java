/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam;

import us.blaam.model.Entity;
import us.blaam.model.Position;

/**
 * Used to specify settings for the creation of a server.
 * That server will be maintained by the <i>Blaam!</i> environment
 * by being allocated to a {@link ServerBootstrap}.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public abstract class ServerFactory {

	/**
	 * The created server which this <tt>ServerFactory</tt>
	 * will use as an end-point of communication between the
	 * user implementation and the actual data encapsulated
	 * by this instance.
	 */
	private final Server server = new Server();

	/**
	 * The overwritten block of code serves as a nexus
	 * for setting configurations that will be used
	 * when building the server.</p>
	 * 
	 * <b>Take into consideration:</b>
	 * <ui>
	 *   <li>All options are disabled by default</li>
	 *   <li>All attributes (e.g. port, name) have default
	 *   values found in {@link Constants}</li>
	 * </ui>
	 */
	protected abstract void configureServer();

	/**
	 * Establishes an option to an enabled state. This
	 * establishment is considered during the building
	 * of the server.
	 * @param option The {@link ServerOption} to enable.
	 */
	protected final void setOption(ServerOption option) {
		server.enableOption(option);
	}

	/**
	 * Configures the socket port which is used during
	 * the network binding of the server.
	 * @param port The internet socket port specified for
	 * the listening of incoming connections.
	 */
	protected final void setPort(int port) {
		server.setPort(port);
	}

	/**
	 * Configures the socket host-name which is used
	 * during the network binding of the server.
	 * @param hostName The internet socket host-name specified
	 * for the listening of incoming connections. 
	 */
	protected final void setHostName(String hostName) {
		server.setHostName(hostName);
	}

	protected final void setFileDirectory(String directory) {
		server.setFileDirectory(directory);
	}

	/**
	 * Sets the server's name identifier. This value is
	 * displayed as a replacement for <i>"RuneScape"</i>.
	 * @param name The name identifier to use.
	 */
	protected final void setName(String name) {
		server.setName(name);
	}

	/**
	 * Sets the experience rate of the server.
	 * @param experienceRate The modifier of the
	 * RuneScape experience rate.
	 */
	protected final void setExperienceRate(double experienceRate) {
		server.setExperienceRate(experienceRate);
	}

	/**
	 * Sets the spawn position of the server.
	 * @return The position which serves as a starting
	 * point for all {@link Entity} objects.
	 */
	protected final void setDefaultPosition(Position position) {
		server.setDefaultPosition(position);
	}

	/**
	 * Invokes the configuration of the server. The
	 * associated server instance value is then retrieved.
	 * @return The configured associate server instance.
	 */
	Server buildServer() {
		/*
		 * In the future we may want to enforce this
		 * method is only called once, however, at this
		 * time only the API source (of this main package)
		 * can access this method.
		 */
		configureServer();
		return server;
	}

	/**
	 * Options which, when enabled, change server behavior.
	 * All options are disabled by default.
	 * 
	 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
	 * @author Conner G. Davis <connergdavis@gmail.com>
	 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
	 * @author Jordon Jensen <jwjens@live.com>
	 */
	protected static enum ServerOption {

		/**
		 * If this option is enabled the platform will display
		 * technical output for use in debugging issues.
		 */
		DEBUG;

	}

}