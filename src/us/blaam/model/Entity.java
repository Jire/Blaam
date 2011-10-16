/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.model;

/**
 * <DOCUMENTATION NEEDED>
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public abstract class Entity {
	
	/**
	 * Their world entity ID.
	 */
	private int id = -1;
	
	/**
	 * Their location on the map.
	 */
	private Location location = Location.getSpawnLocation();

	/**
	 * @param id the id to set
	 */
	public void setId(int id) throws Exception {
		if (id != -1) {
			throw new Exception("You cannot change their entity ID! It's already been set!");
		}
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	void setLocation(Location location) {
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}
	
	Entity(Location location) {
		this.location = location;
	}

}