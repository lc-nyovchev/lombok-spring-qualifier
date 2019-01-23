package nyovchev.sprloqua.config;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import nyovchev.sprloqua.service.Destination;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static nyovchev.sprloqua.config.LombokInjectorTestConfig.DESTINATION_FOUR;
import static nyovchev.sprloqua.config.LombokInjectorTestConfig.DESTINATION_ONE;
import static nyovchev.sprloqua.config.LombokInjectorTestConfig.DESTINATION_THREE;
import static nyovchev.sprloqua.config.LombokInjectorTestConfig.DESTINATION_TWO;

@Configuration
@Import(LombokInjectorTestConfig.class)
@RequiredArgsConstructor
@Getter
public class LombokInjectorWithQualifiersConfig {
	@NonNull @Qualifier(DESTINATION_ONE) private final Destination destination1;
	@NonNull @Qualifier(DESTINATION_TWO) private final Destination destination2;
	@NonNull @Qualifier(DESTINATION_THREE) private final Destination destination3;
	@NonNull @Qualifier(DESTINATION_FOUR) private final Destination destination4;
}
