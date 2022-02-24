package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Logement;


public class DAOLogement implements IDAO<Logement, Integer> {

	@Override
	public Logement findById(Integer id) {

		Logement l = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(urlBdd,loginBdd,passwordBdd);
			PreparedStatement ps = conn.prepareStatement("SELECT * from logement where numero=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
               //à compléter
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public List<Logement> findAll() {

		List<Logement> logements = new ArrayList();
		
		//à compléter
		
		return logements;
	}

	@Override
	public Logement insert(Logement l) {

		return null;
	}

	@Override
	public void update(Logement l) {

		
	}

	@Override
	public void delete(Integer id) {

		
	}

}
