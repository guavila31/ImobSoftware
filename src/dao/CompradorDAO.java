package dao;

import java.sql.Connection;

public class CompradorDAO {
    
    private Connection conn;

    public CompradorDAO() {
    conn = ConnectionFactory.getConnection();
    }
    public void inserir(){
    
    }
    
}
