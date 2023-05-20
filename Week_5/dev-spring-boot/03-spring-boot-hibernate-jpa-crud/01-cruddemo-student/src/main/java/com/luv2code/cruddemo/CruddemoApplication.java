package com.luv2code.cruddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		// lambda expression
		return runner -> {
			//createStudent(studentDAO);

			createMultipleStudents(studentDAO);

			//readStudent(studentDAO);

			//queryForStudents(studentDAO);

			//queryForStudentsByLastName(studentDAO);

			//updateStudent(studentDAO);

			//deleteStudent(studentDAO);
		
			//deleteAll(studentDAO);
		};
	}

	//----------------- D - Delete ----------------------------------------------------

	// deletando todos os estudantes da tabela
	private void deleteAll(StudentDAO studentDAO) {

		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);
	}

	//deletando somente um aluno pelo id definido
	private void deleteStudent(StudentDAO studentDAO) {

		int studentId = 3;
		System.out.println("Deleting student id: " + studentId);
		studentDAO.delete(studentId);
	}

	//----------------- U - Update ----------------------------------------------------
	private void updateStudent(StudentDAO studentDAO) {
		//retieve student based on the id: primary key
		int studentId=1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change first name to "Scooby"
		System.out.println("Updating student...");
		myStudent.setFirstName("Scooby");

		// update the student
		studentDAO.update(myStudent);

		//display the updated student
		System.out.println("Update student: " + myStudent);
	}

	//------------------ R - Read --------------------------------------------------------
	//exibir o estudante buscado pelo last name
	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudent = studentDAO.findByLastName("Jhon");

		//display list of students
		for(Student tempStudent : theStudent){
			System.out.println(tempStudent);
		}
	}

	//exibir os estudantes cadastrados no banco
	private void queryForStudents(StudentDAO studentDAO) {
		// get alist of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}

	}

	//cadastrar e exibir os dados do estudante pelo id
	private void readStudent(StudentDAO studentDAO){

		//create a student object
		System.out.println("Creating a new Student...");
		Student  tempStudent= new Student("Teste", "ts", "teste@gmai.com");

		//save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved Student. Generated id: " + theId);

		//retrive student based on the id: primary key
		System.out.println("Retriving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		//display student
		System.out.println("Found the student: " + myStudent);

	}

	//-------------------- C - Create --------------------------------------------

	// criando multiplos estudantes
	private void createMultipleStudents(StudentDAO studentDAO){

		//create multiple students
		System.out.println("Creating 3 new student objects...");
		Student tempStudent1 = new Student("Jhon", "Wick", "Jonwick@gmail.com");
		Student tempStudent2 = new Student("Elizabeth", "Queen", "QueenEl@gmail.com");
		Student tempStudent3 = new Student("Elton", "Jhon", "Jonelt@gmail.com");

		//save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent1.getId());
		System.out.println("Saved student. Generated id: " + tempStudent2.getId());
		System.out.println("Saved student. Generated id: " + tempStudent3.getId());

	}

	//criando um novo estudante, utilizando a pasta dao e seus arquivos
	private void createStudent(StudentDAO studentDAO){
		
		//create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@gmail.com");

		//save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
	//---------------------------------------------------------------------------------
}
