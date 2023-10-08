package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EpamEmailValidation {
    public static boolean validateEpamEmail(String email) {
        String regex = "^[a-zA-Z]+[_]+[a-zA-Z0-9]+@epam.com$";
        Pattern p = Pattern.compile(regex);
        // Если строка пустая, то вернуть ноль
        // вернуть false
        if (email == null) {
            return false;
        }
        // Pattern class содержит matcher() метод
        Matcher m = p.matcher(email);
        return m.matches();
    }



