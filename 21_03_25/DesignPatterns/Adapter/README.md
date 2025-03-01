# Packages repackaging - Adapter Design Pattern

CompanySender has 3 attributes, while the Receiver is expecting 2.  

The "isRegisteredPost" boolean is instead integrated inside the ID; if the package's most significant number is (strictly) higher than 5, then the package is a Registered Package, which can be traced. Otherwise, it is not traceable.  

The receiver can only interact with TargetPackage, which is implemented by Repackager. The Receiver class only inserts the data of the address and of the ID. 
  
The Repackager does the repackaging. At the creation of the object, it creates an instance of CompanySender, which expects `(String address, Integer IDnumb, Boolean isRegisteredPost)`. The repackager calls the method `private Boolean extractBoolean(Integer id)` in order to extract whether or not the most significant digit of the ID signals that it is or not a registered package.  
  
Then the CompanySender instance is created. If the Receiver calls the gimmeDetails, then the Repackager calls the CompanySender in turn in order to receive the information about the status: it will be given in case of a traceable package, and a message will be sent back in case it is not traceable.  