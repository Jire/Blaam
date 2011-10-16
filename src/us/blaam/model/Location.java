/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.model;

import us.blaam.Environment;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class Location {
	
	/**
	 * The coordinates.
	 */
	private int x, y, z;
	
	private Location(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * @param x the x to set
	 */
	protected void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param y the y to set
	 */
	protected void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param z the z to set
	 */
	protected void setZ(int z) {
		this.z = z;
	}

	/**
	 * @return the z
	 */
	public int getZ() {
		return z;
	}
	
	public static Location create(int x, int y, int z) {
		return new Location(x, y, z);
	}
	
	public static Location create(int x, int y) {
		return create(x, y);
	}
	
	public static final Location getSpawnLocation() {
		return Environment.getServer().getSpawnLocation();
	}

}