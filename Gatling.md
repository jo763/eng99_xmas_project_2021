# Gatling
-	Script based performance testing tool
-	Uses Scala to write the tests
-	Used for Heavy Load Testing
-	Can easily be hooked into CI/CD Jenkins pipeline
-	Less RAM and CPU utilisation 

## Steps to install Gatling
1.	Download Gatling open source on c drive  - https://gatling.io/
2.	Install Scala as a plugin on IntelliJ
3.	Install Java JDK (8 or above) - https://www.oracle.com/java/technologies/downloads/#jdk17-windows
4.	Copy Java bin path into PATH system variable
5.	Copy Java path into JAVA_HOME variable
6.	Check version – Java -version
7.	Run gatling.bat 

# Generating HAR file
1.	On your website > f12 > Developer tools > Network
2.	Record your interaction with the website
3.	Export HAR file
4.	Open recorder.bat from terminal
5.	Recorder mode > HAR Converter
6.	Look for HAR file previously exported 
7.	Run gatling.bat and select option for the file exported
8.	Gatling test IP given
