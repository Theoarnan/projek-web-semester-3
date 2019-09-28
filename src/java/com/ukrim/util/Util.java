/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ukrim.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author harokidz
 */
public class Util {
    public static String konversiTanggal(String tanggal) throws ParseException{
        final String OLD_FORMAT = "yyyy-MM-dd";
        final String NEW_FORMAT = "dd MMMM, yyyy";
        
        String oldDateString = tanggal;
        String newDateString;
        
        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
        Date d = sdf.parse(oldDateString);
        sdf.applyPattern(NEW_FORMAT);
        newDateString = sdf.format(d);
        return newDateString;
    }
    public static String konversiGendre(String gendre) {
	if (gendre.equalsIgnoreCase("L")) {
	    return "Laki-Laki";
	}
	return "Perempuan";
    }
}
