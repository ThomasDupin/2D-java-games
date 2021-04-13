package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.CallableStatement;
import java.sql.ResultSet;


import entity.ElementPosition;
import entity.Entity;

// TODO: Auto-generated Javadoc
/**
 * The Class DAOElementPosition.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class DAOElementPosition extends DAOEntity<Entity> {

	/**
	 * Instantiates a new DAO element position.
	 *
	 * @param connection the connection
	 * @throws SQLException the SQL exception
	 */
	public DAOElementPosition(Connection connection) throws SQLException {
		super(connection);
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#create(entity.Entity)
	 */
	@Override
	public boolean create(Entity entity) {
		return false;
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#delete(entity.Entity)
	 */
	@Override
	public boolean delete(Entity entity) {
		return false;
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#update(entity.Entity)
	 */
	@Override
	public boolean update(Entity entity) {
		return false;
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#find(int)
	 */
	@Override
	public ArrayList<ElementPosition> find(int idMap) {
		ArrayList<ElementPosition> map = new ArrayList<ElementPosition>(); 
		
		try {
		 	final String sql = "{call GetMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, idMap);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			while(resultSet.next()) {
					map.add(new ElementPosition(resultSet.getString("D"), resultSet.getInt("x"), resultSet.getInt("y")));
				}
		} catch (final  SQLException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	/* (non-Javadoc)
	 * @see model.DAOEntity#find(java.lang.String)
	 */
	@Override
	public Entity find(String code) {
		return null;
	}

}
