#Compile command
mvn clean package

#Execution command
java -jar target\paypal-1.0-SNAPSHOT.jar
---------------------------------
# Service urls
# Transactions get By Date
http://localhost:9090/transaction/date/07-27-2020
# Transactions get by User ID
http://localhost:9090/transaction/userId/K003
#Transaction get by User Id and TransactionType
http://localhost:9090/transaction/userId/K001/transactionType/invoice
