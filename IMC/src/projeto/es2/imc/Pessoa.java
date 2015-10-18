package projeto.es2.imc;

public class Pessoa {

    private int peso;
    private double altura;
    private String sexo;

    public Pessoa() {
        this.altura = 0;
        this.peso = 0;
        this.sexo = "";
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    public String Mensagem() {
        IMC imc = new IMC();
        return(imc.calculaImc(this.altura, this.peso, this.sexo));
        
    }

    
    

}
