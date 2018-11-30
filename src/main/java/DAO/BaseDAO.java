package DAO;

import java.sql.Connection;

class BaseDAO {


    Connection getConnection(){
        return ConnectionFactory.getConnection();
    }

}
