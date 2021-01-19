# adriankurek-pl-examples

Simple Java application related to the Hibernate ORM framework.

## Instruction:

- Install MySQL:

      `choco install mysql`

- Connect to the MySQL server:

      `mysql -u root`

- Create database:

      `create database localdatabase;`

- Install Apache Maven:

      `choco install maven`

- Clone branch:

      `git clone --single-branch --branch java-hibernate-jpa-app https://github.com/artysta/adriankurek-pl-examples.git`

- Go to the folder:

      `cd adriankurek-pl-examples/java-hibernate-jpa-app/`

- Compile:

      `mvn clean install`

- Run:

      `mvn exec:java -Dexec.mainClass="pl.adriankurek.main.App"`

Each time you run this app, it adds new random car to the database.
