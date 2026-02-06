package rh;

import Gh.C5404e;
import Gh.C5405f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.v;
import sh.C6726e;

public final class s extends D {

    /* renamed from: c  reason: collision with root package name */
    public static final b f73459c = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final y f73460d = y.f73499e.a("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    private final List f73461a;

    /* renamed from: b  reason: collision with root package name */
    private final List f73462b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Charset f73463a;

        /* renamed from: b  reason: collision with root package name */
        private final List f73464b;

        /* renamed from: c  reason: collision with root package name */
        private final List f73465c;

        public a() {
            this((Charset) null, 1, (DefaultConstructorMarker) null);
        }

        public final a a(String str, String str2) {
            String str3 = str;
            C6496s.h(str3, "name");
            C6496s.h(str2, "value");
            v.b bVar = v.f73477k;
            this.f73464b.add(v.b.b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f73463a, 91, (Object) null));
            this.f73465c.add(v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f73463a, 91, (Object) null));
            return this;
        }

        public final a b(String str, String str2) {
            String str3 = str;
            C6496s.h(str3, "name");
            C6496s.h(str2, "value");
            v.b bVar = v.f73477k;
            this.f73464b.add(v.b.b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f73463a, 83, (Object) null));
            this.f73465c.add(v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f73463a, 83, (Object) null));
            return this;
        }

        public final s c() {
            return new s(this.f73464b, this.f73465c);
        }

        public a(Charset charset) {
            this.f73463a = charset;
            this.f73464b = new ArrayList();
            this.f73465c = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public s(List list, List list2) {
        C6496s.h(list, "encodedNames");
        C6496s.h(list2, "encodedValues");
        this.f73461a = C6726e.V(list);
        this.f73462b = C6726e.V(list2);
    }

    private final long a(C5405f fVar, boolean z10) {
        C5404e eVar;
        if (z10) {
            eVar = new C5404e();
        } else {
            C6496s.e(fVar);
            eVar = fVar.i();
        }
        int size = this.f73461a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                eVar.K0(38);
            }
            eVar.X((String) this.f73461a.get(i10));
            eVar.K0(61);
            eVar.X((String) this.f73462b.get(i10));
        }
        if (!z10) {
            return 0;
        }
        long B02 = eVar.B0();
        eVar.a();
        return B02;
    }

    public long contentLength() {
        return a((C5405f) null, true);
    }

    public y contentType() {
        return f73460d;
    }

    public void writeTo(C5405f fVar) {
        C6496s.h(fVar, "sink");
        a(fVar, false);
    }
}
