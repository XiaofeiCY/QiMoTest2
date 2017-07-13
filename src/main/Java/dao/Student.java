package dao;

/**
 * Created by XFXF on 2017/7/5.
 */
public class Student {
    private Integer stuno;
    private String name;
    private Integer age;

    public Integer getStuno() {
        return stuno;
    }

    public void setStuno(Integer stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != null ? !age.equals(student.age) : student.age != null) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (stuno != null ? !stuno.equals(student.stuno) : student.stuno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuno != null ? stuno.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
