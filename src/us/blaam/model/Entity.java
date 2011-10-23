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
 * An entity serves to represent any roaming model of the game. All
 * entities hold a position along with functionality to change that position.
 * They also hold an {@link #index} which marks their position on their
 * parenting {@link EntityList} encapsulator.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public abstract class Entity {

	/**
	 * The entities enlisted index inside it's appropriate
	 * {@link EntityList} of the {@link World} which it is active.
	 */
	private int index = -1;

	/**
	 * The entity's representative position on the grid map.
	 */
	private Position position = Position.getDefaultPosition();

	/**
	 * Constructs a new entity.
	 * @param position The entity's representative
	 * position on the grid map.
	 */
	Entity(Position position) {
		this.position = position;
	}

	/**
	 * Sets the entity's {@link #index}.
	 * @param index The entities enlisted index inside it's appropriate
	 * {@link EntityList} of the {@link World} which it is active.
	 */
	void setIndex(int index) throws Exception {
		/*
		 * For testing purposes ONLY. Do not use
		 * this assertion as means for flow control.
		 */
		assert index != -1;

		this.index = index;
	}

	/**
	 * Sets the entity's {@link #position}.
	 * @param position The new position of the entity.
	 */
	void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * Retrieves the entity's {@link #index}.
	 * @return The entities enlisted index inside it's appropriate
	 * {@link EntityList} of the {@link World} which it is active.
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Gets the {@link #position} of the entity.
	 * @return The entity's representative position
	 * on the grid map.
	 */
	public Position getPosition() {
		return position;
	}
	
	protected abstract String getDisplayName();

}