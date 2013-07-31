/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.persistencia;

import br.senai.sc.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que guarda as  informações referentes aos funcionarios.
 *
 *@version 1.0 31/07/13
 * @author nathan_bettiol
 */
public class FuncionarioDAO {
    
    //Vetor dinamico para armazenar os funcionarios cadastrados.
     private List<Funcionario> funcionarios = new ArrayList<>();
     
     /* Método para adicionar um funcionario no vetor de funcionarios */
     public void adicionar (Funcionario f){
         funcionarios.add(f);
         JOptionPane.showMessageDialog(null,"Funcionario "
                 + "Adicionado com sucesso.");
         
         
         
     }
     

}
