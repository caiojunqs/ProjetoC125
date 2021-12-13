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
public class CorpoCeleste {
    
    
    private String nome;
    private long diametro;
    
    public CorpoCeleste(String nome, long diametro){
    this.nome = nome;
    this.diametro = diametro;
    }
   
    public String getNome(){
        return this.nome;
    }
    public long getDiametro(){
        return this.diametro;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiametro(long diametro) {
        this.diametro = diametro;
    }
    
    public void mostrarNome(){
        System.out.println("O nome do Corpo Celeste eh: "+this.nome);
    }
    
    public void mostrarDiametro(){
        System.out.println("O diametro do Corpo Celeste eh: "+this.diametro);
    }

    
  
}
