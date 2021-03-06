package controllers;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
public class TestApplication {
	
	@SuppressWarnings("serial")
	public static class SelectPlayers extends JPanel implements ActionListener {
		
		public SelectPlayers() throws ClassNotFoundException, SQLException {
	        super(new GridLayout(1,0));
			String sql = "SELECT column_name from all_tab_columns where table_name = 'PLAYERS'";
			Statement s = connectAndReturnStatement();
			ResultSet rs = s.executeQuery(sql);
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
			 
			Object[][] dataT = new Object[numR][columnNames.size()];
			
			 for(int i = 0; i<numR; i++ ){
				 rs.next();
				dataT[i][0] = rs.getInt(1);
				dataT[i][1] = rs.getInt(2);	
				dataT[i][2] = rs.getInt(3);
				dataT[i][3] = rs.getString(4);
				dataT[i][4] = rs.getString(5);
				 
			 }
		 
	        JTable table = new JTable(dataT, columnN);
	        table.setPreferredScrollableViewportSize(new Dimension(columnN.length*120,numR*17 ));
	        table.setFillsViewportHeight(true);
	        JScrollPane scrollPane = new JScrollPane(table);
	        add(scrollPane);
		     
		 }

		public void actionPerformed(ActionEvent e) {
			
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                try {
		                	JFrame frame = new JFrame("Select * from Players");
		        	       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        	 
		        	        //Create and set up the content pane.
		        	        SelectPlayers newContentPane = new SelectPlayers();
		        	        newContentPane.setOpaque(true); //content panes must be opaque
		        	        frame.setContentPane(newContentPane);
		        	 
		        	        //Display the window.
		        	        frame.pack();
		        	        frame.setVisible(true);
						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        });
			
		}
    }
	
	@SuppressWarnings("serial")
	public static class SelectTeams extends JPanel implements ActionListener{
		
		public SelectTeams() throws ClassNotFoundException, SQLException {
	        super(new GridLayout(1,0));
			String sql = "SELECT column_name from all_tab_columns where table_name = 'TEAMS'";
			Statement a = connectAndReturnStatement();
			ResultSet rs = a.executeQuery(sql);
			ArrayList<String> columnNames = new ArrayList<String>();
			while(rs.next()){
					columnNames.add(rs.getNString("COLUMN_NAME"));
				}
			 Object[] columnN = columnNames.toArray();
			 sql = "select count(*) from TEAMS";
			 rs = a.executeQuery(sql);
			 rs.next();
			 String numRows = rs.getNString("COUNT(*)");
			 int numR = Integer.parseInt(numRows); 
			 sql = "SELECT * from TEAMS";
			 rs = a.executeQuery(sql);
			 
			Object[][] dataT = new Object[numR][columnNames.size()];
			
			 for(int i = 0; i<numR; i++ ){
				 rs.next();
				dataT[i][0] = rs.getInt(1);
				dataT[i][1] = rs.getString(2);	
				dataT[i][2] = rs.getInt(3);
				dataT[i][3] = rs.getInt(4);
				 
			 }
		 
	        JTable table = new JTable(dataT, columnN);
	       // table.setPreferredScrollableViewportSize(new Dimension(500, 70));
	        table.setPreferredScrollableViewportSize(new Dimension(columnN.length*120,numR*17 ));
	        table.setFillsViewportHeight(true);
	        JScrollPane scrollPane = new JScrollPane(table);
	        add(scrollPane);
		 }
		@Override
		public void actionPerformed(ActionEvent e) {
			
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                try {
		                	JFrame frame = new JFrame("Select * from Teams");
		     //   	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        	 
		        	        //Create and set up the content pane.
		        	        SelectTeams newContentPane = new SelectTeams();
		        	        newContentPane.setOpaque(true); //content panes must be opaque
		        	        frame.setContentPane(newContentPane);
		        	 
		        	        //Display the window.
		        	        frame.pack();
		        	        frame.setVisible(true);
						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        });
			
		}
		
	}


	@SuppressWarnings("serial")
	public static class PreparedState extends JPanel implements ActionListener {
		public void usePreparedStatement() throws ClassNotFoundException, SQLException{
			String g = "INSERT INTO TEAMS values (?,?,?,?)";
			PreparedStatement addBlankTeam = null;
        	addBlankTeam = connectAndReturnConnection().prepareStatement(g);
			
			addBlankTeam.setInt(1, 0);
			addBlankTeam.setString(2, "No Name");
			addBlankTeam.setInt(3, 0);
			addBlankTeam.setInt(4, 0);
			addBlankTeam.executeUpdate();
		}
		public void actionPerformed(ActionEvent e) {
				
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                try {
		               
		                	usePreparedStatement();
		                	


		        	
						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        });
			
		}
			
		}
	
	@SuppressWarnings("serial")
	public static class DeleteTeam extends JPanel implements ActionListener{

		
		public void deleteStatement() throws ClassNotFoundException, SQLException{
			String sql = "DELETE FROM TEAMS WHERE TEAM_NAME = 'No Name'";
			connectAndReturnStatement().executeQuery(sql);		
		}
		
		public void actionPerformed(ActionEvent e) {
				
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                try {
	
		                	deleteStatement();
		     				
		        	        
						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        });
			
		}
			
		
	}
	
	@SuppressWarnings("serial")
	public static class UpdateNoNameTeam extends JPanel implements ActionListener{
		
		public void updateStatement() throws ClassNotFoundException, SQLException{
			String sql = "UPDATE TEAMS SET TEAM_NAME = 'Updated Team' WHERE TEAM_NAME = 'No Name'";
			connectAndReturnStatement().executeQuery(sql);
		}
		public void actionPerformed(ActionEvent e) {
				
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                try {
		                	updateStatement();
		        	        
						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        });
			
		}
	}
	
	@SuppressWarnings("serial")
	public static class InsertPlayer extends JPanel implements ActionListener{
		
		public void InsertStatement() throws ClassNotFoundException, SQLException{
			String sql = "INSERT INTO PLAYERS (TEAM_ID, WIN, LOSS, FAVORITE_CHAMPION, PLAYER_NAME) VALUES ('1', '137', '0', 'Renekton', 'Inserted Player')";
			connectAndReturnStatement().executeQuery(sql);
		}
		public void actionPerformed(ActionEvent e) {
				
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	try {
		            		InsertStatement();
							
		            	}catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            	
		            }
		        });
			
		}
			
	}

	@SuppressWarnings("serial")
	public static class StoredProcedure extends JPanel implements ActionListener{
	
			public void storedStatement() throws ClassNotFoundException, SQLException{
				String sql = "CALL ADDPLAYER('0','0','0','STORED CHAMPION','STORED PROCEDURE')";
				
				Statement x = connectAndReturnStatement();
 				x.executeQuery(sql);
 				x.executeQuery("commit");
			}
		public void actionPerformed(ActionEvent e) {
				
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	 try {
							
		            		 storedStatement();
		            	 }catch (ClassNotFoundException | SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		            	
		            	
		            	
		            }
		        });
			
		}
			
	}

	@SuppressWarnings("serial")
	public static class ReplaceFunction extends JPanel implements ActionListener{
		
		public void replace() throws ClassNotFoundException, SQLException{
			String sql = "UPDATE players SET PLAYER_NAME = REPLACE (PLAYERS.PLAYER_NAME, 'STORED PROCEDURE', 'REPLACED')";
			String sql1 = "commit";
			Statement y = connectAndReturnStatement();
			y.executeQuery(sql);			
			y.executeQuery(sql1);
		}
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                try {
		                	
		                	replace();
		        	        
						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        });
			
		}
		
	}

	
	public static Statement connectAndReturnStatement() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","team11");
			Statement st = con.createStatement();
			String sql = "ALTER SESSION SET CURRENT_SCHEMA = LEAGUE";// not needed
			st.executeQuery(sql);
			return st;
	}
	
	public static Connection connectAndReturnConnection() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","team11");
			Statement st = con.createStatement();
			String sql = "ALTER SESSION SET CURRENT_SCHEMA = LEAGUE";// not needed;
			st.executeQuery(sql);
			return con;
	}
}


	

