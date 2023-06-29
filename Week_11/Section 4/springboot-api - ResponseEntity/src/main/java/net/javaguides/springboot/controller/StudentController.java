package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping("/student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(1, "Ramesh", "Fadatera");
        //return new ResponseEntity<>(student, HttpStatus.OK);
        return ResponseEntity.ok(student);
        //  return ResponseEntity.ok(student).
        //  .header("custom-header", "ramesh")
        //  .body(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Gabriel", "Rosa"));
        students.add(new Student(2, "Bruna", "Silva"));
        students.add(new Student(3, "Maggie", "Rosa"));
        students.add(new Student(4, "Luciana", "Rosa"));
        return ResponseEntity.ok(students);
    }

//    @GetMapping("/students/{id}")
//    public Student studentPathVariable(@PathVariable("id") int studentId){
//        return new Student(studentId,"Ramesh", "Fatadare");
//    }


    //http://localhost:8080/students/1/Test/Testando
    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastname){
        Student student =  new Student(studentId,firstName, lastname);
        return ResponseEntity.ok(student);
    }

    //http://localhost:8080/students/query?id=2&firstName=Gabriel&lastName=Rosa
    @GetMapping("query")
    public ResponseEntity<Student> studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        Student student =  new Student(id,firstName ,lastName);
        return ResponseEntity.ok(student);
    }

@PostMapping("create")
@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
    return new ResponseEntity<>(student,HttpStatus.CREATED);
    }

    @PutMapping("{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return ResponseEntity.ok("Student deleted successfully");
    }

}
