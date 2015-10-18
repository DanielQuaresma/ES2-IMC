/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import projeto.es2.imc.Pessoa;
import projeto.es2.imc.IMC;

/**
 *
 * @author DANIEL
 */
public class TesteIMC {
    
    public TesteIMC() {
    }
    
    @Test
    public void testeNumerosInvalidos(){
        Pessoa p = new Pessoa();
        p.setAltura(0.59);
        p.setPeso(90);
        p.setSexo("M");
        Assert.assertEquals(p.Mensagem(), "Valores Inválidos");
    }
    
    @Test
    public void testeImcBaixo(){
        Pessoa p = new Pessoa();
        p.setPeso(50);
        p.setAltura(1.80);
        p.setSexo("f");
        Assert.assertEquals(p.Mensagem(), "Você está abaixo do peso recomendado.");
    }
    
    @Test
    public void testeImcIdealM(){
        Pessoa p = new Pessoa();
        p.setPeso(70);
        p.setAltura(1.80);
        p.setSexo("M");
        Assert.assertEquals(p.Mensagem(), "Você está muito bem! Continue assim!");
    }    
    
    @Test
    public void testeImcIdealF(){
        Pessoa p = new Pessoa();
        p.setPeso(60);
        p.setAltura(1.80);
        p.setSexo("f");
        Assert.assertEquals(p.Mensagem(), "Você está muito bem! Continue assim!");
    }
    
    @Test
    public void testeImcModerado(){
        Pessoa p = new Pessoa();
        p.setPeso(100);
        p.setAltura(2.00);
        p.setSexo("f");
        System.out.println(p.Mensagem());
        Assert.assertEquals(p.Mensagem(), "Você está acima do peso recomendado. Cuidado!");
    }
}
