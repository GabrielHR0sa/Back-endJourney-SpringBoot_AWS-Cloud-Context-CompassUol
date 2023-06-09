/*
 * package com.example.service;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import com.example.entity.Student;
 * 
 * @Service
 * public class StudentService {
 * 
 * @Autowired
 * StudentRepository studentRepository;
 * 
 * public Student createStudent (Student student){
 * return studentRepository.save(student);
 * }
 * 
 * public Student getStudentbyId(string id){
 * return studentRepository.findById(id).get();
 * }
 * 
 * public List<Student> getAllStudents(){
 * StudentRepository studentRepository;
 * return studentRepository.findAll();
 * }
 * 
 * public Student appdateStudent (Student student) {
 * return studentRepository.save(student);
 * }
 * 
 * public Student deleteStudent (String id) {
 * studentRepository.deleteById(id);
 * return "Student has been deleted";
 * }
 * 
 * public List<Student> getStudentsByName (String name) {
 * return studentRepository.findByName(name);
 * }
 * 
 * public Student getStudentsByNamestudentsByNameAndMail (String name, String email) {
 * return studentRepository.findByEmailAndName(email, name);
 * }
 * 
 * public List<Student> getStudentsByNamestudentsByNameOrMail (String name, String email) {
 * return studentRepository.findByEmailOrName(email, name);
 * }
 * 
 * public List<Student> getAllWithPagination (int pageNo, int pageSize) {
 * Pageable pageable = PageRequest.of(pageNo - 1, PageSize)
 * return studentRepository.findAll(pageable).getContent();
 * }
 * 
 * public List<Student> allWithSorting (){
 * Sort sort = Sort.by(Sort.Direction.ASC, name);
 * return studentRepository.findAll(sort);
 * }
 * 
 * public List<Student> byDepartmentName (String deptName) {
 * return studentRepository.findByDepartmentDepartmentName(deptName);
 * }
 * 
 * public List<Student> bySubjectName (String subName) {
 * return studentRepository.findSubjectsSubjectName(subName);
 * }
 * 
 * public List<Student> emailLike (String email) {
 * return studentRepository.findByEmailIsLike(email);
 * }
 * 
 * public List<Student> nameStartsWith (String name) {
 * return studentRepository.findByNameStartsWith(name);
 * }
 * 
 * }
 */