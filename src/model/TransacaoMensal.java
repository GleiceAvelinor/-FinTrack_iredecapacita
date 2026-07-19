/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ednar
 */
public class TransacaoMensal  extends Transacao{
    private int mes;
    
public TransacaoMensal(String descricao, double valor, String tipo, int mes){
    super(descricao, valor, tipo);
              this.mes = mes;
}
   
}
