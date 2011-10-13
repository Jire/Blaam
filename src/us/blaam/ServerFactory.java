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
 * Used to configure and build a server to
 * be maintained by the <i>Blaam!</i> environment.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon Jensen <jwjens@live.com>
 */
public abstract class ServerFactory {

	/**
	 * The created server which <tt>ServerFactory</tt>
	 * implementations should configure.
	 */
	private final Server server = new Server();

	/**
	 * Used to set custom configurations for
	 * the server built by this factory.
	 */
	protected abstract void configureServer();

	/**
	 * Enables an option on the server.
	 * @param option The option to enable.
	 */
	protected final void setOption(ServerOption option) {
		server.enableOption(option);
	}

	protected final void removeOption(ServerOption option) {
		server.disableOption(option);
	}

	/**
	 * Sets the server's socket port.
	 * @param port The socket port to be used.
	 */
	protected final void setPort(int port) {
		server.setPort(port);
	}

	/**
	 * Sets the server's socket host name.
	 * @param hostName The socket host name to be used.
	 */
	protected final void setHostName(String hostName) {
		server.setHostName(hostName);
	}

	/**
	 * Sets the server's name identifier. This value is
	 * displayed as a replacement for <i>"RuneScape"</i>.
	 * @param name  The name identifier to use.
	 */
	protected final void setName(String name) {
		server.setName(name);
	}

	/**
	 * Configures and builds the server.
	 * @return The configured server instance.
	 */
	Server buildServer() {
		configureServer();
		return server;
	}

	/**
	 * Used to set options on the server.
	 * 
	 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
	 * @author Conner G. Davis <connergdavis@gmail.com>
	 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
	 * @author Jordon Jensen <jwjens@live.com>
	 */
	protected enum ServerOption {

		/**
		 * This option is <b>disabled</b> by default.
		 * 
		 * <p>If this option is enabled the platform will display
		 * technical output for use in debugging issues.</p>
		 */
		DEBUG;

	}

}