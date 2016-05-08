import static org.junit.Assert.*;

import org.junit.Test;

public class testServer {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		
		
		/**
		 * for running this test
		 * requires thread variable be defined as public in ChatServer 
		 * unless it won't work
		 * after change made to ChatServer class asserEquals can be uncomment in test1 method
		 */
		test1();
	
	}
	
	private void test1(){
		ChatServer server = null;
		server = new ChatServer(5555);
		
		server.start();
		//assertEquals(11, server.thread.getId());
		
		//System.out.println(server.thread.toString());
	}
	

}
