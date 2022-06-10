/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() {
        conn = ConnectionFactory.getConnection();
    }

    public boolean autenticar(String login, String senha) {

        try {
            PreparedStatement stmt = conn.prepareStatement("select * from tb_usuario where login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean autenticarADM(String login, String senha) {

        try {
            PreparedStatement stmt = conn.prepareStatement("select * from tb_adminstrador where login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean InserirUsuario(String login, String senha, String email, String telefone) {

        try {
            PreparedStatement stmt = conn.prepareStatement("insert into tb_adminstrador (login, senha, email, telefone) VALUES (?,?,?,?);");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            stmt.setString(3, email);
            stmt.setString(4, telefone);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
