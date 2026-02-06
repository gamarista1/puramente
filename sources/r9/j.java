package R9;

import Q9.f;
import R9.k;
import android.net.Uri;
import com.google.common.collect.C4770v;
import ja.C3645a;
import java.util.Collections;
import java.util.List;
import k9.C3717q0;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f33802a;

    /* renamed from: b  reason: collision with root package name */
    public final C3717q0 f33803b;

    /* renamed from: c  reason: collision with root package name */
    public final C4770v f33804c;

    /* renamed from: d  reason: collision with root package name */
    public final long f33805d;

    /* renamed from: e  reason: collision with root package name */
    public final List f33806e;

    /* renamed from: f  reason: collision with root package name */
    public final List f33807f;

    /* renamed from: g  reason: collision with root package name */
    public final List f33808g;

    /* renamed from: h  reason: collision with root package name */
    private final i f33809h;

    public static class c extends j {

        /* renamed from: i  reason: collision with root package name */
        public final Uri f33811i;

        /* renamed from: j  reason: collision with root package name */
        public final long f33812j;

        /* renamed from: k  reason: collision with root package name */
        private final String f33813k;

        /* renamed from: l  reason: collision with root package name */
        private final i f33814l;

        /* renamed from: m  reason: collision with root package name */
        private final m f33815m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(long j10, C3717q0 q0Var, List list, k.e eVar, List list2, List list3, List list4, String str, long j11) {
            super(j10, q0Var, list, eVar, list2, list3, list4);
            m mVar;
            List list5 = list;
            this.f33811i = Uri.parse(((b) list.get(0)).f33749a);
            i c10 = eVar.c();
            this.f33814l = c10;
            this.f33813k = str;
            this.f33812j = j11;
            if (c10 != null) {
                mVar = null;
            } else {
                mVar = new m(new i((String) null, 0, j11));
            }
            this.f33815m = mVar;
        }

        public String a() {
            return this.f33813k;
        }

        public f l() {
            return this.f33815m;
        }

        public i m() {
            return this.f33814l;
        }
    }

    public static j o(long j10, C3717q0 q0Var, List list, k kVar, List list2, List list3, List list4, String str) {
        k kVar2 = kVar;
        if (kVar2 instanceof k.e) {
            return new c(j10, q0Var, list, (k.e) kVar2, list2, list3, list4, str, -1);
        } else if (kVar2 instanceof k.a) {
            return new b(j10, q0Var, list, (k.a) kVar2, list2, list3, list4);
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }

    public abstract String a();

    public abstract f l();

    public abstract i m();

    public i n() {
        return this.f33809h;
    }

    private j(long j10, C3717q0 q0Var, List list, k kVar, List list2, List list3, List list4) {
        List list5;
        C3645a.a(!list.isEmpty());
        this.f33802a = j10;
        this.f33803b = q0Var;
        this.f33804c = C4770v.z(list);
        if (list2 == null) {
            list5 = Collections.emptyList();
        } else {
            list5 = Collections.unmodifiableList(list2);
        }
        this.f33806e = list5;
        this.f33807f = list3;
        this.f33808g = list4;
        this.f33809h = kVar.a(this);
        this.f33805d = kVar.b();
    }

    public static class b extends j implements f {

        /* renamed from: i  reason: collision with root package name */
        final k.a f33810i;

        public b(long j10, C3717q0 q0Var, List list, k.a aVar, List list2, List list3, List list4) {
            super(j10, q0Var, list, aVar, list2, list3, list4);
            this.f33810i = aVar;
        }

        public String a() {
            return null;
        }

        public long b(long j10) {
            return this.f33810i.j(j10);
        }

        public long c(long j10, long j11) {
            return this.f33810i.h(j10, j11);
        }

        public long d(long j10, long j11) {
            return this.f33810i.d(j10, j11);
        }

        public long e(long j10, long j11) {
            return this.f33810i.f(j10, j11);
        }

        public i f(long j10) {
            return this.f33810i.k(this, j10);
        }

        public long g(long j10, long j11) {
            return this.f33810i.i(j10, j11);
        }

        public long h(long j10) {
            return this.f33810i.g(j10);
        }

        public boolean i() {
            return this.f33810i.l();
        }

        public long j() {
            return this.f33810i.e();
        }

        public long k(long j10, long j11) {
            return this.f33810i.c(j10, j11);
        }

        public i m() {
            return null;
        }

        public f l() {
            return this;
        }
    }
}
