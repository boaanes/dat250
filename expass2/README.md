# DAT250 Expass2

The code for both projects can be found in each respective folder. There is probably alot of files from the project itself, I haven't bothered cleaning these up. The code can be found in the `src`-folders. 

I inspected the tables using and IntelliJ feature by clicking the database icon next to the class declaration,see image below.

![db](ignore.png)

## Experiment 1
After importing the project in intellij with the `pom.xml` page, i could run the project with no issues.
Following the Java Persistance API tutorial also went fine.

Databse relationship:

![db1](db-relationship-exper1.png)

## Experiment 2
When starting with experiment 2, I initially created a new maven project, however i found out rather quickly that I could just clone the same repo used in experiment 1. This probably saved me alot of time and frustration regarding maven dependencies.

When implementing the actual code, I got great us of the `@Data` annotation. The code is really compact as it doesn't contain any getters or setters. Very nice👍

Database relationship:

![db2](db-relationship-exper2.png)
