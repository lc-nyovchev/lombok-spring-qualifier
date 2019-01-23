package nyovchev.sprloqua.config;

import nyovchev.sprloqua.service.Destination;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("nyovchev.sprloqua")
public class LombokInjectorTestConfig {

	public static final String DESTINATION_ONE = "PANAMA";
	public static final String DESTINATION_TWO = "NEW ZEALAND";
	public static final String DESTINATION_THREE = "JAPAN";
	public static final String DESTINATION_FOUR = "SCOTLAND";

	@Bean(DESTINATION_ONE)
	public Destination getDestinationOne() {
		return new Destination("panama");
	}

	@Bean(DESTINATION_TWO)
	public Destination destinationTwo() {
		return new Destination("new zealand");
	}

	@Bean(DESTINATION_THREE)
	public Destination destinationThree() {
		return new Destination("japan");
	}

	@Bean(DESTINATION_FOUR)
	public Destination destinationFour() {
		return new Destination("scotland");
	}

}
