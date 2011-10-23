/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam;

import us.blaam.model.Position;

/**
 * Constant variables which, of so, values will not change
 * during the runtime of the software.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public final class Constants {

	/**
	 * Constants that provide default values for variables related to networking.
	 * 
	 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
	 * @author Conner G. Davis <connergdavis@gmail.com>
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
	 * @author Jordon W. Jensen <jwjens@live.com>
	 */
	public static class Game {

		/**
		 * The server's name identifier. This value is
		 * displayed as a replacement for <i>"RuneScape"</i>.
		 */
		public static final String DEFAULT_NAME = "RuneScape";

		/**
		 * The modifier of the RuneScape experience rate.
		 */
		public static final double DEFAULT_EXP_RATE = 1;

		/**
		 * This is where players will spawn once they first play
		 * the game. This position is also used by the Home Teleport
		 * spell in the Magic skill.
		 */
		public static final Position DEFAULT_POSITION = Position.create(3222, 3222);

	}

	/**
	 * Constants that provide default values for variables related
	 * to file I/O operations.
	 * 
	 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
	 * @author Conner G. Davis <connergdavis@gmail.com>
	 * @author Jordon W. Jensen <jwjens@live.com>
	 */
	public static class IO {

		/**
		 * All file data stored by the <i>Blaam!</i> environment
		 * is located in this directory.
		 */
		public static final String DEFAULT_FILE_DIRECTORY = "data/";

	}

}