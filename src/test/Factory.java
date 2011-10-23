/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package test;

import us.blaam.ServerFactory;
import us.blaam.model.Position;

public class Factory extends ServerFactory {

	@Override
	protected void configureServer() {
		setName("RuneScape");
		setExperienceRate(1);
		setDefaultPosition(Position.create(3222, 3222));

		setPort(43594);
		setHostName("localhost");

		setFileDirectory("data/");

		setOption(ServerOption.DEBUG);
	}

}