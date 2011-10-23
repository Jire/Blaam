/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.model;

import us.blaam.fileio.PlayerFileManager;
import us.blaam.fileio.persistable.Persistable;
import us.blaam.fileio.persistable.PersistableFileManager;
import us.blaam.fileio.persistable.Persisting;
import us.blaam.network.Session;

/**
 * Each instantation of a player serves to represent
 * a connected user in the world. A player holds a constructed
 * connection object which is utilized for output writing and
 * maintaining a connection line towards the unique user channel.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class Player extends Entity implements Persistable {

	/**
	 * A player's game rights. This serves to identify what permissions
	 * a user has while interacting with the server.
	 * 
	 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
	 * @author Conner G. Davis <connergdavis@gmail.com>
	 * @author Jordon W. Jensen <jwjens@live.com>
	 */
	public static enum Right {

		/**
		 * A player obtaining standard rights have access to all normal
		 * functionality of the world. They do not have the ability to
		 * enforce the rules, only report those breaking the rules.
		 * 
		 * <p><b>Crown:</b> 0</p>
		 */
		STANDARD,

		/**
		 * A player obtaining moderator rights have access to all priviledges
		 * provided to {@link #STANDARD}, however also can enforce rules.
		 * They may also have access to special areas of the game.
		 * 
		 * <p><b>Crown:</b> 1</p>
		 */
		MODERATOR,

		/**
		 * A player obtaining administrator rights has access to all
		 * priviledges provided to {@link #MODERATOR}. They too, however,
		 * are granted all priviledges for interaction with the world and
		 * can take and give priviledges to others (who are below their rights).
		 * 
		 * <p><b>Crown:</b> 2</p>
		 */
		ADMINISTRATOR;

		/**
		 * Retrieves the associated identification crown
		 * number for the right.
		 * @return The right's ordinal index in the enumeration.
		 */
		public int getCrown() {
			return ordinal();
		}

		/**
		 * Retrieves a {@link Right} for an identification
		 * number that corresponds to that right's crown.
		 * @param id The crown identification to find the
		 * right value for.
		 * @return The corresponding right.
		 */
		public static Right forId(int id) {
			return values()[id]; // by ordinal
		}

	}

	/**
	 * The player's game rights. This serves to identify what permissions
	 * a user has while interacting with the server.
	 */
	@Persisting
	private Right right = Right.STANDARD;

	/**
	 * Gets the player's {@link #right}.
	 * @return The player's game rights. This serves to identify what
	 * permissions a user has while interacting with the server.
	 */
	public Right getRight() {
		return right;
	}

	/**
	 * Sets a player's {@link #right}.
	 * @param right The player's game rights. This serves to identify
	 * what permissions a user has while interacting with the server.
	 */
	public void setRight(Right right) {
		this.right = right;
	}

	/**
	 * The player's connection session which holds their details
	 * along with their connection channel.
	 */
	private Session session;

	/**
	 * Gets the player's {@link #session}.
	 * @return The player's connection session which holds their details
	 * along with their connection channel.
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * Their inventory.
	 */
	private final Inventory inventory;

	public Player(Session session, Position location) {
		super(location);
		this.session = session;
		this.inventory = new Inventory();
	}

	/**
	 * @return the inventory
	 */
	public Inventory getInventory() {
		return inventory;
	}

	private final PersistableFileManager<Player> fileManager = new PlayerFileManager(this);

	/* (non-Javadoc)
	 * @see us.blaam.fileio.Saveable#getFileManager()
	 */
	@Override
	public PersistableFileManager<Player> getFileManager() {
		return fileManager;
	}

	/* (non-Javadoc)
	 * @see us.blaam.model.Entity#getDisplayName()
	 */
	@Override
	protected String getDisplayName() {
		return session.getUsername();
	}

}