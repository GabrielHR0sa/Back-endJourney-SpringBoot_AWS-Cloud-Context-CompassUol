public class User {

    private String username;
    private int age;

    public String getUsername() {
        
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
            this.age = age;
    }

}
