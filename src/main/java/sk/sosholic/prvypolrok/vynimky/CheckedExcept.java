package sk.sosholic.prvypolrok.vynimky;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.io.*;

public class CheckedExcept {
    public static void main(String[] args) {

    }

    public static void nacitatSubor(){

        try{
            BufferedReader buffedReader = new BufferedReader(new FileReader("text.txt"));
        }catch (FileNotFoundException exception){
            System.out.println("subor nenajdeny zadaj spravnu cestu k suboru");

        }
         //   BufferedReader.readLine();

    }


    public static void uloha1() {
        SQLException sqlException = new SQLException("nejaka sql chyba");

        try {
            throw sqlException;
        }catch (SQLException ex){
            System.out.println("NEVIM");
        }


    }

    public static void uloha2() throws IOException {
        URL url = new URL("http");

        URLConnection connection = url.openConnection();

        connection.connect();
    }
}
