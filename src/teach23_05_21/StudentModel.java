package teach23_05_21;

public class StudentModel {
    private String name;
    private int age;
    private float mathScore;

    public StudentModel(String name, int age, float mathScore) {
        this.name = name;
        this.age = age;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getMathScore() {
        return mathScore;
    }
}
