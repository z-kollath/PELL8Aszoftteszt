package hu.meiit.pell8a.JUnit;


//Tesztkészlet (test suite) - lefuttatja az összes teszt osztályt 
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ negyzetTeszt.class, szamolATeszt.class })
public class MindenTeszt {

}
