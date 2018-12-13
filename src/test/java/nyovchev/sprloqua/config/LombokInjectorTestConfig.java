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

	@Bean(DESTINATION_ONE)
	public Destination getDestinationOne() {
		return new Destination("panama");
	}

	@Bean(DESTINATION_TWO)
	public Destination destinationTwo() {
		return new Destination("new zealand");
	}
}
