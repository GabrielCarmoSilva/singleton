/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadeeventos;

/**
 *
 * @author user
 */
public class Parametros {
    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }
    
    private String nomeCasaEventos;
    private String organizador;
    
    public String getNomeCasaEventos() {
        return nomeCasaEventos;
    }

    public void setNomeCasaEventos(String nomeCasaEventos) {
        this.nomeCasaEventos = nomeCasaEventos;
    }
    
    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }
}
