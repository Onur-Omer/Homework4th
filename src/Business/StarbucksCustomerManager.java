package Business;

import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService  customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckSerivce) {
		super();
		this.customerCheckService = customerCheckSerivce;
	}
	
	@Override
	public void  save(Customer customer) {
			if(customerCheckService.validateRealPerson(customer)) {

				super.save(customer);
				
			}
			
}
}
