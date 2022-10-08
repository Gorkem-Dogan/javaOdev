
public class CustomerManager {

	private Person _person;
	private CreditManager _creditManager;
	
	public CustomerManager() {
		
		
	}

	public CustomerManager(Person person, CreditManager creditManager) {

		_person = person;
		_creditManager = creditManager;
	}

	public void add() 
	{
		System.out.println(_person.id+" has been added to the system");
	}
	public void giveCredit() 
	{
		_creditManager.calculate();
		System.out.println("Kredi verildi");
		
	}

}

