package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.List;

import model.Client;
import model.Compte;
import model.Hote;
import model.Organisateur;
import model.Reservation;
import model.TypeDePaiement;


public class DAOCompte implements IDAO<Compte, Integer> {

	@Override
	public Compte findById(Integer id) {
		Compte c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from compte where id_compte=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				if(rs.getString("type_compte").equals("client")) 
				{
					c = new Client(rs.getInt("id_compte"),rs.getString("nom"),rs.getString("prenom"),rs.getString("mail"),rs.getString("password"),rs.getDate("dateNaissance"));

	
				}
				else if (rs.getString("type_compte").equals("Organisateur"))
				{
					c = new Organisateur(rs.getInt("id_compte"),rs.getString("nom"),rs.getString("prenom"),rs.getString("mail"),rs.getDate("dateNaissance"));
					
				}
				else if (rs.getString("type_compte").equals("Hote"))
				{
					c = new Hote(rs.getInt("id_compte"),rs.getString("nom"),rs.getString("prenom"),rs.getString("mail"),rs.getDate("dateNaissance"));
					
				}
			}
			

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Compte> findAll() {

		return null;
	}

	@Override
	public Compte insert(Compte c) {

		return null;
	}

	@Override
	public void update(Compte c) {

		
	}

	@Override
	public void delete(Integer id) {

		
	}
	
	public Compte seConnecter(String login, String password) {
		Compte c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd, loginBdd, passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from compte where mail=? and password=?");
			ps.setString(1, login);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				if (rs.getString("type_compte").equals("client")) {
					c = new Client(rs.getString("nom"),rs.getString("prenom"), rs.getString("mail"), rs.getString("password"), LocalDate.parse(rs.getString("date_naissance")));
				} else if (rs.getString("type_compte").equals("hote")) {
					c = new Hote(rs.getString("nom"),rs.getString("prenom"), rs.getString("mail"), rs.getString("password"), LocalDate.parse(rs.getString("date_naissance")));
				} else if (rs.getString("type_compte").equals("organisateur")) {
					c = new Organisateur(rs.getString("nom"),rs.getString("prenom"), rs.getString("mail"), rs.getString("password"), LocalDate.parse(rs.getString("date_naissance")));
				}
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

}
