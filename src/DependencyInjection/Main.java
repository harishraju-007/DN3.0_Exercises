package DependencyInjection;

public class Main {
    public static void main(String[] args) {
        // Create the repository implementation
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        
        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);
        
        // Use the service to find a customer
        Customer customer = customerService.getCustomerById(1);
        
        // Print the customer details
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}
