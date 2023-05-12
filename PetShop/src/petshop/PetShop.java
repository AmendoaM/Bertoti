/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petshop;
/**
 *
 * @author Usuário
 */
public class PetShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente1, paciente2, paciente3;
        paciente1 = new Paciente("Cleo", 1234, "canina", "otite", "pintscher", "pequeno", 12);
        paciente2 = new Paciente("Lili",1230, "SRD", "cinomosds","pintscher","grande", 5);
        paciente3 = new Paciente("Jilo", 1237, "SRD", "aneurisma","bulldog"," pequeno", 6);
     
        Funcionarios funcionario1 = new Funcionarios("Amanda", "matutino", "1200,00");
        Funcionarios funcionario2 = new Funcionarios("Alita", "noturno", "12500,00");
        Funcionarios funcionario3 = new Funcionarios("Amandla", "matutino", "1200,00");
        

        Consultório consultorio1 = new Consultório("rua Amanda Mendes", "12:00-13:00");
        consultorio1.adicionarFuncionario(funcionario1);
        consultorio1.adicionarFuncionario(funcionario2);
        consultorio1.adicionarFuncionario(funcionario3);
        
        
        consultorio1.adicionarPaciente(paciente1);
        consultorio1.adicionarPaciente(paciente2);
        consultorio1.adicionarPaciente(paciente3);
       
        consultorio1.imprimirConsultorio();
    }
    
}
