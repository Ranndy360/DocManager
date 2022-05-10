package com.sv.utec.docmanager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Toolkit {

    public static String formatoFecha(String fechaStr,String  formato) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(formato);
        Date fecha  = formatter.parse(fechaStr);
        return formatter.format(fecha);
    }

    public static String fechaHoy(Date fechaStr) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return formatter.format(fechaStr);
    }

    public static String codigo(){
        // Los caracteres de interés en un array de char.
        char [] chars = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
        // Longitud del array de char.
        int charsLength = chars.length;
        // Instanciamos la clase Random
        Random random = new Random();
        // Un StringBuffer para componer la cadena aleatoria de forma eficiente
        StringBuffer buffer = new StringBuffer();
        // Bucle para elegir una cadena de 10 caracteres al azar
        for (int i=0;i<10;i++){
            // Añadimos al buffer un caracter al azar del array
            buffer.append(chars[random.nextInt(charsLength)]);
        }
        // Y solo nos queda hacer algo con la cadena
        return buffer.toString();
    }

}
