package yg;

import yg.C6805d;

/* renamed from: yg.c  reason: case insensitive filesystem */
public abstract class C6804c {

    /* renamed from: yg.c$a */
    public static final class a extends C6804c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f73905a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final int f73906b;

        static {
            C6805d.a aVar = C6805d.f73908c;
            f73906b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        public int a() {
            return f73906b;
        }
    }

    /* renamed from: yg.c$b */
    public static final class b extends C6804c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f73907a = new b();

        private b() {
        }

        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
