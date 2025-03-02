# Login system - Singleton+ 

The main in client allows to create users by imputting usernames and passwords.

The user class contains a LocalDate variable which specifies the date their profile was created.

 Each user is assigned a userLog, which contains a list of access (listaAccessi), which stores the LocalDateTime the user has successfully logged in. The userLog also contains a unsuccessfulLogins counter, which counts the number of unsuccessful logins.  A message warns of the attempt.

The Login class is Singleton - there should be only one instance of it; it is called by the method getInstance().

The userLogin() method returns a Boolean and takes as input a Utente and a String as password.

If the password is correct - through the Utente method checkPassword - which does not need to reveal it - then the userLogin is successful, and a Boolean is returned. If the login is unsuccessful, then a unsuccessful attempt is logged.

ToDo: check if Utente u1 exists before try to login. Add more nuance and data to the Utente class. Allow for a "forgotten your password" style of interaction. Add comments about methods functionalities