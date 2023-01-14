package com.ea.todoApp.controller;

import com.ea.todoApp.model.Task;
import com.ea.todoApp.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TaskDAO {

    public void save(Task task) {}

    public void update(Task task) {}

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
