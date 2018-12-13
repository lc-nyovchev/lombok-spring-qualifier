package nyovchev.sprloqua.service;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import static nyovchev.sprloqua.config.LombokInjectorTestConfig.DESTINATION_ONE;
import static nyovchev.sprloqua.config.LombokInjectorTestConfig.DESTINATION_TWO;

/**
 * If this was pre-lombok 1.18.4, Spring wouldn't be able to choose between the
 * two {@link Destination} beans as the generated constructor didn't have @{@link Qualifier}.
 * <p>
 * NOTE: pre-lombok 1.18.4, it was still possible to do injection based on variable name, provided
 * that the instance variable name was the same as the bean qualifier, that is why to test properly
 * we name the instance variables:
 * <p>
 * <pre>{@code
 *   destination1
 *   destination2
 * }</pre>
 * <p>
 * And we name the actual qualifiers:
 * <p>
 * <pre>{@code
 *  PANAMA
 *  NEW ZEALAND
 * }</pre>
 * <p>
 * This way we are sure that Spring actually uses the qualifier, and not the variable name, to inject.
 */
@Service
@Getter
@RequiredArgsConstructor
public class LombokInjectorTestService {
	@Qualifier(DESTINATION_ONE) @NonNull private final Destination destination1;
	@Qualifier(DESTINATION_TWO) @NonNull private final Destination destination2;
}
