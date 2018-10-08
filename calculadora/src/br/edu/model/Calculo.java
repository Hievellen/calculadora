package br.edu.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double primeiroValor; 
    private Double segundoValor; 
    private String operador; 
    private Double resultado; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(Double primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public Double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(Double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    

    
    
}



