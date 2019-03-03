1. I have Created the CRC and attached in the attchment. It consists of Customer, Queue Manager, Table Manager 
   and Table as a Class. 
   
   Customer --> Provide customer information. Reply to the message with Confirm or Leave. 
   Queue Manager --> Look for availability of tables with Table Manager. 
                     Reply to customer with the option accepted or in a waitlist. 
   Table Manager --> Provide information to Queue Manager about avalability of tables. 
                     Keep records of each table. 
   Table --> Provide table information like its capacity.

2. These classes has a certain responsibilities. Once each object performs its responsibility the next object 
   will be ready for its responsibility. Further in addition to the problem, if the customer requires table of 
   5 people and the table of 3 people only available then the next customer who is requested for the table will 
   be allowed to have that table. This loop will continue until the customer is available with 3 number of people. 
   Due to this only, I have added chain of responsibility design pattern in the Din Tai Fung Design Pattern.

3. I have attached Communication diagram in the attachment. (.asta and .PNG files)
