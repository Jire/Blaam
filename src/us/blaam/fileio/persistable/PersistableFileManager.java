/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.fileio.persistable;

import java.io.IOException;

import us.blaam.fileio.FileManager;
import us.blaam.fileio.SubDirectory;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public abstract class PersistableFileManager<P extends Persistable> extends FileManager {

	private final P persistable;

	/**
	 * @param persistable
	 * @param subDirectory
	 */
	protected PersistableFileManager(P persistable, SubDirectory subDirectory) {
		super(subDirectory);
		this.persistable = persistable;
	}

	@Override
	public void write() throws IOException {
		// TODO
		write(persistable);
	}

	@Override
	protected void write(Object o) throws IOException {
		// TODO
	}

}