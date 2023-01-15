/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Flitz
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelHeader = new javax.swing.JPanel();
        JLabelHeaderTitle = new javax.swing.JLabel();
        JLabelHeaderSubtitle = new javax.swing.JLabel();
        JPanelMain = new javax.swing.JPanel();
        JPanelProjects = new javax.swing.JPanel();
        JLabelProjectTitle = new javax.swing.JLabel();
        JLabelProjectAdd = new javax.swing.JLabel();
        JPanelTasks = new javax.swing.JPanel();
        JPanellTaskTitle = new javax.swing.JLabel();
        JPanelTaskAdd = new javax.swing.JLabel();
        JPanelProjectsList = new javax.swing.JPanel();
        JScrollPanelProjectsList = new javax.swing.JScrollPane();
        JListProjectsList = new javax.swing.JList<>();
        JPanelTasksList = new javax.swing.JPanel();
        JPanelEmptyList = new javax.swing.JPanel();
        JLabelEmptyListIcon = new javax.swing.JLabel();
        JLabelEmptyListTitle = new javax.swing.JLabel();
        JLabelEmptyListDescription = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(10, 11, 28));

        JPanelHeader.setBackground(new java.awt.Color(10, 11, 28));
        JPanelHeader.setForeground(new java.awt.Color(252, 252, 252));

        JLabelHeaderTitle.setFont(new java.awt.Font("Poppins", 1, 40)); // NOI18N
        JLabelHeaderTitle.setForeground(new java.awt.Color(252, 252, 252));
        JLabelHeaderTitle.setLabelFor(JLabelHeaderTitle);
        JLabelHeaderTitle.setText("Todo App");

        JLabelHeaderSubtitle.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        JLabelHeaderSubtitle.setForeground(new java.awt.Color(138, 139, 139));
        JLabelHeaderSubtitle.setLabelFor(JLabelHeaderSubtitle);
        JLabelHeaderSubtitle.setText("Organize de maneira pr�tica seus Projetos e Tarefas");

        JPanelMain.setBackground(new java.awt.Color(10, 11, 28));
        JPanelMain.setForeground(new java.awt.Color(252, 252, 252));

        JPanelProjects.setBackground(new java.awt.Color(10, 11, 28));
        JPanelProjects.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 24, 50), 2, true));
        JPanelProjects.setPreferredSize(new java.awt.Dimension(200, 45));

        JLabelProjectTitle.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        JLabelProjectTitle.setForeground(new java.awt.Color(252, 252, 252));
        JLabelProjectTitle.setText("Projetos");

        JLabelProjectAdd.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        JLabelProjectAdd.setForeground(new java.awt.Color(252, 252, 252));
        JLabelProjectAdd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JLabelProjectAdd.setText("+");
        JLabelProjectAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JLabelProjectAdd.setIconTextGap(0);

        javax.swing.GroupLayout JPanelProjectsLayout = new javax.swing.GroupLayout(JPanelProjects);
        JPanelProjects.setLayout(JPanelProjectsLayout);
        JPanelProjectsLayout.setHorizontalGroup(
            JPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelProjectsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(JLabelProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        JPanelProjectsLayout.setVerticalGroup(
            JPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelProjectAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JLabelProjectAdd.getAccessibleContext().setAccessibleName("+");

        JPanelTasks.setBackground(new java.awt.Color(10, 11, 28));
        JPanelTasks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 24, 50), 2, true));

        JPanellTaskTitle.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        JPanellTaskTitle.setForeground(new java.awt.Color(252, 252, 252));
        JPanellTaskTitle.setText("Tarefas");

        JPanelTaskAdd.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        JPanelTaskAdd.setForeground(new java.awt.Color(252, 252, 252));
        JPanelTaskAdd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JPanelTaskAdd.setText("+");
        JPanelTaskAdd.setToolTipText("");
        JPanelTaskAdd.setAlignmentX(0.5F);
        JPanelTaskAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelTaskAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JPanelTaskAdd.setIconTextGap(0);
        JPanelTaskAdd.setPreferredSize(new java.awt.Dimension(11, 29));

        javax.swing.GroupLayout JPanelTasksLayout = new javax.swing.GroupLayout(JPanelTasks);
        JPanelTasks.setLayout(JPanelTasksLayout);
        JPanelTasksLayout.setHorizontalGroup(
            JPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTasksLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(JPanellTaskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPanelTaskAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        JPanelTasksLayout.setVerticalGroup(
            JPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanellTaskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelTaskAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JPanelProjectsList.setBackground(new java.awt.Color(24, 24, 50));
        JPanelProjectsList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 24, 50), 2, true));
        JPanelProjectsList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JScrollPanelProjectsList.setBackground(new java.awt.Color(24, 24, 50));
        JScrollPanelProjectsList.setBorder(null);
        JScrollPanelProjectsList.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N

        JListProjectsList.setBackground(new java.awt.Color(24, 24, 50));
        JListProjectsList.setBorder(null);
        JListProjectsList.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        JListProjectsList.setForeground(new java.awt.Color(252, 252, 252));
        JListProjectsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListProjectsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JListProjectsList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JListProjectsList.setFixedCellHeight(42);
        JListProjectsList.setMaximumSize(new java.awt.Dimension(54, 200));
        JListProjectsList.setName(""); // NOI18N
        JListProjectsList.setSelectedIndex(0);
        JListProjectsList.setSelectionBackground(new java.awt.Color(10, 11, 28));
        JListProjectsList.setSelectionForeground(new java.awt.Color(252, 252, 252));
        JListProjectsList.setVisibleRowCount(10);
        JScrollPanelProjectsList.setViewportView(JListProjectsList);

        javax.swing.GroupLayout JPanelProjectsListLayout = new javax.swing.GroupLayout(JPanelProjectsList);
        JPanelProjectsList.setLayout(JPanelProjectsListLayout);
        JPanelProjectsListLayout.setHorizontalGroup(
            JPanelProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjectsListLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JScrollPanelProjectsList)
                .addGap(10, 10, 10))
        );
        JPanelProjectsListLayout.setVerticalGroup(
            JPanelProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelProjectsListLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JScrollPanelProjectsList, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        JPanelTasksList.setBackground(new java.awt.Color(24, 24, 50));
        JPanelTasksList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 24, 50), 1, true));

        JPanelEmptyList.setBackground(new java.awt.Color(24, 24, 50));

        JLabelEmptyListIcon.setForeground(new java.awt.Color(252, 252, 252));
        JLabelEmptyListIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLabelEmptyListTitle.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        JLabelEmptyListTitle.setForeground(new java.awt.Color(252, 252, 252));
        JLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelEmptyListTitle.setText("Nenhuma Tarefa por aqui...");
        JLabelEmptyListTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLabelEmptyListDescription.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        JLabelEmptyListDescription.setForeground(new java.awt.Color(139, 139, 139));
        JLabelEmptyListDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelEmptyListDescription.setText("Clique no bot�o \"+\" para inserir uma nova Tarefa.");
        JLabelEmptyListDescription.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout JPanelEmptyListLayout = new javax.swing.GroupLayout(JPanelEmptyList);
        JPanelEmptyList.setLayout(JPanelEmptyListLayout);
        JPanelEmptyListLayout.setHorizontalGroup(
            JPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelEmptyListDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelEmptyListLayout.setVerticalGroup(
            JPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEmptyListLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(JLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelEmptyListDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JLabelEmptyListIcon.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout JPanelTasksListLayout = new javax.swing.GroupLayout(JPanelTasksList);
        JPanelTasksList.setLayout(JPanelTasksListLayout);
        JPanelTasksListLayout.setHorizontalGroup(
            JPanelTasksListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTasksListLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JPanelEmptyList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        JPanelTasksListLayout.setVerticalGroup(
            JPanelTasksListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTasksListLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JPanelEmptyList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanelMainLayout = new javax.swing.GroupLayout(JPanelMain);
        JPanelMain.setLayout(JPanelMainLayout);
        JPanelMainLayout.setHorizontalGroup(
            JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMainLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(JPanelProjectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        JPanelMainLayout.setVerticalGroup(
            JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelProjectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout JPanelHeaderLayout = new javax.swing.GroupLayout(JPanelHeader);
        JPanelHeader.setLayout(JPanelHeaderLayout);
        JPanelHeaderLayout.setHorizontalGroup(
            JPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHeaderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(JPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelHeaderSubtitle)
                    .addComponent(JLabelHeaderTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(JPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPanelHeaderLayout.setVerticalGroup(
            JPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHeaderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JLabelHeaderTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelHeaderSubtitle)
                .addGap(30, 30, 30)
                .addComponent(JPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelEmptyListDescription;
    private javax.swing.JLabel JLabelEmptyListIcon;
    private javax.swing.JLabel JLabelEmptyListTitle;
    private javax.swing.JLabel JLabelHeaderSubtitle;
    private javax.swing.JLabel JLabelHeaderTitle;
    private javax.swing.JLabel JLabelProjectAdd;
    private javax.swing.JLabel JLabelProjectTitle;
    private javax.swing.JList<String> JListProjectsList;
    private javax.swing.JPanel JPanelEmptyList;
    private javax.swing.JPanel JPanelHeader;
    private javax.swing.JPanel JPanelMain;
    private javax.swing.JPanel JPanelProjects;
    private javax.swing.JPanel JPanelProjectsList;
    private javax.swing.JLabel JPanelTaskAdd;
    private javax.swing.JPanel JPanelTasks;
    private javax.swing.JPanel JPanelTasksList;
    private javax.swing.JLabel JPanellTaskTitle;
    private javax.swing.JScrollPane JScrollPanelProjectsList;
    // End of variables declaration//GEN-END:variables
}
