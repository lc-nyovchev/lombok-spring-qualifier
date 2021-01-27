# lombok-spring-qualifier
Small project demonstrating that the constructor injection of @Qualifier beans is now possible with lombok

Check out the test folder where there is a service wired like that:


```java
@Service
@Getter
@RequiredArgsConstructor
public class LombokInjectorTestService {
	@Qualifier(DESTINATION_ONE) @NonNull private final Destination destination1;
	@Qualifier(DESTINATION_TWO) @NonNull private final Destination destination2;
}
```


**NOTE:** 
Keep in mind that this functionality was introduced in lombok 1.18.4 and it requires placing
a **lombok.config** file in the root of your dir, looking like that:

```yaml
# Copy the Qualifier annotation from the instance variables to the constructor
# see https://github.com/rzwitserloot/lombok/issues/745
lombok.copyableAnnotations += org.springframework.beans.factory.annotation.Qualifier

```
