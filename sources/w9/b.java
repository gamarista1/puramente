package W9;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import ja.C3645a;
import k9.C3700i;
import nb.k;

public final class b implements C3700i {

    /* renamed from: r  reason: collision with root package name */
    public static final b f34926r = new C0565b().o("").a();

    /* renamed from: s  reason: collision with root package name */
    public static final C3700i.a f34927s = new a();

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f34928a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f34929b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f34930c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f34931d;

    /* renamed from: e  reason: collision with root package name */
    public final float f34932e;

    /* renamed from: f  reason: collision with root package name */
    public final int f34933f;

    /* renamed from: g  reason: collision with root package name */
    public final int f34934g;

    /* renamed from: h  reason: collision with root package name */
    public final float f34935h;

    /* renamed from: i  reason: collision with root package name */
    public final int f34936i;

    /* renamed from: j  reason: collision with root package name */
    public final float f34937j;

    /* renamed from: k  reason: collision with root package name */
    public final float f34938k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f34939l;

    /* renamed from: m  reason: collision with root package name */
    public final int f34940m;

    /* renamed from: n  reason: collision with root package name */
    public final int f34941n;

    /* renamed from: o  reason: collision with root package name */
    public final float f34942o;

    /* renamed from: p  reason: collision with root package name */
    public final int f34943p;

    /* renamed from: q  reason: collision with root package name */
    public final float f34944q;

    /* renamed from: W9.b$b  reason: collision with other inner class name */
    public static final class C0565b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f34945a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f34946b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f34947c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f34948d;

        /* renamed from: e  reason: collision with root package name */
        private float f34949e;

        /* renamed from: f  reason: collision with root package name */
        private int f34950f;

        /* renamed from: g  reason: collision with root package name */
        private int f34951g;

        /* renamed from: h  reason: collision with root package name */
        private float f34952h;

        /* renamed from: i  reason: collision with root package name */
        private int f34953i;

        /* renamed from: j  reason: collision with root package name */
        private int f34954j;

        /* renamed from: k  reason: collision with root package name */
        private float f34955k;

        /* renamed from: l  reason: collision with root package name */
        private float f34956l;

        /* renamed from: m  reason: collision with root package name */
        private float f34957m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f34958n;

        /* renamed from: o  reason: collision with root package name */
        private int f34959o;

        /* renamed from: p  reason: collision with root package name */
        private int f34960p;

        /* renamed from: q  reason: collision with root package name */
        private float f34961q;

        public b a() {
            return new b(this.f34945a, this.f34947c, this.f34948d, this.f34946b, this.f34949e, this.f34950f, this.f34951g, this.f34952h, this.f34953i, this.f34954j, this.f34955k, this.f34956l, this.f34957m, this.f34958n, this.f34959o, this.f34960p, this.f34961q);
        }

        public C0565b b() {
            this.f34958n = false;
            return this;
        }

        public int c() {
            return this.f34951g;
        }

        public int d() {
            return this.f34953i;
        }

        public CharSequence e() {
            return this.f34945a;
        }

        public C0565b f(Bitmap bitmap) {
            this.f34946b = bitmap;
            return this;
        }

        public C0565b g(float f10) {
            this.f34957m = f10;
            return this;
        }

        public C0565b h(float f10, int i10) {
            this.f34949e = f10;
            this.f34950f = i10;
            return this;
        }

        public C0565b i(int i10) {
            this.f34951g = i10;
            return this;
        }

        public C0565b j(Layout.Alignment alignment) {
            this.f34948d = alignment;
            return this;
        }

        public C0565b k(float f10) {
            this.f34952h = f10;
            return this;
        }

        public C0565b l(int i10) {
            this.f34953i = i10;
            return this;
        }

        public C0565b m(float f10) {
            this.f34961q = f10;
            return this;
        }

        public C0565b n(float f10) {
            this.f34956l = f10;
            return this;
        }

        public C0565b o(CharSequence charSequence) {
            this.f34945a = charSequence;
            return this;
        }

        public C0565b p(Layout.Alignment alignment) {
            this.f34947c = alignment;
            return this;
        }

        public C0565b q(float f10, int i10) {
            this.f34955k = f10;
            this.f34954j = i10;
            return this;
        }

        public C0565b r(int i10) {
            this.f34960p = i10;
            return this;
        }

        public C0565b s(int i10) {
            this.f34959o = i10;
            this.f34958n = true;
            return this;
        }

        public C0565b() {
            this.f34945a = null;
            this.f34946b = null;
            this.f34947c = null;
            this.f34948d = null;
            this.f34949e = -3.4028235E38f;
            this.f34950f = Integer.MIN_VALUE;
            this.f34951g = Integer.MIN_VALUE;
            this.f34952h = -3.4028235E38f;
            this.f34953i = Integer.MIN_VALUE;
            this.f34954j = Integer.MIN_VALUE;
            this.f34955k = -3.4028235E38f;
            this.f34956l = -3.4028235E38f;
            this.f34957m = -3.4028235E38f;
            this.f34958n = false;
            this.f34959o = -16777216;
            this.f34960p = Integer.MIN_VALUE;
        }

