package com.ea.todoApp.controller;

import com.ea.todoApp.model.Project;
import com.ea.todoApp.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProjectDAO {

    public void save(Project project) {
        String sql = "INSERT INTO projects(name, description, createdAt, updatedAt) VALUES (?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, project.getName());
            stmt.setString(2, project.getDescription());
            stmt.setDate(3, new java.sql.Date(project.getCreatedAt().getTime()));
            stmt.setDate(4, new java.sql.Date(project.getUpdatedAt().getTime()));

            stmt.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar o projeto " + ex.getMessage(), ex);

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }

    }

}
