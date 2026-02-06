package T9;

import android.net.Uri;
import com.google.common.collect.B;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4771w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o9.m;

public final class g extends i {

    /* renamed from: d  reason: collision with root package name */
    public final int f34268d;

    /* renamed from: e  reason: collision with root package name */
    public final long f34269e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f34270f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f34271g;

    /* renamed from: h  reason: collision with root package name */
    public final long f34272h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f34273i;

    /* renamed from: j  reason: collision with root package name */
    public final int f34274j;

    /* renamed from: k  reason: collision with root package name */
    public final long f34275k;

    /* renamed from: l  reason: collision with root package name */
    public final int f34276l;

    /* renamed from: m  reason: collision with root package name */
    public final long f34277m;

    /* renamed from: n  reason: collision with root package name */
    public final long f34278n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f34279o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f34280p;

    /* renamed from: q  reason: collision with root package name */
    public final m f34281q;

    /* renamed from: r  reason: collision with root package name */
    public final List f34282r;

    /* renamed from: s  reason: collision with root package name */
    public final List f34283s;

    /* renamed from: t  reason: collision with root package name */
    public final Map f34284t;

    /* renamed from: u  reason: collision with root package name */
    public final long f34285u;

    /* renamed from: v  reason: collision with root package name */
    public final f f34286v;

    public static final class b extends e {

