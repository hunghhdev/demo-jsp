
package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class userDao {
    connect cn = new connect();
    public userBo insertUser(userBo bo){
        String sql  = "insert into user(name,password) values(?,?)";
        Connection connection = cn.getConnection();
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, bo.getName());
            ps.setString(2, bo.getPass());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bo;
    }
    public static void main(String[] args) {
        userDao dao = new userDao();
        dao.insertUser(new userBo("test1","test"));
    }
}
