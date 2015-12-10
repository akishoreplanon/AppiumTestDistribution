# AppiumTestDistribution

Add the below dependencies in your pom.xml

```
<dependency>
	<groupId>com.github.saikrishna321</groupId>
	<artifactId>AppiumTestDistribution</artifactId>
	<version>v2.0.0</version>
</dependency>
```

```
<repositories>
		<repository>
			<id>jitpack.io</id>
			<url>https://jitpack.io</url>
		</repository>
	</repositories>
```
<h2>Sample Tests</h2>
 Clone the project (https://github.com/saikrishna321/AppiumTestDistributionExample)
<h1>Configure tests</h1>

Main Runnerclass should look as below :: 

```
public class Runner {
    
	@Test
	public void testApp() throws Exception {
		ParallelThread parallelThread = new ParallelThread();
		parallelThread.runner("com.paralle.tests");

	}
}

```

1. Extend your tests to BaseTest which is part of the dependencies, which takes care of running the appium server session in parallel threads.

2. Place your android.apk file into build folder.

3. add the below variables to the config.properties
 
    * appname=AndroidCalculator.apk(Android APK file name which is placed in build folder)
    * package=com.android2.calculator3(Application package)
    * appActivity=com.android2.calculator3.Calculator(Application Launch Activity)
    * runner=parallel or distribute
    
    
<h3>Run Test from CommandLine</h3>

   mvn -Dtest=Runner test
   
<h3>Reports</h3>

Your should see report file generated as ExtentReport.html

