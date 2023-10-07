public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereço() {
        return endereco;
    }

    public Pessoa(String cpf, String nome, String endereco){
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
    }

    


}
