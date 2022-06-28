package edu.sap.KeywordDrivenFramework;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import edu.sap.KeywordDrivenFramework.Base.Base;

/**
 * Unit test for simple App.
 */
public class AppTest 
{ 
	WebDriver driver;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

    	Base baseObj = new Base();
    	driver = baseObj.initDriver("chrome");
        assertTrue( true );
    }
}
