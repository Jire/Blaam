/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public final class Inventory {

	private final Map<Item, Integer> storage = new HashMap<Item, Integer>(28);

	public final void addItem(Item item, int quantity) {
		storage.put(item, quantity);
	}

	public final void addItem(Item item) {
		storage.put(item, 1);
	}

	public Map<Item, Integer> getStorage() {
		return storage;
	}

}