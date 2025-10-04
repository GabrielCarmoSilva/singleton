/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadeeventos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeCasaEventos() {
        Parametros.getInstance().setNomeCasaEventos("Maracanã");
        assertEquals("Maracanã", Parametros.getInstance().getNomeCasaEventos());
    }

    @Test
    public void deveRetornarOrganizador() {
        Parametros.getInstance().setOrganizador("Gabriel");
        assertEquals("Gabriel", Parametros.getInstance().getOrganizador());
    }

}