package DAO;

import Model.Student;

import java.util.List;

public interface StudentDAO {

    public List<Student> getAll();
    public List<String> getMin();
    public List<Student> getTopStudents();

}
