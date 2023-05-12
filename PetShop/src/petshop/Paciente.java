/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Paciente {

    private String nome;
    private int id;
    private String especie;
    private String doenca;
    private String raca;
    private String porte;
    private int idade;

    public Paciente(String nome, int id, String especie, String doenca, String raca, String porte, int idade) {
        this.nome = nome;
        this.id = id;
        this.especie = especie;
        this.doenca = doenca;
        this.raca = raca;
        this.porte = porte;
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    

    public void imprimirPaciente() {
        System.out.println("Nome:" + nome);
        System.out.println("Id: " + id);
        System.out.println("Especie:" + especie);
        System.out.println("Doenca:" + doenca);
        System.out.println("Raa:" + raca);
        System.out.println("Porte:" + porte);
        System.out.println("Idade:" + idade);
        
    }

    }
    

