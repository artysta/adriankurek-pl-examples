# adriankurek-pl-examples

Simple Apache Maven application.

You must have Apache Maven installed if you want to run this app. Just download it from the [official site](https://maven.apache.org/download.cgi) or use [Chocolatey](https://chocolatey.org/): `choco install maven`.

Instruction:

Clone branch:
`git clone --single-branch --branch json-parser-maven-app https://github.com/artysta/adriankurek-pl-examples.git`

Go to the folder:
`cd adriankurek-pl-examples/json-parser-maven-app/`

Compile:
`mvn clean install`

Run (remember to add the path to the JSON library):
`java -cp ".\target\json-parser-app-1.0-SNAPSHOT.jar;PATH_TO_JSON_PACKAGE" pl.adriankurek.App`

(In my case it is:
`java -cp ".\target\json-parser-maven-app-1.0-SNAPSHOT.jar;C:\Users\Adrian\.m2\repository\org\json\json\20190722\json-20190722.jar" pl.adriankurek.App`)
