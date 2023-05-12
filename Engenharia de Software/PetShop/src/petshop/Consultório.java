/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class Consultório {
   private String endereco;
   private String horario;
   private List<Funcionarios> listaFuncionarios;
   private List<Paciente> listaPaciente;

    public Consultório(String endereco, String horario) {
        this.endereco = endereco;
        this.horario = horario;
        listaFuncionarios = new ArrayList<>();
        listaPaciente = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
   
    public void adicionarFuncionario(Funcionarios funcionarios) {
        listaFuncionarios.add(funcionarios);
    }
    
    public void adicionarPaciente(Paciente paciente) {
        listaPaciente.add(paciente);
    }
    
    public void imprimirConsultorio() {
        System.out.println("Endereco: " + endereco);
        System.out.println("Horario de funcionamento: " + horario);
        System.out.println("Funcionarios");
        for (Funcionarios funcionario : listaFuncionarios) {
            funcionario.imprimirFuncionarios();
        }
        System.out.println("Pacientes:");
        for (Paciente paciente : listaPaciente) {
            paciente.imprimirPaciente();
        }
        
    }
}
