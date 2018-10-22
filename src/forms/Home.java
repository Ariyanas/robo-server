package forms;

import classes.Project;
import com.alee.laf.WebLookAndFeel;
import com.alee.extended.filechooser.WebDirectoryChooser;
import com.alee.laf.optionpane.WebOptionPane;
import com.alee.utils.swing.DialogOptions;
import java.io.File;
import com.alee.laf.rootpane.WebFrame;
import javax.swing.DefaultListModel;
import utils.CList;
import utils.Msg;

/**
 *
 * @author Ariyanas
 */
public class Home extends WebFrame {

    DefaultListModel<Project> projects = null;
    Msg msg = null;
    boolean flag = false;
    int index = 0;

    public Home() {
        initComponents();

        projects = new DefaultListModel<>();
        msg = new Msg(this);

        pnlInfo.setVisible(false);
        btnCancel.setVisible(false);
        
        listProjects.setModel(projects);
        listProjects.setFixedCellHeight(24);
        listProjects.setFixedCellWidth(262);
        listProjects.setCellRenderer(new CList());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtProjectType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtProjectName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtProjectHost = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtProjectPort = new javax.swing.JTextField();
        txtProjectPath = new com.alee.extended.filechooser.WebPathField();
        jPanel1 = new javax.swing.JPanel();
        pnlList = new javax.swing.JScrollPane();
        listProjects = new javax.swing.JList<>();
        pnlInfo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblProjectType = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblProjectName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setLabelFor(txtProjectType);
        jLabel1.setText("Project Type");

        txtProjectType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laravel", "Angular", "React", "Spring Boot", "Spring", "Django", "Code Igniter" }));

        jLabel2.setLabelFor(txtProjectPath);
        jLabel2.setText("Project Path");

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel6.setLabelFor(txtProjectName);
        jLabel6.setText("Project Name");

        jLabel10.setLabelFor(txtProjectHost);
        jLabel10.setText("Host");

        txtProjectHost.setText("127.0.0.1");

        jLabel11.setLabelFor(txtProjectPort);
        jLabel11.setText("Port");

        txtProjectPort.setText("8000");

        txtProjectPath.setToolTipText("Select project directory");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlList.setMinimumSize(new java.awt.Dimension(262, 25));

        listProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listProjects.setMaximumSize(new java.awt.Dimension(262, 0));
        listProjects.setMinimumSize(new java.awt.Dimension(262, 0));
        listProjects.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listProjectsValueChanged(evt);
            }
        });
        pnlList.setViewportView(listProjects);

        jPanel1.add(pnlList, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, -1, 224));

        jLabel4.setText("Project Type");

        lblProjectType.setText("Project Type");

        btnStart.setText("Start");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel5.setText("Project Name");

        lblProjectName.setText("Project Name");

        jLabel7.setText("Project Path");

        txtPath.setEditable(false);
        txtPath.setEnabled(false);

        jButton4.setText("Open");

        jLabel8.setText("Host");

        txtHost.setText("127.0.0.1");

        jLabel9.setText("Port");

        txtPort.setText("8000");

        lblStatus.setText("Server Status");

        btnStop.setText("Stop");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(pnlInfoLayout.createSequentialGroup()
                                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 131, Short.MAX_VALUE))
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(lblProjectType, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblProjectName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(txtPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjectType)
                    .addComponent(lblProjectName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnEdit)
                    .addComponent(btnStop))
                .addContainerGap())
        );

        jPanel1.add(pnlInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 28, 455, -1));

        jLabel3.setText("Projects List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(95, 95, 95)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtProjectType, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 179, Short.MAX_VALUE))
                                    .addComponent(txtProjectName))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancel)
                                    .addComponent(txtProjectPath, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBrowse))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(txtProjectPort, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtProjectHost, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProjectType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBrowse)
                            .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtProjectPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProjectHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProjectPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        WebDirectoryChooser directoryChooser = null;

        if (directoryChooser == null) {
            directoryChooser = new WebDirectoryChooser(this, "Choose any directory");
        }
        directoryChooser.setVisible(true);

        if (directoryChooser.getResult() == DialogOptions.OK_OPTION) {
            File dir = directoryChooser.getSelectedDirectory();

            txtProjectPath.setSelectedPath(dir);
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        final File dir = txtProjectPath.getSelectedPath();

        //System.out.println(dir.getAbsolutePath());
        if (!dir.isDirectory() || !dir.exists()) {
            msg.showError("Please select a valid project directory !");
            return;
        }

        final String path = dir.getAbsolutePath();
        final String name = txtProjectName.getText().trim();
        final String type = txtProjectType.getSelectedItem().toString();
        final String host = txtProjectHost.getText().trim();
        final String port = txtProjectPort.getText().trim();

        if (name.isEmpty() || type.isEmpty() || host.isEmpty() || port.isEmpty() || path.isEmpty()) {
            msg.showError("Please enter valid details, no field should be left empty !");
            return;
        }

        if(!flag) {
            final Project pro = new Project(type, name, path, host, port);

            projects.addElement(pro);
        } else {
            Project pro = projects.get(index);
            pro.setHost(host);
            pro.setPort(port);
            pro.setName(name);
            pro.setType(type);
            pro.setPath(path);
        }
        
        setDefaults();

        //WebOptionPane.showMessageDialog(this,"Please select a valid project directory !","Error",WebOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAddActionPerformed

    private void listProjectsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listProjectsValueChanged
        final Project pro = listProjects.getSelectedValue();
        
        lblProjectType.setText(pro.getType());
        lblProjectName.setText(pro.getName());
        txtPath.setText(pro.getPath());
        txtHost.setText(pro.getHost());
        txtPort.setText(pro.getPort());
        
        if(pro.getStatus().equals("running")) {
            btnStop.setEnabled(true);
            btnEdit.setEnabled(false);
            btnStart.setEnabled(false);
        } else {
            btnStop.setEnabled(false);
            btnEdit.setEnabled(true);
            btnStart.setEnabled(true);
        }
        
        pnlInfo.setVisible(true);
    }//GEN-LAST:event_listProjectsValueChanged

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        final Project pro = listProjects.getSelectedValue();
        index = listProjects.getSelectedIndex();
        
        flag = true;
        
        btnStart.setEnabled(false);
        btnStop.setEnabled(false);
        listProjects.setEnabled(false);
        txtHost.setEnabled(false);
        txtPort.setEnabled(false);
        
        txtProjectType.setSelectedItem(pro.getType());
        txtProjectName.setText(pro.getName());
        txtProjectHost.setText(pro.getHost());
        txtProjectPort.setText(pro.getPort());
        
        File f = new File(pro.getPath());
        
        txtProjectPath.setSelectedPath(f);
        
        btnCancel.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setDefaults();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            WebLookAndFeel.install();
            
            Home form = new Home();
            form.setLocationRelativeTo(null);
            form.setTitle("Robo Server - Manage Local Development Servers !");
            form.setVisible(true);
        });
    }
    
    public void setDefaults(){
        txtProjectType.setSelectedIndex(0);
        txtProjectName.setText("");
        txtProjectHost.setText("127.0.0.1");
        txtProjectPort.setText("8000");
        
        btnStart.setEnabled(true);
        btnStop.setEnabled(true);
        listProjects.setEnabled(true);
        txtHost.setEnabled(true);
        txtPort.setEnabled(true);
        btnCancel.setVisible(false);
        
        flag = false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblProjectName;
    private javax.swing.JLabel lblProjectType;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JList<Project> listProjects;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JScrollPane pnlList;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtPath;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtProjectHost;
    private javax.swing.JTextField txtProjectName;
    private com.alee.extended.filechooser.WebPathField txtProjectPath;
    private javax.swing.JTextField txtProjectPort;
    private javax.swing.JComboBox<String> txtProjectType;
    // End of variables declaration//GEN-END:variables
}
