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
 * An individual RuneScape item. Items should
 * only be declared when they are read from the 
 * cache.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public final class Item {

	private final int id;
	private final boolean tradeable;
	private final double weight;

	public Item(int id, boolean tradeable, double weight) {
		this.id = id;
		this.tradeable = tradeable;
		this.weight = weight;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the tradeable
	 */
	public boolean isTradeable() {
		return tradeable;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

}