package com.facebook.react.common.mapbuffer;

import Ef.i;
import sf.C6714a;
import zf.C6828a;

public interface a extends Iterable, C6828a {

    /* renamed from: U  reason: collision with root package name */
    public static final C0636a f40614U = C0636a.f40615a;

    /* renamed from: com.facebook.react.common.mapbuffer.a$a  reason: collision with other inner class name */
    public static final class C0636a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0636a f40615a = new C0636a();

        /* renamed from: b  reason: collision with root package name */
        private static final i f40616b = new i(0, 65535);

        private C0636a() {
        }

        public final i a() {
            return f40616b;
        }
    }

    public enum b {
        BOOL,
        INT,
        DOUBLE,
        STRING,
        MAP,
        LONG;

        static {
            b[] a10;
            f40624h = C6714a.a(a10);
        }
    }

    public interface c {
        long a();

        int b();

        double c();

        String d();

        a e();

        boolean f();

        int getKey();

        b getType();
    }

    a F(int i10);

    boolean getBoolean(int i10);

    int getCount();

    double getDouble(int i10);

    int getInt(int i10);

    String getString(int i10);

    boolean p(int i10);
}
