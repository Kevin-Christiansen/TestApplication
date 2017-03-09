package ast_tester;

import java.sql.*;
import java.util.ArrayList;

public class Example {

	public static void main(String[] args) throws SQLException {
		String sql = "UPDATE TEAMS SET TEAM_NAME = 'Updated Team' WHERE TEAM_NAME = 'No Name'";
		//String sql = "INSERT INTO PLAYERS (TEAM_ID, WIN, LOSS, FAVORITE_CHAMPION, PLAYER_NAME) VALUES ('1', '137', '0', 'Renekton', 'Inserted Player')";
		/*String difSql ="diff sql";
		sql = "DELETE FROM TEAMS WHERE TEAM_NAME = 'No Name'";
		sql = "INSERT INTO PLAYERS (TEAM_ID, WIN, LOSS, FAVORITE_CHAMPION, PLAYER_NAME) VALUES ('1', '137', '0', 'Renekton', 'Inserted Player')";
		sql = "UPDATE TEAMS SET TEAM_NAME = 'Updated Team' WHERE TEAM_NAME = 'No Name'";
		/////////////////////////////////
		Statement s = null;
		ResultSet rs = s.executeQuery("DELETE FROM XD WHERE XD_NAME = 'No Name'");
	//	rs  = s.executeQuery("DELETE FROM XD WHERE XD_NAME = 'No Name'");
		ArrayList<String> columnNames = new ArrayList<String>();
		while(rs.next()){
				columnNames.add(rs.getNString("COLUMN_NAME"));
			}
		 Object[] columnN = columnNames.toArray();
		 sql = "select count(*) from PLAYERS";
		 rs = s.executeQuery(sql);
		 rs.next();
		 String numRows = rs.getNString("COUNT(*)");
		 int numR = Integer.parseInt(numRows); 
		 sql = "SELECT * from PLAYERS";
		 rs = s.executeQuery(sql);
		 //////////////////////////
		*/

	}

}
