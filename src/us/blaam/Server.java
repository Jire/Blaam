/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam;

import static us.blaam.Constants.DEFAULT_HOSTNAME;
import static us.blaam.Constants.DEFAULT_NAME;
import static us.blaam.Constants.DEFAULT_PORT;

import java.util.BitSet;

import us.blaam.ServerFactory.ServerOption;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon Jensen <jwjens@live.com>
 */
public class Server {

	/**
	 * In computer networking, a port is an application-specific
	 * or process-specific software construct serving as a communications
	 * endpoint in a computer's host operating system. A port is associated
	 * with an IP address of the host, as well as the type of protocol used for communication.
	 */
	private int port;

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
	private String hostName;

	/**
	 * 
	 */
	private String name;

	private final BitSet options = new BitSet();

	private void setOption(ServerOption option, boolean enabled) {
		options.set(option.ordinal(), enabled);
	}

	void enableOption(ServerOption option) {
		setOption(option, true);
	}

	void disableOption(ServerOption option) {
		setOption(option, false);
	}

	public int getPort() {
		return port;
	}

	public String getHostName() {
		return hostName;
	}

	public String getName() {
		return name;
	}

	void setPort(int port) {
		this.port = port;
	}

	void setHostName(String hostName) {
		this.hostName = hostName;
	}

	void setName(String name) {
		this.name = name;
	}
	
	private boolean optionEnabled(ServerOption option) {
		return options.get(option.ordinal());
	}

	public boolean isDebugging() {
		return optionEnabled(ServerOption.DEBUG);
	}
	
	Server() {
		port = DEFAULT_PORT;
		hostName = DEFAULT_HOSTNAME;

		name = DEFAULT_NAME;
	}

	public void printResume() {
		System.err.println("[ " + name + " Statistics ]");
		System.err.println("Hostname: " + hostName);
		System.err.println("Port: " + port);
		System.err.println("Debugging: " + isDebugging());
	}

}