package h2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import i2.C2076a;
import i2.L;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import nb.k;

/* renamed from: h2.a  reason: case insensitive filesystem */
public final class C2030a {

    /* renamed from: A  reason: collision with root package name */
    private static final String f21170A = L.y0(6);

    /* renamed from: B  reason: collision with root package name */
    private static final String f21171B = L.y0(7);

    /* renamed from: C  reason: collision with root package name */
    private static final String f21172C = L.y0(8);

    /* renamed from: D  reason: collision with root package name */
    private static final String f21173D = L.y0(9);

    /* renamed from: E  reason: collision with root package name */
    private static final String f21174E = L.y0(10);

    /* renamed from: F  reason: collision with root package name */
    private static final String f21175F = L.y0(11);

    /* renamed from: G  reason: collision with root package name */
    private static final String f21176G = L.y0(12);

    /* renamed from: H  reason: collision with root package name */
    private static final String f21177H = L.y0(13);

    /* renamed from: I  reason: collision with root package name */
    private static final String f21178I = L.y0(14);

    /* renamed from: J  reason: collision with root package name */
    private static final String f21179J = L.y0(15);

    /* renamed from: K  reason: collision with root package name */
    private static final String f21180K = L.y0(16);

    /* renamed from: r  reason: collision with root package name */
    public static final C2030a f21181r = new b().o("").a();

    /* renamed from: s  reason: collision with root package name */
    private static final String f21182s = L.y0(0);

    /* renamed from: t  reason: collision with root package name */
    private static final String f21183t = L.y0(17);

    /* renamed from: u  reason: collision with root package name */
    private static final String f21184u = L.y0(1);

    /* renamed from: v  reason: collision with root package name */
    private static final String f21185v = L.y0(2);

    /* renamed from: w  reason: collision with root package name */
    private static final String f21186w = L.y0(3);

    /* renamed from: x  reason: collision with root package name */
    private static final String f21187x = L.y0(18);

    /* renamed from: y  reason: collision with root package name */
    private static final String f21188y = L.y0(4);

    /* renamed from: z  reason: collision with root package name */
    private static final String f21189z = L.y0(5);

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f21190a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f21191b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f21192c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f21193d;

    /* renamed from: e  reason: collision with root package name */
    public final float f21194e;

    /* renamed from: f  reason: collision with root package name */
    public final int f21195f;

    /* renamed from: g  reason: collision with root package name */
    public final int f21196g;

    /* renamed from: h  reason: collision with root package name */
    public final float f21197h;

    /* renamed from: i  reason: collision with root package name */
    public final int f21198i;

    /* renamed from: j  reason: collision with root package name */
    public final float f21199j;

    /* renamed from: k  reason: collision with root package name */
    public final float f21200k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f21201l;

    /* renamed from: m  reason: collision with root package name */
    public final int f21202m;

    /* renamed from: n  reason: collision with root package name */
    public final int f21203n;

    /* renamed from: o  reason: collision with root package name */
    public final float f21204o;

    /* renamed from: p  reason: collision with root package name */
    public final int f21205p;

    /* renamed from: q  reason: collision with root package name */
    public final float f21206q;

    /* renamed from: h2.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f21207a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f21208b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f21209c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f21210d;

        /* renamed from: e  reason: collision with root package name */
        private float f21211e;

        /* renamed from: f  reason: collision with root package name */
        private int f21212f;

        /* renamed from: g  reason: collision with root package name */
        private int f21213g;

        /* renamed from: h  reason: collision with root package name */
        private float f21214h;

        /* renamed from: i  reason: collision with root package name */
        private int f21215i;

        /* renamed from: j  reason: collision with root package name */
        private int f21216j;

        /* renamed from: k  reason: collision with root package name */
        private float f21217k;

        /* renamed from: l  reason: collision with root package name */
        private float f21218l;

        /* renamed from: m  reason: collision with root package name */
        private float f21219m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f21220n;

        /* renamed from: o  reason: collision with root package name */
        private int f21221o;

        /* renamed from: p  reason: collision with root package name */
        private int f21222p;

        /* renamed from: q  reason: collision with root package name */
        private float f21223q;

        public C2030a a() {
            return new C2030a(this.f21207a, this.f21209c, this.f21210d, this.f21208b, this.f21211e, this.f21212f, this.f21213g, this.f21214h, this.f21215i, this.f21216j, this.f21217k, this.f21218l, this.f21219m, this.f21220n, this.f21221o, this.f21222p, this.f21223q);
        }

        public b b() {
            this.f21220n = false;
            return this;
        }

        public int c() {
            return this.f21213g;
        }

        public int d() {
            return this.f21215i;
        }

        public CharSequence e() {
            return this.f21207a;
        }

        public b f(Bitmap bitmap) {
            this.f21208b = bitmap;
            return this;
        }

        public b g(float f10) {
            this.f21219m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f21211e = f10;
            this.f21212f = i10;
            return this;
        }

        public b i(int i10) {
            this.f21213g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f21210d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f21214h = f10;
            return this;
        }

        public b l(int i10) {
            this.f21215i = i10;
            return this;
        }

        public b m(float f10) {
            this.f21223q = f10;
            return this;
        }

        public b n(float f10) {
            this.f21218l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f21207a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f21209c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f21217k = f10;
            this.f21216j = i10;
            return this;
        }

        public b r(int i10) {
            this.f21222p = i10;
            return this;
        }

        public b s(int i10) {
            this.f21221o = i10;
            this.f21220n = true;
            return this;
        }

