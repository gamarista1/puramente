package com.google.firebase.installations;

import android.text.TextUtils;
import com.revenuecat.purchases.common.Constants;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kc.C5066d;
import mc.C5101a;
import mc.C5102b;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final long f57380b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f57381c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static i f57382d;

    /* renamed from: a  reason: collision with root package name */
    private final C5101a f57383a;

    private i(C5101a aVar) {
        this.f57383a = aVar;
    }

    public static i c() {
        return d(C5102b.a());
    }

    public static i d(C5101a aVar) {
        if (f57382d == null) {
            f57382d = new i(aVar);
        }
        return f57382d;
    }

    static boolean g(String str) {
        return f57381c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
    }

    public long a() {
        return this.f57383a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(C5066d dVar) {
        if (!TextUtils.isEmpty(dVar.b()) && dVar.h() + dVar.c() >= b() + f57380b) {
            return false;
        }
        return true;
    }
}
