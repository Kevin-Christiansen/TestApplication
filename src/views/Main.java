package views;

import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;

import controllers.TestApplication.DeleteTeam;
import controllers.TestApplication.InsertPlayer;
import controllers.TestApplication.PreparedState;
import controllers.TestApplication.ReplaceFunction;
import controllers.TestApplication.SelectPlayers;
import controllers.TestApplication.SelectTeams;
import controllers.TestApplication.StoredProcedure;
import controllers.TestApplication.UpdateNoNameTeam;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JFrame SELECT_PLAYERS_FRAME = new JFrame();
		 SELECT_PLAYERS_FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JButton SELECT_PLAYERS = new JButton();
		 SELECT_PLAYERS_FRAME.setSize(200,200);     
		 SELECT_PLAYERS.setSize(400,400);
		 SELECT_PLAYERS.setVisible(true);
		 SELECT_PLAYERS.setText("SELECT * from PLAYERS");
		 SELECT_PLAYERS_FRAME.add(SELECT_PLAYERS);
		 SELECT_PLAYERS_FRAME.setLocation(700, 100);
		 SELECT_PLAYERS_FRAME.setVisible(true);
		 SELECT_PLAYERS.addActionListener(new SelectPlayers());
		 
		 
		 JFrame frame_prepared_statement = new JFrame();
		 frame_prepared_statement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JButton prepared_statement = new JButton();
		 frame_prepared_statement.setSize(320,200);     
		 prepared_statement.setSize(400,400);
		 frame_prepared_statement.setLocation(50, 300);
		 prepared_statement.setVisible(true);
		 prepared_statement.setText("Add No Name team to Teams Table via Preapared Statement");
		 frame_prepared_statement.add(prepared_statement);
		 frame_prepared_statement.setVisible(true);
		 prepared_statement.addActionListener(new PreparedState());
		 
		 JFrame frame_delete = new JFrame();
		 frame_delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JButton delete = new JButton();
		 frame_delete.setSize(220,200);     
		 delete.setSize(400,400);
		 frame_delete.setLocation(380, 300);
		 delete.setVisible(true);
		 delete.setText("Delete No Name Team");
		 frame_delete.add(delete);
		 frame_delete.setVisible(true);
		 delete.addActionListener(new DeleteTeam());
		 
		 JFrame frame_select_teams = new JFrame();
		 frame_select_teams.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JButton select_teams = new JButton();
		 frame_select_teams.setSize(200,200);     
		 select_teams.setSize(400,400);
		 frame_select_teams.setLocation(910, 100);
		 select_teams.setVisible(true);
		 select_teams.setText("Select * from Teams");
		 frame_select_teams.add(select_teams);
		 frame_select_teams.setVisible(true);
		 select_teams.addActionListener(new SelectTeams());
		 
		 JFrame frame_update_no_name = new JFrame();
		 frame_update_no_name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JButton update_no_name = new JButton();
		 frame_update_no_name.setSize(200,200);     
		 update_no_name.setSize(400,400);
		 frame_update_no_name.setLocation(600, 300);
		 update_no_name.setVisible(true);
		 update_no_name.setText("Update No Name Teams");
		 frame_update_no_name.add(update_no_name);
		 frame_update_no_name.setVisible(true);
		 update_no_name.addActionListener(new UpdateNoNameTeam());
		 
		 
		 JFrame frame_insert_player = new JFrame();
		 frame_insert_player.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JButton insert_player = new JButton();
		 frame_insert_player.setSize(200,200);     
		 insert_player.setSize(400,400);
		 frame_insert_player.setLocation(820, 300);
		 insert_player.setVisible(true);
		 insert_player.setText("Query Insert Player");
		 frame_insert_player.add(insert_player);
		 frame_insert_player.setVisible(true);
		 insert_player.addActionListener(new InsertPlayer());
		 
		 JFrame frame_stored_insert = new JFrame();
		 frame_stored_insert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JButton stored_insert = new JButton();
		 frame_stored_insert.setSize(250,200);     
		 stored_insert.setSize(400,400);
		 frame_stored_insert.setLocation(1030, 300);
		 stored_insert.setVisible(true);
		 stored_insert.setText("Stored Procedure Insert Player");
		 frame_stored_insert.add(stored_insert);
		 frame_stored_insert.setVisible(true);
		 stored_insert.addActionListener(new StoredProcedure());
		 
		 JFrame frame_replace = new JFrame();
		 frame_replace.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JButton replace = new JButton();
		 frame_replace.setSize(250,200);     
		 replace.setSize(400,400);
		 frame_replace.setLocation(600, 550);
		 replace.setVisible(true);
		 replace.setText("Replace Stored Players");
		 frame_replace.add(replace);
		 frame_replace.setVisible(true);
		 replace.addActionListener(new ReplaceFunction());
	}

}
