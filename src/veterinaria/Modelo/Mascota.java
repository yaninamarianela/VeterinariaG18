/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.Modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Mascota {
    private int codigo;
    private String alias;
    private String especie;
    private String raza;
    private String colorPelo;
    private Date fecNac;
    private String tipoTratamiento;
    private double pesoMedio;
    private double pesoActual;

    public Mascota(int codigo, String alias, String especie, String raza, String colorPelo, Date fecNac, String tipoTratamiento, double pesoMedio, double pesoActual) {
        this.codigo = codigo;
        this.alias = alias;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fecNac = fecNac;
        this.tipoTratamiento = tipoTratamiento;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    
    
    
    
}
