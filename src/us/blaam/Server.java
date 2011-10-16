/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam;

import static us.blaam.Constants.Game.*;
import static us.blaam.Constants.IO.DEFAULT_FILE_DIRECTORY;
import static us.blaam.Constants.Networking.*;

import java.util.BitSet;

import us.blaam.ServerFactory.ServerOption;
import us.blaam.model.Location;

/**
 * The centre of the environment, of which, all other
 * components are bound in a hierarchy to. <tt>Server</tt>s
 * are built through a {@link ServerFactory}.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class Server {

	/**
	 * In computer networking, a port is an application-specific
	 * or process-specific software construct serving as a communications
	 * endpoint in a computer's host operating system. A port is associated
	 * with an IP address of the host, as well as the type of protocol used for communication.
	 */
	private int port = DEFAULT_PORT;

	/**
	 * On the Internet, a hostname is a domain name assigned to a host computer. This is usually
	 * a combination of the host's local name with its parent domain's name. For example,
	 * en.example.org consists of a local hostname (en) and the domain name example.org. The hostname
	 * is translated into an IP address via the local hosts file, or the Domain Name System (DNS) resolver.
	 * It is possible for a single host computer to have several hostnames; but generally the operating system
	 * of the host prefers to have one hostname that the host uses for itself.
	 * 
	 * <p>Any domain name can also be a hostname, as long as the restrictions mentioned below are followed.
	 * For example, both "en.example.org" and "example.org" can be hostnames if they both have IP addresses
	 * assigned to them. The domain name "xyz.example.org" may not be a hostname if it does not have an IP
	 * address, but "aa.xyz.example.org" may still be a hostname. All hostnames are domain names, but not all
	 * domain names are hostnames.</p>
	 */
	private String hostName = DEFAULT_HOSTNAME;

	/**
	 * The server's name identifier. This value is
	 * displayed as a replacement for <i>"RuneScape"</i>.
	 */
	private String name = DEFAULT_NAME;

	private String fileDirectory = DEFAULT_FILE_DIRECTORY;

	private double experienceRate = DEFAULT_EXP_RATE;
	
	private Location spawnLocation = DEFAULT_SPAWN_LOCATION;

	/**
	 * Encapsulates the <i>true</i> (enabled) or <i>false</i> (disabled)
	 * values of options defined by each {@link ServerOption}'s ordinal.
	 * 
	 * <p>By default (as in all <tt>BitSet</tt>s) all of the values
	 * enlisted in this set are set to <i>false</i>, and so being, also
	 * are the toggled state of every option.</p>
	 */
	private final BitSet options = new BitSet();

	/**
	 * Sets the state of a {@link ServerOption}.
	 * @param option The option which so's state will be set.
	 * @param enabled The new state of the option, <code>true</code>
	 * to mark it as enabled, or <code>false</code> to mark it as disabled.
	 */
	private void setOption(ServerOption option, boolean enabled) {
		options.set(option.ordinal(), enabled);
	}

	/**
	 * Checks whether or not a {@link ServerOption} is enabled.
	 * @param option The option which so's state will be checked.
	 * @return The option's condition (may it be <code>true</code>
	 * when enabled and <code>false</code> otherwise)
	 */
	private boolean optionEnabled(ServerOption option) {
		return options.get(option.ordinal());
	}

	/**
	 * Establishes a {@link ServerOption} to a state of enabled.
	 * @param option The option which so's state will be enabled.
	 */
	void enableOption(ServerOption option) {
		setOption(option, true);
	}


	/**
	 * Configures the socket port which is used during
	 * the network binding of the server.
	 * @param port The internet socket port specified for
	 * the listening of incoming connections.
	 */
	void setPort(int port) {
		this.port = port;
	}

	/**
	 * Configures the socket host-name which is used
	 * during the network binding of the server.
	 * @param hostName The internet socket host-name specified
	 * for the listening of incoming connections.
	 */
	void setHostName(String hostName) {
		this.hostName = hostName;
	}

	void setFileDirectory(String directory) {
		this.fileDirectory = directory;
	}

	/**
	 * Sets the server's name identifier. This value is
	 * displayed as a replacement for <i>"RuneScape"</i>.
	 * @param name The name identifier to use.
	 */
	void setName(String name) {
		this.name = name;
	}

	void setExperienceRate(double experienceRate) {
		this.experienceRate = experienceRate;
	}
	
	void setSpawnLocation(Location location) {
		this.spawnLocation = location;
	}

	/**
	 * Retrieves the socket port which is used during
	 * the network binding of the server.
	 * @return The internet socket port specified for
	 * the listening of incoming connections.
	 */
	public int getPort() {
		return port;
	}

	/**
	 * Retrieves the socket host-name which is used
	 * during the network binding of the server.
	 * @return The internet socket host-name specified
	 * for the listening of incoming connections. 
	 */
	public String getHostName() {
		return hostName;
	}

	public String getFileDirectory() {
		return fileDirectory;
	}

	/**
	 * Retrieves the server's name identifier. This value
	 * is displayed as a replacement for <i>"RuneScape"</i>.
	 * @return The name identifier to use.
	 */
	public String getName() {
		return name;
	}
	
	public double getExperienceRate() {
		return experienceRate;
	}
	
	public Location getSpawnLocation() {
		return spawnLocation;
	}

	/**
	 * If this option is enabled the platform will display
	 * technical output for use in debugging issues.
	 * @return <code>true</code> in the state that debugging
	 * is enabled or <code>false</code> otherwise.
	 */
	public boolean isDebugging() {
		return optionEnabled(ServerOption.DEBUG);
	}

	Server() {
	}

}