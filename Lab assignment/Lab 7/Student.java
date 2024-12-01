
class Student {
    private int studentID;
    private String studentName;
    private double math;
    private double physic;
    private double chemistry;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double AvrgMark() {
        return (math + physic + chemistry) / 3;
    }

    public String getRate() {
        double avg = AvrgMark();
        if (avg >= 8.0) {
            return "A";
        } else if (avg >= 6.5) {
            return "B";
        } else if (avg >= 5.0) {
            return "C";
        } else {
            return "D";
        }
    }
}