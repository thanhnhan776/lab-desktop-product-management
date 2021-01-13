/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import dao.TblCategoryDao;
import entity.TblCategory;
import entity.TblUser;
import form.table.CategoriesTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductManagementForm extends javax.swing.JFrame {

    private TblUser user;
    private List<TblCategory> categories;
    private TblCategory selectedCategory;

    private boolean isAddingNewCategory = false;

    private TblCategoryDao categoryDao = new TblCategoryDao();

    /**
     * Creates new form ProductManagementForm
     */
    public ProductManagementForm() {
        initComponents();
        loadData();
    }

    private void loadData() {
        try {
            categories = categoryDao.getAllCategories();
            tblCategories.setModel(new CategoriesTableModel(categories));
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public TblUser getUser() {
        return user;
    }

    public void setUser(TblUser user) {
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcomeUser = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategories = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCategoryId = new javax.swing.JTextField();
        jlabel = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNewCategory = new javax.swing.JButton();
        btnSaveCategory = new javax.swing.JButton();
        btnDeleteCategory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCategoryDescription = new javax.swing.JTextArea();
        btnCancelCategory = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Management");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblWelcomeUser.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblWelcomeUser.setForeground(new java.awt.Color(0, 102, 255));
        lblWelcomeUser.setText("Hi");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Categories"));

        tblCategories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategories);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        jLabel1.setText("Id");

        txtCategoryId.setEditable(false);

        jlabel.setText("Name");

        jLabel2.setText("Description");

        btnNewCategory.setText("Add new");
        btnNewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCategoryActionPerformed(evt);
            }
        });

        btnSaveCategory.setText("Save");
        btnSaveCategory.setToolTipText("");
        btnSaveCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCategoryActionPerformed(evt);
            }
        });

        btnDeleteCategory.setText("Delete");
        btnDeleteCategory.setEnabled(false);

        txtCategoryDescription.setColumns(20);
        txtCategoryDescription.setRows(5);
        jScrollPane2.setViewportView(txtCategoryDescription);

        btnCancelCategory.setText("Cancel");
        btnCancelCategory.setEnabled(false);
        btnCancelCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel)
                            .addComponent(jLabel1))
                        .addGap(18, 43, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCategoryName, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(txtCategoryId)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNewCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaveCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelCategory)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteCategory)
                    .addComponent(btnNewCategory)
                    .addComponent(btnSaveCategory)
                    .addComponent(btnCancelCategory))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Categories", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Products", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcomeUser)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcomeUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Categories");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (user != null) {
            lblWelcomeUser.setText("Welcome " + user.getFullName() + "!");
        }
    }//GEN-LAST:event_formWindowOpened

    private void tblCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriesMouseClicked
        int index = tblCategories.getSelectedRow();
        selectedCategory = categories.get(index);
        btnDeleteCategory.setEnabled(true);
        displaySelectedCategory();
    }//GEN-LAST:event_tblCategoriesMouseClicked

    private void btnNewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCategoryActionPerformed
        isAddingNewCategory = true;
        btnNewCategory.setEnabled(false);
        btnDeleteCategory.setEnabled(false);
        btnCancelCategory.setEnabled(true);
        txtCategoryId.setEditable(true);
        txtCategoryId.setText("");
        txtCategoryName.setText("");
        txtCategoryDescription.setText("");
        txtCategoryId.requestFocus();
    }//GEN-LAST:event_btnNewCategoryActionPerformed

    private void btnCancelCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelCategoryActionPerformed
        isAddingNewCategory = false;
        btnNewCategory.setEnabled(true);
        btnDeleteCategory.setEnabled(selectedCategory != null);
        btnCancelCategory.setEnabled(false);
        displaySelectedCategory();
    }//GEN-LAST:event_btnCancelCategoryActionPerformed

    private void btnSaveCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCategoryActionPerformed
        String id = txtCategoryId.getText();
        String name = txtCategoryName.getText();
        String description = txtCategoryDescription.getText();
        try {
            if (isAddingNewCategory) {
                TblCategory category = new TblCategory(id, name, description);
                this.checkCategoryValidation(category);
                categoryDao.saveCategory(category);
                loadData();
                btnCancelCategoryActionPerformed(null);
            } else if (selectedCategory != null) {
                TblCategory category = new TblCategory(
                        selectedCategory.getCategoryId(), name, description);
                this.checkCategoryValidation(category);
                categoryDao.updateCategory(category);
                loadData();
                btnCancelCategoryActionPerformed(null);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveCategoryActionPerformed

    private void checkCategoryValidation(TblCategory category) throws Exception {
        if (category == null) {
            throw new Exception("Empty category!");
        }
        if (category.getCategoryId() == null || category.getCategoryId().isEmpty()) {
            throw new Exception("Id must not be empty!");
        }
        if (category.getName() == null || category.getName().isEmpty()) {
            throw new Exception("Name must not be empty!");
        }
    }

    private void displaySelectedCategory() {
        txtCategoryId.setEditable(false);
        if (selectedCategory != null) {
            txtCategoryId.setText(selectedCategory.getCategoryId());
            txtCategoryName.setText(selectedCategory.getName());
            txtCategoryDescription.setText(selectedCategory.getDescription());
        } else {
            txtCategoryId.setText("");
            txtCategoryName.setText("");
            txtCategoryDescription.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelCategory;
    private javax.swing.JButton btnDeleteCategory;
    private javax.swing.JButton btnNewCategory;
    private javax.swing.JButton btnSaveCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel lblWelcomeUser;
    private javax.swing.JTable tblCategories;
    private javax.swing.JTextArea txtCategoryDescription;
    private javax.swing.JTextField txtCategoryId;
    private javax.swing.JTextField txtCategoryName;
    // End of variables declaration//GEN-END:variables
}
