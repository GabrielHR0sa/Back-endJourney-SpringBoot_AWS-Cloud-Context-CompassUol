package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(1, "Ramesh", "Fadatera");
        return student;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Gabriel", "Rosa"));
        students.add(new Student(2, "Bruna", "Silva"));
        students.add(new Student(3, "Maggie", "Rosa"));
        students.add(new Student(4, "Luciana", "Rosa"));
        return students;
    }

//    @GetMapping("/students/{id}")
//    public Student studentPathVariable(@PathVariable("id") int studentId){
//        return new Student(studentId,"Ramesh", "Fatadare");
//    }


    //http://localhost:8080/students/1/Test/Testando
    @GetMapping("/students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastname){
        return new Student(studentId,firstName, lastname);
    }

    //http://localhost:8080/students/query?id=2&firstName=Gabriel&lastName=Rosa
    @GetMapping("/students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        return new Student(id,firstName ,lastName);
    }

@PostMapping("/students/create")
@ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    @PutMapping("students/{id}/update")
    public Student updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    @DeleteMapping("students/{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return "Student deleted successfully";
    }

}
