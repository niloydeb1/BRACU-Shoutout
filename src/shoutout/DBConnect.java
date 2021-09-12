package shoutout;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class DBConnect extends login
{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public static String i, n, m, cg;
    public DBConnect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/shoutout";  
            Properties info = new Properties();
            info.put("user", "Niloy");
            info.put("password", "0246810");
            con = DriverManager.getConnection(url, info);
            st=con.createStatement();
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
    }
    public String login(String u, String p) throws SQLException
    {
        try
        {
            String query = "select password, type from authentication where username='"+u+"';";
            rs= st.executeQuery(query);
            while(rs.next())
            {
                if(rs.getString("password").equals(p))
                {
                    return rs.getString("type");
                }
            }
            query = "select password, type from authentication2 where username='"+u+"';";
            rs= st.executeQuery(query);
            while(rs.next())
            {
                if(rs.getString("password").equals(p))
                {
                    return rs.getString("type");
                }
            }
            return "";
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
        return null;
    }
    public String checkUser(String u) throws SQLException
    {
        try
        {
            String str="";
            String query = "select type from authentication where username='"+u+"';";
            rs= st.executeQuery(query);
            while(rs.next())
            {
                str=rs.getString("type");
                System.out.println(str);
                return str;
            }
            return "";
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
        return "";
    }
    public void sCreate(String n, String i, String d, String u, String p, String e, String b) throws SQLException
    {
        try
        {
            String query = "insert into authentication values ('"+u+"', '"+p+"', 'student');";
            st.executeUpdate(query);
            query = "insert into stdProfile values ('"+u+"', '"+n+"', '"+i+"' , '"+d+"', '"+e+"', '"+b+"');";
            st.executeUpdate(query);
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
    }
    public void fCreate(String n, String i, String d, String u, String p, String in, String e, String b) throws SQLException
    {
        try
        {
            String query = "insert into authentication values ('"+u+"', '"+p+"', 'faculty');";
            st.executeUpdate(query);
            query = "insert into facProfile values ('"+u+"','"+in+"', '"+n+"', '"+i+"' , '"+d+"', '"+e+"', '"+b+"');";
            st.executeUpdate(query);
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
    }
//    public boolean checkID(String i)
//    {
//        try
//        {
//            String query = "select id from stdprofile;";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                if(rs.getString("id").equals(i))
//                {
//                    return true;
//                }
//            }
//            return false;
//        }
//        catch(SQLException ex)
//        {
//            System.out.println("Error: "+ex);
//        }
//        return false;
//    }
//    public boolean stdORfac(String u) throws SQLException
//    {
//        String query = "select user from stdprofile;";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            if(rs.getString("user").equals(u))
//            {
//                return true;
//            }
//        }
//        return false;
//    }
    public String getName(String u) throws SQLException
    {
        String str="";
        String query = "select name from stdprofile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str=rs.getString("name");
        }
        if(str=="")
        {
            query = "select name from facprofile where username='"+u+"';";
            rs= st.executeQuery(query);
            while(rs.next())
            {
                str=rs.getString("name");
            }
        }
        return str;
    }
    public String getID(String u) throws SQLException
    {
        String str="";
        String query = "select id from stdprofile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str= rs.getString("id");
        }
        if(str=="")
        {
            query = "select id from facprofile where username='"+u+"';";
            rs= st.executeQuery(query);
            while(rs.next())
            {
                str= rs.getString("id");
            }
        }
        return str;
    }
    public String getInitial(String u) throws SQLException
    {
        String str="";
        String query = "select id from facprofile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str= rs.getString("id");
        }
        return str;
    }
    public String getDept(String u) throws SQLException
    {
        String str="";
        String query = "select dept from stdprofile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str= rs.getString("dept");
        }
        if(str=="")
        {
            query = "select dept from facprofile where username='"+u+"';";
            rs= st.executeQuery(query);
            while(rs.next())
            {
                str= rs.getString("dept");
            }
        }
        return str;
    }
    public String getEmail(String u) throws SQLException
    {
        String str="";
        String query = "select email from stdprofile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str= rs.getString("email");
        }
        if(str=="")
        {
            query = "select email from facprofile where username='"+u+"';";
            rs= st.executeQuery(query);
            while(rs.next())
            {
                str= rs.getString("email");
            }
        }
        return str;
    }
