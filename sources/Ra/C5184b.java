package ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import za.C5298a;

/* renamed from: ra.b  reason: case insensitive filesystem */
public final class C5184b extends C5298a {
    public static final Parcelable.Creator<C5184b> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    private final e f61483a;

    /* renamed from: b  reason: collision with root package name */
    private final C0905b f61484b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61485c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f61486d;

    /* renamed from: e  reason: collision with root package name */
    private final int f61487e;

    /* renamed from: f  reason: collision with root package name */
    private final d f61488f;

    /* renamed from: g  reason: collision with root package name */
    private final c f61489g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f61490h;

    /* renamed from: ra.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private e f61491a;

        /* renamed from: b  reason: collision with root package name */
        private C0905b f61492b;

        /* renamed from: c  reason: collision with root package name */
        private d f61493c;

        /* renamed from: d  reason: collision with root package name */
        private c f61494d;

        /* renamed from: e  reason: collision with root package name */
        private String f61495e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f61496f;

        /* renamed from: g  reason: collision with root package name */
        private int f61497g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f61498h;

        public a() {
            e.a o02 = e.o0();
            o02.b(false);
            this.f61491a = o02.a();
            C0905b.a o03 = C0905b.o0();
            o03.b(false);
            this.f61492b = o03.a();
            d.a o04 = d.o0();
            o04.b(false);
            this.f61493c = o04.a();
            c.a o05 = c.o0();
            o05.b(false);
            this.f61494d = o05.a();
        }

        public C5184b a() {
            return new C5184b(this.f61491a, this.f61492b, this.f61495e, this.f61496f, this.f61497g, this.f61493c, this.f61494d, this.f61498h);
        }

        public a b(boolean z10) {
            this.f61496f = z10;
            return this;
        }

        public a c(C0905b bVar) {
            this.f61492b = (C0905b) C4536s.l(bVar);
            return this;
        }

        public a d(c cVar) {
            this.f61494d = (c) C4536s.l(cVar);
            return this;
        }

        public a e(d dVar) {
            this.f61493c = (d) C4536s.l(dVar);
            return this;
        }

        public a f(e eVar) {
            this.f61491a = (e) C4536s.l(eVar);
            return this;
        }

        public a g(boolean z10) {
            this.f61498h = z10;
            return this;
        }

        public final a h(String str) {
            this.f61495e = str;
            return this;
        }

