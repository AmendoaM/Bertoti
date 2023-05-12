/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author Usuário
 */
public class Funcionarios {
    private String nome;
    private String turno;
    private String salario;

    public Funcionarios(String nome, String turno, String salario) {
        this.nome = nome;
        this.turno = turno;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
    public void imprimirFuncionarios() {
        System.out.println("Nome:" + nome);
        System.out.println("Turno:" + turno);
        System.out.println("Salario:" + salario);
    }
    
}
