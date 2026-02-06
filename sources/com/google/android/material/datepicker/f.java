package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

abstract class f {
    static String a(long j10) {
        return b(j10, (SimpleDateFormat) null);
    }

    static String b(long j10, SimpleDateFormat simpleDateFormat) {
        Calendar j11 = u.j();
        Calendar l10 = u.l();
        l10.setTimeInMillis(j10);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j10));
        }
        if (j11.get(1) == l10.get(1)) {
            return c(j10);
        }
        return h(j10);
    }

    static String c(long j10) {
        return d(j10, Locale.getDefault());
    }

    static String d(long j10, Locale locale) {
        return u.b(locale).format(new Date(j10));
    }

    static String e(long j10) {
        return f(j10, Locale.getDefault());
    }

    static String f(long j10, Locale locale) {
        return u.c(locale).format(new Date(j10));
    }

    static String g(long j10) {
        return DateUtils.formatDateTime((Context) null, j10, 8228);
    }

    static String h(long j10) {
        return i(j10, Locale.getDefault());
    }

    static String i(long j10, Locale locale) {
        return u.n(locale).format(new Date(j10));
    }

    static String j(long j10) {
        return k(j10, Locale.getDefault());
    }

    static String k(long j10, Locale locale) {
        return u.o(locale).format(new Date(j10));
    }
}
