Feature: SignUpFeature 
	This feature deals with sign up functionality of the application
	
Scenario: Sign up a new user  with valid user data 
	Given  user is on homepage 
	And  He click my account 
	And  he Click sign up 
	And he enter first name as "Choudhury" 
	And he enter lastName as "Iqbal" 
	And he enter mobile number as "9293856129" 
	And he enter email as "iqbalchoudhury2@gmail.com" 
	And he enter password as "password" 
	And he confirms password as "password" 
	When he click sign up button 
	Then he will be able to sign up successfully 
	
	
	
