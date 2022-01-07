package com.java;

public class SpringNotes {

	public SpringNotes() {
		// TODO Auto-generated constructor stub
	}

}
/*
							Java Technology
								|
				----------------------------------
				|				|				|
				JSE				JEE				JME
				|				|				|
				core			enterprise		micro [ android api ] / reactNative
				|				|
	language fundas			------------------
	oops concepts			|				|
	packages				Web				EJB
	access specifiers		|				|java beans [ component / class ] 
	multithreading		Servlets			------------------------------------
	generics				JSP				|Spring		   |JPA				|
	collections f/w			Angular		Session			Entity			Message
	file i/o				React			|				|				|
	jdbc							-------------		------------	-------------
	|								|		   |		|		|		|		|
	adv java					Stateless   Stateful	BMP	   CMP		SMS		Mail
	|				airindia.com		login/register	jdbc   ORM				JMS
	networking		mum-lon-30thDec-Book->	Ticket
	|				2 tickets													web checkin
	socket programming					Bean managed persistence [ manual jdbc code to be written by you ]
	RMI - javac, rmic					Container managed persistence  [ orm way - container will generate the queries for you ]
	remote method			Neova - 20 offline - 20 30  1/2/3        1.5
	invocation
	
	just the reference
	HERE
	|ATM					ATM server
	SavingsAccount		new SavingsAccount(); <-- actual object is HERE
	|	savObj;	(1)		|   withdraw(); (4) ->JPA-> DB
	|					|
	Machine1			Machine2
	JVM1 [ client ]		JVM2 [ server ]
	|					|
	proxy1	(2)			proxy2 (3) <-- proxy to proxy communication d'facto
	||					||
	|+------------------+|
	+--------------------+ physical layer
marshalling			unmarshalling	
SavingsAccountStub		SavingsAccountStub


												DB
												|
												JPA
					Bank's Enterprise Server	|
					|  Java's Enterprise Application - for a Bank - getBalance() + setBalance()
			-------------------------------------		
			|	  |    |      |    |		|
			ATM  PC   Visa   IVR  Phone	SmartPhone
		  cash   IE			  |     SMS  androidApp - iMobileApp for ICICI
				Chrome		listen to your bank balance 89573.00  eighty.mp3,nine.mp3,thousand....
				|
		http://icicibank.com/login
			dashboard->viewbalance
			|
			view payee ->transfer funds
							|
							view statements
							
	"enterprise application feature" - has 7 features
	
	OLA/Uber cabs
	
	1.remote capability
			- socket programming - Socket sock = new Socket(ip,port); 
			
									ServerSocket serv = new ServerSocket(ip,port);
	
	2. high availability
			24 x 7 
			
			clustering = 8 machine in a cluster   				UPS
			load balancers
			
	3. Multi threading						1 minute sale of a "mobile phone"
	
			Hundreds of ATM machines can communicate with the ATMServer
					2000 customers can be replied in a second
	
	4. POOLing of resources
			empty tea/coffee cups at the TEAvending machine
			are they looking same????
			
	5. Caching of resources
			you and your friends are having tea/coffee in their individual cups
			
	6. Transaction management
					Atomic Consistency Isolation Durability
					
	7. Security management - TLS / OPT / transaction password 
	
	 
	 1 - tables
	 2 - POJOs - entities
	 3 - repositories of JPA
	 -------------------------------
	 4 - SERVICE LAYER - YOUR BUSINESS LOGIC
	 -------------------------------
	 5 - spring controller
	 |
	 6 - angular UI - dinning and menu
					
			
	Spring
	
			- all above features can be acquired
			
			simple method -> remote method
			simple method -> transactional method
			simple method -> threaded method
			simple method -> pooling and caching
			simple method -> secured method
			
			
	class SavingsAccount
	{
			void withdraw()
			{
			
			}
	}		
	class SavingsAccountProxy
	{
		SavingsAccount saObj; //hasA
		
			void withdraw() //code weaving technique
			{
					<-- here the code before the call
						saObj.withdraw();
					---> here the code after the call
			}
	}
	
						Association 
							|
			-------------------------------------
			|			|			|			|
			isA			hasA		usesA		producesA
			
			
			class Machine { }
			
			class WashingMachine extends Machine //isA
			{
									//hasA
					WashingTub washingTub = new WashingTub(); //hasA - fix member inside the machine - its fatal
					
				producesA					   usesA     usesA        usesA         usesA
					Laundry wash(WashingPowder washPow, Water wat, Cloth cl[], Electricity elect) { 
						// it would desolve the washPow with wat and cleans the cl
						//by utilizing the elect 
						 ..
						 rinse();
						 ..
					}
					private void rinse() {  .. spin(); ... }
					private void spin() { }
			}
	
	
	
		DI  - Dependency Injection 
		IoC - Inversion of Control
	
	
	
				src
				|
		-----------------
		|
		main
		|
	---------------------
		|			|
		java		resources
		|			|
		Car			SpringConfig.xml [ any name ]
		Engine			wire all the dependencies
		Piston			in xml way here | ANNOTATED WAY
		TestCar3---->
		|
	"spring container" would be loaded as per the xml file configuration
		
		
	
			
			
	
	
	
	
				

*/