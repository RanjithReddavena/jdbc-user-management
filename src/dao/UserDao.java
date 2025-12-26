package dao;
import model.User;
import util.DBUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class UserDao {
   public void addUser(User user) throws Exception {
        String sql = "INSERT INTO users (name, email, age) VALUES (?, ?, ?)";
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, user.getName());
        ps.setString(2, user.getEmail());
        ps.setInt(3, user.getAge());
        ps.executeUpdate();
        con.close();
    }
    public List<User> getAllUsers() throws Exception {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            users.add(new User(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getInt("age")
            ));
        }
        con.close();
        return users;
    }
}
