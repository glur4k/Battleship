package Model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Destructor;
import Model.Ships;

public class DestructorTest {
	Ships a;
	
	@Before
	public void setUp(){
		a = new Destructor(1, 1, true, false);
	}

	@Test
	public void testDestructor() {
		a = new Destructor(true, false);
		assertNotNull(a);
	}
}
