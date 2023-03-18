Pre-requisites: Make sure you have 'IntelliJ Idea' Installed on your machine 

Checkout Code and configure project:

Open your command line or Terminal application and enter the directory where you would like to copy the repository. For example: cd D:\test

1. Clone the repository git clone https://github.com/kedarrnath/APITests.git
2. Open intellij, create new java project with project source as the "APITests" folder in the content checked-out in step2.
3. Right click on the project in intellij, goto BuildPath > Configure Buildpath. Click "Add External Libraries" and choose libraries from the "libs" folder in the project checked out in step2. Click "Apply and close"
4. Choose Java 8


Run the tests in intellij:

1. Click on testng.xml and Right click > Run
2. You should see all tests being run and their results in Run tab in intellij.

Run the tests from command line:
1. mvn clean test

View Reports:
1. Reports will be avaiable in src/main/resources/Report.html



![image](https://user-images.githubusercontent.com/31267337/226098691-db3bc7ea-be5f-4a97-9bdc-1beeb83eba6c.png)
![image](https://user-images.githubusercontent.com/31267337/226098707-44209f1a-34b4-4bf9-b10c-00e1794b09fa.png)
