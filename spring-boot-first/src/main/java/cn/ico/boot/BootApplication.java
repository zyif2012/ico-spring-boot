package cn.ico.boot;

import org.hibernate.loader.custom.Return;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.ico.boot.data.student.GenericAllPurposeRepository;
import cn.ico.boot.data.student.StudentRepository;
import cn.ico.boot.data.todo.TodoDataService;
import cn.ico.boot.entity.Passport;
import cn.ico.boot.entity.Project;
import cn.ico.boot.entity.Student;
import cn.ico.boot.entity.Task;

//In almost every relationship, independent of source and target sides, one of the two sides will have the join column in its table. That side is called the owning side or the owner of the relationship. The side that does not have the join column is called the non-owning or inverse side.
//Although we have described the owning side as being determined by the data schema, the object model must indicate the owning side through the use of the relationship mapping annotations. The absence of the mappedBy element in the mapping annotation implies ownership of the relationship, while the presence of the mappedBy element means the entity is on the inverse side of the relationship. The mappedBy element is described in subsequent sections.


@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class BootApplication extends SpringBootServletInitializer implements CommandLineRunner{

	private static final Logger log = LoggerFactory
			.getLogger(BootApplication.class);

	@Autowired
	TodoDataService todoJPAService;

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	GenericAllPurposeRepository genericRepository;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BootApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		runAllStudentExamples();

		/*
		 * int todo1 = todoJPAService.addTodo("Ranga", "Dummy10", new Date(),
		 * false);
		 *
		 * int todo2 = todoJPAService.addTodo("Ranga", "Dummy11", new Date(),
		 * false);
		 *
		 * log.info( "Querying for todo records where user = 'Ranga':");
		 *
		 * todoJPAService.retrieveTodos("Ranga") .forEach(todo ->
		 * log.info(todo.toString()));
		 *
		 * todoJPAService.updateTodo(new Todo(todo1, "Ranga", "Dummy++", new
		 * Date(), false));
		 *
		 * log.info("Querying Todo by id " + todo1);
		 *
		 * log.info(todoJPAService.retrieveTodo(todo1) .toString());
		 *
		 * log.info("Deleting todo id " + todo2);
		 *
		 * todoJPAService.deleteTodo(todo2);
		 *
		 * log.info( "Querying for todo records where user = 'Ranga':");
		 *
		 * todoJPAService.retrieveTodos("Ranga") .forEach(todo ->
		 * log.info(todo.toString()));
		 *
		 */
	}

	private void runAllStudentExamples() {
		Passport passport = new Passport("L12344432",
				"India");

		Student student = createStudent("dummy@dummy.com",
				"Doe", passport);
		student = genericRepository.createStudent(student);

		Project project = new Project();
		project.setName("Project1");

		project = genericRepository.createProject(project);

		genericRepository.assignStudentToProject(
				student.getId(), project.getId());

		Task task = new Task();
		task.setName("Task1");
		task.setProject(project);
		task.setStudent(student);
		genericRepository.createTask(task);

		Student student2 = studentRepository
				.retrieveStudent(101);
		System.out.println("student2 " + student2);

		printAllDataAfterTest();

		Passport passport2 = genericRepository
				.getPassport(201);
		System.out.println("passport 2 " + passport2);
		System.out.println("passport 2 Student"
				+ passport2.getStudent());
	}

	private Student createStudent(String email, String name,
								  Passport passport) {
		Student student = new Student();
		student.setEmail(email);
		student.setName(name);
		student.setPassportId(passport);
		return student;
	}

	public void printAllDataAfterTest() {
		System.out.println(
				studentRepository.retrieveAllStudents());
	}
}
