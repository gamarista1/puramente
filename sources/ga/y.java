package ga;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.a;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4771w;
import com.google.common.collect.C4773y;
import ja.C3645a;
import ja.C3647c;
import ja.M;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import k9.C3700i;
import nb.C5114i;

public class y implements C3700i {

    /* renamed from: A  reason: collision with root package name */
    public static final y f43918A;

    /* renamed from: B  reason: collision with root package name */
    public static final y f43919B;

    /* renamed from: C  reason: collision with root package name */
    public static final C3700i.a f43920C = new x();

    /* renamed from: a  reason: collision with root package name */
    public final int f43921a;

    /* renamed from: b  reason: collision with root package name */
    public final int f43922b;

    /* renamed from: c  reason: collision with root package name */
    public final int f43923c;

    /* renamed from: d  reason: collision with root package name */
    public final int f43924d;

    /* renamed from: e  reason: collision with root package name */
    public final int f43925e;

    /* renamed from: f  reason: collision with root package name */
    public final int f43926f;

    /* renamed from: g  reason: collision with root package name */
    public final int f43927g;

    /* renamed from: h  reason: collision with root package name */
    public final int f43928h;

    /* renamed from: i  reason: collision with root package name */
    public final int f43929i;

    /* renamed from: j  reason: collision with root package name */
    public final int f43930j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f43931k;

    /* renamed from: l  reason: collision with root package name */
    public final C4770v f43932l;

    /* renamed from: m  reason: collision with root package name */
    public final int f43933m;

    /* renamed from: n  reason: collision with root package name */
    public final C4770v f43934n;

    /* renamed from: o  reason: collision with root package name */
    public final int f43935o;

    /* renamed from: p  reason: collision with root package name */
    public final int f43936p;

    /* renamed from: q  reason: collision with root package name */
    public final int f43937q;

    /* renamed from: r  reason: collision with root package name */
    public final C4770v f43938r;

    /* renamed from: s  reason: collision with root package name */
    public final C4770v f43939s;

    /* renamed from: t  reason: collision with root package name */
    public final int f43940t;

    /* renamed from: u  reason: collision with root package name */
    public final int f43941u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f43942v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f43943w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f43944x;

    /* renamed from: y  reason: collision with root package name */
    public final C4771w f43945y;

    /* renamed from: z  reason: collision with root package name */
    public final C4773y f43946z;

    static {
        y A10 = new a().A();
        f43918A = A10;
        f43919B = A10;
    }

    protected y(a aVar) {
        this.f43921a = aVar.f43947a;
        this.f43922b = aVar.f43948b;
        this.f43923c = aVar.f43949c;
        this.f43924d = aVar.f43950d;
        this.f43925e = aVar.f43951e;
        this.f43926f = aVar.f43952f;
        this.f43927g = aVar.f43953g;
        this.f43928h = aVar.f43954h;
        this.f43929i = aVar.f43955i;
        this.f43930j = aVar.f43956j;
        this.f43931k = aVar.f43957k;
        this.f43932l = aVar.f43958l;
        this.f43933m = aVar.f43959m;
        this.f43934n = aVar.f43960n;
        this.f43935o = aVar.f43961o;
        this.f43936p = aVar.f43962p;
        this.f43937q = aVar.f43963q;
        this.f43938r = aVar.f43964r;
        this.f43939s = aVar.f43965s;
        this.f43940t = aVar.f43966t;
        this.f43941u = aVar.f43967u;
        this.f43942v = aVar.f43968v;
        this.f43943w = aVar.f43969w;
        this.f43944x = aVar.f43970x;
        this.f43945y = C4771w.c(aVar.f43971y);
        this.f43946z = C4773y.x(aVar.f43972z);
    }

    public static y a(Bundle bundle) {
        return new a(bundle).A();
    }

