package Business;

import Entity.Customer;

interface CustomerCheckService {
	boolean validateRealPerson(Customer customer);
}
