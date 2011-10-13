/*
 * This software is provided "as is" and the authors
 * hold no liability to any damage committed by the
 * software to both physical and virtual objects.
 *
 * This software is "free" as in "freedom" and allows
 * users to do whatever they please with it.
 */

package us.blaam;

/**
 * 
 * @author Thomas G. P. Nappo <canownueasy@hotmail.com>
 * @author Conner G. Davis <connergdavis@gmail.com>
 * @author Ryley M. Kimmel <ryley.kimmel@live.com>
 * @author Jordon Jensen <jwjens@live.com>
 */
public class ServerBootstrap {

	private final ServerFactory factory;
	
	public ServerBootstrap(ServerFactory factory) {
		this.factory = factory;
	}
	
	public void bind() {
		factory.buildServer().printResume();
	}
	
}