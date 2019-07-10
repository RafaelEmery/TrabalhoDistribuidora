/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import bll.*;

/**
 *
 * @author joao
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        miCriarCliente = new javax.swing.JMenuItem();
        miListarCliente = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        miCriarProduto = new javax.swing.JMenuItem();
        miListarProduto = new javax.swing.JMenuItem();
        miListarEstoque = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miCriarFormecedor = new javax.swing.JMenuItem();
        miListarFornecedor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miCriarVenda = new javax.swing.JMenuItem();
        miListarVenda = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miCriarCompra = new javax.swing.JMenuItem();
        miListarCompra = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Distribuidora Cana");

        jMenuBar1.setBackground(new java.awt.Color(160, 158, 149));

        jMenu5.setText("Cliente");

        miCriarCliente.setText("Criar");
        miCriarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarClienteActionPerformed(evt);
            }
        });
        jMenu5.add(miCriarCliente);

        miListarCliente.setText("Listar");
        miListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarClienteActionPerformed(evt);
            }
        });
        jMenu5.add(miListarCliente);

        jMenuBar1.add(jMenu5);

        jMenu1.setForeground(new java.awt.Color(1, 1, 1));
        jMenu1.setText("Produto");

        jMenu6.setText("Cerveja");

        miCriarProduto.setText("Criar");
        miCriarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarProdutoActionPerformed(evt);
            }
        });
        jMenu6.add(miCriarProduto);

        miListarProduto.setText("Listar");
        miListarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarProdutoActionPerformed(evt);
            }
        });
        jMenu6.add(miListarProduto);

        miListarEstoque.setText("Estoque");
        miListarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarEstoqueActionPerformed(evt);
            }
        });
        jMenu6.add(miListarEstoque);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(1, 1, 1));
        jMenu2.setText("Fornecedor");

        miCriarFormecedor.setText("Criar");
        miCriarFormecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarFormecedorActionPerformed(evt);
            }
        });
        jMenu2.add(miCriarFormecedor);

        miListarFornecedor.setText("Listar");
        miListarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarFornecedorActionPerformed(evt);
            }
        });
        jMenu2.add(miListarFornecedor);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(1, 1, 1));
        jMenu3.setText("Vendas");

        miCriarVenda.setText("Realizar");
        miCriarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarVendaActionPerformed(evt);
            }
        });
        jMenu3.add(miCriarVenda);

        miListarVenda.setText("Listar");
        jMenu3.add(miListarVenda);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(1, 1, 1));
        jMenu4.setText("Compras");

        miCriarCompra.setText("Realizar");
        miCriarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarCompraActionPerformed(evt);
            }
        });
        jMenu4.add(miCriarCompra);

        miListarCompra.setText("Listar");
        miListarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarCompraActionPerformed(evt);
            }
        });
        jMenu4.add(miListarCompra);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miCriarVendaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_miCriarVendaActionPerformed
        TransacaoVendaBL.criarTransacao(this);
    }//GEN-LAST:event_miCriarVendaActionPerformed

    private void miListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarClienteActionPerformed
        ClienteBL.listar();
    }//GEN-LAST:event_miListarClienteActionPerformed

    private void miListarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miListarCompraActionPerformed

    private void miCriarClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_miCriarClienteActionPerformed
        ClienteBL.criar(this);
    }//GEN-LAST:event_miCriarClienteActionPerformed

    private void miCriarProdutoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_miCriarProdutoActionPerformed
        ProdutoBL.criarCerveja(this);
    }//GEN-LAST:event_miCriarProdutoActionPerformed

    private void miCriarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miCriarCompraActionPerformed

    private void miListarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miListarFornecedorActionPerformed

    private void miCriarFormecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarFormecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miCriarFormecedorActionPerformed

    private void miListarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarEstoqueActionPerformed
        EstoqueBL.listar(this);
    }//GEN-LAST:event_miListarEstoqueActionPerformed

    private void miListarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miListarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCriarCliente;
    private javax.swing.JMenuItem miCriarCompra;
    private javax.swing.JMenuItem miCriarFormecedor;
    private javax.swing.JMenuItem miCriarProduto;
    private javax.swing.JMenuItem miCriarVenda;
    private javax.swing.JMenuItem miListarCliente;
    private javax.swing.JMenuItem miListarCompra;
    private javax.swing.JMenuItem miListarEstoque;
    private javax.swing.JMenuItem miListarFornecedor;
    private javax.swing.JMenuItem miListarProduto;
    private javax.swing.JMenuItem miListarVenda;
    // End of variables declaration//GEN-END:variables
}
