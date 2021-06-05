package work29_05_21;

public class StudentSort {
    private String name;
    private int roll;
    private float mathScore;
    private float engScore;
    private float total;

    public StudentSort(String name, int roll, float mathScore, float engScore) {
        this.name = name;
        this.roll = roll;
        this.mathScore = mathScore;
        this.engScore = engScore;
        this.total = mathScore + engScore;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public float getMathScore() {
        return mathScore;
    }

    public float getEngScore() {
        return engScore;
    }

    public float getTotal() {
        return total;
    }
}
