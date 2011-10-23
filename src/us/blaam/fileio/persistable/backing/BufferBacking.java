/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.fileio.persistable.backing;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Map;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

import us.blaam.util.Buffer;
import us.blaam.util.reflection.FieldType;

/**
 * 
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public class BufferBacking implements BackedDumper, BackedLoader {

	private final String baseDirectory;

	public BufferBacking(String baseDirectory) {
		this.baseDirectory = baseDirectory;
	}

	@Override
	public boolean dump(Object instance, Field key, Field[] allFields) {
		try {
			File file = new File(baseDirectory + File.separator + key.get(instance).toString() + ".dump");

			FileOutputStream out = new FileOutputStream(file);
			ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();

			for (Field field : allFields) {
				Buffer.writeData(buffer, FieldType.forField(field), field.get(instance));
			}

			out.write(buffer.array());
			out.flush();
			out.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	@Override
	public Map<String, String> load(String key) {
		// TODO: this is from the text backing
		/*		HashMap<String, String> map = new HashMap<String, String>();
		File file = new File(baseDirectory + File.separator + key + ".txt");
		if (file.exists()) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line;
				while ((line = reader.readLine()) != null) {
					map.put(line.split(":", 2)[0], line.split(":", 2)[1]);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		return null;
	}
}