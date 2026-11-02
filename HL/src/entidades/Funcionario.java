package entidades;

import java.time.LocalDate;

public class Funcionario{

    //classe funcionario

private String matricula;
private String cargo;
private LocalDate dataCadastro;

public Funcionario (String matricula, String cargo){
    this.matricula = matricula;
    this.cargo = cargo;
}

public String getMatricula(){
    return matricula;
}

public void setMatricula(String matricula){
    this.matricula = matricula;
}

public String getCargo(){
    return cargo;
}

public void setCargo(String cargo){
    this.cargo = cargo;
}

//métodos
//public String getTipoPessoa(){
 //   ;

}

