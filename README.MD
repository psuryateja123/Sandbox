#### Overview

A simple application with three screens:
 - Main screen
 - Details screen
 - Sign in screen
 
 
 The automation of the app was done using the android espresso and used spoon plugin to run on multiple devices and also to capture the logs.
 
 
 
 

####Current Acceptance Criteria:
 
 Main screen:
 
 ```
 Given I am viewing the apps
 When I am signed out
 Then only one app is visible
 ```
 
 ```
 Given I am viewing the apps
 When I am signed in
 Then a full list of apps is visible
 ```
 
 ```
 Given I am viewing the apps (signed in or out)
 When I click an app
 Then I go to the apps details
 ```
 
 ```
 Given I am signed in
 When I click sign out button
 Then I sign out 
 ```
 
  ```
 Given I am signed out
 When I click sign in button
 Then I go to the sign in page 
 ```
 
 Sign in:
 
 ```
 Given I try and click submit
 When I have not entered a username or password
 Then the submit button is not clickable
 ```
 
 ```
 Given I try and click submit
 When I have entered a username or password
 Then the submit button is clickable
 ```
 
 ```
 Given I try and click submit
 When the username is less than 4 characters
 Then I am not allowed to sign in
```

 Details screen:
 
 ```
 Given I am viewing the details
 When I click launch application
 Then the 3rd party app is opened
 ```
 
 *There may also be other non-documented features / acceptance criteria / bugs *