        public final a i(int i10) {
            this.f61497g = i10;
            return this;
        }
    }

    /* renamed from: ra.b$b  reason: collision with other inner class name */
    public static final class C0905b extends C5298a {
        public static final Parcelable.Creator<C0905b> CREATOR = new u();

        /* renamed from: a  reason: collision with root package name */
        private final boolean f61499a;

        /* renamed from: b  reason: collision with root package name */
        private final String f61500b;

        /* renamed from: c  reason: collision with root package name */
        private final String f61501c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f61502d;

        /* renamed from: e  reason: collision with root package name */
        private final String f61503e;

        /* renamed from: f  reason: collision with root package name */
        private final List f61504f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f61505g;

        /* renamed from: ra.b$b$a */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f61506a = false;

            /* renamed from: b  reason: collision with root package name */
            private String f61507b = null;

            /* renamed from: c  reason: collision with root package name */
            private String f61508c = null;

            /* renamed from: d  reason: collision with root package name */
            private boolean f61509d = true;

            /* renamed from: e  reason: collision with root package name */
            private String f61510e = null;

            /* renamed from: f  reason: collision with root package name */
            private List f61511f = null;

            /* renamed from: g  reason: collision with root package name */
            private boolean f61512g = false;

            public C0905b a() {
                return new C0905b(this.f61506a, this.f61507b, this.f61508c, this.f61509d, this.f61510e, this.f61511f, this.f61512g);
            }

            public a b(boolean z10) {
                this.f61506a = z10;
                return this;
            }
        }

        C0905b(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            C4536s.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f61499a = z10;
            if (z10) {
                C4536s.m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f61500b = str;
            this.f61501c = str2;
            this.f61502d = z11;
            Parcelable.Creator<C5184b> creator = C5184b.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f61504f = arrayList;
            this.f61503e = str3;
            this.f61505g = z12;
        }

        public static a o0() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0905b)) {
                return false;
            }
            C0905b bVar = (C0905b) obj;
            if (this.f61499a != bVar.f61499a || !C4535q.b(this.f61500b, bVar.f61500b) || !C4535q.b(this.f61501c, bVar.f61501c) || this.f61502d != bVar.f61502d || !C4535q.b(this.f61503e, bVar.f61503e) || !C4535q.b(this.f61504f, bVar.f61504f) || this.f61505g != bVar.f61505g) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C4535q.c(Boolean.valueOf(this.f61499a), this.f61500b, this.f61501c, Boolean.valueOf(this.f61502d), this.f61503e, this.f61504f, Boolean.valueOf(this.f61505g));
        }

        public boolean p0() {
            return this.f61502d;
        }

        public List q0() {
            return this.f61504f;
        }

        public String r0() {
            return this.f61503e;
        }

        public String s0() {
            return this.f61501c;
        }

        public String t0() {
            return this.f61500b;
        }

        public boolean u0() {
            return this.f61499a;
        }

        public boolean v0() {
            return this.f61505g;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = za.c.a(parcel);
            za.c.g(parcel, 1, u0());
            za.c.D(parcel, 2, t0(), false);
            za.c.D(parcel, 3, s0(), false);
            za.c.g(parcel, 4, p0());
            za.c.D(parcel, 5, r0(), false);
            za.c.F(parcel, 6, q0(), false);
            za.c.g(parcel, 7, v0());
            za.c.b(parcel, a10);
        }
    }

    /* renamed from: ra.b$c */
    public static final class c extends C5298a {
        public static final Parcelable.Creator<c> CREATOR = new v();

        /* renamed from: a  reason: collision with root package name */
        private final boolean f61513a;

        /* renamed from: b  reason: collision with root package name */
        private final String f61514b;

        /* renamed from: ra.b$c$a */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f61515a = false;

            /* renamed from: b  reason: collision with root package name */
            private String f61516b;

            public c a() {
                return new c(this.f61515a, this.f61516b);
            }

            public a b(boolean z10) {
                this.f61515a = z10;
                return this;
            }
        }

        c(boolean z10, String str) {
            if (z10) {
                C4536s.l(str);
            }
            this.f61513a = z10;
            this.f61514b = str;
        }

        public static a o0() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f61513a != cVar.f61513a || !C4535q.b(this.f61514b, cVar.f61514b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C4535q.c(Boolean.valueOf(this.f61513a), this.f61514b);
        }

        public String p0() {
            return this.f61514b;
        }

        public boolean q0() {
            return this.f61513a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = za.c.a(parcel);
            za.c.g(parcel, 1, q0());
            za.c.D(parcel, 2, p0(), false);
            za.c.b(parcel, a10);
        }
    }

    /* renamed from: ra.b$d */
    public static final class d extends C5298a {
        public static final Parcelable.Creator<d> CREATOR = new w();

        /* renamed from: a  reason: collision with root package name */
        private final boolean f61517a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f61518b;

        /* renamed from: c  reason: collision with root package name */
        private final String f61519c;

        /* renamed from: ra.b$d$a */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f61520a = false;

            /* renamed from: b  reason: collision with root package name */
            private byte[] f61521b;

            /* renamed from: c  reason: collision with root package name */
            private String f61522c;

            public d a() {
                return new d(this.f61520a, this.f61521b, this.f61522c);
            }

            public a b(boolean z10) {
                this.f61520a = z10;
                return this;
            }
        }

        d(boolean z10, byte[] bArr, String str) {
            if (z10) {
                C4536s.l(bArr);
                C4536s.l(str);
            }
            this.f61517a = z10;
            this.f61518b = bArr;
            this.f61519c = str;
        }

        public static a o0() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f61517a != dVar.f61517a || !Arrays.equals(this.f61518b, dVar.f61518b) || !Objects.equals(this.f61519c, dVar.f61519c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (Objects.hash(new Object[]{Boolean.valueOf(this.f61517a), this.f61519c}) * 31) + Arrays.hashCode(this.f61518b);
        }

        public byte[] p0() {
            return this.f61518b;
        }

        public String q0() {
            return this.f61519c;
        }

        public boolean r0() {
            return this.f61517a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = za.c.a(parcel);
            za.c.g(parcel, 1, r0());
            za.c.k(parcel, 2, p0(), false);
            za.c.D(parcel, 3, q0(), false);
            za.c.b(parcel, a10);
        }
    }

    /* renamed from: ra.b$e */
    public static final class e extends C5298a {
        public static final Parcelable.Creator<e> CREATOR = new x();

        /* renamed from: a  reason: collision with root package name */
        private final boolean f61523a;

        /* renamed from: ra.b$e$a */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f61524a = false;

            public e a() {
                return new e(this.f61524a);
            }

            public a b(boolean z10) {
                this.f61524a = z10;
                return this;
            }
        }

        e(boolean z10) {
            this.f61523a = z10;
        }

        public static a o0() {
            return new a();
        }

        public boolean equals(Object obj) {
            if ((obj instanceof e) && this.f61523a == ((e) obj).f61523a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C4535q.c(Boolean.valueOf(this.f61523a));
        }

        public boolean p0() {
            return this.f61523a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = za.c.a(parcel);
            za.c.g(parcel, 1, p0());
            za.c.b(parcel, a10);
        }
    }

    C5184b(e eVar, C0905b bVar, String str, boolean z10, int i10, d dVar, c cVar, boolean z11) {
        this.f61483a = (e) C4536s.l(eVar);
        this.f61484b = (C0905b) C4536s.l(bVar);
        this.f61485c = str;
        this.f61486d = z10;
        this.f61487e = i10;
        if (dVar == null) {
            d.a o02 = d.o0();
            o02.b(false);
            dVar = o02.a();
        }
        this.f61488f = dVar;
        if (cVar == null) {
            c.a o03 = c.o0();
            o03.b(false);
            cVar = o03.a();
        }
        this.f61489g = cVar;
        this.f61490h = z11;
    }

    public static a o0() {
        return new a();
    }

    public static a v0(C5184b bVar) {
        C4536s.l(bVar);
        a o02 = o0();
        o02.c(bVar.p0());
        o02.f(bVar.s0());
        o02.e(bVar.r0());
        o02.d(bVar.q0());
        o02.b(bVar.f61486d);
        o02.i(bVar.f61487e);
        o02.g(bVar.f61490h);
        String str = bVar.f61485c;
        if (str != null) {
            o02.h(str);
        }
        return o02;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5184b)) {
            return false;
        }
        C5184b bVar = (C5184b) obj;
        if (!C4535q.b(this.f61483a, bVar.f61483a) || !C4535q.b(this.f61484b, bVar.f61484b) || !C4535q.b(this.f61488f, bVar.f61488f) || !C4535q.b(this.f61489g, bVar.f61489g) || !C4535q.b(this.f61485c, bVar.f61485c) || this.f61486d != bVar.f61486d || this.f61487e != bVar.f61487e || this.f61490h != bVar.f61490h) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f61483a, this.f61484b, this.f61488f, this.f61489g, this.f61485c, Boolean.valueOf(this.f61486d), Integer.valueOf(this.f61487e), Boolean.valueOf(this.f61490h));
    }

    public C0905b p0() {
        return this.f61484b;
    }

    public c q0() {
        return this.f61489g;
    }

    public d r0() {
        return this.f61488f;
    }

    public e s0() {
        return this.f61483a;
    }

    public boolean t0() {
        return this.f61490h;
    }

    public boolean u0() {
        return this.f61486d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = za.c.a(parcel);
        za.c.B(parcel, 1, s0(), i10, false);
        za.c.B(parcel, 2, p0(), i10, false);
        za.c.D(parcel, 3, this.f61485c, false);
        za.c.g(parcel, 4, u0());
        za.c.t(parcel, 5, this.f61487e);
        za.c.B(parcel, 6, r0(), i10, false);
        za.c.B(parcel, 7, q0(), i10, false);
        za.c.g(parcel, 8, t0());
        za.c.b(parcel, a10);
    }
}
