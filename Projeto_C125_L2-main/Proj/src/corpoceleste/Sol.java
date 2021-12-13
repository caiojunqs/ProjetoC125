/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corpoceleste;

/**
 *
 * @author 55359
 */
public class Sol extends CorpoCeleste{
    
    
    public Sol(String nome, long diametro){
    super(nome, diametro);
    }
    
    @Override
    public void mostrarNome(){
        System.out.println("O nome do Sol eh: "+getNome());
    }
    
    @Override
    public void mostrarDiametro(){
        System.out.println("O diametro do Sol eh: "+getDiametro());
    }
}
