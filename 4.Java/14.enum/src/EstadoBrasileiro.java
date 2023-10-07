public enum EstadoBrasileiro {
    SAO_PAULO("São Paulo", "SP", 11),
    RIO_JANEIRO("Rio de Janeiro", "RJ", 12),
    PIAUI("Piauí", "PI", 13),
    MARANHAO("Maranhão", "MA", 15),
    CEARA("Ceará", "CE", 15);

    private String sigla;
    private String nome;
    private int ibge;

    private EstadoBrasileiro(String nome, String sigla, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
