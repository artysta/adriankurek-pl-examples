# adriankurek-pl-examples

Simple implementation of Java KeyListener.

Instruction:

Clone branch:
`git clone --single-branch --branch json-parser-maven-app https://github.com/artysta/adriankurek-pl-examples.git`

Go to the folder:
`cd adriankurek-pl-examples/json-parser-maven-app/`

Compile:
`mvn clean install`

Run (remember to add the path to the JSON library):
`java -cp ".\target\json-parser-app-1.0-SNAPSHOT.jar;PATH_TO_JSON_PACKAGE" pl.adriankurek.App`

(In my case:
`java -cp ".\target\json-parser-app-1.0-SNAPSHOT.jar;C:\Users\Adrian\.m2\repository\org\json\json\20190722\json-20190722.jar" pl.adriankurek.App`)