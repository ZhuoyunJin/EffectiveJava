package Test.Assertion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestAssertions.class,
        JunitAnnotation.class
})

public class TestSuite {
}
