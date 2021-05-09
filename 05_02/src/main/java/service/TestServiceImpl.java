package service;

import domain.Users;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private static String className = "com.mysql.cj.jdbc.Driver";
    private static String dbUrl = "jdbc:mysql://localhost:3306/jdbc_test?serverTimezone=UTC";
    private static String dbUser = "root";
    private static String DbPassword = "6308";

    //get
    public List<Users> getUsers() {
        List<Users> ret = new ArrayList<Users>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbUrl, dbUser, DbPassword);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM user_data");

            while (rs.next()) {
                Users temp = new Users();
                temp.setId(rs.getInt("id"));
                temp.setChar_server(rs.getString("char_server"));
                temp.setNick_name(rs.getString("nick_name"));
                temp.setChar_class(rs.getString("char_class"));
                ret.add(temp);
            }

            rs.close();
            stmt.close();
            conn.close();
            //이하는 발생 가능 오류 try catch입니다.
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return ret;
    }


    //Post
    public List<Users> postUsers() {
        List<Users> ret = new ArrayList<Users>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbUrl, dbUser, DbPassword);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("INSERT INTO user_data(char_server,nick_name,char_class) VALUES('Abl','E','Assassin')");

            while (rs.next()) {
                Users temp = new Users();
                temp.setId(rs.getInt("id"));
                temp.setChar_server(rs.getString("char_server"));
                temp.setNick_name(rs.getString("nick_name"));
                temp.setChar_class(rs.getString("char_class"));
                ret.add(temp);
            }

            rs.close();
            stmt.close();
            conn.close();
            //이하는 발생 가능 오류 try catch입니다.
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return ret;
    }


    //Update
    public List<Users> patchUsers() {
        List<Users> ret = new ArrayList<Users>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbUrl, dbUser, DbPassword);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("UPDATE user_data SET char_class = 'Hunter' WHERE id = 5");

            while (rs.next()) {
                Users temp = new Users();
                temp.setId(rs.getInt("id"));
                temp.setChar_server(rs.getString("char_server"));
                temp.setNick_name(rs.getString("nick_name"));
                temp.setChar_class(rs.getString("char_class"));
                ret.add(temp);
            }

            rs.close();
            stmt.close();
            conn.close();
            //이하는 발생 가능 오류 try catch입니다.
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return ret;
    }


    //Delete
    public List<Users> deleteUsers() {
        List<Users> ret = new ArrayList<Users>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbUrl, dbUser, DbPassword);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("DELETE FROM user_data WHERE id = 5");

            while (rs.next()) {
                Users temp = new Users();
                temp.setId(rs.getInt("id"));
                temp.setChar_server(rs.getString("char_server"));
                temp.setNick_name(rs.getString("nick_name"));
                temp.setChar_class(rs.getString("char_class"));
                ret.add(temp);
            }

            rs.close();
            stmt.close();
            conn.close();
            //이하는 발생 가능 오류 try catch입니다.
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return ret;
    }
}
