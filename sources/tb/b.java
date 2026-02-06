package Tb;

import Ob.l;

public class b implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    private static final b f52502b = new b("[MIN_NAME]");

    /* renamed from: c  reason: collision with root package name */
    private static final b f52503c = new b("[MAX_KEY]");

    /* renamed from: d  reason: collision with root package name */
    private static final b f52504d = new b(".priority");

    /* renamed from: e  reason: collision with root package name */
    private static final b f52505e = new b(".info");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f52506a;

    /* renamed from: Tb.b$b  reason: collision with other inner class name */
    private static class C0805b extends b {

        /* renamed from: f  reason: collision with root package name */
        private final int f52507f;

        C0805b(String str, int i10) {
            super(str);
            this.f52507f = i10;
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return b.super.compareTo((b) obj);
        }

        /* access modifiers changed from: protected */
        public int m() {
            return this.f52507f;
        }

        /* access modifiers changed from: protected */
        public boolean o() {
            return true;
        }

        public String toString() {
            return "IntegerChildName(\"" + this.f52506a + "\")";
        }
    }

    public static b e(String str) {
        Integer k10 = l.k(str);
        if (k10 != null) {
            return new C0805b(str, k10.intValue());
        }
        if (str.equals(".priority")) {
            return f52504d;
        }
        l.f(!str.contains("/"));
        return new b(str);
    }

    public static b f() {
        return f52505e;
    }

    public static b i() {
        return f52503c;
    }

    public static b j() {
        return f52502b;
    }

    public static b l() {
        return f52504d;
    }

    public String b() {
        return this.f52506a;
    }

    /* renamed from: c */
    public int compareTo(b bVar) {
        if (this == bVar) {
            return 0;
        }
        if (this.f52506a.equals("[MIN_NAME]") || bVar.f52506a.equals("[MAX_KEY]")) {
            return -1;
        }
        if (bVar.f52506a.equals("[MIN_NAME]") || this.f52506a.equals("[MAX_KEY]")) {
            return 1;
        }
        if (o()) {
            if (!bVar.o()) {
                return -1;
            }
            int a10 = l.a(m(), bVar.m());
            if (a10 == 0) {
                return l.a(this.f52506a.length(), bVar.f52506a.length());
            }
            return a10;
        } else if (bVar.o()) {
            return 1;
        } else {
            return this.f52506a.compareTo(bVar.f52506a);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f52506a.equals(((b) obj).f52506a);
    }

    public int hashCode() {
        return this.f52506a.hashCode();
    }

    /* access modifiers changed from: protected */
    public int m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean o() {
        return false;
    }

    public boolean p() {
        return equals(f52504d);
    }

    public String toString() {
        return "ChildKey(\"" + this.f52506a + "\")";
    }

    private b(String str) {
        this.f52506a = str;
    }
}
