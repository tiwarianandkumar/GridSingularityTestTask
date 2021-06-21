$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/org/com/gridsingularity/resources/TC001_SignUpTest.feature");
formatter.feature({
  "name": "To Test Successfull Sign Up for User",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Test DAO is Up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.testDAOIsUpAndRunning()"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Failed to instantiate class org.com.gridsingularity.stepdefinitions.MyStepdefs\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:47)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:33)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\r\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:118)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:56)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:127)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:41)\r\n\t... 34 more\r\nCaused by: org.openqa.selenium.WebDriverException: chrome not reachable\n  (Driver info: chromedriver\u003d91.0.4472.19 (1bf021f248676a0b2ab3ee0561d83a59e424c23e-refs/branch-heads/4472@{#288}),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 71.42 seconds\nBuild info: version: \u00272.39.0\u0027, revision: \u002714fa800511cc5d66d426e08b0b2ab926c7ed7398\u0027, time: \u00272013-12-16 13:18:38\u0027\nSystem info: host: \u0027Anand-PC\u0027, ip: \u0027192.168.29.83\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:193)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:145)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:554)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:216)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.startSession(ChromeDriver.java:182)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:111)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:115)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:161)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:129)\r\n\tat org.com.gridsingularity.stepdefinitions.MyStepdefs.\u003cinit\u003e(MyStepdefs.java:38)\r\n\t... 39 more\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on the Link CreateNewAccount",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnTheLinkCreateNewAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters email as \"anandkumard@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersEmailAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters name as \"Anandkumar T\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersNameAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters organization as \"ITC\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersOrganizationAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters password as \"Grid_SingularityTest001\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersPasswordAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Click on Agree Checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userClickOnAgreeCheckbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on next button on sign up page",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.clickOnNextButtonOnSignUpPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Should be signed up successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldBeSignedUpSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/org/com/gridsingularity/resources/TC002_LoginTest.feature");
formatter.feature({
  "name": "To Test Successfull Login for User",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Test DAO is Up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.testDAOIsUpAndRunning()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters email \"anandkumart.1993@gmail.com\" on login page",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userEntersEmailOnLoginPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password \"Grid_SingularityTest001\" on login page",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersPasswordOnLoginPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.clickOnTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldBeLoggedInSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/org/com/gridsingularity/resources/TC003_CreateProjectTest.feature");
formatter.feature({
  "name": "To Test \u0026 Verify if User is able to create a new project",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Test DAO is Up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.testDAOIsUpAndRunning()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is Logged in Successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsLoggedInSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on left side project link on home page",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnLeftSideProjectLinkOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on new project link",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userClickOnNewProjectLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters new project name as \"Test1\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersNewProjectNameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters new project description as \"Testing\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersNewProjectDescriptionAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on add button for new project creation",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userClickOnAddButtonForNewProjectCreation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify if the new Project is Created with the name \"Test1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.verifyIfTheNewProjectIsCreatedWithTheName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/org/com/gridsingularity/resources/TC004_CreateSimulationTest.feature");
formatter.feature({
  "name": "To Test \u0026 Verify if User is able to craete a new simulation for project",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Test DAO is Up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.testDAOIsUpAndRunning()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is Logged in Successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsLoggedInSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on left side project link on home page",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnLeftSideProjectLinkOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on new project link",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userClickOnNewProjectLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters new project name as \"Test2\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersNewProjectNameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters new project description as \"Testing\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersNewProjectDescriptionAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on add button for new project creation",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userClickOnAddButtonForNewProjectCreation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify if the new Project is Created with the name \"Test2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.verifyIfTheNewProjectIsCreatedWithTheName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the expand link for project \"Test2\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnTheExpandLinkForProject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on new simulation link on project page",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userClickOnNewSimulationLinkOnProjectPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters simulation name as \"Simulation Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersSimulationNameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters simulation description as \"Simulation Description Test\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersSimulationDescriptionAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select simulation project as \"Test2\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userSelectSimulationProjectAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters simulation start date as \"Mon, 21 Jun 2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersSimulationStartDateAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters simulation end date as \"Tue, 22 Jun 2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersSimulationEndDateAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select simulation solar profile as \"Sunny\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userSelectSimulationSolarProfileAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select simulation spot market type as \"One sided pay as offer\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userSelectSimulationSpotMarketTypeAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters simulation no of spot market as \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersSimulationNoOfSpotMarketAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select grid fees as \"Constant value\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userSelectGridFeesAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters simulation Market slot real time duration as \"0\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersSimulationMarketSlotRealTimeDurationAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on next button on simulation page",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userClickOnNextButtonOnSimulationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify if the new simulation has been created",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.verifyIfTheNewSimulationHasBeenCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});