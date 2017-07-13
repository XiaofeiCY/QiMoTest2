package service;

import com.opensymphony.xwork2.ModelDriven;
import dao.Student;
import dao.StudentDao;

import java.util.List;

/**
 * Created by XFXF on 2017/7/5.
 */
public class StudentService implements ModelDriven<Student> {
    private List<Student> students;
    private StudentDao studentdao;
    private Student student = new Student();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public StudentDao getStudentdao() {
        return studentdao;
    }

    public void setStudentdao(StudentDao studentdao) {
        this.studentdao = studentdao;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getModel() {
        return student;
    }

    public String findall(){
        students = studentdao.findAll();
        return "findall";
    }

    public String delete(){
        studentdao.delete(student.getStuno());
        return findall();
    }

    public String Update(){
        student = studentdao.update(student.getStuno());
        return "Update";
    }

    public String UpdateOne(){
        studentdao.updateone(student);
        return findall();
    }

    public String AddOne(){
        return "AddOne";
    }

    public String AddNewOne(){
        studentdao.AddNewOne(student);
        return findall();
    }

}
