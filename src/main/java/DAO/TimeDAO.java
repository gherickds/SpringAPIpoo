package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import model.Time;

import static DAO.ConnectionFactory.getConnection;

public class TimeDAO {
	String Sigla;
	String Nome;
	String Arena;
	
	public List<Time> getAll(){
		
		// Consultar no banco de dados
		List<Time> list = new ArrayList<>();

		list.add(new Time(1,"PAL","Palmeiras","Allianz Parque"));
		list.add(new Time(2,"COR","Corinthians","Arena Corinthians"));
		list.add(new Time(3,"GRE","Grêmio","Arena Grêmio"));
		list.add(new Time(4,"FLA","Flamengo","Maracanã"));
		list.add(new Time(5,"SPO","São Paulo","Morumbi"));
		
		return list;
	}

	public void insert(Time time) {
		try(Connection conn = getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO times(Sigla, Nome, Arena) values(?,?,?)")){

			preparedStatement.setString(1,Sigla);
			preparedStatement.setString(2,Nome);
			preparedStatement.setString(3,Arena);

			preparedStatement.execute();

		}catch (Exception e){
			throw new RuntimeException(e);
		}

	}


	public void deleteById(Long id) throws Exception {


		if( id < 10) {
			throw new Exception("Time não encontrado.");
		}
		
	}

}
