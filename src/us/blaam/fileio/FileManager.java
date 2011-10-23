/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.fileio;

import java.io.IOException;

/**
 * Manages the read and write file operations of an
 * individual type of file.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public abstract class FileManager {

	private final SubDirectory subDirectory;

	protected FileManager(SubDirectory subDirectory) {
		this.subDirectory = subDirectory;
	}

	/**
	 * Writes a file.
	 * 
	 * @param o
	 * 				The Java object to write.
	 * @throws IOException
	 * 				Should an I/O error be encountered while trying
	 * 				to write.
	 */
	protected abstract void write(Object o) throws IOException;

	protected abstract void write() throws IOException;

	/**
	 * Reads an object by supplying its subpath,
	 * which is the individual part of its path
	 * that is unique. For example, data/players/ is
	 * the static directory that's always the same,
	 * and the subpath would be player.
	 * 
	 * @param subPath
	 * 				The file's sub path. Explained above.
	 * @return
	 * 				The Java object which was just read.
	 * @throws IOException
	 * 				Should an I/O error be encountered while trying
	 * 				to read.
	 */
	protected abstract Object read(SubDirectory subDirectory) throws IOException;

	public Object read() throws IOException {
		return read(subDirectory);
	}

	/**
	 * Grabs the subdirectory inside data/ where this
	 * file I/O manager does all of its managing.
	 * 
	 * @return
	 * 				The directory. String can easily be retrieved.
	 */
	protected SubDirectory getSubDirectory() {
		return subDirectory;
	}

}