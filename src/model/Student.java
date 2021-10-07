package model;


public class Student {
    private int number;
    private String name;
    private String MSV;
    private String birthday;
    private String classStudent;

    public Student(){

    }

    public Student(String name, String MSV, String birthday, String classStudent) {
        this.name = name;
        this.MSV = MSV;
        this.birthday = birthday;
        this.classStudent = classStudent;
        
    }

    public String getMSV() {
        return this.MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }
    

    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassStudent() {
        return this.classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            ", name='" + getName() + "'" +
            ", MSV='" + getMSV() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", classStudent='" + getClassStudent() + "'" +
            "}";
    }


}
