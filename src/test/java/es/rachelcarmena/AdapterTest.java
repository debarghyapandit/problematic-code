package es.rachelcarmena;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AdapterTest {

	@Test
	public void convert_from_object_to_another_one() {
		From from = new From(12, 24);
		To to = new To("12", "24");

		assertThat(Adapter.adapt(from), is(to));
	}
}
