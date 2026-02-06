package j3;

import Xg.C5694f;
import Xg.C5696h;
import Xg.D;
import Xg.L;
import Xg.N;
import Xg.w;
import Xg.x;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.G;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1797u;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.d0;
import gh.C5988l;
import j3.C2128E;
import j3.k;
import j3.o;
import j3.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import l3.C2173c;
import lf.C6502A;
import lf.C6514M;
import lf.C6531o;
import mf.C6558k;
import mf.C6559l;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

public abstract class n {

    /* renamed from: H  reason: collision with root package name */
    public static final a f22833H = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public static boolean f22834I = true;
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public C6798l f22835A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final Map f22836B;

    /* renamed from: C  reason: collision with root package name */
    private int f22837C;

    /* renamed from: D  reason: collision with root package name */
    private final List f22838D;

    /* renamed from: E  reason: collision with root package name */
    private final Lazy f22839E;

    /* renamed from: F  reason: collision with root package name */
    private final w f22840F;

    /* renamed from: G  reason: collision with root package name */
    private final C5694f f22841G;

    /* renamed from: a  reason: collision with root package name */
    private final Context f22842a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f22843b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public y f22844c;

    /* renamed from: d  reason: collision with root package name */
    private u f22845d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f22846e;

    /* renamed from: f  reason: collision with root package name */
    private Parcelable[] f22847f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22848g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C6558k f22849h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final x f22850i;

    /* renamed from: j  reason: collision with root package name */
    private final L f22851j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final x f22852k;

    /* renamed from: l  reason: collision with root package name */
    private final L f22853l;

    /* renamed from: m  reason: collision with root package name */
    private final Map f22854m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f22855n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Map f22856o;

    /* renamed from: p  reason: collision with root package name */
    private final Map f22857p;

    /* renamed from: q  reason: collision with root package name */
    private C1798v f22858q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public o f22859r;

    /* renamed from: s  reason: collision with root package name */
    private final CopyOnWriteArrayList f22860s;

    /* renamed from: t  reason: collision with root package name */
    private C1790m.b f22861t;

    /* renamed from: u  reason: collision with root package name */
    private final C1797u f22862u;

    /* renamed from: v  reason: collision with root package name */
    private final G f22863v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f22864w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public C2129F f22865x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final Map f22866y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public C6798l f22867z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends G {

        /* renamed from: g  reason: collision with root package name */
        private final C2128E f22868g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n f22869h;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f22870a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k f22871b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f22872c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, k kVar, boolean z10) {
                super(0);
                this.f22870a = bVar;
                this.f22871b = kVar;
                this.f22872c = z10;
            }

