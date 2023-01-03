package com.mycompany.projetocalculadora;


public class Calcular {
    
    private int resultado;
    private int numero1;
    private int numero2;
    
    public int getNumero1(){
        return numero1;
    }
    
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }
    
    public int getNumero2(){
        return numero2;
    }
    
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    
    
    public void soma(int num1, int num2){
        resultado = num1 + num2;
        System.out.println("\nA soma de " + num1 + " + " + num2 + " é = " + resultado + "\n");       
    }
    
    public void subtracao(int num1, int num2){
        resultado = num1 - num2;
        System.out.println("\nA subtração de " + num1 + " - " + num2 + " é = " + resultado + "\n");  
        
    }
    
    public void multiplicacao(int num1, int num2){
        resultado = num1 * num2;
        System.out.println("\nA multiplicação de " + num1 + " * " + num2 + " é = " + resultado + "\n");
    }
    
    public void divisao(int num1, int num2){
        resultado = num1 / num2;
        System.out.println("\nA divisão de " + num1 + " / " + num2 + " é = " +  resultado + "\n");
        
    }
    
    public void quadrado (int num1){
        resultado += Math.pow(num1,2);
        System.out.println("\nA potência de " + num1 + " é = " + resultado + "\n");
        
    }
    
}