//    public String getC1(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select course1 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("course1");
//        }
//        if(str==null)
//        {
//            query = "select course1 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("course1");
//            }
//        }
//        return str;
//    }
//    public String getC2(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select course2 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("course2");
//        }
//        if(str==null)
//        {
//            query = "select course2 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("course2");
//            }
//        }
//        return str;
//    }
//    public String getC3(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select course3 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("course3");
//        }
//        if(str==null)
//        {
//            query = "select course3 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("course3");
//            }
//        }
//        return str;
//    }
//    public String getC4(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select course4 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("course4");
//        }
//        if(str==null)
//        {
//            query = "select course4 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("course4");
//            }
//        }
//        return str;
//    }
//    public String getC5(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select course5 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("course5");
//        }
//        if(str==null)
//        {
//            query = "select course5 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("course5");
//            }
//        }
//        return str;
//    }
//    public String getS1(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select sec1 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("sec1");
//        }
//        if(str==null)
//        {
//            query = "select sec1 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("sec1");
//            }
//        }
//        return str;
//    }
//    public String getS2(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select sec2 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("sec2");
//        }
//        if(str==null)
//        {
//            query = "select sec2 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("sec2");
//            }
//        }
//        return str;
//    }
//    public String getS3(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select sec3 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("sec3");
//        }
//        if(str==null)
//        {
//            query = "select sec3 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("sec3");
//            }
//        }
//        return str;
//    }
//    public String getS4(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select sec4 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("sec4");
//        }
//        if(str==null)
//        {
//            query = "select sec4 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("sec4");
//            }
//        }
//        return str;
//    }
//    public String getS5(String u) throws SQLException
//    {
//        String str=null;
//        String query = "select sec5 from stdprofile where user='"+u+"';";
//        rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            str= rs.getString("sec5");
//        }
//        if(str==null)
//        {
//            query = "select sec5 from facprofile where user='"+u+"';";
//            rs= st.executeQuery(query);
//            while(rs.next())
//            {
//                str= rs.getString("sec5");
//            }
//        }
//        return str;
//    }
    public String getBlood(String u) throws SQLException
    {
        String str="";
        String query = "select blood from stdprofile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str= rs.getString("blood");
        }
        if(str=="")
        {
            query = "select blood from facprofile where username='"+u+"';";
            rs= st.executeQuery(query);
            while(rs.next())
            {
                str= rs.getString("blood");
            }
        }
        return str;
    }
