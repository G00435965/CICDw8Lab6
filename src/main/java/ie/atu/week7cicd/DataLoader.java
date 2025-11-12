package ie.atu.week7cicd;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) { this. personRepository = personRepository; }

    @Override
    public void run(String... args) throws Exception {
        Address address1 = new Address( "Galway", "H91ZZ00");
        Person testData = new Person( "Keelan", "Student", "1234", "keelan@atu.ie", "Electronics", address1);
        //Address 2
        Address address2 = new Address( "Mayo", "H91ZZ00");
        Person testData2 = new Person( "James", "Student", "5678", "james@atu.ie", "Electronics", address2);
        //Address 3
        Address address3 = new Address( "Clare", "H91ZZ11");
        Person testData3 = new Person( "Aaron", "Student", "9101", "aaron@atu.ie", "Electronics", address3);
        personRepository.save(testData);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}
