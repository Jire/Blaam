/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.model.commands;

import us.blaam.model.commands.hooks.*;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public enum HookType {

	PLACEHOLDER(new PlaceholderHook());

	private final CommandHook hook;

	CommandHook getHook() {
		return hook;
	}

	HookType(CommandHook hook) {
		this.hook = hook;
	}

}