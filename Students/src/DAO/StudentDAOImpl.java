package DAO;

import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    public List<Student> getAll() {

        try {
            Connection connection = helpers.Database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from students order by avg_score desc limit 3");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                students.add(new Student(resultSet.getString(1), resultSet.getInt(2), resultSet.getString(3),resultSet.getDouble(4)));
            }
            connection.close();
            return students;
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public List<String> getMin() {

        List<String> list = new ArrayList<>();

        try {
            Connection connection = helpers.Database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT MAX() OVER () FROM students GROUP BY avg_score");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                if (resultSet.isLast()) {
                    String students = "Количество студентов с минимальным баллом " + resultSet.getString(1);
                    list.add(students);
                }
            }

        }

        catch (SQLException e) {
            e.printStackTrace();
        }




    try {
        Connection connection = helpers.Database.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT count(*)) OVER () FROM students GROUP BY avg_score;");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            if (resultSet.isLast()) {
                String students = "Количество студентов с максимальным баллом " + resultSet.getString(1);
                list.add(students);
            }
        }
    }

        catch (SQLException e) {
        e.printStackTrace();
    }
        return list;
}

    public List<Student> getTopStudents() {

        try {
            Connection connection = helpers.Database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select MAX(fio), MAX(age), group_num, MAX(avg_score) from students group BY group_num");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Student> students = new ArrayList<>();

            while (resultSet.next()) {
                students.add(new Student(resultSet.getString(1), resultSet.getInt(2), resultSet.getString(3),resultSet.getDouble(4)));
            }
            connection.close();
            return students;
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }


}
