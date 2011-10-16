/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import us.blaam.Environment;
import us.blaam.model.Player;

/**
 * <DOCUMENTATION NEEDED>
 * Gist: A file manager for player files.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class PlayerFileManager implements FileManager {

	@Override
	public void write(Object o) throws IOException {
		if (o instanceof Player) {
			GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(new File(Environment.getServer().
				getFileDirectory() + this.getSubDirectory())));
		} else
			throw new IllegalArgumentException("Could not write player file...the object passed wasn't a player.");
	}

	@Override
	public Object read(String subPath) {
		// TODO Handle any read operations for player files.
		return null;
	}
	
	@Override
	public SubDirectory getSubDirectory() {
		return SubDirectory.PLAYERS;
	}

}
