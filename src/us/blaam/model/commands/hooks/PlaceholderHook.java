/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.model.commands.hooks;

import us.blaam.model.commands.CommandHook;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class PlaceholderHook extends CommandHook {

	@Override
	protected void perform() {
		error("My only action is to serve as a placeholder for a command hook...");
		error("So please, don't use me!");

		log("But... if you must, I'll show you my capabilities!");
		log("[ SERVER INFORMATION ]");
		log("-- General --");
		log("Name: " + getServer().getName());
		log("File store: " + getServer().getFileDirectory());
		log("-- Game Information --");
		log("Experience rate: " + getServer().getExperienceRate());
		log("Default location: " + getServer().getDefaultPosition());
		log("-- Network Information --");
		log("Host name: " + getServer().getHostName());
		log("Port: " + getServer().getPort());
	}

}