        private C0565b(b bVar) {
            this.f34945a = bVar.f34928a;
            this.f34946b = bVar.f34931d;
            this.f34947c = bVar.f34929b;
            this.f34948d = bVar.f34930c;
            this.f34949e = bVar.f34932e;
            this.f34950f = bVar.f34933f;
            this.f34951g = bVar.f34934g;
            this.f34952h = bVar.f34935h;
            this.f34953i = bVar.f34936i;
            this.f34954j = bVar.f34941n;
            this.f34955k = bVar.f34942o;
            this.f34956l = bVar.f34937j;
            this.f34957m = bVar.f34938k;
            this.f34958n = bVar.f34939l;
            this.f34959o = bVar.f34940m;
            this.f34960p = bVar.f34943p;
            this.f34961q = bVar.f34944q;
        }
    }

    /* access modifiers changed from: private */
    public static final b c(Bundle bundle) {
        C0565b bVar = new C0565b();
        CharSequence charSequence = bundle.getCharSequence(d(0));
        if (charSequence != null) {
            bVar.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(d(1));
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(d(2));
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(d(3));
        if (bitmap != null) {
            bVar.f(bitmap);
        }
        if (bundle.containsKey(d(4)) && bundle.containsKey(d(5))) {
            bVar.h(bundle.getFloat(d(4)), bundle.getInt(d(5)));
        }
        if (bundle.containsKey(d(6))) {
            bVar.i(bundle.getInt(d(6)));
        }
        if (bundle.containsKey(d(7))) {
            bVar.k(bundle.getFloat(d(7)));
        }
        if (bundle.containsKey(d(8))) {
            bVar.l(bundle.getInt(d(8)));
        }
        if (bundle.containsKey(d(10)) && bundle.containsKey(d(9))) {
            bVar.q(bundle.getFloat(d(10)), bundle.getInt(d(9)));
        }
        if (bundle.containsKey(d(11))) {
            bVar.n(bundle.getFloat(d(11)));
        }
        if (bundle.containsKey(d(12))) {
            bVar.g(bundle.getFloat(d(12)));
        }
        if (bundle.containsKey(d(13))) {
            bVar.s(bundle.getInt(d(13)));
        }
        if (!bundle.getBoolean(d(14), false)) {
            bVar.b();
        }
        if (bundle.containsKey(d(15))) {
            bVar.r(bundle.getInt(d(15)));
        }
        if (bundle.containsKey(d(16))) {
            bVar.m(bundle.getFloat(d(16)));
        }
        return bVar.a();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public C0565b b() {
        return new C0565b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f34928a, bVar.f34928a) && this.f34929b == bVar.f34929b && this.f34930c == bVar.f34930c && ((bitmap = this.f34931d) != null ? !((bitmap2 = bVar.f34931d) == null || !bitmap.sameAs(bitmap2)) : bVar.f34931d == null) && this.f34932e == bVar.f34932e && this.f34933f == bVar.f34933f && this.f34934g == bVar.f34934g && this.f34935h == bVar.f34935h && this.f34936i == bVar.f34936i && this.f34937j == bVar.f34937j && this.f34938k == bVar.f34938k && this.f34939l == bVar.f34939l && this.f34940m == bVar.f34940m && this.f34941n == bVar.f34941n && this.f34942o == bVar.f34942o && this.f34943p == bVar.f34943p && this.f34944q == bVar.f34944q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        CharSequence charSequence = this.f34928a;
        return k.b(charSequence, this.f34929b, this.f34930c, this.f34931d, Float.valueOf(this.f34932e), Integer.valueOf(this.f34933f), Integer.valueOf(this.f34934g), Float.valueOf(this.f34935h), Integer.valueOf(this.f34936i), Float.valueOf(this.f34937j), Float.valueOf(this.f34938k), Boolean.valueOf(this.f34939l), Integer.valueOf(this.f34940m), Integer.valueOf(this.f34941n), Float.valueOf(this.f34942o), Integer.valueOf(this.f34943p), Float.valueOf(this.f34944q));
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            C3645a.e(bitmap);
        } else {
            C3645a.a(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f34928a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f34928a = charSequence.toString();
        } else {
            this.f34928a = null;
        }
        this.f34929b = alignment;
        this.f34930c = alignment2;
        this.f34931d = bitmap2;
        this.f34932e = f10;
        this.f34933f = i10;
        this.f34934g = i11;
        this.f34935h = f11;
        this.f34936i = i12;
        this.f34937j = f13;
        this.f34938k = f14;
        this.f34939l = z10;
        this.f34940m = i14;
        this.f34941n = i13;
        this.f34942o = f12;
        this.f34943p = i15;
        this.f34944q = f15;
    }
}
