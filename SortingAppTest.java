import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.junit.jupiter.api.Test;
class SortingAppTest {
	@Test
	void testBasicInput() throws IOException { //basic test for sorting app NO REVERSE
        //you need to change the test to throw IOException in case it does not run
		//you also need to initialize the output file and create an expected file 
		//so the output file and expected file can compare
		
		String outputFile = "C:\\Users\\katly\\Desktop\\output.txt"; 
        SortingApp.main(null);
        String expectedFile = "C:\\Users\\katly\\Desktop\\expected.txt"; 
        assertEquals(expectedFile, outputFile);
		//fail("Not yet implemented");
	}
	@Test
	void testBasicInputWithReverse() throws IOException { //basic test for sorting app with NO REVERSE
		//you need to change the test to throw IOException in case it does not run
		//you also need to initialize the output file and create an expected file 
		//so the output file and expected file can compare
		String outputFile = "C:\\Users\\katly\\Desktop\\output.txt"; 
		SortingApp.main(null);
		String expectedFile = "C:\\Users\\katly\\Desktop\\expected.txt"; 
		assertEquals(expectedFile, outputFile);
		//fail("Not yet implemented");
	}
}