        public b() {
            this.f21207a = null;
            this.f21208b = null;
            this.f21209c = null;
            this.f21210d = null;
            this.f21211e = -3.4028235E38f;
            this.f21212f = Integer.MIN_VALUE;
            this.f21213g = Integer.MIN_VALUE;
            this.f21214h = -3.4028235E38f;
            this.f21215i = Integer.MIN_VALUE;
            this.f21216j = Integer.MIN_VALUE;
            this.f21217k = -3.4028235E38f;
            this.f21218l = -3.4028235E38f;
            this.f21219m = -3.4028235E38f;
            this.f21220n = false;
            this.f21221o = -16777216;
            this.f21222p = Integer.MIN_VALUE;
        }

        private b(C2030a aVar) {
            this.f21207a = aVar.f21190a;
            this.f21208b = aVar.f21193d;
            this.f21209c = aVar.f21191b;
            this.f21210d = aVar.f21192c;
            this.f21211e = aVar.f21194e;
            this.f21212f = aVar.f21195f;
            this.f21213g = aVar.f21196g;
            this.f21214h = aVar.f21197h;
            this.f21215i = aVar.f21198i;
            this.f21216j = aVar.f21203n;
            this.f21217k = aVar.f21204o;
            this.f21218l = aVar.f21199j;
            this.f21219m = aVar.f21200k;
            this.f21220n = aVar.f21201l;
            this.f21221o = aVar.f21202m;
            this.f21222p = aVar.f21205p;
            this.f21223q = aVar.f21206q;
        }
    }

    public static C2030a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f21182s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f21183t);
            if (parcelableArrayList != null) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    C2032c.c((Bundle) it.next(), valueOf);
                }
                bVar.o(valueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f21184u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f21185v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f21186w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f21187x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f21188y;
        if (bundle.containsKey(str)) {
            String str2 = f21189z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f21170A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = f21171B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = f21172C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = f21174E;
        if (bundle.containsKey(str6)) {
            String str7 = f21173D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f21175F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = f21176G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = f21177H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f21178I, false)) {
            bVar.b();
        }
        String str11 = f21179J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = f21180K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f21190a;
        if (charSequence != null) {
            bundle.putCharSequence(f21182s, charSequence);
            CharSequence charSequence2 = this.f21190a;
            if (charSequence2 instanceof Spanned) {
                ArrayList a10 = C2032c.a((Spanned) charSequence2);
                if (!a10.isEmpty()) {
                    bundle.putParcelableArrayList(f21183t, a10);
                }
            }
        }
        bundle.putSerializable(f21184u, this.f21191b);
        bundle.putSerializable(f21185v, this.f21192c);
        bundle.putFloat(f21188y, this.f21194e);
        bundle.putInt(f21189z, this.f21195f);
        bundle.putInt(f21170A, this.f21196g);
        bundle.putFloat(f21171B, this.f21197h);
        bundle.putInt(f21172C, this.f21198i);
        bundle.putInt(f21173D, this.f21203n);
        bundle.putFloat(f21174E, this.f21204o);
        bundle.putFloat(f21175F, this.f21199j);
        bundle.putFloat(f21176G, this.f21200k);
        bundle.putBoolean(f21178I, this.f21201l);
        bundle.putInt(f21177H, this.f21202m);
        bundle.putInt(f21179J, this.f21205p);
        bundle.putFloat(f21180K, this.f21206q);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle d() {
        Bundle c10 = c();
        if (this.f21193d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C2076a.g(this.f21193d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            c10.putByteArray(f21187x, byteArrayOutputStream.toByteArray());
        }
        return c10;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2030a.class != obj.getClass()) {
            return false;
        }
        C2030a aVar = (C2030a) obj;
        if (TextUtils.equals(this.f21190a, aVar.f21190a) && this.f21191b == aVar.f21191b && this.f21192c == aVar.f21192c && ((bitmap = this.f21193d) != null ? !((bitmap2 = aVar.f21193d) == null || !bitmap.sameAs(bitmap2)) : aVar.f21193d == null) && this.f21194e == aVar.f21194e && this.f21195f == aVar.f21195f && this.f21196g == aVar.f21196g && this.f21197h == aVar.f21197h && this.f21198i == aVar.f21198i && this.f21199j == aVar.f21199j && this.f21200k == aVar.f21200k && this.f21201l == aVar.f21201l && this.f21202m == aVar.f21202m && this.f21203n == aVar.f21203n && this.f21204o == aVar.f21204o && this.f21205p == aVar.f21205p && this.f21206q == aVar.f21206q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        CharSequence charSequence = this.f21190a;
        return k.b(charSequence, this.f21191b, this.f21192c, this.f21193d, Float.valueOf(this.f21194e), Integer.valueOf(this.f21195f), Integer.valueOf(this.f21196g), Float.valueOf(this.f21197h), Integer.valueOf(this.f21198i), Float.valueOf(this.f21199j), Float.valueOf(this.f21200k), Boolean.valueOf(this.f21201l), Integer.valueOf(this.f21202m), Integer.valueOf(this.f21203n), Float.valueOf(this.f21204o), Integer.valueOf(this.f21205p), Float.valueOf(this.f21206q));
    }

    private C2030a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            C2076a.e(bitmap);
        } else {
            C2076a.a(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f21190a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f21190a = charSequence.toString();
        } else {
            this.f21190a = null;
        }
        this.f21191b = alignment;
        this.f21192c = alignment2;
        this.f21193d = bitmap2;
        this.f21194e = f10;
        this.f21195f = i10;
        this.f21196g = i11;
        this.f21197h = f11;
        this.f21198i = i12;
        this.f21199j = f13;
        this.f21200k = f14;
        this.f21201l = z10;
        this.f21202m = i14;
        this.f21203n = i13;
        this.f21204o = f12;
        this.f21205p = i15;
        this.f21206q = f15;
    }
}
