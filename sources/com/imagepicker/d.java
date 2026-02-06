package com.imagepicker;

import android.util.Log;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    protected String f59110a;

    /* renamed from: b  reason: collision with root package name */
    protected int f59111b;

    /* renamed from: c  reason: collision with root package name */
    protected int f59112c;

    d() {
    }

    /* access modifiers changed from: protected */
    public String a(String str, String str2) {
        try {
            Locale locale = Locale.US;
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_ISO8601, locale);
            if (parse != null) {
                return simpleDateFormat.format(parse);
            }
            return null;
        } catch (Exception e10) {
            Log.e("RNIP", "Could not parse image datetime to UTC: " + e10.getMessage());
            return null;
        }
    }
}
