package com.google.firebase.remoteconfig.internal;

import Dc.r;
import Dc.t;
import android.content.SharedPreferences;
import java.util.Date;

public class p {

    /* renamed from: e  reason: collision with root package name */
    static final Date f57890e = new Date(-1);

    /* renamed from: f  reason: collision with root package name */
    static final Date f57891f = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f57892a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f57893b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Object f57894c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Object f57895d = new Object();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f57896a;

        /* renamed from: b  reason: collision with root package name */
        private Date f57897b;

        a(int i10, Date date) {
            this.f57896a = i10;
            this.f57897b = date;
        }

        /* access modifiers changed from: package-private */
        public Date a() {
            return this.f57897b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f57896a;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f57898a;

        /* renamed from: b  reason: collision with root package name */
        private Date f57899b;

        public b(int i10, Date date) {
            this.f57898a = i10;
            this.f57899b = date;
        }

        /* access modifiers changed from: package-private */
        public Date a() {
            return this.f57899b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f57898a;
        }
    }

    public p(SharedPreferences sharedPreferences) {
        this.f57892a = sharedPreferences;
    }

    public void a() {
        synchronized (this.f57893b) {
            this.f57892a.edit().clear().commit();
        }
    }

    /* access modifiers changed from: package-private */
    public a b() {
        a aVar;
        synchronized (this.f57894c) {
            aVar = new a(this.f57892a.getInt("num_failed_fetches", 0), new Date(this.f57892a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    public long c() {
        return this.f57892a.getLong("fetch_timeout_in_seconds", 60);
    }

    public r d() {
        w a10;
        synchronized (this.f57893b) {
            long j10 = this.f57892a.getLong("last_fetch_time_in_millis", -1);
            int i10 = this.f57892a.getInt("last_fetch_status", 0);
            a10 = w.d().c(i10).d(j10).b(new t.b().d(this.f57892a.getLong("fetch_timeout_in_seconds", 60)).e(this.f57892a.getLong("minimum_fetch_interval_in_seconds", m.f57861j)).c()).a();
        }
        return a10;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f57892a.getString("last_fetch_etag", (String) null);
    }

    /* access modifiers changed from: package-private */
    public Date f() {
        return new Date(this.f57892a.getLong("last_fetch_time_in_millis", -1));
    }

    /* access modifiers changed from: package-private */
    public long g() {
        return this.f57892a.getLong("last_template_version", 0);
    }

    public long h() {
        return this.f57892a.getLong("minimum_fetch_interval_in_seconds", m.f57861j);
    }

    public b i() {
        b bVar;
        synchronized (this.f57895d) {
            bVar = new b(this.f57892a.getInt("num_failed_realtime_streams", 0), new Date(this.f57892a.getLong("realtime_backoff_end_time_in_millis", -1)));
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        l(0, f57891f);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        p(0, f57891f);
    }

    /* access modifiers changed from: package-private */
    public void l(int i10, Date date) {
        synchronized (this.f57894c) {
            this.f57892a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void m(t tVar) {
        synchronized (this.f57893b) {
            this.f57892a.edit().putLong("fetch_timeout_in_seconds", tVar.a()).putLong("minimum_fetch_interval_in_seconds", tVar.b()).commit();
        }
    }

    /* access modifiers changed from: package-private */
    public void n(String str) {
        synchronized (this.f57893b) {
            this.f57892a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void o(long j10) {
        synchronized (this.f57893b) {
            this.f57892a.edit().putLong("last_template_version", j10).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i10, Date date) {
        synchronized (this.f57895d) {
            this.f57892a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        synchronized (this.f57893b) {
            this.f57892a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void r(Date date) {
        synchronized (this.f57893b) {
            this.f57892a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        synchronized (this.f57893b) {
            this.f57892a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
