/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.network;

import org.jboss.netty.channel.Channel;

/**
 * Represents a connection session between the server and
 * a user client by encapsulating data which is related to
 * the single session.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public final class Session {

	/**
	 * The session's username which the user connected with.
	 */
	private final String username;

	/**
	 * Gets the session's {@link #username}.
	 * @return The session's username which the user connected with.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * The session's password which the user connected with.
	 */
	private final String password;

	/**
	 * Gets the session's {@link #password}.
	 * @return The session's password which the user connected with.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * The connection channel which holds the stream towards
	 * the server and user client.
	 */
	private Channel channel;

	/**
	 * Gets the session's {@link #channel}.
	 * @return The connection channel which holds the stream towards
	 * the server and user client.
	 */
	public Channel getChannel() {
		return channel;
	}

	/**
	 * Constructs a new session.
	 * @param username The session's connection username.
	 * @param password The session's connection password.
	 * @param channel The session's connection channel which holds 
	 * the stream towards the server and user client.
	 */
	public Session(String username, String password, Channel channel) {
		this.username = username;
		this.password = password;
		this.channel = channel;
	}

	/**
	 * Constructs a new session with no channel.
	 * @param username The session's connection username.
	 * @param password The session's connection password.
	 */
	public Session(String username, String password) {
		this(username, password, null);
	}

}