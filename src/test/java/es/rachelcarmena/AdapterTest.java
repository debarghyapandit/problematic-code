package es.rachelcarmena;

import org.junit.Test;

import static es.rachelcarmena.To.status.BLACK;
import static es.rachelcarmena.To.status.WHITE;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AdapterTest {

	@Test
	public void convert_from_object_to_another_one_when_param1_less_than_param2() {
		From from = new From(12, 24);
		To to = new To("12", "24", BLACK);

		assertThat(Adapter.adapt(from), is(to));
	}

	@Test
	public void convert_from_object_to_another_one_when_equals_params() {
		From from = new From(12, 12);
		To to = new To("12", "12", WHITE);

		assertThat(Adapter.adapt(from), is(to));
	}

	@Test
	public void convert_from_object_to_another_one_when_param1_greater_than_param2() {
		From from = new From(12, 6);
		To to = new To("12", "6", WHITE);

		assertThat(Adapter.adapt(from), is(to));
	}
}