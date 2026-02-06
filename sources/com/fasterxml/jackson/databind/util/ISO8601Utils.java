package com.fasterxml.jackson.databind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    @Deprecated
    private static final String GMT_ID = "GMT";
    @Deprecated
    private static final TimeZone TIMEZONE_GMT = TimeZone.getTimeZone(GMT_ID);
    private static final TimeZone TIMEZONE_UTC;
    private static final TimeZone TIMEZONE_Z;
    private static final String UTC_ID = "UTC";

    static {
        TimeZone timeZone = TimeZone.getTimeZone(UTC_ID);
        TIMEZONE_UTC = timeZone;
        TIMEZONE_Z = timeZone;
    }

    private static boolean checkOffset(String str, int i10, char c10) {
        if (i10 >= str.length() || str.charAt(i10) != c10) {
            return false;
        }
        return true;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
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

    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) {
        /*
            r1 = r19
            r2 = r20
            int r0 = r20.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r3 = r0 + 4
            int r4 = parseInt(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r5 = 45
            boolean r6 = checkOffset(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r7 = 5
            if (r6 == 0) goto L_0x0019
            int r3 = r0 + 5
        L_0x0019:
            int r0 = r3 + 2
            int r6 = parseInt(r1, r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            boolean r8 = checkOffset(r1, r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r8 == 0) goto L_0x0027
            int r0 = r3 + 3
        L_0x0027:
            int r3 = r0 + 2
            int r8 = parseInt(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r9 = 84
            boolean r9 = checkOffset(r1, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r10 = 1
            if (r9 != 0) goto L_0x0053
            int r11 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r11 > r3) goto L_0x0053
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r6 = r6 - r10
            r0.<init>(r4, r6, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.util.Date r0 = r0.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            return r0
        L_0x004a:
            r0 = move-exception
            goto L_0x01b6
        L_0x004d:
            r0 = move-exception
            goto L_0x01b6
        L_0x0050:
            r0 = move-exception
            goto L_0x01b6
        L_0x0053:
            r11 = 43
            r12 = 90
            r13 = 0
            r14 = 2
            if (r9 == 0) goto L_0x00d8
            int r3 = r0 + 3
            int r9 = r0 + 5
            int r3 = parseInt(r1, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r15 = 58
            boolean r16 = checkOffset(r1, r9, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r16 == 0) goto L_0x006d
            int r9 = r0 + 6
        L_0x006d:
            int r0 = r9 + 2
            int r16 = parseInt(r1, r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            boolean r15 = checkOffset(r1, r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r15 == 0) goto L_0x007c
            int r9 = r9 + 3
            r0 = r9
        L_0x007c:
            int r9 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r9 <= r0) goto L_0x00ce
            char r9 = r1.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r9 == r12) goto L_0x00ce
            if (r9 == r11) goto L_0x00ce
            if (r9 == r5) goto L_0x00ce
            int r9 = r0 + 2
            int r15 = parseInt(r1, r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r7 = 59
            if (r15 <= r7) goto L_0x009c
            r7 = 63
            if (r15 >= r7) goto L_0x009c
            r15 = 59
        L_0x009c:
            r7 = 46
            boolean r7 = checkOffset(r1, r9, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r7 == 0) goto L_0x00c8
            int r7 = r0 + 3
            int r9 = r0 + 4
            int r9 = indexOfNonDigit(r1, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r0 = r0 + 6
            int r0 = java.lang.Math.min(r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r17 = parseInt(r1, r7, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r0 = r0 - r7
            if (r0 == r10) goto L_0x00bf
            if (r0 == r14) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            int r17 = r17 * 10
            goto L_0x00c1
        L_0x00bf:
            int r17 = r17 * 100
        L_0x00c1:
            r0 = r3
            r3 = r9
            r7 = r16
            r9 = r17
            goto L_0x00dc
        L_0x00c8:
            r0 = r3
            r3 = r9
            r9 = r13
            r7 = r16
            goto L_0x00dc
        L_0x00ce:
            r9 = r13
            r15 = r9
            r7 = r16
            r18 = r3
            r3 = r0
            r0 = r18
            goto L_0x00dc
        L_0x00d8:
            r0 = r13
            r7 = r0
            r9 = r7
            r15 = r9
        L_0x00dc:
            int r14 = r19.length()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r14 <= r3) goto L_0x01ae
            char r14 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r14 != r12) goto L_0x00ed
            java.util.TimeZone r5 = TIMEZONE_Z     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r3 = r3 + r10
            goto L_0x017d
        L_0x00ed:
            if (r14 == r11) goto L_0x010e
            if (r14 != r5) goto L_0x00f2
            goto L_0x010e
        L_0x00f2:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.append(r14)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
        L_0x010e:
            java.lang.String r5 = r1.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r11 = r5.length()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r3 = r3 + r11
            java.lang.String r11 = "+0000"
            boolean r11 = r11.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r11 != 0) goto L_0x017b
            java.lang.String r11 = "+00:00"
            boolean r11 = r11.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r11 == 0) goto L_0x0128
            goto L_0x017b
        L_0x0128:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r11.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r12 = "GMT"
            r11.append(r12)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r11.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r5 = r11.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r12 = r11.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            boolean r14 = r12.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r14 != 0) goto L_0x0179
            java.lang.String r14 = ":"
            java.lang.String r10 = ""
            java.lang.String r10 = r12.replace(r14, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            boolean r10 = r10.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            if (r10 == 0) goto L_0x0156
            goto L_0x0179
        L_0x0156:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r4 = r11.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
        L_0x0179:
            r5 = r11
            goto L_0x017d
        L_0x017b:
            java.util.TimeZone r5 = TIMEZONE_Z     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
        L_0x017d:
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r10.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r10.setLenient(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r5 = 1
            r10.set(r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            int r6 = r6 - r5
            r4 = 2
            r10.set(r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r4 = 5
            r10.set(r4, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r4 = 11
            r10.set(r4, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0 = 12
            r10.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0 = 13
            r10.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r0 = 14
            r10.set(r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.util.Date r0 = r10.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            return r0
        L_0x01ae:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, IllegalArgumentException -> 0x004a }
        L_0x01b6:
            if (r1 != 0) goto L_0x01ba
            r1 = 0
            goto L_0x01ce
        L_0x01ba:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01ce:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01da
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01f8
        L_0x01da:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x01f8:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = ": "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r20.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
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

    @Deprecated
    public static TimeZone timeZoneGMT() {
        return TIMEZONE_GMT;
    }

    public static String format(Date date, boolean z10) {
        return format(date, z10, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z10 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb2, gregorianCalendar.get(1), 4);
        char c10 = '-';
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
        if (z10) {
            sb2.append('.');
            padInt(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int abs = Math.abs(i10 / 60);
            int abs2 = Math.abs(i10 % 60);
            if (offset >= 0) {
                c10 = '+';
            }
            sb2.append(c10);
            padInt(sb2, abs, 2);
            sb2.append(':');
            padInt(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }
}
