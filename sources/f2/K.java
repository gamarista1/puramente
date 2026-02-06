package f2;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.a;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4771w;
import com.google.common.collect.C4773y;
import i2.L;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public class K {

    /* renamed from: C  reason: collision with root package name */
    public static final K f19794C;

    /* renamed from: D  reason: collision with root package name */
    public static final K f19795D;

    /* renamed from: E  reason: collision with root package name */
    private static final String f19796E = L.y0(1);

    /* renamed from: F  reason: collision with root package name */
    private static final String f19797F = L.y0(2);

    /* renamed from: G  reason: collision with root package name */
    private static final String f19798G = L.y0(3);

    /* renamed from: H  reason: collision with root package name */
    private static final String f19799H = L.y0(4);

    /* renamed from: I  reason: collision with root package name */
    private static final String f19800I = L.y0(5);

    /* renamed from: J  reason: collision with root package name */
    private static final String f19801J = L.y0(6);

    /* renamed from: K  reason: collision with root package name */
    private static final String f19802K = L.y0(7);

    /* renamed from: L  reason: collision with root package name */
    private static final String f19803L = L.y0(8);

    /* renamed from: M  reason: collision with root package name */
    private static final String f19804M = L.y0(9);

    /* renamed from: N  reason: collision with root package name */
    private static final String f19805N = L.y0(10);

    /* renamed from: O  reason: collision with root package name */
    private static final String f19806O = L.y0(11);

    /* renamed from: P  reason: collision with root package name */
    private static final String f19807P = L.y0(12);

    /* renamed from: Q  reason: collision with root package name */
    private static final String f19808Q = L.y0(13);

    /* renamed from: R  reason: collision with root package name */
    private static final String f19809R = L.y0(14);

    /* renamed from: S  reason: collision with root package name */
    private static final String f19810S = L.y0(15);

    /* renamed from: T  reason: collision with root package name */
    private static final String f19811T = L.y0(16);

    /* renamed from: U  reason: collision with root package name */
    private static final String f19812U = L.y0(17);

    /* renamed from: V  reason: collision with root package name */
    private static final String f19813V = L.y0(18);

    /* renamed from: W  reason: collision with root package name */
    private static final String f19814W = L.y0(19);

    /* renamed from: X  reason: collision with root package name */
    private static final String f19815X = L.y0(20);

    /* renamed from: Y  reason: collision with root package name */
    private static final String f19816Y = L.y0(21);

    /* renamed from: Z  reason: collision with root package name */
    private static final String f19817Z = L.y0(22);

    /* renamed from: a0  reason: collision with root package name */
    private static final String f19818a0 = L.y0(23);

    /* renamed from: b0  reason: collision with root package name */
    private static final String f19819b0 = L.y0(24);

    /* renamed from: c0  reason: collision with root package name */
    private static final String f19820c0 = L.y0(25);

    /* renamed from: d0  reason: collision with root package name */
    private static final String f19821d0 = L.y0(26);

    /* renamed from: e0  reason: collision with root package name */
    private static final String f19822e0 = L.y0(27);

    /* renamed from: f0  reason: collision with root package name */
    private static final String f19823f0 = L.y0(28);

    /* renamed from: g0  reason: collision with root package name */
    private static final String f19824g0 = L.y0(29);

    /* renamed from: h0  reason: collision with root package name */
    private static final String f19825h0 = L.y0(30);

    /* renamed from: i0  reason: collision with root package name */
    private static final String f19826i0 = L.y0(31);

    /* renamed from: A  reason: collision with root package name */
    public final C4771w f19827A;

    /* renamed from: B  reason: collision with root package name */
    public final C4773y f19828B;

    /* renamed from: a  reason: collision with root package name */
    public final int f19829a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19830b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19831c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19832d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19833e;

    /* renamed from: f  reason: collision with root package name */
    public final int f19834f;

    /* renamed from: g  reason: collision with root package name */
    public final int f19835g;

    /* renamed from: h  reason: collision with root package name */
    public final int f19836h;

    /* renamed from: i  reason: collision with root package name */
    public final int f19837i;

    /* renamed from: j  reason: collision with root package name */
    public final int f19838j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f19839k;

    /* renamed from: l  reason: collision with root package name */
    public final C4770v f19840l;

    /* renamed from: m  reason: collision with root package name */
    public final int f19841m;

    /* renamed from: n  reason: collision with root package name */
    public final C4770v f19842n;

    /* renamed from: o  reason: collision with root package name */
    public final int f19843o;

    /* renamed from: p  reason: collision with root package name */
    public final int f19844p;

    /* renamed from: q  reason: collision with root package name */
    public final int f19845q;

    /* renamed from: r  reason: collision with root package name */
    public final C4770v f19846r;

    /* renamed from: s  reason: collision with root package name */
    public final b f19847s;

    /* renamed from: t  reason: collision with root package name */
    public final C4770v f19848t;

    /* renamed from: u  reason: collision with root package name */
    public final int f19849u;

    /* renamed from: v  reason: collision with root package name */
    public final int f19850v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f19851w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f19852x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f19853y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f19854z;

    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        public static final b f19855d = new a().d();

        /* renamed from: e  reason: collision with root package name */
        private static final String f19856e = L.y0(1);

        /* renamed from: f  reason: collision with root package name */
        private static final String f19857f = L.y0(2);

        /* renamed from: g  reason: collision with root package name */
        private static final String f19858g = L.y0(3);

        /* renamed from: a  reason: collision with root package name */
        public final int f19859a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f19860b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f19861c;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public int f19862a = 0;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public boolean f19863b = false;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public boolean f19864c = false;

            public b d() {
                return new b(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f19859a == bVar.f19859a && this.f19860b == bVar.f19860b && this.f19861c == bVar.f19861c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f19859a + 31) * 31) + (this.f19860b ? 1 : 0)) * 31) + (this.f19861c ? 1 : 0);
        }

        private b(a aVar) {
            this.f19859a = aVar.f19862a;
            this.f19860b = aVar.f19863b;
            this.f19861c = aVar.f19864c;
        }
    }

    static {
        K C10 = new c().C();
        f19794C = C10;
        f19795D = C10;
    }

    protected K(c cVar) {
        this.f19829a = cVar.f19867a;
        this.f19830b = cVar.f19868b;
        this.f19831c = cVar.f19869c;
        this.f19832d = cVar.f19870d;
        this.f19833e = cVar.f19871e;
        this.f19834f = cVar.f19872f;
        this.f19835g = cVar.f19873g;
        this.f19836h = cVar.f19874h;
        this.f19837i = cVar.f19875i;
        this.f19838j = cVar.f19876j;
        this.f19839k = cVar.f19877k;
        this.f19840l = cVar.f19878l;
        this.f19841m = cVar.f19879m;
        this.f19842n = cVar.f19880n;
        this.f19843o = cVar.f19881o;
        this.f19844p = cVar.f19882p;
        this.f19845q = cVar.f19883q;
        this.f19846r = cVar.f19884r;
        this.f19847s = cVar.f19885s;
        this.f19848t = cVar.f19886t;
        this.f19849u = cVar.f19887u;
        this.f19850v = cVar.f19888v;
        this.f19851w = cVar.f19889w;
        this.f19852x = cVar.f19890x;
        this.f19853y = cVar.f19891y;
        this.f19854z = cVar.f19892z;
        this.f19827A = C4771w.c(cVar.f19865A);
        this.f19828B = C4773y.x(cVar.f19866B);
    }

    public c a() {
        return new c(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        K k10 = (K) obj;
        if (this.f19829a == k10.f19829a && this.f19830b == k10.f19830b && this.f19831c == k10.f19831c && this.f19832d == k10.f19832d && this.f19833e == k10.f19833e && this.f19834f == k10.f19834f && this.f19835g == k10.f19835g && this.f19836h == k10.f19836h && this.f19839k == k10.f19839k && this.f19837i == k10.f19837i && this.f19838j == k10.f19838j && this.f19840l.equals(k10.f19840l) && this.f19841m == k10.f19841m && this.f19842n.equals(k10.f19842n) && this.f19843o == k10.f19843o && this.f19844p == k10.f19844p && this.f19845q == k10.f19845q && this.f19846r.equals(k10.f19846r) && this.f19847s.equals(k10.f19847s) && this.f19848t.equals(k10.f19848t) && this.f19849u == k10.f19849u && this.f19850v == k10.f19850v && this.f19851w == k10.f19851w && this.f19852x == k10.f19852x && this.f19853y == k10.f19853y && this.f19854z == k10.f19854z && this.f19827A.equals(k10.f19827A) && this.f19828B.equals(k10.f19828B)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f19829a + 31) * 31) + this.f19830b) * 31) + this.f19831c) * 31) + this.f19832d) * 31) + this.f19833e) * 31) + this.f19834f) * 31) + this.f19835g) * 31) + this.f19836h) * 31) + (this.f19839k ? 1 : 0)) * 31) + this.f19837i) * 31) + this.f19838j) * 31) + this.f19840l.hashCode()) * 31) + this.f19841m) * 31) + this.f19842n.hashCode()) * 31) + this.f19843o) * 31) + this.f19844p) * 31) + this.f19845q) * 31) + this.f19846r.hashCode()) * 31) + this.f19847s.hashCode()) * 31) + this.f19848t.hashCode()) * 31) + this.f19849u) * 31) + this.f19850v) * 31) + (this.f19851w ? 1 : 0)) * 31) + (this.f19852x ? 1 : 0)) * 31) + (this.f19853y ? 1 : 0)) * 31) + (this.f19854z ? 1 : 0)) * 31) + this.f19827A.hashCode()) * 31) + this.f19828B.hashCode();
    }

    public static class c {
        /* access modifiers changed from: private */

        /* renamed from: A  reason: collision with root package name */
        public HashMap f19865A;
        /* access modifiers changed from: private */

        /* renamed from: B  reason: collision with root package name */
        public HashSet f19866B;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f19867a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f19868b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f19869c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f19870d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f19871e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f19872f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f19873g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f19874h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f19875i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f19876j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f19877k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public C4770v f19878l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public int f19879m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public C4770v f19880n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public int f19881o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f19882p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public int f19883q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public C4770v f19884r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public b f19885s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public C4770v f19886t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public int f19887u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public int f19888v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public boolean f19889w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public boolean f19890x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public boolean f19891y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public boolean f19892z;

        public c() {
            this.f19867a = a.e.API_PRIORITY_OTHER;
            this.f19868b = a.e.API_PRIORITY_OTHER;
            this.f19869c = a.e.API_PRIORITY_OTHER;
            this.f19870d = a.e.API_PRIORITY_OTHER;
            this.f19875i = a.e.API_PRIORITY_OTHER;
            this.f19876j = a.e.API_PRIORITY_OTHER;
            this.f19877k = true;
            this.f19878l = C4770v.E();
            this.f19879m = 0;
            this.f19880n = C4770v.E();
            this.f19881o = 0;
            this.f19882p = a.e.API_PRIORITY_OTHER;
            this.f19883q = a.e.API_PRIORITY_OTHER;
            this.f19884r = C4770v.E();
            this.f19885s = b.f19855d;
            this.f19886t = C4770v.E();
            this.f19887u = 0;
            this.f19888v = 0;
            this.f19889w = false;
            this.f19890x = false;
            this.f19891y = false;
            this.f19892z = false;
            this.f19865A = new HashMap();
            this.f19866B = new HashSet();
        }

        private void E(K k10) {
            this.f19867a = k10.f19829a;
            this.f19868b = k10.f19830b;
            this.f19869c = k10.f19831c;
            this.f19870d = k10.f19832d;
            this.f19871e = k10.f19833e;
            this.f19872f = k10.f19834f;
            this.f19873g = k10.f19835g;
            this.f19874h = k10.f19836h;
            this.f19875i = k10.f19837i;
            this.f19876j = k10.f19838j;
            this.f19877k = k10.f19839k;
            this.f19878l = k10.f19840l;
            this.f19879m = k10.f19841m;
            this.f19880n = k10.f19842n;
            this.f19881o = k10.f19843o;
            this.f19882p = k10.f19844p;
            this.f19883q = k10.f19845q;
            this.f19884r = k10.f19846r;
            this.f19885s = k10.f19847s;
            this.f19886t = k10.f19848t;
            this.f19887u = k10.f19849u;
            this.f19888v = k10.f19850v;
            this.f19889w = k10.f19851w;
            this.f19890x = k10.f19852x;
            this.f19891y = k10.f19853y;
            this.f19892z = k10.f19854z;
            this.f19866B = new HashSet(k10.f19828B);
            this.f19865A = new HashMap(k10.f19827A);
        }

        public K C() {
            return new K(this);
        }

        public c D(int i10) {
            Iterator it = this.f19865A.values().iterator();
            while (it.hasNext()) {
                if (((J) it.next()).a() == i10) {
                    it.remove();
                }
            }
            return this;
        }

        /* access modifiers changed from: protected */
        public c F(K k10) {
            E(k10);
            return this;
        }

        public c G(int i10) {
            this.f19888v = i10;
            return this;
        }

        public c H(J j10) {
            D(j10.a());
            this.f19865A.put(j10.f19792a, j10);
            return this;
        }

        public c I(Context context) {
            CaptioningManager captioningManager;
            if ((L.f22072a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f19887u = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f19886t = C4770v.H(L.Y(locale));
                }
            }
            return this;
        }

        public c J(int i10, boolean z10) {
            if (z10) {
                this.f19866B.add(Integer.valueOf(i10));
            } else {
                this.f19866B.remove(Integer.valueOf(i10));
            }
            return this;
        }

        public c K(int i10, int i11, boolean z10) {
            this.f19875i = i10;
            this.f19876j = i11;
            this.f19877k = z10;
            return this;
        }

        public c L(Context context, boolean z10) {
            Point P10 = L.P(context);
            return K(P10.x, P10.y, z10);
        }

        public c(Context context) {
            this();
            I(context);
            L(context, true);
        }

        protected c(K k10) {
            E(k10);
        }
    }
}
