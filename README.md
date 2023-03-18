Pre-requisites: Make sure you have 'IntelliJ Idea' Installed on your machine 

Checkout Code and configure project:

Open your command line or Terminal application and enter the directory where you would like to copy the repository. For example: cd D:\test
Clone the repository git clone https://github.com/kedarrnath/APITests.git
Open intellij, create new java project with project source as the "APITests" folder in the content checked-out in step2.
Right click on the project in intellij, goto BuildPath > Configure Buildpath. Click "Add External Libraries" and choose libraries from the "libs" folder in the project checked out in step2. Click "Apply and close"
Choose Java 8
Run the tests in intellij:

Click on testng.xml and Right click > Run
You should see all tests being run and their results in Run tab in intellij.

Run the tests from command line:
mvn clean test
