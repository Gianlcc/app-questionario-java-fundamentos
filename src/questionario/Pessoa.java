package questionario;

public class Pessoa {

    private String nome;
    private int idade;
    private float salario;
    private Carro carro;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the carro
     */
    public Carro getCarro() {
        if (carro == null) {
            carro = new Carro();
        }

        return carro;
    }
    public boolean hasCarro() {
        return this.carro != null;
        
    }
}
