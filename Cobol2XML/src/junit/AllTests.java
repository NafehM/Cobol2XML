package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ NumTest.class, PaserTest.class, SymbolTest.class, TokenTest.class, WordTest.class })
public class AllTests {

}
