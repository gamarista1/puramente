package expo.modules.av;

import Hd.l;
import Yd.a;
import android.os.Bundle;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.av.d;
import ge.C5007a;
import ge.e;
import ie.C5036f;
import ie.C5037g;
import ie.C5039i;
import ie.C5040j;
import ie.k;
import ie.n;
import java.lang.ref.WeakReference;
import java.util.Map;
import ke.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6531o;
import qe.C5155b;
import qe.C5157d;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u0004\u0018\u00010\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lexpo/modules/av/c;", "Lke/b;", "<init>", "()V", "Lke/d;", "b", "()Lke/d;", "Lexpo/modules/av/a;", "d", "Lkotlin/Lazy;", "o", "()Lexpo/modules/av/a;", "_avManager", "n", "avManager", "expo-av_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f60176d = C6531o.b(new l(this));

    public static final class A implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60177a;

        public A(c cVar) {
            this.f60177a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            a.b(this.f60177a.c().t(), objArr[0], "android.permission.RECORD_AUDIO");
            return C6514M.f71813a;
        }
    }

    public static final class B implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60178a;

        public B(c cVar) {
            this.f60178a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            Boolean bool = objArr[0];
            bool.booleanValue();
            this.f60178a.n().f(bool);
            return C6514M.f71813a;
        }
    }

    public static final class C implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60179a;

        public C(c cVar) {
            this.f60179a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60179a.n().A((Nd.b) pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class D implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final D f60180a = new D();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Nd.b.class);
        }
    }

    public static final class E implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60181a;

        public E(c cVar) {
            this.f60181a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            this.f60181a.n().A(objArr[0]);
            return C6514M.f71813a;
        }
    }

    public static final class F implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60182a;

        public F(c cVar) {
            this.f60182a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60182a.n().l(d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class G implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final G f60183a = new G();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ae.p.class);
        }
    }

    public static final class H implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60184a;

        public H(c cVar) {
            this.f60184a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            this.f60184a.n().l(d.b(objArr[0]));
            return C6514M.f71813a;
        }
    }

    public static final class I implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final I f60185a = new I();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Nd.b.class);
        }
    }

    public static final class J implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60186a;

        public J(c cVar) {
            this.f60186a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            int intValue = objArr[0].intValue();
            this.f60186a.n().c(Integer.valueOf(intValue), objArr[1], d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class K implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final K f60187a = new K();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    public static final class L implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60188a;

        public L(c cVar) {
            this.f60188a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60188a.n().h(Integer.valueOf(objArr[0].intValue()), d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class M implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final M f60189a = new M();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    public static final class N implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final N f60190a = new N();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.g(Nd.b.class);
        }
    }

    public static final class O implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final O f60191a = new O();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.g(Nd.b.class);
        }
    }

    public static final class P implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60192a;

        public P(c cVar) {
            this.f60192a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            Number number = objArr[0];
            int intValue = number.intValue();
            a m10 = this.f60192a.n();
            Integer valueOf = Integer.valueOf(intValue);
            m10.b(valueOf, objArr[1], objArr[2], d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class Q implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final Q f60193a = new Q();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    public static final class R implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60194a;

        public R(c cVar) {
            this.f60194a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60194a.n().s(Integer.valueOf(objArr[0].intValue()), d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class S implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final S f60195a = new S();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Nd.b.class);
        }
    }

    public static final class T implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final T f60196a = new T();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    public static final class U implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final U f60197a = new U();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Nd.b.class);
        }
    }

    public static final class V implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60198a;

        public V(c cVar) {
            this.f60198a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            int intValue = objArr[0].intValue();
            this.f60198a.n().q(Integer.valueOf(intValue), objArr[1], d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class W implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final W f60199a = new W();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    public static final class X implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final X f60200a = new X();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Nd.b.class);
        }
    }

    public static final class Y implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60201a;

        public Y(c cVar) {
            this.f60201a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            int intValue = objArr[0].intValue();
            this.f60201a.n().F(Integer.valueOf(intValue), objArr[1], d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class Z implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final Z f60202a = new Z();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    /* renamed from: expo.modules.av.c$a  reason: case insensitive filesystem */
    static final class C4955a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f60203a;

        C4955a(WeakReference weakReference) {
            this.f60203a = weakReference;
        }

        public final void a(String str, Bundle bundle) {
            C6496s.h(str, "name");
            C6496s.h(bundle, "body");
            try {
                c cVar = (c) this.f60203a.get();
                if (cVar != null) {
                    cVar.h(str, bundle);
                }
            } catch (Throwable unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (Bundle) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class a0 implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60204a;

        public a0(c cVar) {
            this.f60204a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60204a.n().g(Integer.valueOf(objArr[0].intValue()), d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$b  reason: case insensitive filesystem */
    public static final class C4956b implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60205a;

        public C4956b(c cVar) {
            this.f60205a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60205a.n().i(d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class b0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b0 f60206a = new b0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Nd.b.class);
        }
    }

    /* renamed from: expo.modules.av.c$c  reason: collision with other inner class name */
    public static final class C0882c implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0882c f60207a = new C0882c();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ae.p.class);
        }
    }

    public static final class c0 implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60208a;

        public c0(c cVar) {
            this.f60208a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60208a.n().G(objArr[0], d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$d  reason: case insensitive filesystem */
    public static final class C4957d implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60209a;

        public C4957d(c cVar) {
            this.f60209a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            this.f60209a.n().i(d.b(objArr[0]));
            return C6514M.f71813a;
        }
    }

    public static final class d0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final d0 f60210a = new d0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Nd.b.class);
        }
    }

    /* renamed from: expo.modules.av.c$e  reason: case insensitive filesystem */
    public static final class C4958e implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60211a;

        public C4958e(c cVar) {
            this.f60211a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60211a.n().z(d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class e0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final e0 f60212a = new e0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: expo.modules.av.c$f  reason: case insensitive filesystem */
    public static final class C4959f implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4959f f60213a = new C4959f();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ae.p.class);
        }
    }

    public static final class f0 implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60214a;

        public f0(c cVar) {
            this.f60214a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60214a.n().C(objArr[0], d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$g  reason: case insensitive filesystem */
    public static final class C4960g implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60215a;

        public C4960g(c cVar) {
            this.f60215a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            this.f60215a.n().z(d.b(objArr[0]));
            return C6514M.f71813a;
        }
    }

    public static final class g0 implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60216a;

        public g0(c cVar) {
            this.f60216a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            a m10 = this.f60216a.n();
            m10.t(objArr[0], objArr[1], d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$h  reason: case insensitive filesystem */
    public static final class C4961h implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60217a;

        public C4961h(c cVar) {
            this.f60217a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60217a.n().r(d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class h0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final h0 f60218a = new h0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    /* renamed from: expo.modules.av.c$i  reason: case insensitive filesystem */
    public static final class C4962i implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4962i f60219a = new C4962i();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ae.p.class);
        }
    }

    public static final class i0 implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60220a;

        public i0(c cVar) {
            this.f60220a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60220a.n().w(Integer.valueOf(objArr[0].intValue()), d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$j  reason: case insensitive filesystem */
    public static final class C4963j implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60221a;

        public C4963j(c cVar) {
            this.f60221a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            this.f60221a.n().r(d.b(objArr[0]));
            return C6514M.f71813a;
        }
    }

    public static final class j0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final j0 f60222a = new j0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    /* renamed from: expo.modules.av.c$k  reason: case insensitive filesystem */
    public static final class C4964k implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60223a;

        public C4964k(c cVar) {
            this.f60223a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60223a.n().k(d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class k0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final k0 f60224a = new k0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Nd.b.class);
        }
    }

    /* renamed from: expo.modules.av.c$l  reason: case insensitive filesystem */
    public static final class C4965l implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60225a;

        public C4965l(c cVar) {
            this.f60225a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            Boolean bool = (Boolean) pVar;
            bool.booleanValue();
            this.f60225a.n().f(bool);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class l0 implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60226a;

        public l0(c cVar) {
            this.f60226a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            int intValue = objArr[0].intValue();
            this.f60226a.n().n(Integer.valueOf(intValue), objArr[1], d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$m  reason: case insensitive filesystem */
    public static final class C4966m implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4966m f60227a = new C4966m();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ae.p.class);
        }
    }

    public static final class m0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final m0 f60228a = new m0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    /* renamed from: expo.modules.av.c$n  reason: case insensitive filesystem */
    public static final class C4967n implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60229a;

        public C4967n(c cVar) {
            this.f60229a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            this.f60229a.n().k(d.b(objArr[0]));
            return C6514M.f71813a;
        }
    }

    public static final class n0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60230a;

        public n0(c cVar) {
            this.f60230a = cVar;
        }

        public final void a() {
            Object obj;
            C4955a aVar = new C4955a(new WeakReference(this.f60230a));
            try {
                obj = this.f60230a.c().p().b(a.class);
            } catch (Exception unused) {
                obj = null;
            }
            a aVar2 = (a) obj;
            if (aVar2 != null) {
                aVar2.B(new d.a(aVar));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$o  reason: case insensitive filesystem */
    public static final class C4968o implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60231a;

        public C4968o(c cVar) {
            this.f60231a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60231a.n().D(d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$p  reason: case insensitive filesystem */
    public static final class C4969p implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4969p f60232a = new C4969p();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ae.p.class);
        }
    }

    /* renamed from: expo.modules.av.c$q  reason: case insensitive filesystem */
    public static final class C4970q implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60233a;

        public C4970q(c cVar) {
            this.f60233a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            this.f60233a.n().D(d.b(objArr[0]));
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$r  reason: case insensitive filesystem */
    public static final class C4971r implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60234a;

        public C4971r(c cVar) {
            this.f60234a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f60234a.n().j(d.b(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$s  reason: case insensitive filesystem */
    public static final class C4972s implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4972s f60235a = new C4972s();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ae.p.class);
        }
    }

    /* renamed from: expo.modules.av.c$t  reason: case insensitive filesystem */
    public static final class C4973t implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60236a;

        public C4973t(c cVar) {
            this.f60236a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            this.f60236a.n().j(d.b(objArr[0]));
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$u  reason: case insensitive filesystem */
    public static final class C4974u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60237a;

        public C4974u(c cVar) {
            this.f60237a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            a.d(this.f60237a.c().t(), pVar, "android.permission.RECORD_AUDIO");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$v  reason: case insensitive filesystem */
    public static final class C4975v implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4975v f60238a = new C4975v();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ae.p.class);
        }
    }

    /* renamed from: expo.modules.av.c$w  reason: case insensitive filesystem */
    public static final class C4976w implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4976w f60239a = new C4976w();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(Boolean.TYPE);
        }
    }

    /* renamed from: expo.modules.av.c$x  reason: case insensitive filesystem */
    public static final class C4977x implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60240a;

        public C4977x(c cVar) {
            this.f60240a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            a.d(this.f60240a.c().t(), objArr[0], "android.permission.RECORD_AUDIO");
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$y  reason: case insensitive filesystem */
    public static final class C4978y implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60241a;

        public C4978y(c cVar) {
            this.f60241a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            a.b(this.f60241a.c().t(), pVar, "android.permission.RECORD_AUDIO");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: expo.modules.av.c$z  reason: case insensitive filesystem */
    public static final class C4979z implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4979z f60242a = new C4979z();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ae.p.class);
        }
    }

    /* access modifiers changed from: private */
    public static final a l(c cVar) {
        Object obj;
        try {
            obj = cVar.c().p().b(a.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (a) obj;
    }

    /* access modifiers changed from: private */
    public final a n() {
        a o10 = o();
        if (o10 != null) {
            return o10;
        }
        throw new b();
    }

    private final a o() {
        return (a) this.f60176d.getValue();
    }

    public ke.d b() {
        Object obj;
        Object obj2;
        Class<String> cls;
        Class<C6514M> cls2;
        Class<ae.p> cls3;
        Class<C6514M> cls4;
        Class<String> cls5;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object fVar;
        Object fVar2;
        Object fVar3;
        Object fVar4;
        Object fVar5;
        Object fVar6;
        Object fVar7;
        Object fVar8;
        Object fVar9;
        Object kVar;
        Object fVar10;
        Object fVar11;
        Class<Boolean> cls6 = Boolean.class;
        Class<Integer> cls7 = Integer.class;
        Class<Nd.b> cls8 = Nd.b.class;
        Class<ae.p> cls9 = ae.p.class;
        D3.a.c("[" + "ExpoModulesCore" + "] " + (getClass() + ".ModuleDefinition"));
        try {
            ke.c cVar = new ke.c(this);
            cVar.o("ExponentAV");
            cVar.g("didUpdatePlaybackStatus", "ExponentAV.onError", "Expo.Recording.recorderUnloaded");
            Map r10 = cVar.r();
            e eVar = e.MODULE_CREATE;
            r10.put(eVar, new C5007a(eVar, new n0(this)));
            Class<C6514M> cls10 = C6514M.class;
            Class<String> cls11 = String.class;
            if (C6496s.c(cls6, cls9)) {
                obj = new C5037g("setAudioIsEnabled", new C5155b[0], new C4965l(this));
            } else {
                C5155b bVar = (C5155b) C5157d.f61437a.a().get(new Pair(kotlin.jvm.internal.O.b(cls6), Boolean.FALSE));
                if (bVar == null) {
                    bVar = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls6), false, C4976w.f60239a));
                }
                C5155b[] bVarArr = {bVar};
                B b10 = new B(this);
                if (C6496s.c(cls10, Integer.TYPE)) {
                    fVar11 = new ie.l("setAudioIsEnabled", bVarArr, b10);
                } else if (C6496s.c(cls10, Boolean.TYPE)) {
                    fVar11 = new C5039i("setAudioIsEnabled", bVarArr, b10);
                } else if (C6496s.c(cls10, Double.TYPE)) {
                    fVar11 = new C5040j("setAudioIsEnabled", bVarArr, b10);
                } else if (C6496s.c(cls10, Float.TYPE)) {
                    fVar11 = new k("setAudioIsEnabled", bVarArr, b10);
                } else if (C6496s.c(cls10, cls11)) {
                    fVar11 = new n("setAudioIsEnabled", bVarArr, b10);
                } else {
                    fVar11 = new C5036f("setAudioIsEnabled", bVarArr, b10);
                }
                obj = fVar11;
            }
            cVar.k().put("setAudioIsEnabled", obj);
            if (C6496s.c(cls8, cls9)) {
                obj2 = new C5037g("setAudioMode", new C5155b[0], new C(this));
            } else {
                C5155b bVar2 = (C5155b) C5157d.f61437a.a().get(new Pair(kotlin.jvm.internal.O.b(cls8), Boolean.FALSE));
                if (bVar2 == null) {
                    bVar2 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), false, D.f60180a));
                }
                C5155b[] bVarArr2 = {bVar2};
                E e10 = new E(this);
                if (C6496s.c(cls10, Integer.TYPE)) {
                    fVar10 = new ie.l("setAudioMode", bVarArr2, e10);
                } else if (C6496s.c(cls10, Boolean.TYPE)) {
                    fVar10 = new C5039i("setAudioMode", bVarArr2, e10);
                } else if (C6496s.c(cls10, Double.TYPE)) {
                    fVar10 = new C5040j("setAudioMode", bVarArr2, e10);
                } else if (C6496s.c(cls10, Float.TYPE)) {
                    fVar10 = new k("setAudioMode", bVarArr2, e10);
                } else if (C6496s.c(cls10, cls11)) {
                    fVar10 = new n("setAudioMode", bVarArr2, e10);
                } else {
                    fVar10 = new C5036f("setAudioMode", bVarArr2, e10);
                }
                obj2 = fVar10;
            }
            cVar.k().put("setAudioMode", obj2);
            C5157d dVar = C5157d.f61437a;
            Ff.d b11 = kotlin.jvm.internal.O.b(cls8);
            Boolean bool = Boolean.FALSE;
            C5155b bVar3 = (C5155b) dVar.a().get(new Pair(b11, bool));
            if (bVar3 == null) {
                cls = cls11;
                bVar3 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), false, S.f60195a));
            } else {
                cls = cls11;
            }
            C5155b bVar4 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls8), bool));
            if (bVar4 == null) {
                cls2 = cls10;
                bVar4 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), false, d0.f60210a));
            } else {
                cls2 = cls10;
            }
            cVar.k().put("loadForSound", new C5037g("loadForSound", new C5155b[]{bVar3, bVar4}, new g0(this)));
            C5155b bVar5 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (bVar5 == null) {
                bVar5 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls7), false, h0.f60218a));
            }
            cVar.k().put("unloadForSound", new C5037g("unloadForSound", new C5155b[]{bVar5}, new i0(this)));
            C5155b bVar6 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (bVar6 == null) {
                bVar6 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls7), false, j0.f60222a));
            }
            C5155b bVar7 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls8), bool));
            if (bVar7 == null) {
                bVar7 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), false, k0.f60224a));
            }
            cVar.k().put("setStatusForSound", new C5037g("setStatusForSound", new C5155b[]{bVar6, bVar7}, new l0(this)));
            C5155b bVar8 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (bVar8 == null) {
                bVar8 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls7), false, m0.f60228a));
            }
            C5155b bVar9 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls8), bool));
            if (bVar9 == null) {
                bVar9 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), false, I.f60185a));
            }
            cVar.k().put("replaySound", new C5037g("replaySound", new C5155b[]{bVar8, bVar9}, new J(this)));
            C5155b bVar10 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (bVar10 == null) {
                bVar10 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls7), false, K.f60187a));
            }
            cVar.k().put("getStatusForSound", new C5037g("getStatusForSound", new C5155b[]{bVar10}, new L(this)));
            C5155b bVar11 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (bVar11 == null) {
                bVar11 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls7), false, M.f60189a));
            }
            Ff.d b12 = kotlin.jvm.internal.O.b(cls8);
            Boolean bool2 = Boolean.TRUE;
            C5155b bVar12 = (C5155b) dVar.a().get(new Pair(b12, bool2));
            if (bVar12 == null) {
                cls3 = cls9;
                bVar12 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), true, N.f60190a));
            } else {
                cls3 = cls9;
            }
            C5155b bVar13 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls8), bool2));
            if (bVar13 == null) {
                bVar13 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), true, O.f60191a));
            }
            cVar.k().put("loadForVideo", new C5037g("loadForVideo", new C5155b[]{bVar11, bVar12, bVar13}, new P(this)));
            C5155b bVar14 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (bVar14 == null) {
                bVar14 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls7), false, Q.f60193a));
            }
            cVar.k().put("unloadForVideo", new C5037g("unloadForVideo", new C5155b[]{bVar14}, new R(this)));
            C5155b bVar15 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (bVar15 == null) {
                bVar15 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls7), false, T.f60196a));
            }
            C5155b bVar16 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls8), bool));
            if (bVar16 == null) {
                bVar16 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), false, U.f60197a));
            }
            cVar.k().put("setStatusForVideo", new C5037g("setStatusForVideo", new C5155b[]{bVar15, bVar16}, new V(this)));
            C5155b bVar17 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (bVar17 == null) {
                bVar17 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls7), false, W.f60199a));
            }
            C5155b bVar18 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls8), bool));
            if (bVar18 == null) {
                bVar18 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), false, X.f60200a));
            }
            cVar.k().put("replayVideo", new C5037g("replayVideo", new C5155b[]{bVar17, bVar18}, new Y(this)));
            C5155b bVar19 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls7), bool));
            if (bVar19 == null) {
                bVar19 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls7), false, Z.f60202a));
            }
            cVar.k().put("getStatusForVideo", new C5037g("getStatusForVideo", new C5155b[]{bVar19}, new a0(this)));
            C5155b bVar20 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls8), bool));
            if (bVar20 == null) {
                bVar20 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls8), false, b0.f60206a));
            }
            cVar.k().put("prepareAudioRecorder", new C5037g("prepareAudioRecorder", new C5155b[]{bVar20}, new c0(this)));
            Class<ae.p> cls12 = cls3;
            if (C6496s.c(cls12, cls12)) {
                obj3 = new C5037g("getAvailableInputs", new C5155b[0], new F(this));
                cls5 = cls;
                cls4 = cls2;
            } else {
                C5155b bVar21 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls12), bool));
                if (bVar21 == null) {
                    bVar21 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls12), false, G.f60183a));
                }
                C5155b[] bVarArr3 = {bVar21};
                H h10 = new H(this);
                cls4 = cls2;
                if (C6496s.c(cls4, Integer.TYPE)) {
                    kVar = new ie.l("getAvailableInputs", bVarArr3, h10);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    kVar = new C5039i("getAvailableInputs", bVarArr3, h10);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    kVar = new C5040j("getAvailableInputs", bVarArr3, h10);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    kVar = new k("getAvailableInputs", bVarArr3, h10);
                } else {
                    cls5 = cls;
                    if (C6496s.c(cls4, cls5)) {
                        fVar9 = new n("getAvailableInputs", bVarArr3, h10);
                    } else {
                        fVar9 = new C5036f("getAvailableInputs", bVarArr3, h10);
                    }
                    obj3 = fVar9;
                }
                obj3 = kVar;
                cls5 = cls;
            }
            cVar.k().put("getAvailableInputs", obj3);
            if (C6496s.c(cls12, cls12)) {
                obj4 = new C5037g("getCurrentInput", new C5155b[0], new C4956b(this));
            } else {
                C5155b bVar22 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls12), bool));
                if (bVar22 == null) {
                    bVar22 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls12), false, C0882c.f60207a));
                }
                C5155b[] bVarArr4 = {bVar22};
                C4957d dVar2 = new C4957d(this);
                if (C6496s.c(cls4, Integer.TYPE)) {
                    fVar8 = new ie.l("getCurrentInput", bVarArr4, dVar2);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    fVar8 = new C5039i("getCurrentInput", bVarArr4, dVar2);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    fVar8 = new C5040j("getCurrentInput", bVarArr4, dVar2);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    fVar8 = new k("getCurrentInput", bVarArr4, dVar2);
                } else if (C6496s.c(cls4, cls5)) {
                    fVar8 = new n("getCurrentInput", bVarArr4, dVar2);
                } else {
                    fVar8 = new C5036f("getCurrentInput", bVarArr4, dVar2);
                }
                obj4 = fVar8;
            }
            cVar.k().put("getCurrentInput", obj4);
            C5155b bVar23 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls5), bool));
            if (bVar23 == null) {
                bVar23 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls5), false, e0.f60212a));
            }
            cVar.k().put("setInput", new C5037g("setInput", new C5155b[]{bVar23}, new f0(this)));
            if (C6496s.c(cls12, cls12)) {
                obj5 = new C5037g("startAudioRecording", new C5155b[0], new C4958e(this));
            } else {
                C5155b bVar24 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls12), bool));
                if (bVar24 == null) {
                    bVar24 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls12), false, C4959f.f60213a));
                }
                C5155b[] bVarArr5 = {bVar24};
                C4960g gVar = new C4960g(this);
                if (C6496s.c(cls4, Integer.TYPE)) {
                    fVar7 = new ie.l("startAudioRecording", bVarArr5, gVar);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    fVar7 = new C5039i("startAudioRecording", bVarArr5, gVar);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    fVar7 = new C5040j("startAudioRecording", bVarArr5, gVar);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    fVar7 = new k("startAudioRecording", bVarArr5, gVar);
                } else if (C6496s.c(cls4, cls5)) {
                    fVar7 = new n("startAudioRecording", bVarArr5, gVar);
                } else {
                    fVar7 = new C5036f("startAudioRecording", bVarArr5, gVar);
                }
                obj5 = fVar7;
            }
            cVar.k().put("startAudioRecording", obj5);
            if (C6496s.c(cls12, cls12)) {
                obj6 = new C5037g("pauseAudioRecording", new C5155b[0], new C4961h(this));
            } else {
                C5155b bVar25 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls12), bool));
                if (bVar25 == null) {
                    bVar25 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls12), false, C4962i.f60219a));
                }
                C5155b[] bVarArr6 = {bVar25};
                C4963j jVar = new C4963j(this);
                if (C6496s.c(cls4, Integer.TYPE)) {
                    fVar6 = new ie.l("pauseAudioRecording", bVarArr6, jVar);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    fVar6 = new C5039i("pauseAudioRecording", bVarArr6, jVar);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    fVar6 = new C5040j("pauseAudioRecording", bVarArr6, jVar);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    fVar6 = new k("pauseAudioRecording", bVarArr6, jVar);
                } else if (C6496s.c(cls4, cls5)) {
                    fVar6 = new n("pauseAudioRecording", bVarArr6, jVar);
                } else {
                    fVar6 = new C5036f("pauseAudioRecording", bVarArr6, jVar);
                }
                obj6 = fVar6;
            }
            cVar.k().put("pauseAudioRecording", obj6);
            if (C6496s.c(cls12, cls12)) {
                obj7 = new C5037g("stopAudioRecording", new C5155b[0], new C4964k(this));
            } else {
                C5155b bVar26 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls12), bool));
                if (bVar26 == null) {
                    bVar26 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls12), false, C4966m.f60227a));
                }
                C5155b[] bVarArr7 = {bVar26};
                C4967n nVar = new C4967n(this);
                if (C6496s.c(cls4, Integer.TYPE)) {
                    fVar5 = new ie.l("stopAudioRecording", bVarArr7, nVar);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    fVar5 = new C5039i("stopAudioRecording", bVarArr7, nVar);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    fVar5 = new C5040j("stopAudioRecording", bVarArr7, nVar);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    fVar5 = new k("stopAudioRecording", bVarArr7, nVar);
                } else if (C6496s.c(cls4, cls5)) {
                    fVar5 = new n("stopAudioRecording", bVarArr7, nVar);
                } else {
                    fVar5 = new C5036f("stopAudioRecording", bVarArr7, nVar);
                }
                obj7 = fVar5;
            }
            cVar.k().put("stopAudioRecording", obj7);
            if (C6496s.c(cls12, cls12)) {
                obj8 = new C5037g("getAudioRecordingStatus", new C5155b[0], new C4968o(this));
            } else {
                C5155b bVar27 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls12), bool));
                if (bVar27 == null) {
                    bVar27 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls12), false, C4969p.f60232a));
                }
                C5155b[] bVarArr8 = {bVar27};
                C4970q qVar = new C4970q(this);
                if (C6496s.c(cls4, Integer.TYPE)) {
                    fVar4 = new ie.l("getAudioRecordingStatus", bVarArr8, qVar);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    fVar4 = new C5039i("getAudioRecordingStatus", bVarArr8, qVar);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    fVar4 = new C5040j("getAudioRecordingStatus", bVarArr8, qVar);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    fVar4 = new k("getAudioRecordingStatus", bVarArr8, qVar);
                } else if (C6496s.c(cls4, cls5)) {
                    fVar4 = new n("getAudioRecordingStatus", bVarArr8, qVar);
                } else {
                    fVar4 = new C5036f("getAudioRecordingStatus", bVarArr8, qVar);
                }
                obj8 = fVar4;
            }
            cVar.k().put("getAudioRecordingStatus", obj8);
            if (C6496s.c(cls12, cls12)) {
                obj9 = new C5037g("unloadAudioRecorder", new C5155b[0], new C4971r(this));
            } else {
                C5155b bVar28 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls12), bool));
                if (bVar28 == null) {
                    bVar28 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls12), false, C4972s.f60235a));
                }
                C5155b[] bVarArr9 = {bVar28};
                C4973t tVar = new C4973t(this);
                if (C6496s.c(cls4, Integer.TYPE)) {
                    fVar3 = new ie.l("unloadAudioRecorder", bVarArr9, tVar);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    fVar3 = new C5039i("unloadAudioRecorder", bVarArr9, tVar);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    fVar3 = new C5040j("unloadAudioRecorder", bVarArr9, tVar);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    fVar3 = new k("unloadAudioRecorder", bVarArr9, tVar);
                } else if (C6496s.c(cls4, cls5)) {
                    fVar3 = new n("unloadAudioRecorder", bVarArr9, tVar);
                } else {
                    fVar3 = new C5036f("unloadAudioRecorder", bVarArr9, tVar);
                }
                obj9 = fVar3;
            }
            cVar.k().put("unloadAudioRecorder", obj9);
            if (C6496s.c(cls12, cls12)) {
                obj10 = new C5037g("requestPermissionsAsync", new C5155b[0], new C4974u(this));
            } else {
                C5155b bVar29 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls12), bool));
                if (bVar29 == null) {
                    bVar29 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls12), false, C4975v.f60238a));
                }
                C5155b[] bVarArr10 = {bVar29};
                C4977x xVar = new C4977x(this);
                if (C6496s.c(cls4, Integer.TYPE)) {
                    fVar2 = new ie.l("requestPermissionsAsync", bVarArr10, xVar);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    fVar2 = new C5039i("requestPermissionsAsync", bVarArr10, xVar);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    fVar2 = new C5040j("requestPermissionsAsync", bVarArr10, xVar);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    fVar2 = new k("requestPermissionsAsync", bVarArr10, xVar);
                } else if (C6496s.c(cls4, cls5)) {
                    fVar2 = new n("requestPermissionsAsync", bVarArr10, xVar);
                } else {
                    fVar2 = new C5036f("requestPermissionsAsync", bVarArr10, xVar);
                }
                obj10 = fVar2;
            }
            cVar.k().put("requestPermissionsAsync", obj10);
            if (C6496s.c(cls12, cls12)) {
                obj11 = new C5037g("getPermissionsAsync", new C5155b[0], new C4978y(this));
            } else {
                C5155b bVar30 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls12), bool));
                if (bVar30 == null) {
                    bVar30 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls12), false, C4979z.f60242a));
                }
                C5155b[] bVarArr11 = {bVar30};
                A a10 = new A(this);
                if (C6496s.c(cls4, Integer.TYPE)) {
                    fVar = new ie.l("getPermissionsAsync", bVarArr11, a10);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    fVar = new C5039i("getPermissionsAsync", bVarArr11, a10);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    fVar = new C5040j("getPermissionsAsync", bVarArr11, a10);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    fVar = new k("getPermissionsAsync", bVarArr11, a10);
                } else if (C6496s.c(cls4, cls5)) {
                    fVar = new n("getPermissionsAsync", bVarArr11, a10);
                } else {
                    fVar = new C5036f("getPermissionsAsync", bVarArr11, a10);
                }
                obj11 = fVar;
            }
            cVar.k().put("getPermissionsAsync", obj11);
            ke.d p10 = cVar.p();
            D3.a.f();
            return p10;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            D3.a.f();
            throw th3;
        }
    }
}
