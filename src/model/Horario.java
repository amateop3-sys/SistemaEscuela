package model;


import java.time.LocalTime;

import enums.DiaSemana;



public class Horario {

    //=========================
    // ATRIBUTOS
    //=========================

    private int id;
    private DiaSemana dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    //=========================
    // CONSTRUCTOR VACÍO
    //=========================

    public Horario() {

    }

    //=========================
    // CONSTRUCTOR COMPLETO
    //=========================

    public Horario(int id,
                   DiaSemana dia,
                   LocalTime horaInicio,
                   LocalTime horaFin) {

        this.id = id;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;

    }

    //=========================
    // GETTERS
    //=========================

    public int getId() {
        return id;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    //=========================
    // SETTERS
    //=========================

    public void setId(int id) {
        this.id = id;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    // MÉTODOS

    @Override
    public String toString() {

        return dia + "  " + horaInicio + " - " + horaFin;

    }



	
}
