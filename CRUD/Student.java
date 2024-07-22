public class Student {
    private String studName;
    private int id;
    private int std;


    public String getStudName() {
        return studName;
    }
    public int getId() {
        return id;
    }
    public int getStd() {
        return std;
    }
    public void setStd(int std) {
        this.std = std;
    }
    Student(String studName, int id, int std) {
        this.studName = studName;
        this.id= id;
        this.std = std;
    }

}