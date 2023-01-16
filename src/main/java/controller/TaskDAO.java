package controller;

import model.Task;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            throw new RuntimeException("Error saving task " + ex.getMessage(), ex);

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Error closing connection", ex);
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
            throw new RuntimeException("Error updating task", ex);

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Error closing connection", ex);
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
            throw new RuntimeException("Error deleting task", ex);

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Error closing connection", ex);
            }
        }

    }

    public List<Task> getAll() {
        String sql = "SELECT * FROM tasks";

        List<Task> tasks = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;

        ResultSet rset = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);

            rset = stmt.executeQuery();

            while (rset.next()) {

                Task task = new Task();

                task.setId(rset.getInt("id"));
                task.setIdProject(rset.getInt("idProject"));
                task.setName(rset.getString("name"));
                task.setDescription(rset.getString("description"));
                task.setNotes(rset.getString("notes"));
                task.setDeadline(rset.getDate("deadline"));
                task.setCompleted(rset.getBoolean("completed"));
                task.setCreatedAt(rset.getDate("createdAt"));
                task.setCreatedAt(rset.getDate("updatedAt"));

                tasks.add(task);
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Error fetching tasks", ex);

        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                throw new RuntimeException("Error closing connection", ex);

            }
        }

        return tasks;

    }
    
    public List<Task> getByProjectId(int id) {
        String sql = "SELECT * FROM tasks where idProject = ?";

        List<Task> tasks = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;

        ResultSet rset = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            rset = stmt.executeQuery();

            while (rset.next()) {

                Task task = new Task();

                task.setId(rset.getInt("id"));
                task.setIdProject(rset.getInt("idProject"));
                task.setName(rset.getString("name"));
                task.setDescription(rset.getString("description"));
                task.setNotes(rset.getString("notes"));
                task.setDeadline(rset.getDate("deadline"));
                task.setCompleted(rset.getBoolean("completed"));
                task.setCreatedAt(rset.getDate("createdAt"));
                task.setCreatedAt(rset.getDate("updatedAt"));

                tasks.add(task);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar as tarefas", ex);
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Error closing connection", ex);
            }
        }
        return tasks;
    }

}
