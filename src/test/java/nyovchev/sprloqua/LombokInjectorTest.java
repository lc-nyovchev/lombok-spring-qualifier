package nyovchev.sprloqua;

import nyovchev.sprloqua.config.LombokInjectorTestConfig;
import nyovchev.sprloqua.service.LombokInjectorTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = LombokInjectorTestConfig.class)
public class LombokInjectorTest {

	@Autowired private LombokInjectorTestService lombokInjectorTestService;

	@Test
	public void testProperQualifierInjection() {
		assertEquals("panama", lombokInjectorTestService.getDestination1().getPhysicalDestination());
		assertEquals("new zealand", lombokInjectorTestService.getDestination2().getPhysicalDestination());
	}
}