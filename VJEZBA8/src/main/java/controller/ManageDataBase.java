package controller;

import model.Programmer;

import java.sql.*;
import java.util.ArrayList;

public class ManageDataBase {

    private Connection connection;

    public ManageDataBase() {
        connectToDatabase();
    }

    private void connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Kokafaca1!";
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }

    public void saveProgrammer(Programmer programmer) {
        String sql = "INSERT INTO programmers (first_name, last_name, best_language, working_time) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, programmer.getFirstName());
            preparedStatement.setString(2, programmer.getLastName());
            preparedStatement.setString(3, programmer.getBestLanguage());
            preparedStatement.setString(4, programmer.getWorkingTime());

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");

            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                int programmerId = rs.getInt(1);
                saveProgrammingLanguages(programmerId, programmer.getExperiencedIn());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void saveProgrammingLanguages(int programmerId, ArrayList<String> languages) {
        String sql = "INSERT INTO programming_languages (programmer_id, language) VALUES (?, ?)";

        for (String language : languages) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, programmerId);
                preparedStatement.setString(2, language);

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) inserted.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void getProgrammers() {
        String sql = "SELECT * FROM programmers";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String bestLanguage = resultSet.getString("best_language");
                String workingTime = resultSet.getString("working_time");

                System.out.println(firstName + " " + lastName + " " + bestLanguage + " " + workingTime);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
