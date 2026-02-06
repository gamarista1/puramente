package k9;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4771w;
import ja.C3645a;
import ja.M;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k9.C3700i;

/* renamed from: k9.y0  reason: case insensitive filesystem */
public final class C3732y0 implements C3700i {

    /* renamed from: i  reason: collision with root package name */
    public static final C3732y0 f45853i = new c().a();

    /* renamed from: j  reason: collision with root package name */
    public static final C3700i.a f45854j = new C3730x0();

    /* renamed from: a  reason: collision with root package name */
    public final String f45855a;

    /* renamed from: b  reason: collision with root package name */
    public final h f45856b;

    /* renamed from: c  reason: collision with root package name */
    public final i f45857c;

    /* renamed from: d  reason: collision with root package name */
    public final g f45858d;

    /* renamed from: e  reason: collision with root package name */
    public final D0 f45859e;

    /* renamed from: f  reason: collision with root package name */
    public final d f45860f;

    /* renamed from: g  reason: collision with root package name */
    public final e f45861g;

    /* renamed from: h  reason: collision with root package name */
    public final j f45862h;

    /* renamed from: k9.y0$b */
    public static final class b {
    }

    /* renamed from: k9.y0$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f45863a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f45864b;

        /* renamed from: c  reason: collision with root package name */
        private String f45865c;

        /* renamed from: d  reason: collision with root package name */
        private d.a f45866d;

        /* renamed from: e  reason: collision with root package name */
        private f.a f45867e;

        /* renamed from: f  reason: collision with root package name */
        private List f45868f;

        /* renamed from: g  reason: collision with root package name */
        private String f45869g;

        /* renamed from: h  reason: collision with root package name */
        private C4770v f45870h;

        /* renamed from: i  reason: collision with root package name */
        private Object f45871i;

        /* renamed from: j  reason: collision with root package name */
        private D0 f45872j;

        /* renamed from: k  reason: collision with root package name */
        private g.a f45873k;

        /* renamed from: l  reason: collision with root package name */
        private j f45874l;

        public C3732y0 a() {
            boolean z10;
            i iVar;
            if (this.f45867e.f45900b == null || this.f45867e.f45899a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z10);
            Uri uri = this.f45864b;
            f fVar = null;
            if (uri != null) {
                String str = this.f45865c;
                if (this.f45867e.f45899a != null) {
                    fVar = this.f45867e.i();
                }
                iVar = new i(uri, str, fVar, (b) null, this.f45868f, this.f45869g, this.f45870h, this.f45871i);
            } else {
                iVar = null;
            }
            String str2 = this.f45863a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            e g10 = this.f45866d.g();
            g f10 = this.f45873k.f();
            D0 d02 = this.f45872j;
            if (d02 == null) {
                d02 = D0.f45199G;
            }
            return new C3732y0(str3, g10, iVar, f10, d02, this.f45874l);
        }

        public c b(String str) {
            this.f45869g = str;
            return this;
        }

        public c c(String str) {
            this.f45863a = (String) C3645a.e(str);
            return this;
        }

        public c d(Object obj) {
            this.f45871i = obj;
            return this;
        }

        public c e(Uri uri) {
            this.f45864b = uri;
            return this;
        }

        public c() {
            this.f45866d = new d.a();
            this.f45867e = new f.a();
            this.f45868f = Collections.emptyList();
            this.f45870h = C4770v.E();
            this.f45873k = new g.a();
            this.f45874l = j.f45927d;
        }

