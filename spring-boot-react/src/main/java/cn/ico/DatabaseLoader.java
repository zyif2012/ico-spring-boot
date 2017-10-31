package cn.ico;

import cn.ico.domain.Employee;
import cn.ico.domain.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }


    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Tom", "english name"));
    }
}
