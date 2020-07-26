#Compile command
mvn clean package

#Execution command
java -jar target\paypal-1.0-SNAPSHOT.jar
---------------------------------
# TransactionService urls
# Transactions get By Date
http://localhost:9090/transaction/date/07-27-2020
# Transactions get by User ID
http://localhost:9090/transaction/userId/K003
#Transaction get by User Id and TransactionType
http://localhost:9090/transaction/userId/K001/transactionType/invoice

# Dictionary Service
#Execution command
java -jar target\dictionary-1.0-SNAPSHOT.jar

# Service Urls
http://localhost:9080/dictionary/word/ant
http://localhost:9080/dictionary/addWord/ant
http://localhost:9080/dictionary/allWords
http://localhost:9080/dictionary/deleteWord/ant
