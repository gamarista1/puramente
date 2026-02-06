package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.common.Constants;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(String str, int i10, char c10) {
        if (i10 >= str.length() || str.charAt(i10) != c10) {
            return false;
        }
        return true;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(24);
        padInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        padInt(sb2, gregorianCalendar.get(14), 3);
        sb2.append('Z');
        return sb2.toString();
    }

    private static int indexOfNonDigit(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i10, int i11) {
        String num = Integer.toString(i10);
        for (int length = i11 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    public static Date parse(String str) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TimeZone timeZone;
        char charAt;
        String str2 = str;
        int i15 = 4;
        try {
            int parseInt = parseInt(str2, 0, 4);
            if (checkOffset(str2, 4, '-')) {
                i15 = 5;
            }
            int i16 = i15 + 2;
            int parseInt2 = parseInt(str2, i15, i16);
            if (checkOffset(str2, i16, '-')) {
                i16 = i15 + 3;
            }
            int i17 = i16 + 2;
            int parseInt3 = parseInt(str2, i16, i17);
            boolean checkOffset = checkOffset(str2, i17, 'T');
            if (!checkOffset && str.length() <= i17) {
                return new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3).getTime();
            }
            if (checkOffset) {
                int i18 = i16 + 5;
                int parseInt4 = parseInt(str2, i16 + 3, i18);
                if (checkOffset(str2, i18, ':')) {
                    i18 = i16 + 6;
                }
                int i19 = i18 + 2;
                i11 = parseInt(str2, i18, i19);
                if (checkOffset(str2, i19, ':')) {
                    i19 = i18 + 3;
                }
                if (str.length() <= i19 || (charAt = str2.charAt(i19)) == 'Z' || charAt == '+' || charAt == '-') {
                    i10 = parseInt;
                    i14 = parseInt4;
                    i17 = i19;
                    i13 = 0;
                    i12 = 0;
                } else {
                    int i20 = i19 + 2;
                    i12 = parseInt(str2, i19, i20);
                    if (i12 > 59 && i12 < 63) {
                        i12 = 59;
                    }
                    if (checkOffset(str2, i20, '.')) {
                        int i21 = i19 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str2, i19 + 4);
                        int min = Math.min(indexOfNonDigit, i19 + 6);
                        i10 = parseInt;
                        i13 = (int) (Math.pow(10.0d, (double) (3 - (min - i21))) * ((double) parseInt(str2, i21, min)));
                        i14 = parseInt4;
                        i17 = indexOfNonDigit;
                    } else {
                        i10 = parseInt;
                        i14 = parseInt4;
                        i17 = i20;
                        i13 = 0;
                    }
                }
            } else {
                i10 = parseInt;
                i14 = 0;
                i13 = 0;
                i12 = 0;
                i11 = 0;
            }
            if (str.length() > i17) {
                char charAt2 = str2.charAt(i17);
                if (charAt2 == 'Z') {
                    timeZone = TIMEZONE_Z;
                } else {
                    if (charAt2 != '+') {
                        if (charAt2 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                        }
                    }
                    String substring = str2.substring(i17);
                    if (!"+0000".equals(substring)) {
                        if (!"+00:00".equals(substring)) {
                            String str3 = GMT_ID + substring;
                            TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                            String id2 = timeZone2.getID();
                            if (!id2.equals(str3)) {
                                if (!id2.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "").equals(str3)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                                }
                            }
                            timeZone = timeZone2;
                        }
                    }
                    timeZone = TIMEZONE_Z;
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i10);
                gregorianCalendar.set(2, parseInt2 - 1);
                gregorianCalendar.set(5, parseInt3);
                gregorianCalendar.set(11, i14);
                gregorianCalendar.set(12, i11);
                gregorianCalendar.set(13, i12);
                gregorianCalendar.set(14, i13);
                return gregorianCalendar.getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new SerializationException("Not an RFC 3339 date: " + str2, e);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new SerializationException("Not an RFC 3339 date: " + str2, e);
        }
    }

    private static int parseInt(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit >= 0) {
                i12 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 >= 0) {
                i12 = (i12 * 10) - digit2;
                i13 = i14;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
        }
        return -i12;
    }
}
