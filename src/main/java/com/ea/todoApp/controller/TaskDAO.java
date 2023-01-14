package com.ea.todoApp.controller;

import com.ea.todoApp.model.Task;
import com.ea.todoApp.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TaskDAO {

    public void save(Task task) {
        String sql = "INSERT INTO tasks(idProject, name, description, notes, deadline, completed, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, task.getIdProject());
            stmt.setString(2, task.getName());
            stmt.setString(3, task.getDescription());
            stmt.setString(4, task.getNotes());
            stmt.setDate(5, new java.sql.Date(task.getDeadline().getTime()));
            stmt.setBoolean(6, task.isCompleted());
            stmt.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            stmt.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));

            stmt.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tarefa " + ex.getMessage(), ex);

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

    public void update(Task task) {

        String sql = "UPDATE tasks SET idProject = ?, name = ?, description = ?, notes = ?, deadline = ?, completed = ?, createdAt = ?, updatedAt = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setInt     (1, task.getIdProject());
            stmt.setString  (2, task.getName());
            stmt.setString  (3, task.getDescription());
            stmt.setString  (4, task.getNotes());
            stmt.setDate    (5, new java.sql.Date(task.getDeadline().getTime()));
            stmt.setBoolean (6, task.isCompleted());
            stmt.setDate    (7, new java.sql.Date(task.getCreatedAt().getTime()));
            stmt.setDate    (8, new java.sql.Date(task.getUpdatedAt().getTime()));
            stmt.setInt     (9, task.getId());

            stmt.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro em atualizar a tarefa", ex);

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

    public void removeById(int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, taskId);
            stmt.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar a tarefa", ex);

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

    public List<Task> getAll(int idProject) {
        return null;
    }

}
