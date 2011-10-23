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
 * A position serves to represent a tile on the map grid.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class Position {

	/**
	 * <p>The <tt>X</tt> coordinate is adjusted based on
	 * your position along the East and West of the map.
	 * 
	 * <p>This coordinate's increasement is dependent on
	 * the distance <em>East</em> from the map barrier.</p>
	 */
	private int x;

	/**
	 * <p>The <tt>Y</tt> coordinate is adjusted based on
	 * your position along the North and South of the map.</p>
	 * 
	 * <p>This coordinate's increasement is dependent on
	 * the distance <em>South</em> from the map barrier.</p>
	 */
	private int y;

	/**
	 * <p>The <tt>Z</tt> coordinate is adjusted based
	 * on your height level of the map.</p>
	 * 
	 * <p>This coordinate's increasement is dependent on
	 * the level of concrete separations of height which
	 * is continuously expanded both in the positive and
	 * negative value range.</p>
	 */
	private int z;

	/**
	 * Constructs a new <tt>position</tt>.
	 * @param x The {@link #x} coordinate.
	 * @param y The {@link #y} coordinate.
	 * @param z The {@link #z} coordinate.
	 */
	private Position(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Sets the {@link x} coordinate of the position.
	 * @param x The new value of <tt>x</tt>.
	 */
	void setX(int x) {
		this.x = x;
	}

	/**
	 * Sets the {@link y} coordinate of the position.
	 * @param y The new value of <tt>y</tt>.
	 */
	void setY(int y) {
		this.y = y;
	}

	/**
	 * Sets the {@link z} coordinate of the position.
	 * @param z The new value of <tt>z</tt>.
	 */
	void setZ(int z) {
		this.z = z;
	}

	/**
	 * Gets the {@link x} coordinate of the position.
	 * @return The <tt>x</tt> coordinate value.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Gets the {@link y} coordinate of the position.
	 * @return The <tt>y</tt> coordinate value.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Gets the {@link z} coordinate of the position.
	 * @return The <tt>z</tt> coordinate value.
	 */
	public int getZ() {
		return z;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}

	/**
	 * Constructs a new <tt>position</tt>.
	 * @param x The {@link #x} coordinate.
	 * @param y The {@link #y} coordinate.
	 * @param z The {@link #z} coordinate.
	 */
	public static Position create(int x, int y, int z) {
		return new Position(x, y, z);
	}

	/**
	 * Constructs a new <tt>position</tt>.
	 * @param x The {@link #x} coordinate.
	 * @param y The {@link #y} coordinate.
	 * @param z The {@link #z} coordinate.
	 */
	public static Position create(int x, int y) {
		return new Position(x, y, 0);
	}

	/**
	 * Fetches the spawn position from the environment-held server.
	 * @return The position which serves as a starting point for
	 * all {@link Entity} objects.
	 */
	public static final Position getDefaultPosition() {
		return Environment.getServer().getDefaultPosition();
	}

}