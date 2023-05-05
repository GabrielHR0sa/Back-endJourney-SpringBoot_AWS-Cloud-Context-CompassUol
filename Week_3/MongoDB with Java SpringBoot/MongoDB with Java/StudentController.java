/*
 * package com.exemple.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 * @RestController
 * 
 * @RequestMapping("/api/student")
 * public class StudentController {
 * 
 * @Autowired
 * StudentService studentService;
 * 
 * @PostMapping("/create")
 * public Student createStudent(@RequestBody Student student){
 * return studentService.createStudent(student);
 * }
 * 
 * @GetMapping("getById/{id}")
 * public Student getStudentbyId(@PathVariable String id){
 * return studentService.getStudentbyId(id);
 * }
 * 
 * @GetMapping("/all")
 * public List<Student> getAllStudents() {
 * return studentService.getAllStudents();
 * }
 * 
 * @PutMapping("/update")
 * public Student updateStudent(@RequestBody Student student) {
 * return studentService.updateStudent(student);
 * }
 * 
 * @DeleteMapping("/delete/{id}")
 * public String deleteStudent(@PathVariable String id) {
 * return studentService.deleteStudent(id);
 * }
 * 
 * //Get documents By Field
 * @Getmapping("/studentByName/{name}") 
 * public List<Student> student.ByName(@PathVariable String name){
 * return studentService.getStudentByName(name);
 * }
 * 
 * //And operator with multiple fields
 * GetMapping("/studentsByNameAndMail")
 * public Student studentsByNameAndMail(@RequestParam String name,
 * @RequestParam String email) {
 * return studentService.studentsByNameAndMail(name, email);
 * }
 * 
 * //Or operator with multiple fields
 * GetMapping("/studentsByNameOrMail")
 * public List<Student> studentsByNameOrMail(@RequestParam String name,
 * @RequestParam String email) {
 * return studentService.studentsByNameOrMail(name, email);
 * }
 * 
 * //Pagination
 * @GetMapping("/allWithPagination")
 * public List<Student> getAllWithPagination(@RequestParam int pageNo,
 * @RequestParam int pageSize) {
 * return studentService.getAllWithPagination(pageNo,pageSize);
 * }
 * 
 * //Sorting documents
 * @GetMapping("allWithSorting")
 * public List<Student> allWithSorting(){
 * return studentService.allWithSorting();
 * }
 * 
 * //Get documents by Sub document fields
 * @GetMapping("/byDepartmentName")
 * public Lints<Student> byDepartmentName(@RequestParam String deptName) {
 * return studentService.byDepartmentName(deptName);
 * }
 * 
 * //Get documents by array value
 * GetMapping("/bySbjectName")
 * public List<Student> bySubjectName(@RequestParam String subName) {
 * return studentService.bySubjectName(subName);
 * }
 * 
 * // like query
 * GetMapping("/emailLike")
 * public List<Student> emailLike(@RequestParam String email) {
 * return studentService.emailLike(email);
 * }
 * 
 * //Starts With query
 * GetMapping("/nameStartsWith")
 * public List<Student> nameStartWith(@RequestParam String name) {
 * return studentService.nameStartsWith(name);
 * }
 * 
 * }
 */
