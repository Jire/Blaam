/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package us.blaam.util.reflection;

import java.lang.reflect.Field;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Jordon W. Jensen <jwjens@live.com>
 */
public enum FieldType {

	UNKNOWN(null),

	// refer to data type class representation
	BOOLEAN(boolean.class),
	BYTE(byte.class),
	SHORT(short.class),
	CHAR(short.class),
	INT(int.class),
	FLOAT(float.class),
	LONG(long.class),
	DOUBLE(double.class);

	private final Class<?> clazz;

	FieldType(Class<?> clazz) {
		this.clazz = clazz;
	}

	public static FieldType forField(Field field) {
		return forClass(field.getClass());
	}

	public static FieldType forClass(Class<?> clazz) {
		for (FieldType fieldType : values()) {
			if (fieldType.clazz == clazz) {
				return fieldType;
			}
		}
		return FieldType.UNKNOWN;
	}

}