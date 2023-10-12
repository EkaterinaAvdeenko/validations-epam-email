package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EpamEmailValidation {
    public static boolean validateEpamEmail(String email) {
        String regex = "^[a-zA-Z]+[_]+[a-zA-Z0-9]+@epam.com$";
        Pattern p = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();
    }



