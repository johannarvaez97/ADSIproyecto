/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Vercion1;



/**
 *
 * @author Sebestian
 */
public class Registro {
   private RegistroEquipo registroequipo;
   private int idRegistro;
   private String usuarioTipoDocumento;
   private int usuarioNumeroDocumento;
   private java.sql.Date fechaEntrada;
   private java.sql.Time horaEntrada;
   private java.sql.Date fechaSalida;
   private java.sql.Time horaSalida;

    public Registro() {
    }

    public RegistroEquipo getRegistroequipo() {
        return registroequipo;
    }

    public void setRegistroequipo(RegistroEquipo registroequipo) {
        this.registroequipo = registroequipo;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getUsuarioTipoDocumento() {
        return usuarioTipoDocumento;
    }

    public void setUsuarioTipoDocumento(String usuarioTipoDocumento) {
        this.usuarioTipoDocumento = usuarioTipoDocumento;
    }

    public int getUsuarioNumeroDocumento() {
        return usuarioNumeroDocumento;
    }

    public void setUsuarioNumeroDocumento(int usuarioNumeroDocumento) {
        this.usuarioNumeroDocumento = usuarioNumeroDocumento;
    }

    public java.sql.Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(java.sql.Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public java.sql.Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(java.sql.Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public java.sql.Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(java.sql.Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public java.sql.Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(java.sql.Time horaSalida) {
        this.horaSalida = horaSalida;
    }
   
   
   
}
