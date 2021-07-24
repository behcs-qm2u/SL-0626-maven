package tdd;

import java.util.Arrays;
import java.util.List;

// import org.testng.annotations.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.*;

public class HarmcrestExample {
	
	
	@Test
	public void testcase() {
		
		  List<Integer> list = Arrays.asList(5, 2, 4);
		  
		  assertThat(list, hasSize(4));
		  
		  // ensure the order is correct
	      assertThat(list, contains(5, 2, 4));
	      
	      assertThat(list, everyItem(greaterThan(1)));
		
	}

}
