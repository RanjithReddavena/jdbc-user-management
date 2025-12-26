package main;
import dao.UserDao;
import model.User;
public class MainApp{
    public static void main(String[] args) throws Exception {
        UserDao dao = new UserDao();
        dao.addUser(new User("JDBCuserCheck2", "JDBC2@gmail.com", 43));
        dao.getAllUsers().forEach(user ->
                System.out.println(user.getId() + " " + user.getName() + " " + user.getEmail() + " " + user.getAge()));
    }
}

