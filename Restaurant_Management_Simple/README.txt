Restaurant Management - Simple Table Listing

Project structure:
src/com/rest/Main.java
src/com/rest/CLI/tableCLI.java
src/com/rest/models/table.java
src/com/rest/repository/tablerepository.java
src/com/rest/services/tableservice.java

This simple version stores two tables in memory:
Table 1: capacity 2
Table 2: capacity 4

Compile from the Restaurant_Management_Simple folder in PowerShell:
javac -d out (Get-ChildItem -Recurse src -Filter *.java | ForEach-Object { $_.FullName })

Run:
java -cp out com.rest.Main

Choose 1 to print the two tables, or 0 to exit.
