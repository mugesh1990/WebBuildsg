@weBuildTest
Feature: webuildsg Test Automation


@HomePage
    Scenario Outline: Title of your scenario outline
     Given Load the chrome Browser with url
   Then Check The Activity tracker menu are linked with proper page 
    Then Validate all activity tracker menus are having log 
    Then I search "<value>" with search data filed to filter activity tracker
    Then Validate the Social media container are having log 
    And  Social media menu are landing on proper page while clicking 
    Then close the Broswer

 Examples:
       |value|
       |active|
       

 @ActivenUserPage
    Scenario Outline: Title of your scenario outline
     Given Load the chrome Browser with url
     Then redirect to Activeuser page
     Then check the activegoup with "<activegroup>"
     Then All active group should tag with page 
     Then check the active group value more then "<groupvalue>"
      Then check the "<activegroup>" link with proper page landing
     Then close the Broswer
     
			Examples: 
     		 | groupvalue | status  |activegroup|
     		 | 5 | success |.NET Developers Singapore|
    
 @ProgramingLanguage
     Scenario Outline: Title of your scenario outline
     Given Load the chrome Browser with url
     Then redirect to programing Language
     Then click the Radionbutton with "<language>" languaage
     Then subMenu Visiablity Check 
     Then subMenus are linkied with proper page
     Then close the Broswer
    
     Examples:
    	  |language|
    		|C|
    
  
    
