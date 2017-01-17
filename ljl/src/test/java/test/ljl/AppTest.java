package test.ljl;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//JUnit 方式触发 Cucumber Feature 文件示例
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty"},
		features={"features"},
		tags = {"@interface"},//标记执行指定，只执行在代码前加@search标签的feature
//		format = {"junit:reports/junit/junit.xml","html:reports/html"}
		format = {"json:target/report/cucumber.json"}
		)

public class AppTest{
	
}

///**
// * Unit test for simple App.
// */
//public class AppTest 
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}
