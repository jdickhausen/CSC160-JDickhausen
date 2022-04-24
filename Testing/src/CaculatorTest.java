
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CaculatorTest {
	
	Calculator calc; 
	
	@BeforeEach
	void setUp() {
		calc = new Calculator();
	}
	
	@Test
	@DisplayName("Simple multiplication should work")
	void testMultiply() {
		assertEquals(20, calc.multiply(4, 5), "Multiplication does not work");
	}
	
	@Test
	@Disabled ("Add is not ready for test yet")
	@DisplayName("Simple addition should work")
	void testAdd() {
		assertEquals(10, calc.add(5, 3), "Addition does not work");
	}
}
