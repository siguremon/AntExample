package net.siguremon.antexample;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class TestAntExample {
	@Test
	public void testSum() {
		AntExample obj = new AntExample();
		assertThat(obj.sum(1, 2), is(3));
	}
}