/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam;

/*
 * <LEGACY-DOC>
 * Used to configure and build a server to
 * be maintained by the <i>Blaam!</i> environment.
 */
/**
 * Used to specify settings for the creation of a server.
 * That server will be maintained by the <i>Blaam!</i> environment
 * by being allocated to a {@link ServerBootstrap}.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public abstract class ServerFactory {

	/*
	 * <LEGACY-DOC>
	 * The created server which <tt>ServerFactory</tt>
	 * implementations should configure.
	 */
	/**
	 * The created server which this <tt>ServerFactory</tt>
	 * will use as an end-point of communication between the
	 * user implementation and the actual data encapsulated
	 * by this instance.
	 */
	private final Server server = new Server();

	/*
	 * <LEGACY-DOC>
	 * Used to set custom configurations for
	 * the server built by this factory.
	 */
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

	/*
	 * <LEGACY-DOC>
	 * Enables an option on the server.
	 * @param option The option to enable.
	 */
	/**
	 * Establishes an option to an enabled state. This
	 * establishment is considered during the building
	 * of the server.
	 * @param option The {@link ServerOption} to enable.
	 */
	protected final void setOption(ServerOption option) {
		server.enableOption(option);
	}

	/*
	 * <LEGACY-DOC>
	 * Sets the server's socket port.
	 * @param port The socket port to be used.
	 */
	/**
	 * Configures the socket port which is used during
	 * the network binding of the server.
	 * @param port The internet socket port specified for
	 * the listening of incoming connections.
	 */
	protected final void setPort(int port) {
		server.setPort(port);
	}

	/*
	 * <LEGACY-DOC>
	 * Sets the server's socket host name.
	 * @param hostName The socket host name to be used.
	 */
	/**
	 * Configures the socket host-name which is used
	 * during the network binding of the server.
	 * @param hostName The internet socket host-name specified
	 * for the listening of incoming connections. 
	 */
	protected final void setHostName(String hostName) {
		server.setHostName(hostName);
	}

	/**
	 * Sets the server's name identifier. This value is
	 * displayed as a replacement for <i>"RuneScape"</i>.
	 * @param name The name identifier to use.
	 */
	protected final void setName(String name) {
		server.setName(name);
	}
	
	protected final void setExperienceRate(double experienceRate) {
		server.setExperienceRate(experienceRate);
	}

	/*
	 * <LEGACY-DOC>
	 * Configures and builds the server.
	 * @return The configured server instance.
	 */
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

	/*
	 * <LEGACY-DOC>
	 * Used to set options on the server.
	 */
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