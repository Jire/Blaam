/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.fileio;

import static us.blaam.util.Buffer.writeString;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

import us.blaam.fileio.persistable.PersistableFileManager;
import us.blaam.model.Player;

/**
 * A file manager that handles player save files.
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public final class PlayerFileManager extends PersistableFileManager<Player> {

	/**
	 * HOW PLAYER FILES ARE SAVED:
	 * 
	 * --------------------------------
	 * |      Name     |  Data Type   |
	 * |------------------------------|
	 * | Instance ID   | Short        |
	 * | Username      | String       |
	 * | Password      | String       |
	 * | Inventory     | See below    |
	 * | Inventory Example            |
	 * | ID            | Integer      |
	 * | Quantity      | Integer      |
	 * --------------------------------
	 */

	public PlayerFileManager(Player player) {
		super(player, SubDirectory.PLAYERS);
	}

	@Override
	protected void write(Object o) throws IOException {
		// XXX: This is scrap
		if (!(o instanceof Player)) {
			throw new IllegalArgumentException("Could not write player file: the object passed was not a player.");
		}

		final Player player = (Player) o;

		try {
			File file = new File(getSubDirectory().getDirectory() + player.getSession().getUsername() + ".save");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream out = new FileOutputStream(file);
			ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
			buffer.writeShort(player.getIndex());
			writeString(buffer, player.getSession().getUsername());
			writeString(buffer, player.getSession().getPassword());
			/*			for (Entry<Item, Integer> entry : player.getInventory().getStorage().entrySet()) {
				buffer.writeInt(entry.getKey().getId());
				buffer.writeInt(entry.getValue());
			}*/
			out.write(buffer.array());//conner u forgot this lolol.
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Object read(SubDirectory subDirectory) throws IOException {
		File file = new File(subDirectory.getDirectory());
		if (file.exists()) {
			// The current code here is only a test.
			DataInputStream in = new DataInputStream(new FileInputStream(file));
			in.readUTF();
		} else 
			throw new IOException("The player file specified to read did not exist: " + file.getPath());
		// TODO
		return null;
	}

	@Override
	public SubDirectory getSubDirectory() {
		return SubDirectory.PLAYERS;
	}

}