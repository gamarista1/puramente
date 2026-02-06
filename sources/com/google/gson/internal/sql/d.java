package com.google.gson.internal.sql;

import com.google.gson.internal.bind.c;
import com.google.gson.u;
import java.sql.Date;
import java.sql.Timestamp;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f58344a;

    /* renamed from: b  reason: collision with root package name */
    public static final c.b f58345b;

    /* renamed from: c  reason: collision with root package name */
    public static final c.b f58346c;

    /* renamed from: d  reason: collision with root package name */
    public static final u f58347d;

    /* renamed from: e  reason: collision with root package name */
    public static final u f58348e;

    /* renamed from: f  reason: collision with root package name */
    public static final u f58349f;

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Date d(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    class b extends c.b {
        b(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Timestamp d(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f58344a = z10;
        if (z10) {
            f58345b = new a(Date.class);
            f58346c = new b(Timestamp.class);
            f58347d = a.f58338b;
            f58348e = b.f58340b;
            f58349f = c.f58342b;
            return;
        }
        f58345b = null;
        f58346c = null;
        f58347d = null;
        f58348e = null;
        f58349f = null;
    }
}
