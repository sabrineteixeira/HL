package entidades;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa(String nome, String cpf, String telefone, String email) {
        super();
        this.nome = validarTextoObrigatorio(nome, "nome");
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    //métodos abstratos: cada subclasse implementa o seu (polimorfismo)
public abstract String getTipoPessoa();

public abstract String exibirResumo();

    @Override
    public String toString(){
        return exibirResumo();
    }

    //métodos de apoio (protected)
    
    protected static String validarTextoObrigatorio(String valor, String campo){
        if (valor == null || valor.trim().isEmpty()){
            throw new IllegalArgumentException("O campo " + campo + " é obrigatório.");{
                return valor.trim();
            }
        }
    }

}

