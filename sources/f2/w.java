package f2;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4771w;
import i2.C2076a;
import i2.L;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class w {

    /* renamed from: i  reason: collision with root package name */
    public static final w f20149i = new c().a();

    /* renamed from: j  reason: collision with root package name */
    private static final String f20150j = L.y0(0);

    /* renamed from: k  reason: collision with root package name */
    private static final String f20151k = L.y0(1);

    /* renamed from: l  reason: collision with root package name */
    private static final String f20152l = L.y0(2);

    /* renamed from: m  reason: collision with root package name */
    private static final String f20153m = L.y0(3);

    /* renamed from: n  reason: collision with root package name */
    private static final String f20154n = L.y0(4);

    /* renamed from: o  reason: collision with root package name */
    private static final String f20155o = L.y0(5);

    /* renamed from: a  reason: collision with root package name */
    public final String f20156a;

    /* renamed from: b  reason: collision with root package name */
    public final h f20157b;

    /* renamed from: c  reason: collision with root package name */
    public final h f20158c;

    /* renamed from: d  reason: collision with root package name */
    public final g f20159d;

    /* renamed from: e  reason: collision with root package name */
    public final y f20160e;

    /* renamed from: f  reason: collision with root package name */
    public final d f20161f;

    /* renamed from: g  reason: collision with root package name */
    public final e f20162g;

    /* renamed from: h  reason: collision with root package name */
    public final i f20163h;

    public static final class b {
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f20164a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f20165b;

        /* renamed from: c  reason: collision with root package name */
        private String f20166c;

        /* renamed from: d  reason: collision with root package name */
        private d.a f20167d;

        /* renamed from: e  reason: collision with root package name */
        private f.a f20168e;

        /* renamed from: f  reason: collision with root package name */
        private List f20169f;

        /* renamed from: g  reason: collision with root package name */
        private String f20170g;

        /* renamed from: h  reason: collision with root package name */
        private C4770v f20171h;

        /* renamed from: i  reason: collision with root package name */
        private Object f20172i;

        /* renamed from: j  reason: collision with root package name */
        private long f20173j;

        /* renamed from: k  reason: collision with root package name */
        private y f20174k;

        /* renamed from: l  reason: collision with root package name */
        private g.a f20175l;

        /* renamed from: m  reason: collision with root package name */
        private i f20176m;

        public w a() {
            boolean z10;
            h hVar;
            if (this.f20168e.f20218b == null || this.f20168e.f20217a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
            Uri uri = this.f20165b;
            f fVar = null;
            if (uri != null) {
                String str = this.f20166c;
                if (this.f20168e.f20217a != null) {
                    fVar = this.f20168e.i();
                }
                hVar = new h(uri, str, fVar, (b) null, this.f20169f, this.f20170g, this.f20171h, this.f20172i, this.f20173j);
            } else {
                hVar = null;
            }
            String str2 = this.f20164a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            e g10 = this.f20167d.g();
            g f10 = this.f20175l.f();
            y yVar = this.f20174k;
            if (yVar == null) {
                yVar = y.f20291H;
            }
            return new w(str3, g10, hVar, f10, yVar, this.f20176m);
        }

        public c b(g gVar) {
            this.f20175l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f20164a = (String) C2076a.e(str);
            return this;
        }

        public c d(List list) {
            this.f20171h = C4770v.z(list);
            return this;
        }

        public c e(Object obj) {
            this.f20172i = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f20165b = uri;
            return this;
        }

        public c g(String str) {
            Uri uri;
            if (str == null) {
                uri = null;
            } else {
                uri = Uri.parse(str);
            }
            return f(uri);
        }

        public c() {
            this.f20167d = new d.a();
            this.f20168e = new f.a();
            this.f20169f = Collections.emptyList();
            this.f20171h = C4770v.E();
            this.f20175l = new g.a();
            this.f20176m = i.f20258d;
            this.f20173j = -9223372036854775807L;
        }

        private c(w wVar) {
            this();
            f.a aVar;
            this.f20167d = wVar.f20161f.a();
            this.f20164a = wVar.f20156a;
            this.f20174k = wVar.f20160e;
            this.f20175l = wVar.f20159d.a();
            this.f20176m = wVar.f20163h;
            h hVar = wVar.f20157b;
            if (hVar != null) {
                this.f20170g = hVar.f20253e;
                this.f20166c = hVar.f20250b;
                this.f20165b = hVar.f20249a;
                this.f20169f = hVar.f20252d;
                this.f20171h = hVar.f20254f;
                this.f20172i = hVar.f20256h;
                f fVar = hVar.f20251c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f20168e = aVar;
                this.f20173j = hVar.f20257i;
            }
        }
    }

    public static class d {

        /* renamed from: h  reason: collision with root package name */
        public static final d f20177h = new a().f();

        /* renamed from: i  reason: collision with root package name */
        private static final String f20178i = L.y0(0);

        /* renamed from: j  reason: collision with root package name */
        private static final String f20179j = L.y0(1);

        /* renamed from: k  reason: collision with root package name */
        private static final String f20180k = L.y0(2);

        /* renamed from: l  reason: collision with root package name */
        private static final String f20181l = L.y0(3);

        /* renamed from: m  reason: collision with root package name */
        private static final String f20182m = L.y0(4);

        /* renamed from: n  reason: collision with root package name */
        static final String f20183n = L.y0(5);

        /* renamed from: o  reason: collision with root package name */
        static final String f20184o = L.y0(6);

        /* renamed from: a  reason: collision with root package name */
        public final long f20185a;

        /* renamed from: b  reason: collision with root package name */
        public final long f20186b;

        /* renamed from: c  reason: collision with root package name */
        public final long f20187c;

        /* renamed from: d  reason: collision with root package name */
        public final long f20188d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f20189e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f20190f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f20191g;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f20192a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f20193b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public boolean f20194c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f20195d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f20196e;

            public d f() {
                return new d(this);
            }

            public e g() {
                return new e(this);
            }

            public a() {
                this.f20193b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f20192a = dVar.f20186b;
                this.f20193b = dVar.f20188d;
                this.f20194c = dVar.f20189e;
                this.f20195d = dVar.f20190f;
                this.f20196e = dVar.f20191g;
            }
        }

        public a a() {
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
            if (this.f20186b == dVar.f20186b && this.f20188d == dVar.f20188d && this.f20189e == dVar.f20189e && this.f20190f == dVar.f20190f && this.f20191g == dVar.f20191g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f20186b;
            long j11 = this.f20188d;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f20189e ? 1 : 0)) * 31) + (this.f20190f ? 1 : 0)) * 31) + (this.f20191g ? 1 : 0);
        }

        private d(a aVar) {
            this.f20185a = L.h1(aVar.f20192a);
            this.f20187c = L.h1(aVar.f20193b);
            this.f20186b = aVar.f20192a;
            this.f20188d = aVar.f20193b;
            this.f20189e = aVar.f20194c;
            this.f20190f = aVar.f20195d;
            this.f20191g = aVar.f20196e;
        }
    }

    public static final class e extends d {

        /* renamed from: p  reason: collision with root package name */
        public static final e f20197p = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* renamed from: l  reason: collision with root package name */
        private static final String f20198l = L.y0(0);

        /* renamed from: m  reason: collision with root package name */
        private static final String f20199m = L.y0(1);

        /* renamed from: n  reason: collision with root package name */
        private static final String f20200n = L.y0(2);

        /* renamed from: o  reason: collision with root package name */
        private static final String f20201o = L.y0(3);

        /* renamed from: p  reason: collision with root package name */
        static final String f20202p = L.y0(4);

        /* renamed from: q  reason: collision with root package name */
        private static final String f20203q = L.y0(5);

        /* renamed from: r  reason: collision with root package name */
        private static final String f20204r = L.y0(6);

        /* renamed from: s  reason: collision with root package name */
        private static final String f20205s = L.y0(7);

        /* renamed from: a  reason: collision with root package name */
        public final UUID f20206a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f20207b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f20208c;

        /* renamed from: d  reason: collision with root package name */
        public final C4771w f20209d;

        /* renamed from: e  reason: collision with root package name */
        public final C4771w f20210e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f20211f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f20212g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f20213h;

        /* renamed from: i  reason: collision with root package name */
        public final C4770v f20214i;

        /* renamed from: j  reason: collision with root package name */
        public final C4770v f20215j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public final byte[] f20216k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f20216k;
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
            if (!this.f20206a.equals(fVar.f20206a) || !L.c(this.f20208c, fVar.f20208c) || !L.c(this.f20210e, fVar.f20210e) || this.f20211f != fVar.f20211f || this.f20213h != fVar.f20213h || this.f20212g != fVar.f20212g || !this.f20215j.equals(fVar.f20215j) || !Arrays.equals(this.f20216k, fVar.f20216k)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f20206a.hashCode() * 31;
            Uri uri = this.f20208c;
            if (uri != null) {
                i10 = uri.hashCode();
            } else {
                i10 = 0;
            }
            return ((((((((((((hashCode + i10) * 31) + this.f20210e.hashCode()) * 31) + (this.f20211f ? 1 : 0)) * 31) + (this.f20213h ? 1 : 0)) * 31) + (this.f20212g ? 1 : 0)) * 31) + this.f20215j.hashCode()) * 31) + Arrays.hashCode(this.f20216k);
        }

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public UUID f20217a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public Uri f20218b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public C4771w f20219c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f20220d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f20221e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public boolean f20222f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public C4770v f20223g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public byte[] f20224h;

            public f i() {
                return new f(this);
            }

            private a() {
                this.f20219c = C4771w.n();
                this.f20221e = true;
                this.f20223g = C4770v.E();
            }

            private a(f fVar) {
                this.f20217a = fVar.f20206a;
                this.f20218b = fVar.f20208c;
                this.f20219c = fVar.f20210e;
                this.f20220d = fVar.f20211f;
                this.f20221e = fVar.f20212g;
                this.f20222f = fVar.f20213h;
                this.f20223g = fVar.f20215j;
                this.f20224h = fVar.f20216k;
            }
        }

        private f(a aVar) {
            C2076a.g(!aVar.f20222f || aVar.f20218b != null);
            UUID uuid = (UUID) C2076a.e(aVar.f20217a);
            this.f20206a = uuid;
            this.f20207b = uuid;
            this.f20208c = aVar.f20218b;
            this.f20209d = aVar.f20219c;
            this.f20210e = aVar.f20219c;
            this.f20211f = aVar.f20220d;
            this.f20213h = aVar.f20222f;
            this.f20212g = aVar.f20221e;
            this.f20214i = aVar.f20223g;
            this.f20215j = aVar.f20223g;
            this.f20216k = aVar.f20224h != null ? Arrays.copyOf(aVar.f20224h, aVar.f20224h.length) : null;
        }
    }

    public static final class g {

        /* renamed from: f  reason: collision with root package name */
        public static final g f20225f = new a().f();

        /* renamed from: g  reason: collision with root package name */
        private static final String f20226g = L.y0(0);

        /* renamed from: h  reason: collision with root package name */
        private static final String f20227h = L.y0(1);

        /* renamed from: i  reason: collision with root package name */
        private static final String f20228i = L.y0(2);

        /* renamed from: j  reason: collision with root package name */
        private static final String f20229j = L.y0(3);

        /* renamed from: k  reason: collision with root package name */
        private static final String f20230k = L.y0(4);

        /* renamed from: a  reason: collision with root package name */
        public final long f20231a;

        /* renamed from: b  reason: collision with root package name */
        public final long f20232b;

        /* renamed from: c  reason: collision with root package name */
        public final long f20233c;

        /* renamed from: d  reason: collision with root package name */
        public final float f20234d;

        /* renamed from: e  reason: collision with root package name */
        public final float f20235e;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f20236a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f20237b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public long f20238c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public float f20239d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public float f20240e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f20238c = j10;
                return this;
            }

            public a h(float f10) {
                this.f20240e = f10;
                return this;
            }

            public a i(long j10) {
                this.f20237b = j10;
                return this;
            }

            public a j(float f10) {
                this.f20239d = f10;
                return this;
            }

            public a k(long j10) {
                this.f20236a = j10;
                return this;
            }

            public a() {
                this.f20236a = -9223372036854775807L;
                this.f20237b = -9223372036854775807L;
                this.f20238c = -9223372036854775807L;
                this.f20239d = -3.4028235E38f;
                this.f20240e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f20236a = gVar.f20231a;
                this.f20237b = gVar.f20232b;
                this.f20238c = gVar.f20233c;
                this.f20239d = gVar.f20234d;
                this.f20240e = gVar.f20235e;
            }
        }

        public a a() {
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
            if (this.f20231a == gVar.f20231a && this.f20232b == gVar.f20232b && this.f20233c == gVar.f20233c && this.f20234d == gVar.f20234d && this.f20235e == gVar.f20235e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            long j10 = this.f20231a;
            long j11 = this.f20232b;
            long j12 = this.f20233c;
            int i11 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f20234d;
            int i12 = 0;
            if (f10 != 0.0f) {
                i10 = Float.floatToIntBits(f10);
            } else {
                i10 = 0;
            }
            int i13 = (i11 + i10) * 31;
            float f11 = this.f20235e;
            if (f11 != 0.0f) {
                i12 = Float.floatToIntBits(f11);
            }
            return i13 + i12;
        }

        private g(a aVar) {
            this(aVar.f20236a, aVar.f20237b, aVar.f20238c, aVar.f20239d, aVar.f20240e);
        }

        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f20231a = j10;
            this.f20232b = j11;
            this.f20233c = j12;
            this.f20234d = f10;
            this.f20235e = f11;
        }
    }

    public static final class h {

        /* renamed from: j  reason: collision with root package name */
        private static final String f20241j = L.y0(0);

        /* renamed from: k  reason: collision with root package name */
        private static final String f20242k = L.y0(1);

        /* renamed from: l  reason: collision with root package name */
        private static final String f20243l = L.y0(2);

        /* renamed from: m  reason: collision with root package name */
        private static final String f20244m = L.y0(3);

        /* renamed from: n  reason: collision with root package name */
        private static final String f20245n = L.y0(4);

        /* renamed from: o  reason: collision with root package name */
        private static final String f20246o = L.y0(5);

        /* renamed from: p  reason: collision with root package name */
        private static final String f20247p = L.y0(6);

        /* renamed from: q  reason: collision with root package name */
        private static final String f20248q = L.y0(7);

        /* renamed from: a  reason: collision with root package name */
        public final Uri f20249a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20250b;

        /* renamed from: c  reason: collision with root package name */
        public final f f20251c;

        /* renamed from: d  reason: collision with root package name */
        public final List f20252d;

        /* renamed from: e  reason: collision with root package name */
        public final String f20253e;

        /* renamed from: f  reason: collision with root package name */
        public final C4770v f20254f;

        /* renamed from: g  reason: collision with root package name */
        public final List f20255g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f20256h;

        /* renamed from: i  reason: collision with root package name */
        public final long f20257i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (!this.f20249a.equals(hVar.f20249a) || !L.c(this.f20250b, hVar.f20250b) || !L.c(this.f20251c, hVar.f20251c) || !L.c((Object) null, (Object) null) || !this.f20252d.equals(hVar.f20252d) || !L.c(this.f20253e, hVar.f20253e) || !this.f20254f.equals(hVar.f20254f) || !L.c(this.f20256h, hVar.f20256h) || !L.c(Long.valueOf(this.f20257i), Long.valueOf(hVar.f20257i))) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int hashCode = this.f20249a.hashCode() * 31;
            String str = this.f20250b;
            int i13 = 0;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            int i14 = (hashCode + i10) * 31;
            f fVar = this.f20251c;
            if (fVar == null) {
                i11 = 0;
            } else {
                i11 = fVar.hashCode();
            }
            int hashCode2 = (((i14 + i11) * 961) + this.f20252d.hashCode()) * 31;
            String str2 = this.f20253e;
            if (str2 == null) {
                i12 = 0;
            } else {
                i12 = str2.hashCode();
            }
            int hashCode3 = (((hashCode2 + i12) * 31) + this.f20254f.hashCode()) * 31;
            Object obj = this.f20256h;
            if (obj != null) {
                i13 = obj.hashCode();
            }
            return (int) ((((long) (hashCode3 + i13)) * 31) + this.f20257i);
        }

        private h(Uri uri, String str, f fVar, b bVar, List list, String str2, C4770v vVar, Object obj, long j10) {
            this.f20249a = uri;
            this.f20250b = C1960A.p(str);
            this.f20251c = fVar;
            this.f20252d = list;
            this.f20253e = str2;
            this.f20254f = vVar;
            C4770v.a t10 = C4770v.t();
            for (int i10 = 0; i10 < vVar.size(); i10++) {
                t10.a(((k) vVar.get(i10)).a().i());
            }
            this.f20255g = t10.k();
            this.f20256h = obj;
            this.f20257i = j10;
        }
    }

    public static final class i {

        /* renamed from: d  reason: collision with root package name */
        public static final i f20258d = new a().d();

        /* renamed from: e  reason: collision with root package name */
        private static final String f20259e = L.y0(0);

        /* renamed from: f  reason: collision with root package name */
        private static final String f20260f = L.y0(1);

        /* renamed from: g  reason: collision with root package name */
        private static final String f20261g = L.y0(2);

        /* renamed from: a  reason: collision with root package name */
        public final Uri f20262a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20263b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f20264c;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public Uri f20265a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f20266b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public Bundle f20267c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            boolean z10;
            boolean z11;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (L.c(this.f20262a, iVar.f20262a) && L.c(this.f20263b, iVar.f20263b)) {
                if (this.f20264c == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (iVar.f20264c == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int i11;
            Uri uri = this.f20262a;
            int i12 = 0;
            if (uri == null) {
                i10 = 0;
            } else {
                i10 = uri.hashCode();
            }
            int i13 = i10 * 31;
            String str = this.f20263b;
            if (str == null) {
                i11 = 0;
            } else {
                i11 = str.hashCode();
            }
            int i14 = (i13 + i11) * 31;
            if (this.f20264c != null) {
                i12 = 1;
            }
            return i14 + i12;
        }

        private i(a aVar) {
            this.f20262a = aVar.f20265a;
            this.f20263b = aVar.f20266b;
            this.f20264c = aVar.f20267c;
        }
    }

    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k {

        /* renamed from: h  reason: collision with root package name */
        private static final String f20268h = L.y0(0);

        /* renamed from: i  reason: collision with root package name */
        private static final String f20269i = L.y0(1);

        /* renamed from: j  reason: collision with root package name */
        private static final String f20270j = L.y0(2);

        /* renamed from: k  reason: collision with root package name */
        private static final String f20271k = L.y0(3);

        /* renamed from: l  reason: collision with root package name */
        private static final String f20272l = L.y0(4);

        /* renamed from: m  reason: collision with root package name */
        private static final String f20273m = L.y0(5);

        /* renamed from: n  reason: collision with root package name */
        private static final String f20274n = L.y0(6);

        /* renamed from: a  reason: collision with root package name */
        public final Uri f20275a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20276b;

        /* renamed from: c  reason: collision with root package name */
        public final String f20277c;

        /* renamed from: d  reason: collision with root package name */
        public final int f20278d;

        /* renamed from: e  reason: collision with root package name */
        public final int f20279e;

        /* renamed from: f  reason: collision with root package name */
        public final String f20280f;

        /* renamed from: g  reason: collision with root package name */
        public final String f20281g;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public Uri f20282a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f20283b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public String f20284c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public int f20285d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public int f20286e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public String f20287f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public String f20288g;

            /* access modifiers changed from: private */
            public j i() {
                return new j(this);
            }

            private a(k kVar) {
                this.f20282a = kVar.f20275a;
                this.f20283b = kVar.f20276b;
                this.f20284c = kVar.f20277c;
                this.f20285d = kVar.f20278d;
                this.f20286e = kVar.f20279e;
                this.f20287f = kVar.f20280f;
                this.f20288g = kVar.f20281g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (!this.f20275a.equals(kVar.f20275a) || !L.c(this.f20276b, kVar.f20276b) || !L.c(this.f20277c, kVar.f20277c) || this.f20278d != kVar.f20278d || this.f20279e != kVar.f20279e || !L.c(this.f20280f, kVar.f20280f) || !L.c(this.f20281g, kVar.f20281g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int hashCode = this.f20275a.hashCode() * 31;
            String str = this.f20276b;
            int i13 = 0;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            int i14 = (hashCode + i10) * 31;
            String str2 = this.f20277c;
            if (str2 == null) {
                i11 = 0;
            } else {
                i11 = str2.hashCode();
            }
            int i15 = (((((i14 + i11) * 31) + this.f20278d) * 31) + this.f20279e) * 31;
            String str3 = this.f20280f;
            if (str3 == null) {
                i12 = 0;
            } else {
                i12 = str3.hashCode();
            }
            int i16 = (i15 + i12) * 31;
            String str4 = this.f20281g;
            if (str4 != null) {
                i13 = str4.hashCode();
            }
            return i16 + i13;
        }

        private k(a aVar) {
            this.f20275a = aVar.f20282a;
            this.f20276b = aVar.f20283b;
            this.f20277c = aVar.f20284c;
            this.f20278d = aVar.f20285d;
            this.f20279e = aVar.f20286e;
            this.f20280f = aVar.f20287f;
            this.f20281g = aVar.f20288g;
        }
    }

    public static w b(Uri uri) {
        return new c().f(uri).a();
    }

    public static w c(String str) {
        return new c().g(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!L.c(this.f20156a, wVar.f20156a) || !this.f20161f.equals(wVar.f20161f) || !L.c(this.f20157b, wVar.f20157b) || !L.c(this.f20159d, wVar.f20159d) || !L.c(this.f20160e, wVar.f20160e) || !L.c(this.f20163h, wVar.f20163h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f20156a.hashCode() * 31;
        h hVar = this.f20157b;
        if (hVar != null) {
            i10 = hVar.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((((hashCode + i10) * 31) + this.f20159d.hashCode()) * 31) + this.f20161f.hashCode()) * 31) + this.f20160e.hashCode()) * 31) + this.f20163h.hashCode();
    }

    private w(String str, e eVar, h hVar, g gVar, y yVar, i iVar) {
        this.f20156a = str;
        this.f20157b = hVar;
        this.f20158c = hVar;
        this.f20159d = gVar;
        this.f20160e = yVar;
        this.f20161f = eVar;
        this.f20162g = eVar;
        this.f20163h = iVar;
    }
}
