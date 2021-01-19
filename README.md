# adriankurek-pl-examples

Simple Java application related to the Hibernate ORM framework.

## Instruction:

1. Install MySQL:

        choco install mysql

2. Connect to the MySQL server:

        mysql -u root

3. Create database:

        CREATE DATABASE localdatabase;

4. Install Apache Maven:

        choco install maven

5. Clone branch:

        git clone --single-branch --branch java-hibernate-jpa-app https://github.com/artysta/adriankurek-pl-examples.git

6. Go to the folder:

        cd adriankurek-pl-examples/java-hibernate-jpa-app/

7. Compile:

        mvn clean install

8. Run:

        mvn exec:java -Dexec.mainClass="pl.adriankurek.main.App"

Each time you run this app, it adds new random car to the database.
