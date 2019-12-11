package com.cursmysql;

import java.sql.*;

public class STudent {
    private String nrMatricol;
    private String nume;
    private String prenume;
    private String cnp;
    private String dataNasterii;

    public STudent(String nrMatricol, String nume, String prenume, String cnp, String dataNasterii) {
        this.nrMatricol = nrMatricol;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.dataNasterii = dataNasterii;
    }

    public String getNrMatricol() {
        return nrMatricol;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }
    public static void showStudents(){
        String sql= "SELECT * FROM studenti";
        Connection connection = DBCOnnector.getConnection();
        Statement statement;
        ResultSet result;
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()) {
                Integer id = result.getInt(1);
                String nrMatricol = result.getString(2);
                String nume = result.getString(3);
                String prenume = result.getString(4);
                ++count;
                System.out.println("Student:Nr - " + count + " ID:" + id + " Nr.Matricol: " + nrMatricol + " Nume:" + nume + " Prenume" + prenume);
            }
        } catch (SQLException e) {
            System.err.println("Querry error");
        }
        catch (NullPointerException e){
            System.err.println("Element not found");
        }

    }
}
