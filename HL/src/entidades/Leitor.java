import java.time.LocalDate;

public class Leitor {

    //atributos
    private String matricula;
    private LocalDate dataCadastro;
    private boolean ativo;

    //getters e setters
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    //métodos
    public String getTipoPessoa() {
        return "Leitor";
    }

    public void exibirResumo() {
        System.out.println("Matrícula: " + matricula + " | Cadastro: " + dataCadastro + " | Ativo: " + ativo);
       
    }
}