/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.negocio;

/**
 *Classe que representa as transportadoras do software.
 * @version 1.0 31/07/13
 * @author nathan_bettiol
 */
public class Transportadora extends PessoaJuridica {
    
    private String tipoTransporte;
    private double precoFrete;

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }

    public Transportadora() {
    }
    
    
    
}
