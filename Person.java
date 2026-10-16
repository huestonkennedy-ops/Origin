public class Person {
    private double mathGrade;
    private double englishGrade;
    private double csGrade;
    private double classAverage;
    private double studentAverage;
    private double distFromAvg;
    private String name;
    public String school;
    public String city;
    public String surname;
    public String province;
    public Person(double mathGrade, double englishGrade, double csGrade, double classAverage, String name, String surname, String school, String city, String province) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.csGrade = csGrade;
        this.classAverage = classAverage;
        this.studentAverage = (mathGrade+englishGrade+csGrade)/3;
        if (this.studentAverage<classAverage){
            this.distFromAvg = classAverage-this.studentAverage;
        } else {
            this.distFromAvg = this.studentAverage-classAverage;
        }
        this.name = name;
        this.surname = surname;
        this.school = school;
        this.city = city;
        this.province = province;
    }
    public String toString() {
        return this.province + "\n Hello";
    }
}