import java.util.List;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.spring.Field;

//@Document(collection = "student")
public class Student {
    
    //@Id
    private String id;

    private String name;

    //@Field(name = "mail")
    private String email;
     
    private String department;

    private List<Subject> subjects;

    //@Transient
    private double percentage;

    /* 
    //@PersistenceConstructor
    public Student(String id, String name, String email, String department, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.subjects = subjects;
    }
    */

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Subject> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    //@Transient annotation From Spring Data
    public double getPercentage() {
        if(subjects != null && subjects.size() > 0){
            int total = 0;
            for(Subject subject : subjects){
                total += subject.getMarksObtained();
            }
            return total/subjects.size();
        }
        return 0.00;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


}
