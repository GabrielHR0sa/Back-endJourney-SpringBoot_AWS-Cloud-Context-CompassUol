public class Employee {
/*
 *define uma constante, uma variavel que não pode ter seu valor alterado
 é preenchida com upercase e _
 */
    private String name;
    private int age;
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 65;
    
    public Employee(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("INVALID NAME");
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) throw new IllegalArgumentException("INVALID AGE");
        this.age = age;
    }

}