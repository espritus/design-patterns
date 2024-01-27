package project.com;

import java.sql.*;

class DataBConnectionTest
{
    public static void main(String [] args) throws SQLException {
        DatabaseConnection.getInstance();
        Connection conn = DatabaseConnection.getConnection();
        try
        {
            String query = "SELECT * FROM new_table";
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(query);

            while(res.next())
            {
                System.out.println(res.getString("id")+" "+res.getString("name"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try{
                conn.close();
            }catch(SQLException ex)
            {
                ex.printStackTrace();
            }
        }

    }
}