/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */

package us.blaam;

import java.net.InetSocketAddress;

/**
 * A bootstrap which helps to deploy a server with
 * it's encapsulated {@link ServerFactory}, which, in
 * turn, builds the server.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class ServerBootstrap {

	/**
	 * Used to specify settings for the creation of a server.
	 * That server will be maintained by the <i>Blaam!</i> environment
	 * by being allocated each bootstrap instance.
	 */
	private final ServerFactory factory;

	/**
	 * Constructs a new server bootstrap by receiving an intake factory.
	 * @param factory Used to specify settings for the creation of
	 * a server. That server will be maintained by the <i>Blaam!</i>
	 * environment by being allocated each bootstrap instance.
	 */
	public ServerBootstrap(ServerFactory factory) {
		this.factory = factory;
	}

	/**
	 * Attaches the server to a {@link InetSocketAddress} on the local machine
	 * to enable the fowarding of incoming connections from clients to the server.
	 */
	public void bind() {
		Server server = factory.buildServer();
		Environment.setServer(server);

		InetSocketAddress address = new InetSocketAddress(server.getHostName(), server.getPort());

	}

}