            public final void invoke() {
                b.super.g(this.f22871b, this.f22872c);
            }
        }

        public b(n nVar, C2128E e10) {
            C6496s.h(e10, "navigator");
            this.f22869h = nVar;
            this.f22868g = e10;
        }

        public k a(s sVar, Bundle bundle) {
            C6496s.h(sVar, "destination");
            return k.a.b(k.f22809o, this.f22869h.D(), sVar, bundle, this.f22869h.I(), this.f22869h.f22859r, (String) null, (Bundle) null, 96, (Object) null);
        }

        public void e(k kVar) {
            o k10;
            C6496s.h(kVar, "entry");
            boolean c10 = C6496s.c(this.f22869h.f22836B.get(kVar), Boolean.TRUE);
            super.e(kVar);
            this.f22869h.f22836B.remove(kVar);
            if (!this.f22869h.f22849h.contains(kVar)) {
                this.f22869h.u0(kVar);
                if (kVar.getLifecycle().b().b(C1790m.b.CREATED)) {
                    kVar.k(C1790m.b.DESTROYED);
                }
                C6558k d10 = this.f22869h.f22849h;
                if (d10 == null || !d10.isEmpty()) {
                    Iterator it = d10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C6496s.c(((k) it.next()).f(), kVar.f())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (!c10 && (k10 = this.f22869h.f22859r) != null) {
                    k10.c(kVar.f());
                }
                this.f22869h.v0();
                this.f22869h.f22852k.b(this.f22869h.k0());
            } else if (!d()) {
                this.f22869h.v0();
                this.f22869h.f22850i.b(C6565s.h1(this.f22869h.f22849h));
                this.f22869h.f22852k.b(this.f22869h.k0());
            }
        }

        public void g(k kVar, boolean z10) {
            C6496s.h(kVar, "popUpTo");
            C2128E e10 = this.f22869h.f22865x.e(kVar.e().z());
            this.f22869h.f22836B.put(kVar, Boolean.valueOf(z10));
            if (C6496s.c(e10, this.f22868g)) {
                C6798l j10 = this.f22869h.f22835A;
                if (j10 != null) {
                    j10.invoke(kVar);
                    super.g(kVar, z10);
                    return;
                }
                this.f22869h.c0(kVar, new a(this, kVar, z10));
                return;
            }
            Object obj = this.f22869h.f22866y.get(e10);
            C6496s.e(obj);
            ((b) obj).g(kVar, z10);
        }

        public void h(k kVar, boolean z10) {
            C6496s.h(kVar, "popUpTo");
            super.h(kVar, z10);
        }

        public void i(k kVar) {
            C6496s.h(kVar, "entry");
            super.i(kVar);
            if (this.f22869h.f22849h.contains(kVar)) {
                kVar.k(C1790m.b.STARTED);
                return;
            }
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }

        public void j(k kVar) {
            C6496s.h(kVar, "backStackEntry");
            C2128E e10 = this.f22869h.f22865x.e(kVar.e().z());
            if (C6496s.c(e10, this.f22868g)) {
                C6798l c10 = this.f22869h.f22867z;
                if (c10 != null) {
                    c10.invoke(kVar);
                    n(kVar);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + kVar.e() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f22869h.f22866y.get(e10);
            if (obj != null) {
                ((b) obj).j(kVar);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + kVar.e().z() + " should already be created").toString());
        }

        public final void n(k kVar) {
            C6496s.h(kVar, "backStackEntry");
            super.j(kVar);
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22873a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Context invoke(Context context) {
            C6496s.h(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f22874a = new d();

        d() {
            super(1);
        }

        public final void a(C2124A a10) {
            C6496s.h(a10, "$this$navOptions");
            a10.h(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2124A) obj);
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f22875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J f22876b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f22877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f22878d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6558k f22879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(J j10, J j11, n nVar, boolean z10, C6558k kVar) {
            super(1);
            this.f22875a = j10;
            this.f22876b = j11;
            this.f22877c = nVar;
            this.f22878d = z10;
            this.f22879e = kVar;
        }

        public final void a(k kVar) {
            C6496s.h(kVar, "entry");
            this.f22875a.f71755a = true;
            this.f22876b.f71755a = true;
            this.f22877c.i0(kVar, this.f22878d, this.f22879e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k) obj);
            return C6514M.f71813a;
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final f f22880a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final s invoke(s sVar) {
            C6496s.h(sVar, "destination");
            u A10 = sVar.A();
            if (A10 == null || A10.o0() != sVar.x()) {
                return null;
            }
            return sVar.A();
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f22881a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(n nVar) {
            super(1);
            this.f22881a = nVar;
        }

        /* renamed from: a */
        public final Boolean invoke(s sVar) {
            C6496s.h(sVar, "destination");
            return Boolean.valueOf(!this.f22881a.f22856o.containsKey(Integer.valueOf(sVar.x())));
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final h f22882a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final s invoke(s sVar) {
            C6496s.h(sVar, "destination");
            u A10 = sVar.A();
            if (A10 == null || A10.o0() != sVar.x()) {
                return null;
            }
            return sVar.A();
        }
    }

    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f22883a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(n nVar) {
            super(1);
            this.f22883a = nVar;
        }

        /* renamed from: a */
        public final Boolean invoke(s sVar) {
            C6496s.h(sVar, "destination");
            return Boolean.valueOf(!this.f22883a.f22856o.containsKey(Integer.valueOf(sVar.x())));
        }
    }

    static final class j extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f22884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f22885b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f22886c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f22887d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Bundle f22888e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(J j10, List list, kotlin.jvm.internal.L l10, n nVar, Bundle bundle) {
            super(1);
            this.f22884a = j10;
            this.f22885b = list;
            this.f22886c = l10;
            this.f22887d = nVar;
            this.f22888e = bundle;
        }

        public final void a(k kVar) {
            List list;
            C6496s.h(kVar, "entry");
            this.f22884a.f71755a = true;
            int indexOf = this.f22885b.indexOf(kVar);
            if (indexOf != -1) {
                int i10 = indexOf + 1;
                list = this.f22885b.subList(this.f22886c.f71757a, i10);
                this.f22886c.f71757a = i10;
            } else {
                list = C6565s.n();
            }
            this.f22887d.p(kVar.e(), this.f22888e, kVar, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k) obj);
            return C6514M.f71813a;
        }
    }

    static final class k extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f22889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f22890b;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f22891a = new a();

            a() {
                super(1);
            }

            public final void a(C2131b bVar) {
                C6496s.h(bVar, "$this$anim");
                bVar.e(0);
                bVar.f(0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2131b) obj);
                return C6514M.f71813a;
            }
        }

        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final b f22892a = new b();

            b() {
                super(1);
            }

            public final void a(H h10) {
                C6496s.h(h10, "$this$popUpTo");
                h10.d(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((H) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(s sVar, n nVar) {
            super(1);
            this.f22889a = sVar;
            this.f22890b = nVar;
        }

        public final void a(C2124A a10) {
            u uVar;
            C6496s.h(a10, "$this$navOptions");
            a10.a(a.f22891a);
            s sVar = this.f22889a;
            if (sVar instanceof u) {
                Rg.h<s> c10 = s.f22957k.c(sVar);
                n nVar = this.f22890b;
                for (s sVar2 : c10) {
                    s F10 = nVar.F();
                    if (F10 != null) {
                        uVar = F10.A();
                    } else {
                        uVar = null;
                    }
                    if (C6496s.c(sVar2, uVar)) {
                        return;
                    }
                }
                if (n.f22834I) {
                    a10.c(u.f22987q.b(this.f22890b.H()).x(), b.f22892a);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2124A) obj);
            return C6514M.f71813a;
        }
    }

    static final class l extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final l f22893a = new l();

        l() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(s sVar) {
            C6496s.h(sVar, "it");
            return Integer.valueOf(sVar.x());
        }
    }

    static final class m extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f22894a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(n nVar) {
            super(0);
            this.f22894a = nVar;
        }

        /* renamed from: a */
        public final y invoke() {
            y h10 = this.f22894a.f22844c;
            if (h10 == null) {
                return new y(this.f22894a.D(), this.f22894a.f22865x);
            }
            return h10;
        }
    }

    /* renamed from: j3.n$n  reason: collision with other inner class name */
    static final class C0364n extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f22895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f22896b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f22897c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bundle f22898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0364n(J j10, n nVar, s sVar, Bundle bundle) {
            super(1);
            this.f22895a = j10;
            this.f22896b = nVar;
            this.f22897c = sVar;
            this.f22898d = bundle;
        }

        public final void a(k kVar) {
            C6496s.h(kVar, "it");
            this.f22895a.f71755a = true;
            n.q(this.f22896b, this.f22897c, this.f22898d, kVar, (List) null, 8, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k) obj);
            return C6514M.f71813a;
        }
    }

    public static final class o extends G {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f22899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(n nVar) {
            super(false);
            this.f22899d = nVar;
        }

        public void d() {
            this.f22899d.Z();
        }
    }

    static final class p extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f22900a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.f22900a = str;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(C6496s.c(str, this.f22900a));
        }
    }

    public n(Context context) {
        Object obj;
        C6496s.h(context, "context");
        this.f22842a = context;
        Iterator it = Rg.k.h(context, c.f22873a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f22843b = (Activity) obj;
        this.f22849h = new C6558k();
        x a10 = N.a(C6565s.n());
        this.f22850i = a10;
        this.f22851j = C5696h.b(a10);
        x a11 = N.a(C6565s.n());
        this.f22852k = a11;
        this.f22853l = C5696h.b(a11);
        this.f22854m = new LinkedHashMap();
        this.f22855n = new LinkedHashMap();
        this.f22856o = new LinkedHashMap();
        this.f22857p = new LinkedHashMap();
        this.f22860s = new CopyOnWriteArrayList();
        this.f22861t = C1790m.b.INITIALIZED;
        this.f22862u = new m(this);
        this.f22863v = new o(this);
        this.f22864w = true;
        this.f22865x = new C2129F();
        this.f22866y = new LinkedHashMap();
        this.f22836B = new LinkedHashMap();
        C2129F f10 = this.f22865x;
        f10.b(new w(f10));
        this.f22865x.b(new C2130a(this.f22842a));
        this.f22838D = new ArrayList();
        this.f22839E = C6531o.b(new m(this));
        w b10 = D.b(1, 0, Wg.a.DROP_OLDEST, 2, (Object) null);
        this.f22840F = b10;
        this.f22841G = C5696h.a(b10);
    }

    private final String A(int[] iArr) {
        u uVar;
        u uVar2 = this.f22845d;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            s sVar = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = iArr[i10];
            if (i10 == 0) {
                u uVar3 = this.f22845d;
                C6496s.e(uVar3);
                if (uVar3.x() == i11) {
                    sVar = this.f22845d;
                }
            } else {
                C6496s.e(uVar2);
                sVar = uVar2.c0(i11);
            }
            if (sVar == null) {
                return s.f22957k.b(this.f22842a, i11);
            }
            if (i10 != iArr.length - 1 && (sVar instanceof u)) {
                while (true) {
                    uVar = (u) sVar;
                    C6496s.e(uVar);
                    if (!(uVar.c0(uVar.o0()) instanceof u)) {
                        break;
                    }
                    sVar = uVar.c0(uVar.o0());
                }
                uVar2 = uVar;
            }
            i10++;
        }
    }

    private final String B(Object obj) {
        s z10 = z(this, H(), C2173c.b(C5988l.a(O.b(obj.getClass()))), true, (s) null, 4, (Object) null);
        if (z10 != null) {
            Map t10 = z10.t();
            LinkedHashMap linkedHashMap = new LinkedHashMap(mf.O.e(t10.size()));
            for (Map.Entry entry : t10.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((C2137h) entry.getValue()).a());
            }
            return C2173c.c(obj, linkedHashMap);
        }
        throw new IllegalArgumentException(("Destination with route " + O.b(obj.getClass()).w() + " cannot be found in navigation graph " + this.f22845d).toString());
    }

    private final int G() {
        C6558k<k> kVar = this.f22849h;
        int i10 = 0;
        if (kVar == null || !kVar.isEmpty()) {
            for (k e10 : kVar) {
                if (!(e10.e() instanceof u) && (i10 = i10 + 1) < 0) {
                    C6565s.w();
                }
            }
        }
        return i10;
    }

    private final u L(C6558k kVar) {
        s sVar;
        k kVar2 = (k) kVar.x();
        if (kVar2 == null || (sVar = kVar2.e()) == null) {
            sVar = this.f22845d;
            C6496s.e(sVar);
        }
        if (sVar instanceof u) {
            return (u) sVar;
        }
        u A10 = sVar.A();
        C6496s.e(A10);
        return A10;
    }

    private final List O(C6558k kVar) {
        s sVar;
        ArrayList arrayList = new ArrayList();
        k kVar2 = (k) this.f22849h.x();
        if (kVar2 == null || (sVar = kVar2.e()) == null) {
            sVar = H();
        }
        if (kVar != null) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                s z10 = z(this, sVar, lVar.a(), true, (s) null, 4, (Object) null);
                if (z10 != null) {
                    arrayList.add(lVar.c(this.f22842a, z10, I(), this.f22859r));
                    sVar = z10;
                } else {
                    String b10 = s.f22957k.b(this.f22842a, lVar.a());
                    throw new IllegalStateException(("Restore State failed: destination " + b10 + " cannot be found from the current destination " + sVar).toString());
                }
            }
        }
        return arrayList;
    }

    private final boolean P(s sVar, Bundle bundle) {
        int i10;
        s e10;
        k E10 = E();
        C6558k kVar = this.f22849h;
        ListIterator listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((k) listIterator.previous()).e() == sVar) {
                    i10 = listIterator.nextIndex();
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return false;
        }
        if (sVar instanceof u) {
            List G10 = Rg.k.G(Rg.k.x(u.f22987q.a((u) sVar), l.f22893a));
            if (this.f22849h.size() - i10 != G10.size()) {
                return false;
            }
            C6558k kVar2 = this.f22849h;
            Iterable<k> subList = kVar2.subList(i10, kVar2.size());
            ArrayList arrayList = new ArrayList(C6565s.y(subList, 10));
            for (k e11 : subList) {
                arrayList.add(Integer.valueOf(e11.e().x()));
            }
            if (!C6496s.c(arrayList, G10)) {
                return false;
            }
        } else if (E10 == null || (e10 = E10.e()) == null || sVar.x() != e10.x()) {
            return false;
        }
        C6558k<k> kVar3 = new C6558k();
        while (C6565s.p(this.f22849h) >= i10) {
            k kVar4 = (k) C6565s.N(this.f22849h);
            u0(kVar4);
            kVar3.addFirst(new k(kVar4, kVar4.e().k(bundle)));
        }
        for (k kVar5 : kVar3) {
            u A10 = kVar5.e().A();
            if (A10 != null) {
                R(kVar5, C(A10.x()));
            }
            this.f22849h.add(kVar5);
        }
        for (k kVar6 : kVar3) {
            this.f22865x.e(kVar6.e().z()).g(kVar6);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void Q(n nVar, C1798v vVar, C1790m.a aVar) {
        C6496s.h(nVar, "this$0");
        C6496s.h(vVar, "<anonymous parameter 0>");
        C6496s.h(aVar, "event");
        nVar.f22861t = aVar.c();
        if (nVar.f22845d != null) {
            for (k h10 : C6565s.h1(nVar.f22849h)) {
                h10.h(aVar);
            }
        }
    }

    private final void R(k kVar, k kVar2) {
        this.f22854m.put(kVar, kVar2);
        if (this.f22855n.get(kVar2) == null) {
            this.f22855n.put(kVar2, new AtomicInteger(0));
        }
        Object obj = this.f22855n.get(kVar2);
        C6496s.e(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012a A[LOOP:1: B:38:0x0124->B:40:0x012a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void S(j3.s r22, android.os.Bundle r23, j3.z r24, j3.C2128E.a r25) {
        /*
            r21 = this;
            r6 = r21
            r3 = r24
            java.util.Map r0 = r6.f22866y
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()
            j3.n$b r1 = (j3.n.b) r1
            r1.l(r2)
            goto L_0x0010
        L_0x0021:
            kotlin.jvm.internal.J r7 = new kotlin.jvm.internal.J
            r7.<init>()
            r8 = 0
            if (r3 == 0) goto L_0x0098
            java.lang.String r0 = r24.f()
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r24.f()
            kotlin.jvm.internal.C6496s.e(r0)
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.g0(r0, r1, r4)
        L_0x0042:
            r9 = r0
            goto L_0x0099
        L_0x0044:
            Ff.d r0 = r24.g()
            if (r0 == 0) goto L_0x0066
            Ff.d r0 = r24.g()
            kotlin.jvm.internal.C6496s.e(r0)
            gh.b r0 = gh.C5988l.a(r0)
            int r0 = l3.C2173c.b(r0)
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.e0(r0, r1, r4)
            goto L_0x0042
        L_0x0066:
            java.lang.Object r0 = r24.h()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r24.h()
            kotlin.jvm.internal.C6496s.e(r0)
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.f0(r0, r1, r4)
            goto L_0x0042
        L_0x0080:
            int r0 = r24.e()
            r1 = -1
            if (r0 == r1) goto L_0x0098
            int r0 = r24.e()
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.e0(r0, r1, r4)
            goto L_0x0042
        L_0x0098:
            r9 = r8
        L_0x0099:
            android.os.Bundle r0 = r22.k(r23)
            if (r3 == 0) goto L_0x00c4
            boolean r1 = r24.l()
            if (r1 != r2) goto L_0x00c4
            java.util.Map r1 = r6.f22856o
            int r4 = r22.x()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x00c4
            int r1 = r22.x()
            r4 = r25
            boolean r0 = r6.m0(r1, r0, r3, r4)
            r7.f71755a = r0
            r20 = r8
            goto L_0x0115
        L_0x00c4:
            r4 = r25
            if (r3 == 0) goto L_0x00d7
            boolean r1 = r24.j()
            if (r1 != r2) goto L_0x00d7
            boolean r1 = r21.P(r22, r23)
            if (r1 == 0) goto L_0x00d7
            r20 = r2
            goto L_0x00d9
        L_0x00d7:
            r20 = r8
        L_0x00d9:
            if (r20 != 0) goto L_0x0115
            j3.k$a r10 = j3.k.f22809o
            android.content.Context r11 = r6.f22842a
            androidx.lifecycle.m$b r14 = r21.I()
            j3.o r15 = r6.f22859r
            r18 = 96
            r19 = 0
            r16 = 0
            r17 = 0
            r12 = r22
            r13 = r0
            j3.k r1 = j3.k.a.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            j3.F r2 = r6.f22865x
            java.lang.String r5 = r22.z()
            j3.E r2 = r2.e(r5)
            java.util.List r5 = mf.C6565s.e(r1)
            j3.n$n r10 = new j3.n$n
            r1 = r22
            r10.<init>(r7, r6, r1, r0)
            r0 = r21
            r1 = r2
            r2 = r5
            r3 = r24
            r4 = r25
            r5 = r10
            r0.W(r1, r2, r3, r4, r5)
        L_0x0115:
            r21.w0()
            java.util.Map r0 = r6.f22866y
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0124:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0134
            java.lang.Object r1 = r0.next()
            j3.n$b r1 = (j3.n.b) r1
            r1.l(r8)
            goto L_0x0124
        L_0x0134:
            if (r9 != 0) goto L_0x0141
            boolean r0 = r7.f71755a
            if (r0 != 0) goto L_0x0141
            if (r20 == 0) goto L_0x013d
            goto L_0x0141
        L_0x013d:
            r21.v0()
            goto L_0x0144
        L_0x0141:
            r21.t()
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.n.S(j3.s, android.os.Bundle, j3.z, j3.E$a):void");
    }

    public static /* synthetic */ void V(n nVar, String str, z zVar, C2128E.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                zVar = null;
            }
            if ((i10 & 4) != 0) {
                aVar = null;
            }
            nVar.T(str, zVar, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    private final void W(C2128E e10, List list, z zVar, C2128E.a aVar, C6798l lVar) {
        this.f22867z = lVar;
        e10.e(list, zVar, aVar);
        this.f22867z = null;
    }

    private final void Y(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f22846e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C2129F f10 = this.f22865x;
                C6496s.g(next, "name");
                C2128E e10 = f10.e(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    e10.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f22847f;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i10 = 0;
            while (i10 < length) {
                Parcelable parcelable = parcelableArr[i10];
                C6496s.f(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                l lVar = (l) parcelable;
                s x10 = x(this, lVar.a(), (s) null, 2, (Object) null);
                if (x10 != null) {
                    k c10 = lVar.c(this.f22842a, x10, I(), this.f22859r);
                    C2128E e11 = this.f22865x.e(x10.z());
                    Map map = this.f22866y;
                    Object obj = map.get(e11);
                    if (obj == null) {
                        obj = new b(this, e11);
                        map.put(e11, obj);
                    }
                    this.f22849h.add(c10);
                    ((b) obj).n(c10);
                    u A10 = c10.e().A();
                    if (A10 != null) {
                        R(c10, C(A10.x()));
                    }
                    i10++;
                } else {
                    String b10 = s.f22957k.b(this.f22842a, lVar.a());
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + b10 + " cannot be found from the current destination " + F());
                }
            }
            w0();
            this.f22847f = null;
        }
        ArrayList<C2128E> arrayList = new ArrayList<>();
        for (Object next2 : this.f22865x.f().values()) {
            if (!((C2128E) next2).c()) {
                arrayList.add(next2);
            }
        }
        for (C2128E e12 : arrayList) {
            Map map2 = this.f22866y;
            Object obj2 = map2.get(e12);
            if (obj2 == null) {
                obj2 = new b(this, e12);
                map2.put(e12, obj2);
            }
            e12.f((b) obj2);
        }
        if (this.f22845d == null || !this.f22849h.isEmpty()) {
            t();
            return;
        }
        if (!this.f22848g && (activity = this.f22843b) != null) {
            C6496s.e(activity);
            if (N(activity.getIntent())) {
                return;
            }
        }
        u uVar = this.f22845d;
        C6496s.e(uVar);
        S(uVar, bundle, (z) null, (C2128E.a) null);
    }

    private final void d0(C2128E e10, k kVar, boolean z10, C6798l lVar) {
        this.f22835A = lVar;
        e10.j(kVar, z10);
        this.f22835A = null;
    }

    private final boolean e0(int i10, boolean z10, boolean z11) {
        s sVar;
        if (this.f22849h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C6565s.N0(this.f22849h).iterator();
        while (true) {
            if (!it.hasNext()) {
                sVar = null;
                break;
            }
            sVar = ((k) it.next()).e();
            C2128E e10 = this.f22865x.e(sVar.z());
            if (z10 || sVar.x() != i10) {
                arrayList.add(e10);
            }
            if (sVar.x() == i10) {
                break;
            }
        }
        if (sVar != null) {
            return u(arrayList, sVar, z10, z11);
        }
        String b10 = s.f22957k.b(this.f22842a, i10);
        Log.i("NavController", "Ignoring popBackStack to destination " + b10 + " as it was not found on the current back stack");
        return false;
    }

    private final boolean f0(Object obj, boolean z10, boolean z11) {
        return g0(B(obj), z10, z11);
    }

    private final boolean g0(String str, boolean z10, boolean z11) {
        s sVar;
        Object obj;
        if (this.f22849h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C6558k kVar = this.f22849h;
        ListIterator listIterator = kVar.listIterator(kVar.size());
        while (true) {
            sVar = null;
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            k kVar2 = (k) obj;
            boolean E10 = kVar2.e().E(str, kVar2.c());
            if (z10 || !E10) {
                arrayList.add(this.f22865x.e(kVar2.e().z()));
                continue;
            }
            if (E10) {
                break;
            }
        }
        k kVar3 = (k) obj;
        if (kVar3 != null) {
            sVar = kVar3.e();
        }
        if (sVar != null) {
            return u(arrayList, sVar, z10, z11);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    static /* synthetic */ boolean h0(n nVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return nVar.e0(i10, z10, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* access modifiers changed from: private */
    public final void i0(k kVar, boolean z10, C6558k kVar2) {
        o oVar;
        L c10;
        Set set;
        k kVar3 = (k) this.f22849h.last();
        if (C6496s.c(kVar3, kVar)) {
            C6565s.N(this.f22849h);
            b bVar = (b) this.f22866y.get(J().e(kVar3.e().z()));
            boolean z11 = true;
            if ((bVar == null || (c10 = bVar.c()) == null || (set = (Set) c10.getValue()) == null || !set.contains(kVar3)) && !this.f22855n.containsKey(kVar3)) {
                z11 = false;
            }
            C1790m.b b10 = kVar3.getLifecycle().b();
            C1790m.b bVar2 = C1790m.b.CREATED;
            if (b10.b(bVar2)) {
                if (z10) {
                    kVar3.k(bVar2);
                    kVar2.addFirst(new l(kVar3));
                }
                if (!z11) {
                    kVar3.k(C1790m.b.DESTROYED);
                    u0(kVar3);
                } else {
                    kVar3.k(bVar2);
                }
            }
            if (!z10 && !z11 && (oVar = this.f22859r) != null) {
                oVar.c(kVar3.f());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + kVar.e() + ", which is not the top of the back stack (" + kVar3.e() + ')').toString());
    }

    static /* synthetic */ void j0(n nVar, k kVar, boolean z10, C6558k kVar2, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                kVar2 = new C6558k();
            }
            nVar.i0(kVar, z10, kVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    private final boolean m0(int i10, Bundle bundle, z zVar, C2128E.a aVar) {
        if (!this.f22856o.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = (String) this.f22856o.get(Integer.valueOf(i10));
        C6565s.I(this.f22856o.values(), new p(str));
        return v(O((C6558k) V.d(this.f22857p).remove(str)), bundle, zVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: j3.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: j3.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: j3.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: j3.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: j3.u} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(j3.s r31, android.os.Bundle r32, j3.k r33, java.util.List r34) {
        /*
            r30 = this;
            r6 = r30
            r7 = r31
            r15 = r32
            r14 = r33
            r13 = r34
            j3.s r12 = r33.e()
            boolean r0 = r12 instanceof j3.C2133d
            if (r0 != 0) goto L_0x0046
        L_0x0012:
            mf.k r0 = r6.f22849h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0046
            mf.k r0 = r6.f22849h
            java.lang.Object r0 = r0.last()
            j3.k r0 = (j3.k) r0
            j3.s r0 = r0.e()
            boolean r0 = r0 instanceof j3.C2133d
            if (r0 == 0) goto L_0x0046
            mf.k r0 = r6.f22849h
            java.lang.Object r0 = r0.last()
            j3.k r0 = (j3.k) r0
            j3.s r0 = r0.e()
            int r1 = r0.x()
            r4 = 4
            r5 = 0
            r2 = 1
            r3 = 0
            r0 = r30
            boolean r0 = h0(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0012
        L_0x0046:
            mf.k r5 = new mf.k
            r5.<init>()
            boolean r0 = r7 instanceof j3.u
            r18 = 0
            if (r0 == 0) goto L_0x00f6
            r0 = r12
        L_0x0052:
            kotlin.jvm.internal.C6496s.e(r0)
            j3.u r4 = r0.A()
            if (r4 == 0) goto L_0x00e1
            int r0 = r34.size()
            java.util.ListIterator r0 = r13.listIterator(r0)
        L_0x0063:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r0.previous()
            r2 = r1
            j3.k r2 = (j3.k) r2
            j3.s r2 = r2.e()
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r4)
            if (r2 == 0) goto L_0x0063
            goto L_0x007d
        L_0x007b:
            r1 = r18
        L_0x007d:
            j3.k r1 = (j3.k) r1
            if (r1 != 0) goto L_0x00a4
            j3.k$a r8 = j3.k.f22809o
            android.content.Context r9 = r6.f22842a
            androidx.lifecycle.m$b r0 = r30.I()
            j3.o r1 = r6.f22859r
            r16 = 96
            r17 = 0
            r2 = 0
            r3 = 0
            r10 = r4
            r11 = r32
            r19 = r12
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = r14
            r14 = r2
            r2 = r15
            r15 = r3
            j3.k r3 = j3.k.a.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r8 = r1
            r1 = r3
            goto L_0x00a9
        L_0x00a4:
            r19 = r12
            r0 = r13
            r8 = r14
            r2 = r15
        L_0x00a9:
            r5.addFirst(r1)
            mf.k r1 = r6.f22849h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00dc
            mf.k r1 = r6.f22849h
            java.lang.Object r1 = r1.last()
            j3.k r1 = (j3.k) r1
            j3.s r1 = r1.e()
            if (r1 != r4) goto L_0x00dc
            mf.k r1 = r6.f22849h
            java.lang.Object r1 = r1.last()
            j3.k r1 = (j3.k) r1
            r9 = 6
            r10 = 0
            r3 = 0
            r11 = 0
            r12 = r0
            r0 = r30
            r13 = r2
            r2 = r3
            r3 = r11
            r11 = r4
            r4 = r9
            r9 = r5
            r5 = r10
            j0(r0, r1, r2, r3, r4, r5)
            goto L_0x00e8
        L_0x00dc:
            r12 = r0
            r13 = r2
            r11 = r4
            r9 = r5
            goto L_0x00e8
        L_0x00e1:
            r11 = r4
            r9 = r5
            r19 = r12
            r12 = r13
            r8 = r14
            r13 = r15
        L_0x00e8:
            if (r11 == 0) goto L_0x00fc
            if (r11 != r7) goto L_0x00ed
            goto L_0x00fc
        L_0x00ed:
            r14 = r8
            r5 = r9
            r0 = r11
            r15 = r13
            r13 = r12
            r12 = r19
            goto L_0x0052
        L_0x00f6:
            r9 = r5
            r19 = r12
            r12 = r13
            r8 = r14
            r13 = r15
        L_0x00fc:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0105
            r0 = r19
            goto L_0x010f
        L_0x0105:
            java.lang.Object r0 = r9.first()
            j3.k r0 = (j3.k) r0
            j3.s r0 = r0.e()
        L_0x010f:
            if (r0 == 0) goto L_0x0178
            int r1 = r0.x()
            j3.s r1 = r6.w(r1, r0)
            if (r1 == r0) goto L_0x0178
            j3.u r0 = r0.A()
            if (r0 == 0) goto L_0x010f
            if (r13 == 0) goto L_0x012d
            boolean r1 = r32.isEmpty()
            r2 = 1
            if (r1 != r2) goto L_0x012d
            r15 = r18
            goto L_0x012e
        L_0x012d:
            r15 = r13
        L_0x012e:
            int r1 = r34.size()
            java.util.ListIterator r1 = r12.listIterator(r1)
        L_0x0136:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L_0x014e
            java.lang.Object r2 = r1.previous()
            r3 = r2
            j3.k r3 = (j3.k) r3
            j3.s r3 = r3.e()
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r0)
            if (r3 == 0) goto L_0x0136
            goto L_0x0150
        L_0x014e:
            r2 = r18
        L_0x0150:
            j3.k r2 = (j3.k) r2
            if (r2 != 0) goto L_0x0174
            j3.k$a r20 = j3.k.f22809o
            android.content.Context r1 = r6.f22842a
            android.os.Bundle r23 = r0.k(r15)
            androidx.lifecycle.m$b r24 = r30.I()
            j3.o r2 = r6.f22859r
            r28 = 96
            r29 = 0
            r26 = 0
            r27 = 0
            r21 = r1
            r22 = r0
            r25 = r2
            j3.k r2 = j3.k.a.b(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x0174:
            r9.addFirst(r2)
            goto L_0x010f
        L_0x0178:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x017f
            goto L_0x018b
        L_0x017f:
            java.lang.Object r0 = r9.first()
            j3.k r0 = (j3.k) r0
            j3.s r0 = r0.e()
            r19 = r0
        L_0x018b:
            mf.k r0 = r6.f22849h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01d7
            mf.k r0 = r6.f22849h
            java.lang.Object r0 = r0.last()
            j3.k r0 = (j3.k) r0
            j3.s r0 = r0.e()
            boolean r0 = r0 instanceof j3.u
            if (r0 == 0) goto L_0x01d7
            mf.k r0 = r6.f22849h
            java.lang.Object r0 = r0.last()
            j3.k r0 = (j3.k) r0
            j3.s r0 = r0.e()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.navigation.NavGraph"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            j3.u r0 = (j3.u) r0
            androidx.collection.Z r0 = r0.j0()
            int r1 = r19.x()
            java.lang.Object r0 = r0.g(r1)
            if (r0 != 0) goto L_0x01d7
            mf.k r0 = r6.f22849h
            java.lang.Object r0 = r0.last()
            r1 = r0
            j3.k r1 = (j3.k) r1
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r30
            j0(r0, r1, r2, r3, r4, r5)
            goto L_0x018b
        L_0x01d7:
            mf.k r0 = r6.f22849h
            java.lang.Object r0 = r0.t()
            j3.k r0 = (j3.k) r0
            if (r0 != 0) goto L_0x01e7
            java.lang.Object r0 = r9.t()
            j3.k r0 = (j3.k) r0
        L_0x01e7:
            if (r0 == 0) goto L_0x01ee
            j3.s r0 = r0.e()
            goto L_0x01f0
        L_0x01ee:
            r0 = r18
        L_0x01f0:
            j3.u r1 = r6.f22845d
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r1)
            if (r0 != 0) goto L_0x0251
            int r0 = r34.size()
            java.util.ListIterator r0 = r12.listIterator(r0)
        L_0x0200:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x021e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            j3.k r2 = (j3.k) r2
            j3.s r2 = r2.e()
            j3.u r3 = r6.f22845d
            kotlin.jvm.internal.C6496s.e(r3)
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r3)
            if (r2 == 0) goto L_0x0200
            r18 = r1
        L_0x021e:
            j3.k r18 = (j3.k) r18
            if (r18 != 0) goto L_0x024c
            j3.k$a r19 = j3.k.f22809o
            android.content.Context r0 = r6.f22842a
            j3.u r1 = r6.f22845d
            kotlin.jvm.internal.C6496s.e(r1)
            j3.u r2 = r6.f22845d
            kotlin.jvm.internal.C6496s.e(r2)
            android.os.Bundle r22 = r2.k(r13)
            androidx.lifecycle.m$b r23 = r30.I()
            j3.o r2 = r6.f22859r
            r27 = 96
            r28 = 0
            r25 = 0
            r26 = 0
            r20 = r0
            r21 = r1
            r24 = r2
            j3.k r18 = j3.k.a.b(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x024c:
            r0 = r18
            r9.addFirst(r0)
        L_0x0251:
            java.util.Iterator r0 = r9.iterator()
        L_0x0255:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02a1
            java.lang.Object r1 = r0.next()
            j3.k r1 = (j3.k) r1
            j3.F r2 = r6.f22865x
            j3.s r3 = r1.e()
            java.lang.String r3 = r3.z()
            j3.E r2 = r2.e(r3)
            java.util.Map r3 = r6.f22866y
            java.lang.Object r2 = r3.get(r2)
            if (r2 == 0) goto L_0x027d
            j3.n$b r2 = (j3.n.b) r2
            r2.n(r1)
            goto L_0x0255
        L_0x027d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NavigatorBackStack for "
            r0.append(r1)
            java.lang.String r1 = r31.z()
            r0.append(r1)
            java.lang.String r1 = " should already be created"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02a1:
            mf.k r0 = r6.f22849h
            r0.addAll(r9)
            mf.k r0 = r6.f22849h
            r0.add(r8)
            java.util.List r0 = mf.C6565s.L0(r9, r8)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x02b5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02d7
            java.lang.Object r1 = r0.next()
            j3.k r1 = (j3.k) r1
            j3.s r2 = r1.e()
            j3.u r2 = r2.A()
            if (r2 == 0) goto L_0x02b5
            int r2 = r2.x()
            j3.k r2 = r6.C(r2)
            r6.R(r1, r2)
            goto L_0x02b5
        L_0x02d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.n.p(j3.s, android.os.Bundle, j3.k, java.util.List):void");
    }

    static /* synthetic */ void q(n nVar, s sVar, Bundle bundle, k kVar, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                list = C6565s.n();
            }
            nVar.p(sVar, bundle, kVar, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    private final boolean r(int i10) {
        for (b l10 : this.f22866y.values()) {
            l10.l(true);
        }
        boolean m02 = m0(i10, (Bundle) null, C2125B.a(d.f22874a), (C2128E.a) null);
        for (b l11 : this.f22866y.values()) {
            l11.l(false);
        }
        if (!m02 || !e0(i10, true, false)) {
            return false;
        }
        return true;
    }

    private final boolean s0() {
        Bundle bundle;
        int i10 = 0;
        if (!this.f22848g) {
            return false;
        }
        Activity activity = this.f22843b;
        C6496s.e(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        C6496s.e(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        C6496s.e(intArray);
        List u12 = C6559l.u1(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        if (u12.size() < 2) {
            return false;
        }
        int intValue = ((Number) C6565s.N(u12)).intValue();
        if (parcelableArrayList != null) {
            Bundle bundle2 = (Bundle) C6565s.N(parcelableArrayList);
        }
        s z10 = z(this, H(), intValue, false, (s) null, 4, (Object) null);
        if (z10 instanceof u) {
            intValue = u.f22987q.b((u) z10).x();
        }
        s F10 = F();
        if (F10 == null || intValue != F10.x()) {
            return false;
        }
        q s10 = s();
        Bundle a10 = u1.c.a(C6502A.a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle3 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle3 != null) {
            a10.putAll(bundle3);
        }
        s10.e(a10);
        for (Object next : u12) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            int intValue2 = ((Number) next).intValue();
            if (parcelableArrayList != null) {
                bundle = (Bundle) parcelableArrayList.get(i10);
            } else {
                bundle = null;
            }
            s10.a(intValue2, bundle);
            i10 = i11;
        }
        s10.b().t();
        Activity activity2 = this.f22843b;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final boolean t() {
        while (!this.f22849h.isEmpty() && (((k) this.f22849h.last()).e() instanceof u)) {
            j0(this, (k) this.f22849h.last(), false, (C6558k) null, 6, (Object) null);
        }
        k kVar = (k) this.f22849h.x();
        if (kVar != null) {
            this.f22838D.add(kVar);
        }
        this.f22837C++;
        v0();
        int i10 = this.f22837C - 1;
        this.f22837C = i10;
        if (i10 == 0) {
            List<k> h12 = C6565s.h1(this.f22838D);
            this.f22838D.clear();
            for (k kVar2 : h12) {
                Iterator it = this.f22860s.iterator();
                if (!it.hasNext()) {
                    this.f22840F.b(kVar2);
                } else {
                    android.support.v4.media.session.c.a(it.next());
                    kVar2.e();
                    kVar2.c();
                    throw null;
                }
            }
            this.f22850i.b(C6565s.h1(this.f22849h));
            this.f22852k.b(k0());
        }
        if (kVar != null) {
            return true;
        }
        return false;
    }

    private final boolean t0() {
        Bundle bundle;
        s F10 = F();
        C6496s.e(F10);
        int x10 = F10.x();
        for (u A10 = F10.A(); A10 != null; A10 = A10.A()) {
            if (A10.o0() != x10) {
                Bundle bundle2 = new Bundle();
                Activity activity = this.f22843b;
                if (activity != null) {
                    C6496s.e(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f22843b;
                        C6496s.e(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f22843b;
                            C6496s.e(activity3);
                            bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            u L10 = L(this.f22849h);
                            Activity activity4 = this.f22843b;
                            C6496s.e(activity4);
                            Intent intent = activity4.getIntent();
                            C6496s.g(intent, "activity!!.intent");
                            s.b q02 = L10.q0(new r(intent), true, true, L10);
                            if (q02 != null) {
                                bundle = q02.c();
                            } else {
                                bundle = null;
                            }
                            if (bundle != null) {
                                bundle2.putAll(q02.b().k(q02.c()));
                            }
                        }
                    }
                }
                q.g(new q(this), A10.x(), (Bundle) null, 2, (Object) null).e(bundle2).b().t();
                Activity activity5 = this.f22843b;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            x10 = A10.x();
        }
        return false;
    }

    private final boolean u(List list, s sVar, boolean z10, boolean z11) {
        String str;
        boolean z12 = z11;
        J j10 = new J();
        C6558k kVar = new C6558k();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            J j11 = new J();
            d0((C2128E) it.next(), (k) this.f22849h.last(), z12, new e(j11, j10, this, z11, kVar));
            if (!j11.f71755a) {
                break;
            }
        }
        if (z12) {
            if (!z10) {
                for (s x10 : Rg.k.E(Rg.k.h(sVar, f.f22880a), new g(this))) {
                    Map map = this.f22856o;
                    Integer valueOf = Integer.valueOf(x10.x());
                    l lVar = (l) kVar.t();
                    if (lVar != null) {
                        str = lVar.b();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if (!kVar.isEmpty()) {
                l lVar2 = (l) kVar.first();
                for (s x11 : Rg.k.E(Rg.k.h(x(this, lVar2.a(), (s) null, 2, (Object) null), h.f22882a), new i(this))) {
                    this.f22856o.put(Integer.valueOf(x11.x()), lVar2.b());
                }
                if (this.f22856o.values().contains(lVar2.b())) {
                    this.f22857p.put(lVar2.b(), kVar);
                }
            }
        }
        w0();
        return j10.f71755a;
    }

    private final boolean v(List list, Bundle bundle, z zVar, C2128E.a aVar) {
        String str;
        k kVar;
        s e10;
        ArrayList<List> arrayList = new ArrayList<>();
        ArrayList<k> arrayList2 = new ArrayList<>();
        for (Object next : list) {
            if (!(((k) next).e() instanceof u)) {
                arrayList2.add(next);
            }
        }
        for (k kVar2 : arrayList2) {
            List list2 = (List) C6565s.B0(arrayList);
            if (list2 == null || (kVar = (k) C6565s.z0(list2)) == null || (e10 = kVar.e()) == null) {
                str = null;
            } else {
                str = e10.z();
            }
            if (C6496s.c(str, kVar2.e().z())) {
                list2.add(kVar2);
            } else {
                arrayList.add(C6565s.t(kVar2));
            }
        }
        J j10 = new J();
        for (List list3 : arrayList) {
            W(this.f22865x.e(((k) C6565s.o0(list3)).e().z()), list3, zVar, aVar, new j(j10, list, new kotlin.jvm.internal.L(), this, bundle));
        }
        return j10.f71755a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (G() > 1) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void w0() {
        /*
            r3 = this;
            androidx.activity.G r0 = r3.f22863v
            boolean r1 = r3.f22864w
            if (r1 == 0) goto L_0x000e
            int r1 = r3.G()
            r2 = 1
            if (r1 <= r2) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.n.w0():void");
    }

    public static /* synthetic */ s x(n nVar, int i10, s sVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                sVar = null;
            }
            return nVar.w(i10, sVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
    }

    public static /* synthetic */ s z(n nVar, s sVar, int i10, boolean z10, s sVar2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                sVar2 = null;
            }
            return nVar.y(sVar, i10, z10, sVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
    }

    public k C(int i10) {
        Object obj;
        C6558k kVar = this.f22849h;
        ListIterator listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((k) obj).e().x() == i10) {
                break;
            }
        }
        k kVar2 = (k) obj;
        if (kVar2 != null) {
            return kVar2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i10 + " is on the NavController's back stack. The current destination is " + F()).toString());
    }

    public final Context D() {
        return this.f22842a;
    }

    public k E() {
        return (k) this.f22849h.x();
    }

    public s F() {
        k E10 = E();
        if (E10 != null) {
            return E10.e();
        }
        return null;
    }

    public u H() {
        u uVar = this.f22845d;
        if (uVar != null) {
            C6496s.f(uVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return uVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final C1790m.b I() {
        if (this.f22858q == null) {
            return C1790m.b.CREATED;
        }
        return this.f22861t;
    }

    public C2129F J() {
        return this.f22865x;
    }

    public k K() {
        Object obj;
        Iterator it = C6565s.N0(this.f22849h).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = Rg.k.c(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((k) obj).e() instanceof u)) {
                break;
            }
        }
        return (k) obj;
    }

    public final L M() {
        return this.f22853l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean N(android.content.Intent r20) {
        /*
            r19 = this;
            r7 = r19
            r1 = r20
            r8 = 0
            if (r1 != 0) goto L_0x0008
            return r8
        L_0x0008:
            android.os.Bundle r2 = r20.getExtras()
            java.lang.String r3 = "NavController"
            r9 = 0
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = "android-support-nav:controller:deepLinkIds"
            int[] r0 = r2.getIntArray(r0)     // Catch:{ Exception -> 0x0018 }
            goto L_0x002e
        L_0x0018:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleDeepLink() could not extract deepLink from "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r3, r4, r0)
        L_0x002d:
            r0 = r9
        L_0x002e:
            if (r2 == 0) goto L_0x0037
            java.lang.String r4 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r4 = r2.getParcelableArrayList(r4)
            goto L_0x0038
        L_0x0037:
            r4 = r9
        L_0x0038:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            if (r2 == 0) goto L_0x0046
            java.lang.String r6 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r2 = r2.getBundle(r6)
            goto L_0x0047
        L_0x0046:
            r2 = r9
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r5.putAll(r2)
        L_0x004c:
            r10 = 1
            if (r0 == 0) goto L_0x0052
            int r2 = r0.length
            if (r2 != 0) goto L_0x007a
        L_0x0052:
            mf.k r2 = r7.f22849h
            j3.u r2 = r7.L(r2)
            j3.r r6 = new j3.r
            r6.<init>(r1)
            j3.s$b r2 = r2.q0(r6, r10, r10, r2)
            if (r2 == 0) goto L_0x007a
            j3.s r0 = r2.b()
            int[] r4 = j3.s.r(r0, r9, r10, r9)
            android.os.Bundle r2 = r2.c()
            android.os.Bundle r0 = r0.k(r2)
            if (r0 == 0) goto L_0x0078
            r5.putAll(r0)
        L_0x0078:
            r0 = r4
            r4 = r9
        L_0x007a:
            if (r0 == 0) goto L_0x01f2
            int r2 = r0.length
            if (r2 != 0) goto L_0x0081
            goto L_0x01f2
        L_0x0081:
            java.lang.String r2 = r7.A(r0)
            if (r2 == 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Could not find destination "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = " in the navigation graph, ignoring the deep link from "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            return r8
        L_0x00a4:
            java.lang.String r2 = "android-support-nav:controller:deepLinkIntent"
            r5.putParcelable(r2, r1)
            int r2 = r0.length
            android.os.Bundle[] r11 = new android.os.Bundle[r2]
            r3 = r8
        L_0x00ad:
            if (r3 >= r2) goto L_0x00c9
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putAll(r5)
            if (r4 == 0) goto L_0x00c4
            java.lang.Object r12 = r4.get(r3)
            android.os.Bundle r12 = (android.os.Bundle) r12
            if (r12 == 0) goto L_0x00c4
            r6.putAll(r12)
        L_0x00c4:
            r11[r3] = r6
            int r3 = r3 + 1
            goto L_0x00ad
        L_0x00c9:
            int r2 = r20.getFlags()
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r2
            if (r3 == 0) goto L_0x00f8
            r4 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r4
            if (r2 != 0) goto L_0x00f8
            r1.addFlags(r4)
            android.content.Context r0 = r7.f22842a
            androidx.core.app.y r0 = androidx.core.app.y.h(r0)
            androidx.core.app.y r0 = r0.b(r1)
            java.lang.String r1 = "create(context).addNextI…ntWithParentStack(intent)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            r0.t()
            android.app.Activity r0 = r7.f22843b
            if (r0 == 0) goto L_0x00f7
            r0.finish()
            r0.overridePendingTransition(r8, r8)
        L_0x00f7:
            return r10
        L_0x00f8:
            java.lang.String r12 = "Deep Linking failed: destination "
            if (r3 == 0) goto L_0x0160
            mf.k r1 = r7.f22849h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0116
            j3.u r1 = r7.f22845d
            kotlin.jvm.internal.C6496s.e(r1)
            int r2 = r1.x()
            r5 = 4
            r6 = 0
            r3 = 1
            r4 = 0
            r1 = r19
            h0(r1, r2, r3, r4, r5, r6)
        L_0x0116:
            int r1 = r0.length
            if (r8 >= r1) goto L_0x015d
            r1 = r0[r8]
            int r2 = r8 + 1
            r3 = r11[r8]
            r4 = 2
            j3.s r4 = x(r7, r1, r9, r4, r9)
            if (r4 == 0) goto L_0x0134
            j3.n$k r1 = new j3.n$k
            r1.<init>(r4, r7)
            j3.z r1 = j3.C2125B.a(r1)
            r7.S(r4, r3, r1, r9)
            r8 = r2
            goto L_0x0116
        L_0x0134:
            j3.s$a r0 = j3.s.f22957k
            android.content.Context r2 = r7.f22842a
            java.lang.String r0 = r0.b(r2, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            java.lang.String r0 = " cannot be found from the current destination "
            r2.append(r0)
            j3.s r0 = r19.F()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x015d:
            r7.f22848g = r10
            return r10
        L_0x0160:
            j3.u r1 = r7.f22845d
            int r2 = r0.length
            r3 = r8
        L_0x0164:
            if (r3 >= r2) goto L_0x01ef
            r4 = r0[r3]
            r5 = r11[r3]
            if (r3 != 0) goto L_0x016f
            j3.u r6 = r7.f22845d
            goto L_0x0176
        L_0x016f:
            kotlin.jvm.internal.C6496s.e(r1)
            j3.s r6 = r1.c0(r4)
        L_0x0176:
            if (r6 == 0) goto L_0x01ca
            int r4 = r0.length
            int r4 = r4 - r10
            if (r3 == r4) goto L_0x019f
            boolean r4 = r6 instanceof j3.u
            if (r4 == 0) goto L_0x01c7
            j3.u r6 = (j3.u) r6
        L_0x0182:
            kotlin.jvm.internal.C6496s.e(r6)
            int r1 = r6.o0()
            j3.s r1 = r6.c0(r1)
            boolean r1 = r1 instanceof j3.u
            if (r1 == 0) goto L_0x019d
            int r1 = r6.o0()
            j3.s r1 = r6.c0(r1)
            r6 = r1
            j3.u r6 = (j3.u) r6
            goto L_0x0182
        L_0x019d:
            r1 = r6
            goto L_0x01c7
        L_0x019f:
            j3.z$a r13 = new j3.z$a
            r13.<init>()
            j3.u r4 = r7.f22845d
            kotlin.jvm.internal.C6496s.e(r4)
            int r14 = r4.x()
            r17 = 4
            r18 = 0
            r15 = 1
            r16 = 0
            j3.z$a r4 = j3.z.a.k(r13, r14, r15, r16, r17, r18)
            j3.z$a r4 = r4.b(r8)
            j3.z$a r4 = r4.c(r8)
            j3.z r4 = r4.a()
            r7.S(r6, r5, r4, r9)
        L_0x01c7:
            int r3 = r3 + 1
            goto L_0x0164
        L_0x01ca:
            j3.s$a r0 = j3.s.f22957k
            android.content.Context r2 = r7.f22842a
            java.lang.String r0 = r0.b(r2, r4)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r0)
            java.lang.String r0 = " cannot be found in graph "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01ef:
            r7.f22848g = r10
            return r10
        L_0x01f2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.n.N(android.content.Intent):boolean");
    }

    public final void T(String str, z zVar, C2128E.a aVar) {
        C6496s.h(str, "route");
        if (this.f22845d != null) {
            u L10 = L(this.f22849h);
            s.b r02 = L10.r0(str, true, true, L10);
            if (r02 != null) {
                s b10 = r02.b();
                Bundle k10 = b10.k(r02.c());
                if (k10 == null) {
                    k10 = new Bundle();
                }
                s b11 = r02.b();
                Intent intent = new Intent();
                Uri parse = Uri.parse(s.f22957k.a(b10.C()));
                C6496s.d(parse, "Uri.parse(this)");
                intent.setDataAndType(parse, (String) null);
                intent.setAction((String) null);
                k10.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                S(b11, k10, zVar, aVar);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + this.f22845d);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    public final void U(String str, C6798l lVar) {
        C6496s.h(str, "route");
        C6496s.h(lVar, "builder");
        V(this, str, C2125B.a(lVar), (C2128E.a) null, 4, (Object) null);
    }

    public boolean X() {
        Bundle bundle;
        Intent intent;
        if (G() != 1) {
            return Z();
        }
        Activity activity = this.f22843b;
        int[] iArr = null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            bundle = null;
        } else {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
        }
        if (iArr != null) {
            return s0();
        }
        return t0();
    }

    public boolean Z() {
        if (this.f22849h.isEmpty()) {
            return false;
        }
        s F10 = F();
        C6496s.e(F10);
        return a0(F10.x(), true);
    }

    public boolean a0(int i10, boolean z10) {
        return b0(i10, z10, false);
    }

    public boolean b0(int i10, boolean z10, boolean z11) {
        if (!e0(i10, z10, z11) || !t()) {
            return false;
        }
        return true;
    }

    public final void c0(k kVar, C6787a aVar) {
        C6496s.h(kVar, "popUpTo");
        C6496s.h(aVar, "onComplete");
        int indexOf = this.f22849h.indexOf(kVar);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + kVar + " as it was not found on the current back stack");
            return;
        }
        int i10 = indexOf + 1;
        if (i10 != this.f22849h.size()) {
            e0(((k) this.f22849h.get(i10)).e().x(), true, false);
        }
        j0(this, kVar, false, (C6558k) null, 6, (Object) null);
        aVar.invoke();
        w0();
        t();
    }

    public final List k0() {
        ArrayList arrayList = new ArrayList();
        for (b c10 : this.f22866y.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : (Iterable) c10.c().getValue()) {
                k kVar = (k) next;
                if (!arrayList.contains(kVar) && !kVar.g().b(C1790m.b.STARTED)) {
                    arrayList2.add(next);
                }
            }
            C6565s.D(arrayList, arrayList2);
        }
        C6558k kVar2 = this.f22849h;
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : kVar2) {
            k kVar3 = (k) next2;
            if (!arrayList.contains(kVar3) && kVar3.g().b(C1790m.b.STARTED)) {
                arrayList3.add(next2);
            }
        }
        C6565s.D(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (!(((k) next3).e() instanceof u)) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    public void l0(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f22842a.getClassLoader());
            this.f22846e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f22847f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f22857p.clear();
            int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    this.f22856o.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                    i10++;
                    i11++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        Map map = this.f22857p;
                        C6496s.g(str, "id");
                        C6558k kVar = new C6558k(parcelableArray.length);
                        Iterator a10 = C6481c.a(parcelableArray);
                        while (a10.hasNext()) {
                            Parcelable parcelable = (Parcelable) a10.next();
                            C6496s.f(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            kVar.add((l) parcelable);
                        }
                        map.put(str, kVar);
                    }
                }
            }
            this.f22848g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }

    public Bundle n0() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f22865x.f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle i10 = ((C2128E) entry.getValue()).i();
            if (i10 != null) {
                arrayList.add(str);
                bundle2.putBundle(str, i10);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f22849h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f22849h.size()];
            Iterator it = this.f22849h.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                parcelableArr[i11] = new l((k) it.next());
                i11++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f22856o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f22856o.size()];
            ArrayList arrayList2 = new ArrayList();
            int i12 = 0;
            for (Map.Entry entry2 : this.f22856o.entrySet()) {
                iArr[i12] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i12++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f22857p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : this.f22857p.entrySet()) {
                String str2 = (String) entry3.getKey();
                C6558k kVar = (C6558k) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[kVar.size()];
                int i13 = 0;
                for (Object next : kVar) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C6565s.x();
                    }
                    parcelableArr2[i13] = (l) next;
                    i13 = i14;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f22848g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f22848g);
        }
        return bundle;
    }

    public void o0(u uVar) {
        C6496s.h(uVar, "graph");
        p0(uVar, (Bundle) null);
    }

    public void p0(u uVar, Bundle bundle) {
        C6496s.h(uVar, "graph");
        if (!this.f22849h.isEmpty() && I() == C1790m.b.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        } else if (!C6496s.c(this.f22845d, uVar)) {
            u uVar2 = this.f22845d;
            if (uVar2 != null) {
                for (Integer num : new ArrayList(this.f22856o.keySet())) {
                    C6496s.g(num, "id");
                    r(num.intValue());
                }
                h0(this, uVar2.x(), true, false, 4, (Object) null);
            }
            this.f22845d = uVar;
            Y(bundle);
        } else {
            int o10 = uVar.j0().o();
            for (int i10 = 0; i10 < o10; i10++) {
                u uVar3 = this.f22845d;
                C6496s.e(uVar3);
                int j10 = uVar3.j0().j(i10);
                u uVar4 = this.f22845d;
                C6496s.e(uVar4);
                uVar4.j0().m(j10, (s) uVar.j0().p(i10));
            }
            for (k kVar : this.f22849h) {
                s sVar = this.f22845d;
                C6496s.e(sVar);
                for (s sVar2 : C6565s.U(Rg.k.G(s.f22957k.c(kVar.e())))) {
                    if ((!C6496s.c(sVar2, this.f22845d) || !C6496s.c(sVar, uVar)) && (sVar instanceof u)) {
                        sVar = ((u) sVar).c0(sVar2.x());
                        C6496s.e(sVar);
                    }
                }
                kVar.j(sVar);
            }
        }
    }

    public void q0(C1798v vVar) {
        C1790m lifecycle;
        C6496s.h(vVar, "owner");
        if (!C6496s.c(vVar, this.f22858q)) {
            C1798v vVar2 = this.f22858q;
            if (!(vVar2 == null || (lifecycle = vVar2.getLifecycle()) == null)) {
                lifecycle.d(this.f22862u);
            }
            this.f22858q = vVar;
            vVar.getLifecycle().a(this.f22862u);
        }
    }

    public void r0(d0 d0Var) {
        C6496s.h(d0Var, "viewModelStore");
        o oVar = this.f22859r;
        o.b bVar = o.f22901b;
        if (!C6496s.c(oVar, bVar.a(d0Var))) {
            if (this.f22849h.isEmpty()) {
                this.f22859r = bVar.a(d0Var);
                return;
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
    }

    public q s() {
        return new q(this);
    }

    public final k u0(k kVar) {
        C6496s.h(kVar, "child");
        k kVar2 = (k) this.f22854m.remove(kVar);
        Integer num = null;
        if (kVar2 == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.f22855n.get(kVar2);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            b bVar = (b) this.f22866y.get(this.f22865x.e(kVar2.e().z()));
            if (bVar != null) {
                bVar.e(kVar2);
            }
            this.f22855n.remove(kVar2);
        }
        return kVar2;
    }

    public final void v0() {
        Boolean bool;
        AtomicInteger atomicInteger;
        L c10;
        Set set;
        List<k> h12 = C6565s.h1(this.f22849h);
        if (!h12.isEmpty()) {
            s e10 = ((k) C6565s.z0(h12)).e();
            ArrayList arrayList = new ArrayList();
            if (e10 instanceof C2133d) {
                for (k e11 : C6565s.N0(h12)) {
                    s e12 = e11.e();
                    arrayList.add(e12);
                    if (!(e12 instanceof C2133d) && !(e12 instanceof u)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (k kVar : C6565s.N0(h12)) {
                C1790m.b g10 = kVar.g();
                s e13 = kVar.e();
                if (e10 != null && e13.x() == e10.x()) {
                    C1790m.b bVar = C1790m.b.RESUMED;
                    if (g10 != bVar) {
                        b bVar2 = (b) this.f22866y.get(J().e(kVar.e().z()));
                        if (bVar2 == null || (c10 = bVar2.c()) == null || (set = (Set) c10.getValue()) == null) {
                            bool = null;
                        } else {
                            bool = Boolean.valueOf(set.contains(kVar));
                        }
                        if (C6496s.c(bool, Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f22855n.get(kVar)) != null && atomicInteger.get() == 0)) {
                            hashMap.put(kVar, C1790m.b.STARTED);
                        } else {
                            hashMap.put(kVar, bVar);
                        }
                    }
                    s sVar = (s) C6565s.q0(arrayList);
                    if (sVar != null && sVar.x() == e13.x()) {
                        C6565s.L(arrayList);
                    }
                    e10 = e10.A();
                } else if (arrayList.isEmpty() || e13.x() != ((s) C6565s.o0(arrayList)).x()) {
                    kVar.k(C1790m.b.CREATED);
                } else {
                    s sVar2 = (s) C6565s.L(arrayList);
                    if (g10 == C1790m.b.RESUMED) {
                        kVar.k(C1790m.b.STARTED);
                    } else {
                        C1790m.b bVar3 = C1790m.b.STARTED;
                        if (g10 != bVar3) {
                            hashMap.put(kVar, bVar3);
                        }
                    }
                    u A10 = sVar2.A();
                    if (A10 != null && !arrayList.contains(A10)) {
                        arrayList.add(A10);
                    }
                }
            }
            for (k kVar2 : h12) {
                C1790m.b bVar4 = (C1790m.b) hashMap.get(kVar2);
                if (bVar4 != null) {
                    kVar2.k(bVar4);
                } else {
                    kVar2.l();
                }
            }
        }
    }

    public final s w(int i10, s sVar) {
        s sVar2;
        u uVar = this.f22845d;
        if (uVar == null) {
            return null;
        }
        C6496s.e(uVar);
        if (uVar.x() == i10) {
            if (sVar == null) {
                return this.f22845d;
            }
            if (C6496s.c(this.f22845d, sVar) && sVar.A() == null) {
                return this.f22845d;
            }
        }
        k kVar = (k) this.f22849h.x();
        if (kVar == null || (sVar2 = kVar.e()) == null) {
            sVar2 = this.f22845d;
            C6496s.e(sVar2);
        }
        return y(sVar2, i10, false, sVar);
    }

    public final s y(s sVar, int i10, boolean z10, s sVar2) {
        u uVar;
        C6496s.h(sVar, "<this>");
        if (sVar.x() == i10 && (sVar2 == null || (C6496s.c(sVar, sVar2) && C6496s.c(sVar.A(), sVar2.A())))) {
            return sVar;
        }
        if (sVar instanceof u) {
            uVar = (u) sVar;
        } else {
            uVar = sVar.A();
            C6496s.e(uVar);
        }
        return uVar.h0(i10, uVar, z10, sVar2);
    }
}
