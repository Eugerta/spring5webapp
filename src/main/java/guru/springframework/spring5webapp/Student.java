package guru.springframework.spring5webapp;

public class Student {

    private String student_id;
    private String name;

    public Student(String student_id, String name) {
        this.student_id = student_id;
        this.name = name;
    }

    public String getId() {
        return student_id;
    }

    public void setId(String id) {
        this.student_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