        /* renamed from: l  reason: collision with root package name */
        public final boolean f34287l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f34288m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, mVar, str2, str3, j12, j13, z10);
            this.f34287l = z11;
            this.f34288m = z12;
        }

        public b b(long j10, int i10) {
            int i11 = i10;
            return new b(this.f34294a, this.f34295b, this.f34296c, i11, j10, this.f34299f, this.f34300g, this.f34301h, this.f34302i, this.f34303j, this.f34304k, this.f34287l, this.f34288m);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f34289a;

        /* renamed from: b  reason: collision with root package name */
        public final long f34290b;

        /* renamed from: c  reason: collision with root package name */
        public final int f34291c;

        public c(Uri uri, long j10, int i10) {
            this.f34289a = uri;
            this.f34290b = j10;
            this.f34291c = i10;
        }
    }

    public static class e implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public final String f34294a;

        /* renamed from: b  reason: collision with root package name */
        public final d f34295b;

        /* renamed from: c  reason: collision with root package name */
        public final long f34296c;

        /* renamed from: d  reason: collision with root package name */
        public final int f34297d;

        /* renamed from: e  reason: collision with root package name */
        public final long f34298e;

        /* renamed from: f  reason: collision with root package name */
        public final m f34299f;

        /* renamed from: g  reason: collision with root package name */
        public final String f34300g;

        /* renamed from: h  reason: collision with root package name */
        public final String f34301h;

        /* renamed from: i  reason: collision with root package name */
        public final long f34302i;

        /* renamed from: j  reason: collision with root package name */
        public final long f34303j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f34304k;

        /* renamed from: a */
        public int compareTo(Long l10) {
            if (this.f34298e > l10.longValue()) {
                return 1;
            }
            if (this.f34298e < l10.longValue()) {
                return -1;
            }
            return 0;
        }

        private e(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f34294a = str;
            this.f34295b = dVar;
            this.f34296c = j10;
            this.f34297d = i10;
            this.f34298e = j11;
            this.f34299f = mVar;
            this.f34300g = str2;
            this.f34301h = str3;
            this.f34302i = j12;
            this.f34303j = j13;
            this.f34304k = z10;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f34305a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f34306b;

        /* renamed from: c  reason: collision with root package name */
        public final long f34307c;

        /* renamed from: d  reason: collision with root package name */
        public final long f34308d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f34309e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f34305a = j10;
            this.f34306b = z10;
            this.f34307c = j11;
            this.f34308d = j12;
            this.f34309e = z11;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, m mVar, List list2, List list3, f fVar, Map map) {
        super(str, list, z12);
        long j15 = j10;
        String str2 = str;
        List list4 = list;
        this.f34268d = i10;
        this.f34272h = j11;
        this.f34271g = z10;
        this.f34273i = z11;
        this.f34274j = i11;
        this.f34275k = j12;
        this.f34276l = i12;
        this.f34277m = j13;
        this.f34278n = j14;
        this.f34279o = z13;
        this.f34280p = z14;
        this.f34281q = mVar;
        this.f34282r = C4770v.z(list2);
        this.f34283s = C4770v.z(list3);
        this.f34284t = C4771w.c(map);
        if (!list3.isEmpty()) {
            b bVar = (b) B.d(list3);
            this.f34285u = bVar.f34298e + bVar.f34296c;
        } else if (!list2.isEmpty()) {
            d dVar = (d) B.d(list2);
            this.f34285u = dVar.f34298e + dVar.f34296c;
        } else {
            this.f34285u = 0;
        }
        long j16 = -9223372036854775807L;
        if (j15 != -9223372036854775807L) {
            if (j15 >= 0) {
                j16 = Math.min(this.f34285u, j10);
            } else {
                j16 = Math.max(0, this.f34285u + j15);
            }
        }
        this.f34269e = j16;
        this.f34270f = j15 >= 0;
        this.f34286v = fVar;
    }

    public g c(long j10, int i10) {
        int i11 = this.f34268d;
        return new g(i11, this.f34331a, this.f34332b, this.f34269e, this.f34271g, j10, true, i10, this.f34275k, this.f34276l, this.f34277m, this.f34278n, this.f34333c, this.f34279o, this.f34280p, this.f34281q, this.f34282r, this.f34283s, this.f34286v, this.f34284t);
    }

    public g d() {
        if (this.f34279o) {
            return this;
        }
        g gVar = r2;
        g gVar2 = new g(this.f34268d, this.f34331a, this.f34332b, this.f34269e, this.f34271g, this.f34272h, this.f34273i, this.f34274j, this.f34275k, this.f34276l, this.f34277m, this.f34278n, this.f34333c, true, this.f34280p, this.f34281q, this.f34282r, this.f34283s, this.f34286v, this.f34284t);
        return gVar;
    }

    public long e() {
        return this.f34272h + this.f34285u;
    }

    public boolean f(g gVar) {
        if (gVar == null) {
            return true;
        }
        long j10 = this.f34275k;
        long j11 = gVar.f34275k;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f34282r.size() - gVar.f34282r.size();
        if (size == 0) {
            int size2 = this.f34283s.size();
            int size3 = gVar.f34283s.size();
            if (size2 > size3) {
                return true;
            }
            if (size2 != size3 || !this.f34279o || gVar.f34279o) {
                return false;
            }
            return true;
        } else if (size > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static final class d extends e {

        /* renamed from: l  reason: collision with root package name */
        public final String f34292l;

        /* renamed from: m  reason: collision with root package name */
        public final List f34293m;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, (d) null, "", 0, -1, -9223372036854775807L, (m) null, str2, str3, j10, j11, false, C4770v.E());
        }

        public d b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f34293m.size(); i11++) {
                b bVar = (b) this.f34293m.get(i11);
                arrayList.add(bVar.b(j11, i10));
                j11 += bVar.f34296c;
            }
            int i12 = i10;
            return new d(this.f34294a, this.f34295b, this.f34292l, this.f34296c, i10, j10, this.f34299f, this.f34300g, this.f34301h, this.f34302i, this.f34303j, this.f34304k, arrayList);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, d dVar, String str2, long j10, int i10, long j11, m mVar, String str3, String str4, long j12, long j13, boolean z10, List list) {
            super(str, dVar, j10, i10, j11, mVar, str3, str4, j12, j13, z10);
            this.f34292l = str2;
            this.f34293m = C4770v.z(list);
        }
    }

    /* renamed from: b */
    public g a(List list) {
        return this;
    }
}
