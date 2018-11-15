# RamaseshanThirumalai

Welcome to Assurity Api Automation

The api project has been developed using JAVA RestAssured combined with Maven and TestNG framework.

To run this project please make sure you have the following 

1) Eclipse or Netbeans or any IDE installed in your computer
2) Maven (3.3.x) installed and an entry has been added in the environment variable. To verify please open command prompt (As administrator)
and run this mvn --version. If you see the version, then it has been installed properly
3) The pom.xml has all the required jars and those jars will be pulled from maven central repository (ofcourse you need an Internet connection :-))
4) To execute the project say in Eclispe using TestNG, you need to install the TestNg plug-in. Please refer: https://www.ecanarys.com/Blogs/ArticleID/169/How-to-Install-TestNG-framework-Step-by-Step-installation-process
up to Step 7 to install the plug-in/framework.
5) The testng.xml contains listener class and test class.
6) The rest assured libraries can be accessed from maven central repository and you could verify the same in pom.xml
7) Java JDK 1.8 :-)

There are 2 ways to run this project
1) Maven commands using command line
	a) "mvn install" will install all the libraries
	b) "mvn test" will run the test
2) Right-click on "AssurityApiTest" in Eclipse IDE (or any IDE you use) and Run-as "TestNG Test"

There are 2 ways to view the report
1) SUREFIRE REPORTS (maven execution)
		Go to your project in your local computer and navigate to the following to view HTML surefire reports. This report is viewable only if the 
		tests are executed using MAVEN command in command line.
		
		<\ApiAutomation\target\surefire-reports\html\index.html>
		
2) TESTNG REPORTS (RUN-AS TestNg Test execution) 
		Go to your project in your local computer and navigate to the following to view testng report. This report is viewable only if the 
		tests are executed in say Eclipse by right-click on the Test class and choosing run as "TestNg Test"
		
		<\ApiAutomation\test-outputemailable-report.html>

 
