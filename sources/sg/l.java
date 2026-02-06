package Sg;

import Ef.i;
import Rg.k;
import Sg.k;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import mf.C6548a;
import mf.C6550c;
import mf.C6565s;
import yf.C6798l;

final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Matcher f65080a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f65081b;

    /* renamed from: c  reason: collision with root package name */
    private final j f65082c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    private List f65083d;

    public static final class a extends C6550c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f65084b;

        a(l lVar) {
            this.f65084b = lVar;
        }

        public int a() {
            return this.f65084b.e().groupCount() + 1;
        }

        public /* bridge */ boolean b(String str) {
            return super.contains(str);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return b((String) obj);
        }

        /* renamed from: g */
        public String get(int i10) {
            String group = this.f65084b.e().group(i10);
            if (group == null) {
                return "";
            }
            return group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return k((String) obj);
        }

        public /* bridge */ int k(String str) {
            return super.indexOf(str);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return n((String) obj);
        }

        public /* bridge */ int n(String str) {
            return super.lastIndexOf(str);
        }
    }

    public static final class b extends C6548a implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f65085a;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f65086a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.f65086a = bVar;
            }

            public final i a(int i10) {
                return this.f65086a.g(i10);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        b(l lVar) {
            this.f65085a = lVar;
        }

        public int a() {
            return this.f65085a.e().groupCount() + 1;
        }

        public /* bridge */ boolean b(i iVar) {
            return super.contains(iVar);
        }

        public final /* bridge */ boolean contains(Object obj) {
            boolean z10;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = obj instanceof i;
            }
            if (!z10) {
                return false;
            }
            return b((i) obj);
        }

        public i g(int i10) {
            i d10 = n.h(this.f65085a.e(), i10);
            if (d10.a().intValue() < 0) {
                return null;
            }
            String group = this.f65085a.e().group(i10);
            C6496s.g(group, "group(...)");
            return new i(group, d10);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator iterator() {
            return k.x(C6565s.b0(C6565s.o(this)), new a(this)).iterator();
        }
    }

    public l(Matcher matcher, CharSequence charSequence) {
        C6496s.h(matcher, "matcher");
        C6496s.h(charSequence, MetricTracker.Object.INPUT);
        this.f65080a = matcher;
        this.f65081b = charSequence;
    }

    /* access modifiers changed from: private */
    public final MatchResult e() {
        return this.f65080a;
    }

    public k.b a() {
        return k.a.a(this);
    }

    public List b() {
        if (this.f65083d == null) {
            this.f65083d = new a(this);
        }
        List list = this.f65083d;
        C6496s.e(list);
        return list;
    }

    public i c() {
        return n.g(e());
    }

    public k next() {
        int i10;
        int end = e().end();
        if (e().end() == e().start()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = end + i10;
        if (i11 > this.f65081b.length()) {
            return null;
        }
        Matcher matcher = this.f65080a.pattern().matcher(this.f65081b);
        C6496s.g(matcher, "matcher(...)");
        return n.e(matcher, i11, this.f65081b);
    }
}
