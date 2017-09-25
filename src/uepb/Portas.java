/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uepb;

/**
 *
 * @author Home
 */
public class Portas {

//Atributos
public boolean aberta;
private String cor;
private float dmix, dmiy, dmiz;

    

    public void aberta() {
        if(aberta == true){
            System.out.println("Porta já aberta!");
        }else{
            this.aberta = true;
            System.out.println("Fechada");
    }
}
    public void fechar(){
        if(this.aberta == false){
            System.out.println("A porta já está fechada");
        }else{
            this.aberta = false;
            System.out.println("A porta está fechada");
        }
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
        System.out.println("A cor é "+cor);
    }

    public float getDmix() {
        return dmix;
    }

    public void setDmix(float dmix) {
        this.dmix = dmix;
        System.out.println("Dimensão X da porta é : "+dmix);
    }

    public float getDmiy() {
        return dmiy;
    }

    public void setDmiy(float dmiy) {
        this.dmiy = dmiy;
        System.out.println("Dimensão Y da porta é :"+dmiy);
    }

    public float getDmiz() {
        return dmiz;
    }

    public void setDmiz(float dmiz) {
        this.dmiz = dmiz;
        System.out.println("Dimensão Z da porta é : "+dmiz);
    }

}