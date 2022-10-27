package com.mycompany.pcc;

import java.io.Serializable;
import java.util.Objects;

public class PersonaDTO implements Serializable {

    private String nombres;
    private String telefono;
    private String correo;
    private String clave;

    public PersonaDTO(String nombres, String telefono, String correo, String clave) {
        this.nombres = nombres;
        this.telefono = telefono;
        this.correo = correo;
        this.clave = clave;
    }

    public PersonaDTO() {
        this.nombres = "";
        this.telefono = "";
        this.correo = "";
        this.clave = "";
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombres
                + "\n telefono= " + telefono
                + "\n correo= " + correo
                + "\n contraseña= " + clave;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombres);
        hash = 97 * hash + Objects.hashCode(this.telefono);
        hash = 97 * hash + Objects.hashCode(this.correo);
        hash = 97 * hash + Objects.hashCode(this.clave);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaDTO other = (PersonaDTO) obj;
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return Objects.equals(this.clave, other.clave);
    }

}
