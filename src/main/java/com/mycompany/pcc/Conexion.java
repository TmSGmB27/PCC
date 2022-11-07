
package com.mycompany.pcc;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;
    private static Conexion con;

    private Conexion(Connection conectar, String BD, String usuario, String contra) {
        this.conectar = conectar;
        this.BD = BD;
        this.usuario = usuario;
        this.contra = contra;
    }

    private Conexion() {
        this.conectar = null;
        this.BD = "bd_bonill";
        this.usuario = "postgres";
        this.contra = "123456";
    }

    public void conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            this.BD = "jdbc:postgresql://ec2-44-195-132-31.compute-1.amazonaws.com:5432/d44ntcnisaosui";
            this.usuario = "rllwzpqcgrhcrf";
            this.contra = "64140c05e12af530c8f6ad352c820512268c1720f11dbe7f0dc0cb1760fbd909";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contra);
        } catch (ClassNotFoundException | HeadlessException | SQLException e) {

            System.out.println("Error al conectar: " + e);
        }
    }

    public Connection getConexion() {
        return conectar;
    }
    public static Conexion getIntance(){
        if(con==null){
            con=new Conexion();
        }
        return con;
    }



}