//    public void setPass(String u, String p)
//    {
//        try 
//        {
//            String query="update authentication set pass='"+p+"' where user='"+u+"';";
//            st.executeUpdate(query);
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    public void update(String u, String t, String p, String e, String c1, String s1, String c2, String s2, String c3, String s3, String c4, String s4, String c5, String s5, String b)
//    {
//        String query = "update "+t+"profile set email='"+e+"', course1='"+c1+"', sec1='"+s1+"', course2='"+c2+"', sec2='"+s2+"', course3='"+c3+"', sec3='"+s3+"', course4='"+c4+"', sec4='"+s4+"',course5='"+c5+"', sec5='"+s5+"', blood='"+b+"' where user='"+u+"';";
//        try 
//        {
//            st.executeUpdate(query);
//            if("fac".equals(t))
//            {
//                query="select course_id, course_sec from courses where course_instructor=(select name from facProfile where user='"+u+"');";
//                rs= st.executeQuery(query);
//                String qu1="", qu2="", qu3="", qu4="", qu5="";
//                int count=1;
//                while(rs.next())
//                {
//                    String id = rs.getString("course_id");
//                    String sec = rs.getString("course_sec");
//                    if(count==1)
//                    {
//                        qu1="update courses set course_instructor='' where course_id='"+id+"' and course_sec='"+sec+"';";
//                    }
//                    if(count==2)
//                    {
//                        qu2="update courses set course_instructor='' where course_id='"+id+"' and course_sec='"+sec+"';";
//                    }
//                    if(count==3)
//                    {
//                        qu3="update courses set course_instructor='' where course_id='"+id+"' and course_sec='"+sec+"';";
//                    }
//                    if(count==4)
//                    {
//                        qu4="update courses set course_instructor='' where course_id='"+id+"' and course_sec='"+sec+"';";
//                    }
//                    if(count==5)
//                    {
//                        qu5="update courses set course_instructor='' where course_id='"+id+"' and course_sec='"+sec+"';";
//                    }
//                    count++;
//                }
//                if(qu1!="")
//                {
//                    st.executeUpdate(qu1);
//                }
//                if(qu2!="")
//                {
//                    st.executeUpdate(qu2);
//                }
//                if(qu3!="")
//                {
//                    st.executeUpdate(qu3);
//                }
//                if(qu4!="")
//                {
//                    st.executeUpdate(qu4);
//                }
//                if(qu5!="")
//                {
//                    st.executeUpdate(qu5);
//                }
//                if(c1.length()==6)
//                {
//                    query="update courses set course_instructor=(select name from facProfile where user='"+u+"') where course_sec='"+s1+"' and course_id='"+c1+"';";
//                    st.executeUpdate(query);
//                }
//                if(c2.length()==6)
//                {
//                    query="update courses set course_instructor=(select name from facProfile where user='"+u+"') where course_sec='"+s2+"' and course_id='"+c2+"';";
//                    st.executeUpdate(query);
//                }
//                if(c3.length()==6)
//                {
//                    query="update courses set course_instructor=(select name from facProfile where user='"+u+"') where course_sec='"+s3+"' and course_id='"+c3+"';";
//                    st.executeUpdate(query);
//                }
//                if(c4.length()==6)
//                {
//                    query="update courses set course_instructor=(select name from facProfile where user='"+u+"') where course_sec='"+s4+"' and course_id='"+c4+"';";
//                    st.executeUpdate(query);
//                }
//                if(c5.length()==6)
//                {
//                    query="update courses set course_instructor=(select name from facProfile where user='"+u+"') where course_sec='"+s5+"' and course_id='"+c5+"';";
//                    st.executeUpdate(query);
//                }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public String getShout() throws SQLException
    {
        String res = null;
        String query = "select username, message from shoutbox order by date desc;"; 
        rs= st.executeQuery(query);
        String user="", message="";
        while(rs.next())
        {
            user=rs.getString("user");
            message=rs.getString("message");
            res=message;
        }
        if(checkUser(user).equals("student"))
        {
            return "Student: --> "+user+": --> "+res+"\n";
        }
        else
        {
            return "Faculty: --> "+user+": --> "+res+"\n";
        }
    }
    public int countShout(String u) throws SQLException
    {
        String query = "select count(*) from shoutbox WHERE date >= DATE_SUB(CURDATE(), INTERVAL 7 DAY) order by date desc;"; 
        rs=st.executeQuery(query);
        String res="";
        while(rs.next())
        {
            res=rs.getString("count(*)");
        }
        return Integer.parseInt(res);
    }
    public String evaluationCondition() throws SQLException
    {
        String query = "select cond from evaluationPanel;"; 
        rs=st.executeQuery(query);
        String res="";
        while(rs.next())
        {
            res=rs.getString("cond");
        }
        return res;
    }
    public void sendNews(String s) throws SQLException
    {
        String query = "insert into news values ('"+s+"', '"+java.time.LocalDateTime.now()+"');";
        st.executeUpdate(query);
    }
    public void addLunch(String l, String p) throws SQLException
    {
        String query = "insert into cafeteria values ('lunch', '"+l+"', '"+p+"');";
        st.executeUpdate(query);
    }
     public void addBreak(String l, String p) throws SQLException
    {
        String query = "insert into cafeteria values ('breakfast', '"+l+"', '"+p+"');";
        st.executeUpdate(query);
    }
     public void addSnacks(String l, String p) throws SQLException
    {
        String query = "insert into cafeteria values ('snacks', '"+l+"', '"+p+"');";
        st.executeUpdate(query);
    }
    public void resetMenu(String l, String p) throws SQLException
    {
        String query = "delete from cafeteria;";
        st.executeUpdate(query);
    }
    public void sendEvaluation(String q1, String q2, String q3, String q4, String comment, String c, String in)
    {
        try {
            String query = "insert into evaluation values ('"+c+"', '"+in+"', '"+q1+"', '"+q2+"', '"+q3+"', '"+q4+"', '"+comment+"');";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setShout(String u, String s) throws SQLException
    {
        String query = "insert into shoutbox values ('"+u+"', '"+s+"', '"+java.time.LocalDateTime.now()+"');";
        st.executeUpdate(query);
    }
    public void openEvaluation() throws SQLException
    {
        try
        {
            String query = "update evaluationPanel set cond='open';";
            st.executeUpdate(query);
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
    }
    public void closeEvaluation() throws SQLException
    {
        try
        {
            String query = "update evaluationPanel set cond='close';";
            st.executeUpdate(query);
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
    }
    public static void main(String [] args)
    {
        /*Info a=new Info();
        a.assigningValues(i, n, m, cg);
        a.setVisible(true);*/
    }

    void resetMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


