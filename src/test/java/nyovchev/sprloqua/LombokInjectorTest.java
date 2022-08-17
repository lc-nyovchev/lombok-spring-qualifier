package nyovchev.sprloqua;

import nyovchev.sprloqua.config.LombokInjectorWithQualifiersConfig;
import nyovchev.sprloqua.service.LombokInjectorTestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LombokInjectorWithQualifiersConfig.class)
public class LombokInjectorTest {

	@Autowired private LombokInjectorWithQualifiersConfig parentConfig;
	@Autowired private LombokInjectorTestService lombokInjectorTestService;

	@Test
	public void testProperQualifierInjectionForService() {
		assertEquals("panama", lombokInjectorTestService.getDestination1().getPhysicalDestination());
		assertEquals("new zealand", lombokInjectorTestService.getDestination2().getPhysicalDestination());
		assertEquals("japan", lombokInjectorTestService.getDestination3().getPhysicalDestination());
		assertEquals("scotland", lombokInjectorTestService.getDestination4().getPhysicalDestination());
	}

	@Test
	public void testProperQualifierInjectionForConfiguration() {
		assertEquals("panama", parentConfig.getDestination1().getPhysicalDestination());
		assertEquals("new zealand", parentConfig.getDestination2().getPhysicalDestination());
		assertEquals("japan", parentConfig.getDestination3().getPhysicalDestination());
		assertEquals("scotland", parentConfig.getDestination4().getPhysicalDestination());
	}
}