        private c(C3732y0 y0Var) {
            this();
            f.a aVar;
            this.f45866d = y0Var.f45860f.b();
            this.f45863a = y0Var.f45855a;
            this.f45872j = y0Var.f45859e;
            this.f45873k = y0Var.f45858d.b();
            this.f45874l = y0Var.f45862h;
            h hVar = y0Var.f45856b;
            if (hVar != null) {
                this.f45869g = hVar.f45923e;
                this.f45865c = hVar.f45920b;
                this.f45864b = hVar.f45919a;
                this.f45868f = hVar.f45922d;
                this.f45870h = hVar.f45924f;
                this.f45871i = hVar.f45926h;
                f fVar = hVar.f45921c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f45867e = aVar;
            }
        }
    }

    /* renamed from: k9.y0$d */
    public static class d implements C3700i {

        /* renamed from: f  reason: collision with root package name */
        public static final d f45875f = new a().f();

        /* renamed from: g  reason: collision with root package name */
        public static final C3700i.a f45876g = new C3734z0();

        /* renamed from: a  reason: collision with root package name */
        public final long f45877a;

        /* renamed from: b  reason: collision with root package name */
        public final long f45878b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f45879c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f45880d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f45881e;

        /* renamed from: k9.y0$d$a */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f45882a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f45883b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public boolean f45884c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f45885d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f45886e;

            public d f() {
                return g();
            }

            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                boolean z10;
                if (j10 == Long.MIN_VALUE || j10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3645a.a(z10);
                this.f45883b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f45885d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f45884c = z10;
                return this;
            }

            public a k(long j10) {
                boolean z10;
                if (j10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3645a.a(z10);
                this.f45882a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f45886e = z10;
                return this;
            }

            public a() {
                this.f45883b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f45882a = dVar.f45877a;
                this.f45883b = dVar.f45878b;
                this.f45884c = dVar.f45879c;
                this.f45885d = dVar.f45880d;
                this.f45886e = dVar.f45881e;
            }
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public a b() {
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
            if (this.f45877a == dVar.f45877a && this.f45878b == dVar.f45878b && this.f45879c == dVar.f45879c && this.f45880d == dVar.f45880d && this.f45881e == dVar.f45881e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f45877a;
            long j11 = this.f45878b;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f45879c ? 1 : 0)) * 31) + (this.f45880d ? 1 : 0)) * 31) + (this.f45881e ? 1 : 0);
        }

        private d(a aVar) {
            this.f45877a = aVar.f45882a;
            this.f45878b = aVar.f45883b;
            this.f45879c = aVar.f45884c;
            this.f45880d = aVar.f45885d;
            this.f45881e = aVar.f45886e;
        }
    }

    /* renamed from: k9.y0$e */
    public static final class e extends d {

        /* renamed from: h  reason: collision with root package name */
        public static final e f45887h = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: k9.y0$f */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f45888a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f45889b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f45890c;

        /* renamed from: d  reason: collision with root package name */
        public final C4771w f45891d;

        /* renamed from: e  reason: collision with root package name */
        public final C4771w f45892e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f45893f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f45894g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f45895h;

        /* renamed from: i  reason: collision with root package name */
        public final C4770v f45896i;

        /* renamed from: j  reason: collision with root package name */
        public final C4770v f45897j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public final byte[] f45898k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f45898k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (!this.f45888a.equals(fVar.f45888a) || !M.c(this.f45890c, fVar.f45890c) || !M.c(this.f45892e, fVar.f45892e) || this.f45893f != fVar.f45893f || this.f45895h != fVar.f45895h || this.f45894g != fVar.f45894g || !this.f45897j.equals(fVar.f45897j) || !Arrays.equals(this.f45898k, fVar.f45898k)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f45888a.hashCode() * 31;
            Uri uri = this.f45890c;
            if (uri != null) {
                i10 = uri.hashCode();
            } else {
                i10 = 0;
            }
            return ((((((((((((hashCode + i10) * 31) + this.f45892e.hashCode()) * 31) + (this.f45893f ? 1 : 0)) * 31) + (this.f45895h ? 1 : 0)) * 31) + (this.f45894g ? 1 : 0)) * 31) + this.f45897j.hashCode()) * 31) + Arrays.hashCode(this.f45898k);
        }

        /* renamed from: k9.y0$f$a */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public UUID f45899a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public Uri f45900b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public C4771w f45901c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f45902d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f45903e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public boolean f45904f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public C4770v f45905g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public byte[] f45906h;

            public f i() {
                return new f(this);
            }

            private a() {
                this.f45901c = C4771w.n();
                this.f45905g = C4770v.E();
            }

            private a(f fVar) {
                this.f45899a = fVar.f45888a;
                this.f45900b = fVar.f45890c;
                this.f45901c = fVar.f45892e;
                this.f45902d = fVar.f45893f;
                this.f45903e = fVar.f45894g;
                this.f45904f = fVar.f45895h;
                this.f45905g = fVar.f45897j;
                this.f45906h = fVar.f45898k;
            }
        }

        private f(a aVar) {
            C3645a.f(!aVar.f45904f || aVar.f45900b != null);
            UUID uuid = (UUID) C3645a.e(aVar.f45899a);
            this.f45888a = uuid;
            this.f45889b = uuid;
            this.f45890c = aVar.f45900b;
            this.f45891d = aVar.f45901c;
            this.f45892e = aVar.f45901c;
            this.f45893f = aVar.f45902d;
            this.f45895h = aVar.f45904f;
            this.f45894g = aVar.f45903e;
            this.f45896i = aVar.f45905g;
            this.f45897j = aVar.f45905g;
            this.f45898k = aVar.f45906h != null ? Arrays.copyOf(aVar.f45906h, aVar.f45906h.length) : null;
        }
    }

    /* renamed from: k9.y0$g */
    public static final class g implements C3700i {

        /* renamed from: f  reason: collision with root package name */
        public static final g f45907f = new a().f();

        /* renamed from: g  reason: collision with root package name */
        public static final C3700i.a f45908g = new A0();

        /* renamed from: a  reason: collision with root package name */
        public final long f45909a;

        /* renamed from: b  reason: collision with root package name */
        public final long f45910b;

        /* renamed from: c  reason: collision with root package name */
        public final long f45911c;

        /* renamed from: d  reason: collision with root package name */
        public final float f45912d;

        /* renamed from: e  reason: collision with root package name */
        public final float f45913e;

        /* renamed from: k9.y0$g$a */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f45914a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f45915b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public long f45916c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public float f45917d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public float f45918e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f45916c = j10;
                return this;
            }

            public a h(float f10) {
                this.f45918e = f10;
                return this;
            }

            public a i(long j10) {
                this.f45915b = j10;
                return this;
            }

            public a j(float f10) {
                this.f45917d = f10;
                return this;
            }

            public a k(long j10) {
                this.f45914a = j10;
                return this;
            }

            public a() {
                this.f45914a = -9223372036854775807L;
                this.f45915b = -9223372036854775807L;
                this.f45916c = -9223372036854775807L;
                this.f45917d = -3.4028235E38f;
                this.f45918e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f45914a = gVar.f45909a;
                this.f45915b = gVar.f45910b;
                this.f45916c = gVar.f45911c;
                this.f45917d = gVar.f45912d;
                this.f45918e = gVar.f45913e;
            }
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ g d(Bundle bundle) {
            return new g(bundle.getLong(c(0), -9223372036854775807L), bundle.getLong(c(1), -9223372036854775807L), bundle.getLong(c(2), -9223372036854775807L), bundle.getFloat(c(3), -3.4028235E38f), bundle.getFloat(c(4), -3.4028235E38f));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.f45909a == gVar.f45909a && this.f45910b == gVar.f45910b && this.f45911c == gVar.f45911c && this.f45912d == gVar.f45912d && this.f45913e == gVar.f45913e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            long j10 = this.f45909a;
            long j11 = this.f45910b;
            long j12 = this.f45911c;
            int i11 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f45912d;
            int i12 = 0;
            if (f10 != 0.0f) {
                i10 = Float.floatToIntBits(f10);
            } else {
                i10 = 0;
            }
            int i13 = (i11 + i10) * 31;
            float f11 = this.f45913e;
            if (f11 != 0.0f) {
                i12 = Float.floatToIntBits(f11);
            }
            return i13 + i12;
        }

        private g(a aVar) {
            this(aVar.f45914a, aVar.f45915b, aVar.f45916c, aVar.f45917d, aVar.f45918e);
        }

        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f45909a = j10;
            this.f45910b = j11;
            this.f45911c = j12;
            this.f45912d = f10;
            this.f45913e = f11;
        }
    }

    /* renamed from: k9.y0$h */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f45919a;

        /* renamed from: b  reason: collision with root package name */
        public final String f45920b;

        /* renamed from: c  reason: collision with root package name */
        public final f f45921c;

        /* renamed from: d  reason: collision with root package name */
        public final List f45922d;

        /* renamed from: e  reason: collision with root package name */
        public final String f45923e;

        /* renamed from: f  reason: collision with root package name */
        public final C4770v f45924f;

        /* renamed from: g  reason: collision with root package name */
        public final List f45925g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f45926h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (!this.f45919a.equals(hVar.f45919a) || !M.c(this.f45920b, hVar.f45920b) || !M.c(this.f45921c, hVar.f45921c) || !M.c((Object) null, (Object) null) || !this.f45922d.equals(hVar.f45922d) || !M.c(this.f45923e, hVar.f45923e) || !this.f45924f.equals(hVar.f45924f) || !M.c(this.f45926h, hVar.f45926h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int hashCode = this.f45919a.hashCode() * 31;
            String str = this.f45920b;
            int i13 = 0;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            int i14 = (hashCode + i10) * 31;
            f fVar = this.f45921c;
            if (fVar == null) {
                i11 = 0;
            } else {
                i11 = fVar.hashCode();
            }
            int hashCode2 = (((i14 + i11) * 961) + this.f45922d.hashCode()) * 31;
            String str2 = this.f45923e;
            if (str2 == null) {
                i12 = 0;
            } else {
                i12 = str2.hashCode();
            }
            int hashCode3 = (((hashCode2 + i12) * 31) + this.f45924f.hashCode()) * 31;
            Object obj = this.f45926h;
            if (obj != null) {
                i13 = obj.hashCode();
            }
            return hashCode3 + i13;
        }

        private h(Uri uri, String str, f fVar, b bVar, List list, String str2, C4770v vVar, Object obj) {
            this.f45919a = uri;
            this.f45920b = str;
            this.f45921c = fVar;
            this.f45922d = list;
            this.f45923e = str2;
            this.f45924f = vVar;
            C4770v.a t10 = C4770v.t();
            for (int i10 = 0; i10 < vVar.size(); i10++) {
                t10.a(((l) vVar.get(i10)).a().i());
            }
            this.f45925g = t10.k();
            this.f45926h = obj;
        }
    }

    /* renamed from: k9.y0$i */
    public static final class i extends h {
        private i(Uri uri, String str, f fVar, b bVar, List list, String str2, C4770v vVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, vVar, obj);
        }
    }

    /* renamed from: k9.y0$j */
    public static final class j implements C3700i {

        /* renamed from: d  reason: collision with root package name */
        public static final j f45927d = new a().d();

        /* renamed from: e  reason: collision with root package name */
        public static final C3700i.a f45928e = new B0();

        /* renamed from: a  reason: collision with root package name */
        public final Uri f45929a;

        /* renamed from: b  reason: collision with root package name */
        public final String f45930b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f45931c;

        /* renamed from: k9.y0$j$a */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public Uri f45932a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f45933b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public Bundle f45934c;

            public j d() {
                return new j(this);
            }

            public a e(Bundle bundle) {
                this.f45934c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f45932a = uri;
                return this;
            }

            public a g(String str) {
                this.f45933b = str;
                return this;
            }
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (!M.c(this.f45929a, jVar.f45929a) || !M.c(this.f45930b, jVar.f45930b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            Uri uri = this.f45929a;
            int i11 = 0;
            if (uri == null) {
                i10 = 0;
            } else {
                i10 = uri.hashCode();
            }
            int i12 = i10 * 31;
            String str = this.f45930b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return i12 + i11;
        }

        private j(a aVar) {
            this.f45929a = aVar.f45932a;
            this.f45930b = aVar.f45933b;
            this.f45931c = aVar.f45934c;
        }
    }

    /* renamed from: k9.y0$k */
    public static final class k extends l {
        private k(l.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: k9.y0$l */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f45935a;

        /* renamed from: b  reason: collision with root package name */
        public final String f45936b;

        /* renamed from: c  reason: collision with root package name */
        public final String f45937c;

        /* renamed from: d  reason: collision with root package name */
        public final int f45938d;

        /* renamed from: e  reason: collision with root package name */
        public final int f45939e;

        /* renamed from: f  reason: collision with root package name */
        public final String f45940f;

        /* renamed from: g  reason: collision with root package name */
        public final String f45941g;

        /* renamed from: k9.y0$l$a */
        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public Uri f45942a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f45943b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public String f45944c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public int f45945d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public int f45946e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public String f45947f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public String f45948g;

            /* access modifiers changed from: private */
            public k i() {
                return new k(this);
            }

            private a(l lVar) {
                this.f45942a = lVar.f45935a;
                this.f45943b = lVar.f45936b;
                this.f45944c = lVar.f45937c;
                this.f45945d = lVar.f45938d;
                this.f45946e = lVar.f45939e;
                this.f45947f = lVar.f45940f;
                this.f45948g = lVar.f45941g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (!this.f45935a.equals(lVar.f45935a) || !M.c(this.f45936b, lVar.f45936b) || !M.c(this.f45937c, lVar.f45937c) || this.f45938d != lVar.f45938d || this.f45939e != lVar.f45939e || !M.c(this.f45940f, lVar.f45940f) || !M.c(this.f45941g, lVar.f45941g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int hashCode = this.f45935a.hashCode() * 31;
            String str = this.f45936b;
            int i13 = 0;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            int i14 = (hashCode + i10) * 31;
            String str2 = this.f45937c;
            if (str2 == null) {
                i11 = 0;
            } else {
                i11 = str2.hashCode();
            }
            int i15 = (((((i14 + i11) * 31) + this.f45938d) * 31) + this.f45939e) * 31;
            String str3 = this.f45940f;
            if (str3 == null) {
                i12 = 0;
            } else {
                i12 = str3.hashCode();
            }
            int i16 = (i15 + i12) * 31;
            String str4 = this.f45941g;
            if (str4 != null) {
                i13 = str4.hashCode();
            }
            return i16 + i13;
        }

        private l(a aVar) {
            this.f45935a = aVar.f45942a;
            this.f45936b = aVar.f45943b;
            this.f45937c = aVar.f45944c;
            this.f45938d = aVar.f45945d;
            this.f45939e = aVar.f45946e;
            this.f45940f = aVar.f45947f;
            this.f45941g = aVar.f45948g;
        }
    }

    /* access modifiers changed from: private */
    public static C3732y0 c(Bundle bundle) {
        g gVar;
        D0 d02;
        e eVar;
        j jVar;
        String str = (String) C3645a.e(bundle.getString(e(0), ""));
        Bundle bundle2 = bundle.getBundle(e(1));
        if (bundle2 == null) {
            gVar = g.f45907f;
        } else {
            gVar = (g) g.f45908g.a(bundle2);
        }
        g gVar2 = gVar;
        Bundle bundle3 = bundle.getBundle(e(2));
        if (bundle3 == null) {
            d02 = D0.f45199G;
        } else {
            d02 = (D0) D0.f45200H.a(bundle3);
        }
        D0 d03 = d02;
        Bundle bundle4 = bundle.getBundle(e(3));
        if (bundle4 == null) {
            eVar = e.f45887h;
        } else {
            eVar = (e) d.f45876g.a(bundle4);
        }
        e eVar2 = eVar;
        Bundle bundle5 = bundle.getBundle(e(4));
        if (bundle5 == null) {
            jVar = j.f45927d;
        } else {
            jVar = (j) j.f45928e.a(bundle5);
        }
        return new C3732y0(str, eVar2, (i) null, gVar2, d03, jVar);
    }

    public static C3732y0 d(Uri uri) {
        return new c().e(uri).a();
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3732y0)) {
            return false;
        }
        C3732y0 y0Var = (C3732y0) obj;
        if (!M.c(this.f45855a, y0Var.f45855a) || !this.f45860f.equals(y0Var.f45860f) || !M.c(this.f45856b, y0Var.f45856b) || !M.c(this.f45858d, y0Var.f45858d) || !M.c(this.f45859e, y0Var.f45859e) || !M.c(this.f45862h, y0Var.f45862h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f45855a.hashCode() * 31;
        h hVar = this.f45856b;
        if (hVar != null) {
            i10 = hVar.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((((hashCode + i10) * 31) + this.f45858d.hashCode()) * 31) + this.f45860f.hashCode()) * 31) + this.f45859e.hashCode()) * 31) + this.f45862h.hashCode();
    }

    private C3732y0(String str, e eVar, i iVar, g gVar, D0 d02, j jVar) {
        this.f45855a = str;
        this.f45856b = iVar;
        this.f45857c = iVar;
        this.f45858d = gVar;
        this.f45859e = d02;
        this.f45860f = eVar;
        this.f45861g = eVar;
        this.f45862h = jVar;
    }
}
