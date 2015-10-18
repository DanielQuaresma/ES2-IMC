/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.es2.imc;

/**
 *
 * @author DANIEL
 */
public class IMC {

    private double calcImc;

    public IMC() {
        calcImc = 0;
    }

    public String calculaImc(double a, int p, String s) {
        String msg = "";
        s = s.toUpperCase();
        
        if ((p <= 0) || (a < 0.60) || (a > 2.40) || (s.equals(""))) {
            msg = "Valores Inválidos";
            return msg;
        }

        double c = p / (a*a);
        //if (c)

        if ((c >= 19) && (c <= 24.9) && (s.equals("M"))) {
            return msg = "Você está muito bem! Continue assim!";            
        }
        
        if((c >= 18) && (c <= 24.4) && (s.equals("F"))) {
            return msg = "Você está muito bem! Continue assim!";            
        } 

        return "b";
    }

}
