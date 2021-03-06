package com.foobnix.android.utils;

import java.util.List;

public class TxtUtils {

    public static String nullToEmpty(Object txt) {
        if (txt == null) {
            return "";
        }
        return txt instanceof String ? ((String) txt).trim() : txt.toString();
    }

    public static String nullNullToEmpty(String txt) {
        if (txt == null || txt.trim().equals("null")) {
            return "";
        }
        return txt.trim();
    }

    public static boolean isEmpty(String txt) {
        return txt == null || txt.trim().length() == 0;
    }

    public static boolean isNotEmpty(String txt) {
        return !isEmpty(txt);
    }

    public static String joinList(String delim, List<?> items) {
        if (items == null || items.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object it : items) {
            sb.append(it);
            sb.append(delim);
        }
        String string = sb.toString();
        if (string.length() > 1) {
            return string.substring(0, string.length() - delim.length());
        } else {
            return string;
        }
    }

    public static String join(String delim, Object... items) {
        if (items == null || items.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object it : items) {
            sb.append(it);
            sb.append(delim);
        }
        String string = sb.toString();
        if (string.length() > 1) {
            return string.substring(0, string.length() - delim.length());
        } else {
            return string;
        }
    }

    /**
     * Replace string "My name is @firstName @lastName"
     * 
     * @param str
     * @param keys
     * @return
     */
    public static String format$(String str, Object... keys) {
        if (str == null) {
            return null;
        }
        for (Object key : keys) {
            int start = str.indexOf("$");
            int end = str.indexOf(" ", start);

            if (end == -1) {
                end = str.length();
            }

            String tag = str.substring(start, end);
            str = str.replace(tag, key.toString());
        }
        return str;
    }

}
