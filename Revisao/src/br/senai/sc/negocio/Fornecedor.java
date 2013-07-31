/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.negocio;

/**
 * Classe que representa os fornecedores do software
 *  @version 1.0 31/07/13
 *
 * @author nathan_bettiol
 */
public class Fornecedor extends PessoaJuridica {
    
    private String tipoProduto;

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public Fornecedor(){
    
    
    }
    
    
    
}
