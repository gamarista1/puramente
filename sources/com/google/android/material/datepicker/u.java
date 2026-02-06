package com.google.android.material.datepicker;

import Ua.h;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

abstract class u {

    /* renamed from: a  reason: collision with root package name */
    static AtomicReference f55935a = new AtomicReference();

    static long a(long j10) {
        Calendar l10 = l();
        l10.setTimeInMillis(j10);
        return e(l10).getTimeInMillis();
    }

    static DateFormat b(Locale locale) {
        return d("MMMd", locale);
    }

    static DateFormat c(Locale locale) {
        return d("MMMEd", locale);
    }

    private static DateFormat d(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(k());
        return instanceForSkeleton;
    }

    static Calendar e(Calendar calendar) {
        Calendar m10 = m(calendar);
        Calendar l10 = l();
        l10.set(m10.get(1), m10.get(2), m10.get(5));
        return l10;
    }

    static SimpleDateFormat f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(i());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static String g(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(h.f52879C);
        String string2 = resources.getString(h.f52878B);
        String string3 = resources.getString(h.f52877A);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    static t h() {
        t tVar = (t) f55935a.get();
        if (tVar == null) {
            return t.c();
        }
        return tVar;
    }

    private static TimeZone i() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar j() {
        Calendar a10 = h().a();
        a10.set(11, 0);
        a10.set(12, 0);
        a10.set(13, 0);
        a10.set(14, 0);
        a10.setTimeZone(i());
        return a10;
    }

    private static android.icu.util.TimeZone k() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar l() {
        return m((Calendar) null);
    }

    static Calendar m(Calendar calendar) {
        Calendar instance = Calendar.getInstance(i());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    static DateFormat n(Locale locale) {
        return d("yMMMd", locale);
    }

    static DateFormat o(Locale locale) {
        return d("yMMMEd", locale);
    }
}
