/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam;

import us.blaam.model.Location;

/**
 * The constant variables the server utilizes.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public final class Constants {

	/**
	 * Constants that provide default values for variables related to networking.
	 * 
	 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
	 * @author Conner G. Davis <connergdavis@gmail.com>
	 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
	 * @author Jordon W. Jensen <jwjens@live.com>
	 */
	public static class Networking {
		
		/**
		 * The socket host-name which is used
		 * during the network binding of the server.
		 */
		public static final String DEFAULT_HOSTNAME = "localhost";
		
		/**
		 * The socket port which is used during
		 * the network binding of the server.
		 */
		public static final int DEFAULT_PORT = 43594;

	}

	/**
	 * Constants that provide default values for variables related to the game.
	 * 
	 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
	 * @author Conner G. Davis <connergdavis@gmail.com>
	 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
	 * @author Jordon W. Jensen <jwjens@live.com>
	 */
	public static class Game {
		
		/**
		 * The server's name identifier. This value is
		 * displayed as a replacement for <i>"RuneScape"</i>.
		 */
		public static final String DEFAULT_NAME = "RuneScape";
		
		/**
		 * 
		 */
		public static final double DEFAULT_EXP_RATE = 1;
		
		public static final Location DEFAULT_SPAWN_LOCATION = Location.create(3222, 3222);
		
	}
	
	public static class IO {
		
		public static final String DEFAULT_FILE_DIRECTORY = "data/";
		
	}

}