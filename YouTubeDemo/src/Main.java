
public class Main {

	public static void main(String[] args) {
		
		
		
		

	Customer customer1 = new Customer();
	customer1.id=2;
	customer1.FirstName="Engin";
	customer1.LastName="Demiroğ";
	customer1.City="Diyarbakır";
	customer1.NationalIdentity="12874919429";
	Person company1 = new Company();
	company1.id=7;
	//IoC Container
	CustomerManager customerManager = new CustomerManager(company1,new MilitaryCreditManager());
	customerManager.add();
	customerManager.giveCredit();
	
	
	







}
}