    protected static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f43921a == yVar.f43921a && this.f43922b == yVar.f43922b && this.f43923c == yVar.f43923c && this.f43924d == yVar.f43924d && this.f43925e == yVar.f43925e && this.f43926f == yVar.f43926f && this.f43927g == yVar.f43927g && this.f43928h == yVar.f43928h && this.f43931k == yVar.f43931k && this.f43929i == yVar.f43929i && this.f43930j == yVar.f43930j && this.f43932l.equals(yVar.f43932l) && this.f43933m == yVar.f43933m && this.f43934n.equals(yVar.f43934n) && this.f43935o == yVar.f43935o && this.f43936p == yVar.f43936p && this.f43937q == yVar.f43937q && this.f43938r.equals(yVar.f43938r) && this.f43939s.equals(yVar.f43939s) && this.f43940t == yVar.f43940t && this.f43941u == yVar.f43941u && this.f43942v == yVar.f43942v && this.f43943w == yVar.f43943w && this.f43944x == yVar.f43944x && this.f43945y.equals(yVar.f43945y) && this.f43946z.equals(yVar.f43946z)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f43921a + 31) * 31) + this.f43922b) * 31) + this.f43923c) * 31) + this.f43924d) * 31) + this.f43925e) * 31) + this.f43926f) * 31) + this.f43927g) * 31) + this.f43928h) * 31) + (this.f43931k ? 1 : 0)) * 31) + this.f43929i) * 31) + this.f43930j) * 31) + this.f43932l.hashCode()) * 31) + this.f43933m) * 31) + this.f43934n.hashCode()) * 31) + this.f43935o) * 31) + this.f43936p) * 31) + this.f43937q) * 31) + this.f43938r.hashCode()) * 31) + this.f43939s.hashCode()) * 31) + this.f43940t) * 31) + this.f43941u) * 31) + (this.f43942v ? 1 : 0)) * 31) + (this.f43943w ? 1 : 0)) * 31) + (this.f43944x ? 1 : 0)) * 31) + this.f43945y.hashCode()) * 31) + this.f43946z.hashCode();
    }

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f43947a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f43948b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f43949c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f43950d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f43951e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f43952f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f43953g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f43954h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f43955i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f43956j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f43957k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public C4770v f43958l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public int f43959m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public C4770v f43960n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public int f43961o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f43962p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public int f43963q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public C4770v f43964r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public C4770v f43965s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public int f43966t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public int f43967u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public boolean f43968v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public boolean f43969w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public boolean f43970x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public HashMap f43971y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public HashSet f43972z;

        public a() {
            this.f43947a = a.e.API_PRIORITY_OTHER;
            this.f43948b = a.e.API_PRIORITY_OTHER;
            this.f43949c = a.e.API_PRIORITY_OTHER;
            this.f43950d = a.e.API_PRIORITY_OTHER;
            this.f43955i = a.e.API_PRIORITY_OTHER;
            this.f43956j = a.e.API_PRIORITY_OTHER;
            this.f43957k = true;
            this.f43958l = C4770v.E();
            this.f43959m = 0;
            this.f43960n = C4770v.E();
            this.f43961o = 0;
            this.f43962p = a.e.API_PRIORITY_OTHER;
            this.f43963q = a.e.API_PRIORITY_OTHER;
            this.f43964r = C4770v.E();
            this.f43965s = C4770v.E();
            this.f43966t = 0;
            this.f43967u = 0;
            this.f43968v = false;
            this.f43969w = false;
            this.f43970x = false;
            this.f43971y = new HashMap();
            this.f43972z = new HashSet();
        }

        private void B(y yVar) {
            this.f43947a = yVar.f43921a;
            this.f43948b = yVar.f43922b;
            this.f43949c = yVar.f43923c;
            this.f43950d = yVar.f43924d;
            this.f43951e = yVar.f43925e;
            this.f43952f = yVar.f43926f;
            this.f43953g = yVar.f43927g;
            this.f43954h = yVar.f43928h;
            this.f43955i = yVar.f43929i;
            this.f43956j = yVar.f43930j;
            this.f43957k = yVar.f43931k;
            this.f43958l = yVar.f43932l;
            this.f43959m = yVar.f43933m;
            this.f43960n = yVar.f43934n;
            this.f43961o = yVar.f43935o;
            this.f43962p = yVar.f43936p;
            this.f43963q = yVar.f43937q;
            this.f43964r = yVar.f43938r;
            this.f43965s = yVar.f43939s;
            this.f43966t = yVar.f43940t;
            this.f43967u = yVar.f43941u;
            this.f43968v = yVar.f43942v;
            this.f43969w = yVar.f43943w;
            this.f43970x = yVar.f43944x;
            this.f43972z = new HashSet(yVar.f43946z);
            this.f43971y = new HashMap(yVar.f43945y);
        }

        private static C4770v C(String[] strArr) {
            C4770v.a t10 = C4770v.t();
            for (String e10 : (String[]) C3645a.e(strArr)) {
                t10.a(M.E0((String) C3645a.e(e10)));
            }
            return t10.k();
        }

        private void F(Context context) {
            CaptioningManager captioningManager;
            if ((M.f44981a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f43966t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f43965s = C4770v.H(M.Y(locale));
                }
            }
        }

        public y A() {
            return new y(this);
        }

        /* access modifiers changed from: protected */
        public a D(y yVar) {
            B(yVar);
            return this;
        }

        public a E(Context context) {
            if (M.f44981a >= 19) {
                F(context);
            }
            return this;
        }

        public a G(int i10, int i11, boolean z10) {
            this.f43955i = i10;
            this.f43956j = i11;
            this.f43957k = z10;
            return this;
        }

        public a H(Context context, boolean z10) {
            Point O10 = M.O(context);
            return G(O10.x, O10.y, z10);
        }

        public a(Context context) {
            this();
            E(context);
            H(context, true);
        }

        protected a(y yVar) {
            B(yVar);
        }

        protected a(Bundle bundle) {
            C4770v vVar;
            String b10 = y.b(6);
            y yVar = y.f43918A;
            this.f43947a = bundle.getInt(b10, yVar.f43921a);
            this.f43948b = bundle.getInt(y.b(7), yVar.f43922b);
            this.f43949c = bundle.getInt(y.b(8), yVar.f43923c);
            this.f43950d = bundle.getInt(y.b(9), yVar.f43924d);
            this.f43951e = bundle.getInt(y.b(10), yVar.f43925e);
            this.f43952f = bundle.getInt(y.b(11), yVar.f43926f);
            this.f43953g = bundle.getInt(y.b(12), yVar.f43927g);
            this.f43954h = bundle.getInt(y.b(13), yVar.f43928h);
            this.f43955i = bundle.getInt(y.b(14), yVar.f43929i);
            this.f43956j = bundle.getInt(y.b(15), yVar.f43930j);
            this.f43957k = bundle.getBoolean(y.b(16), yVar.f43931k);
            this.f43958l = C4770v.A((String[]) C5114i.a(bundle.getStringArray(y.b(17)), new String[0]));
            this.f43959m = bundle.getInt(y.b(25), yVar.f43933m);
            this.f43960n = C((String[]) C5114i.a(bundle.getStringArray(y.b(1)), new String[0]));
            this.f43961o = bundle.getInt(y.b(2), yVar.f43935o);
            this.f43962p = bundle.getInt(y.b(18), yVar.f43936p);
            this.f43963q = bundle.getInt(y.b(19), yVar.f43937q);
            this.f43964r = C4770v.A((String[]) C5114i.a(bundle.getStringArray(y.b(20)), new String[0]));
            this.f43965s = C((String[]) C5114i.a(bundle.getStringArray(y.b(3)), new String[0]));
            this.f43966t = bundle.getInt(y.b(4), yVar.f43940t);
            this.f43967u = bundle.getInt(y.b(26), yVar.f43941u);
            this.f43968v = bundle.getBoolean(y.b(5), yVar.f43942v);
            this.f43969w = bundle.getBoolean(y.b(21), yVar.f43943w);
            this.f43970x = bundle.getBoolean(y.b(22), yVar.f43944x);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(y.b(23));
            if (parcelableArrayList == null) {
                vVar = C4770v.E();
            } else {
                vVar = C3647c.b(w.f43915c, parcelableArrayList);
            }
            this.f43971y = new HashMap();
            for (int i10 = 0; i10 < vVar.size(); i10++) {
                w wVar = (w) vVar.get(i10);
                this.f43971y.put(wVar.f43916a, wVar);
            }
            int[] iArr = (int[]) C5114i.a(bundle.getIntArray(y.b(24)), new int[0]);
            this.f43972z = new HashSet();
            for (int valueOf : iArr) {
                this.f43972z.add(Integer.valueOf(valueOf));
            }
        }
    }
}
