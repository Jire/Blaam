/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.fileio;

import us.blaam.Environment;

/**
 * <DOCUMENTATION NEEDED>
 * Gist: Global file I/O subdirectories.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public enum SubDirectory {

	PLAYERS("players/");
	
	private final String fileDirectory;
	
	SubDirectory(String fileDirectory) {
		this.fileDirectory = fileDirectory;
	}
	
	public String getDirectory() {
		return Environment.getServer().getFileDirectory() + fileDirectory;
	}
	
}