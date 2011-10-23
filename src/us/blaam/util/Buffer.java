/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.util;

import org.jboss.netty.buffer.ChannelBuffer;

import us.blaam.util.reflection.FieldType;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public final class Buffer {

	public static void writeString(ChannelBuffer buf, String str) {
		int len = str.length();
		if (len >= 65536) {//magic number ?? XXX
			throw new IllegalArgumentException("Could not write string to byte array: it is too long.");
		}
		buf.writeShort(len);
		for (int i = 0; i < len; i++) {
			buf.writeChar(str.charAt(i));
		}
	}

	public static void writeBoolean(ChannelBuffer buf, boolean bool) {
		buf.writeByte(bool ? 1 : 0);
	}

	public static String readString(ChannelBuffer buf) {
		int len = buf.readUnsignedShort();

		char[] characters = new char[len];
		for (int i = 0; i < len; i++) {
			characters[i] = buf.readChar();
		}

		return new String(characters);
	}

	public static boolean readBoolean(ChannelBuffer buf) {
		return buf.readByte() == 1 ? true : false;
	}

	public static void writeData(ChannelBuffer buf, FieldType type, Object data) {
		switch (type) {
		case BOOLEAN:
			writeBoolean(buf, (boolean) data);
			break;
		case BYTE:
			buf.writeByte((byte) data);
			break;
		case SHORT:
			buf.writeShort((short) data);
			break;
		case CHAR:
			buf.writeChar((char) data);
			break;
		case INT:
			buf.writeInt((int) data);
			break;
		case FLOAT:
			buf.writeFloat((float) data);
			break;
		case LONG:
			buf.writeLong((long) data);
			break;
		case DOUBLE:
			buf.writeDouble((double) data);
			break;
		}
		// in the case of UNKNOWN no actions take place.
	}

	public static Object readData(ChannelBuffer buf, FieldType type) {
		switch (type) {
		case BOOLEAN:
			return readBoolean(buf);
		case BYTE:
			return buf.readByte();
		case SHORT:
			return buf.readShort();
		case CHAR:
			return buf.readChar();
		case INT:
			return buf.readInt();
		case FLOAT:
			return buf.readFloat();
		case LONG:
			return buf.readLong();
		case DOUBLE:
			return buf.readDouble();
		}
		// in the case of UNKNOWN null is returned
		return null;
	}

}