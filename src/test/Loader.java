/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */
package test;

import us.blaam.ServerBootstrap;

public class Loader {

	public static void main(String... args) {
		long start = System.currentTimeMillis();
		ServerBootstrap bootstrap = new ServerBootstrap(new Factory());
		bootstrap.bind();
		System.out.println("Took " + (System.currentTimeMillis() - start) + "ms to bind.");
	}

}