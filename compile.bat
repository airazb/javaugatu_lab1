mkdir classes
rem 1.compile lab
rem ##############
javac -d classes src/item/*.java 
javac ./src/item/Main.java -d classes -sourcepath ./src
rem 	run java 
rem ##############
java item.Main -classpath ./classes

rem 	package  
rem ##############
cd classes
jar cvfm ../lab1.jar ../MANIFEST.MF item
cd ..
java -jar lab1.jar

rem 	testing
rem ##############
mkdir test_bin
javac  -classpath ./classes/junit-4.12.jar  -sourcepath ./src -d test_bin test/item/TestItem.java
java -classpath ./test_bin;./classes/junit-4.12.jar;./classes/hamcrest-core-1.3.jar org.junit.runner.JUnitCore item.TestItem


