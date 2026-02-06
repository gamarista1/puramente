package expo.modules.fetch;

import Gh.C5406g;
import Sd.i;
import Sd.j;
import Sd.k;
import Sd.m;
import Sd.n;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Ug.Z;
import ae.C4464a;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.w;
import mf.C6559l;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.F;
import rh.u;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\r\u0010 \u001a\u00020\u0016¢\u0006\u0004\b \u0010\u001aJ/\u0010%\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160#¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R*\u0010=\u001a\u00020\n2\u0006\u00107\u001a\u00020\n8B@BX\u000e¢\u0006\u0012\n\u0004\b*\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010B\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0#j\u0002`?0>8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR(\u0010G\u001a\u0004\u0018\u00010\u00112\b\u00107\u001a\u0004\u0018\u00010\u00118\u0006@BX\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR4\u0010N\u001a\n\u0018\u00010Hj\u0004\u0018\u0001`I2\u000e\u00107\u001a\n\u0018\u00010Hj\u0004\u0018\u0001`I8\u0006@BX\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0011\u0010Q\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lrh/f;", "Lae/a;", "appContext", "LUg/K;", "coroutineScope", "<init>", "(Lae/a;LUg/K;)V", "", "LSd/n;", "validStates", "", "L0", "([LSd/n;)Z", "Lrh/E;", "response", "LSd/k;", "j0", "(Lrh/E;)LSd/k;", "LGh/g;", "stream", "Llf/M;", "W0", "(LGh/g;)V", "a", "()V", "R0", "", "z1", "()[B", "h0", "o0", "", "states", "Lkotlin/Function1;", "callback", "A1", "(Ljava/util/List;Lyf/l;)V", "Lrh/e;", "call", "Ljava/io/IOException;", "e", "onFailure", "(Lrh/e;Ljava/io/IOException;)V", "onResponse", "(Lrh/e;Lrh/E;)V", "c", "LUg/K;", "LSd/m;", "d", "LSd/m;", "E0", "()LSd/m;", "sink", "value", "LSd/n;", "I0", "()LSd/n;", "n1", "(LSd/n;)V", "state", "", "Lexpo/modules/fetch/StateChangeListener;", "f", "Ljava/util/List;", "stateChangeOnceListeners", "g", "LSd/k;", "B0", "()LSd/k;", "responseInit", "Ljava/lang/Exception;", "Lkotlin/Exception;", "h", "Ljava/lang/Exception;", "x0", "()Ljava/lang/Exception;", "error", "t0", "()Z", "bodyUsed", "i", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeResponse extends SharedObject implements C6709f {

    /* renamed from: i  reason: collision with root package name */
    public static final a f60398i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    private static final String f60399j = NativeResponse.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private final K f60400c;

    /* renamed from: d  reason: collision with root package name */
    private final m f60401d = new m();

    /* renamed from: e  reason: collision with root package name */
    private n f60402e = n.INITIALIZED;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final List f60403f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private k f60404g;

    /* renamed from: h  reason: collision with root package name */
    private Exception f60405h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f60406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f60407b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NativeResponse f60408c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(E e10, NativeResponse nativeResponse, C6658d dVar) {
            super(2, dVar);
            this.f60407b = e10;
            this.f60408c = nativeResponse;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f60407b, this.f60408c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C5406g y10;
            C6680b.f();
            if (this.f60406a == 0) {
                w.b(obj);
                F a10 = this.f60407b.a();
                if (a10 == null || (y10 = a10.y()) == null) {
                    return C6514M.f71813a;
                }
                this.f60408c.W0(y10);
                this.f60407b.close();
                if (this.f60408c.I0() == n.BODY_STREAMING_STARTED) {
                    this.f60408c.b("didComplete", new Object[0]);
                }
                this.f60408c.n1(n.BODY_COMPLETED);
                this.f60408c.b("readyForJSFinalization", new Object[0]);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f60409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NativeResponse f60410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f60411c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(NativeResponse nativeResponse, n nVar, C6658d dVar) {
            super(2, dVar);
            this.f60410b = nativeResponse;
            this.f60411c = nVar;
        }

        /* access modifiers changed from: private */
        public static final boolean j(n nVar, C6798l lVar) {
            return ((Boolean) lVar.invoke(nVar)).booleanValue();
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f60410b, this.f60411c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f60409a == 0) {
                w.b(obj);
                C6565s.K(this.f60410b.f60403f, new a(this.f60411c));
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeResponse(C4464a aVar, K k10) {
        super(aVar);
        C6496s.h(aVar, "appContext");
        C6496s.h(k10, "coroutineScope");
        this.f60400c = k10;
    }

    /* access modifiers changed from: private */
    public static final boolean B1(List list, C6798l lVar, n nVar) {
        C6496s.h(nVar, "newState");
        if (!list.contains(nVar)) {
            return false;
        }
        lVar.invoke(nVar);
        return true;
    }

    /* access modifiers changed from: private */
    public final n I0() {
        n nVar;
        synchronized (this) {
            nVar = this.f60402e;
        }
        return nVar;
    }

    private final boolean L0(n... nVarArr) {
        if (C6559l.W(nVarArr, I0())) {
            return false;
        }
        String M02 = C6559l.M0(nVarArr, f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new i(), 30, (Object) null);
        String str = f60399j;
        int b10 = I0().b();
        Log.w(str, "Invalid state - currentState[" + b10 + "] validStates[" + M02 + "]");
        return true;
    }

    /* access modifiers changed from: private */
    public static final CharSequence P0(n nVar) {
        C6496s.h(nVar, "it");
        return String.valueOf(nVar.b());
    }

    /* access modifiers changed from: private */
    public final void W0(C5406g gVar) {
        while (!gVar.J0()) {
            try {
                n nVar = n.RESPONSE_RECEIVED;
                n nVar2 = n.BODY_STREAMING_STARTED;
                if (!L0(nVar, nVar2, n.BODY_STREAMING_CANCELLED)) {
                    if (I0() == nVar) {
                        this.f60401d.a(gVar.i().H0());
                    } else if (I0() == nVar2) {
                        b("didReceiveResponseData", gVar.i().H0());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (IOException e10) {
                this.f60405h = e10;
                if (I0() == n.BODY_STREAMING_STARTED) {
                    b("didFailWithError", e10);
                }
                n1(n.ERROR_RECEIVED);
                return;
            }
        }
    }

    private final k j0(E e10) {
        int o10 = e10.o();
        String M10 = e10.M();
        u<Pair> F10 = e10.F();
        ArrayList arrayList = new ArrayList(C6565s.y(F10, 10));
        for (Pair pair : F10) {
            arrayList.add(C6502A.a(pair.c(), pair.d()));
        }
        return new k(arrayList, o10, M10, e10.g0().l().toString(), e10.I());
    }

    /* access modifiers changed from: private */
    public final void n1(n nVar) {
        synchronized (this) {
            this.f60402e = nVar;
            C6514M m10 = C6514M.f71813a;
        }
        C5600w0 unused = C5576k.d(this.f60400c, (g) null, (M) null, new c(this, nVar, (C6658d) null), 3, (Object) null);
    }

    public final void A1(List list, C6798l lVar) {
        C6496s.h(list, "states");
        C6496s.h(lVar, "callback");
        if (list.contains(I0())) {
            lVar.invoke(I0());
        } else {
            this.f60403f.add(new j(list, lVar));
        }
    }

    public final k B0() {
        return this.f60404g;
    }

    public final m E0() {
        return this.f60401d;
    }

    public final void R0() {
        if (!L0(n.INITIALIZED)) {
            n1(n.STARTED);
        }
    }

    public void a() {
        this.f60401d.b();
        super.a();
    }

    public final void h0() {
        if (!L0(n.BODY_STREAMING_STARTED)) {
            n1(n.BODY_STREAMING_CANCELLED);
        }
    }

    public final void o0() {
        Sd.g gVar = new Sd.g();
        this.f60405h = gVar;
        if (I0() == n.BODY_STREAMING_STARTED) {
            b("didFailWithError", gVar);
        }
        n1(n.ERROR_RECEIVED);
    }

    public void onFailure(C6708e eVar, IOException iOException) {
        C6496s.h(eVar, "call");
        C6496s.h(iOException, "e");
        if (iOException.getMessage() != "Canceled") {
            n nVar = n.STARTED;
            n nVar2 = n.RESPONSE_RECEIVED;
            n nVar3 = n.BODY_STREAMING_STARTED;
            if (!L0(nVar, nVar2, nVar3, n.BODY_STREAMING_CANCELLED)) {
                if (I0() == nVar3) {
                    b("didFailWithError", iOException);
                }
                this.f60405h = iOException;
                n1(n.ERROR_RECEIVED);
                b("readyForJSFinalization", new Object[0]);
            }
        }
    }

    public void onResponse(C6708e eVar, E e10) {
        C6496s.h(eVar, "call");
        C6496s.h(e10, "response");
        this.f60404g = j0(e10);
        n1(n.RESPONSE_RECEIVED);
        C5600w0 unused = C5576k.d(this.f60400c, Z.b(), (M) null, new b(e10, this, (C6658d) null), 2, (Object) null);
    }

    public final boolean t0() {
        return this.f60401d.c();
    }

    public final Exception x0() {
        return this.f60405h;
    }

    public final byte[] z1() {
        n nVar = n.RESPONSE_RECEIVED;
        n nVar2 = n.BODY_COMPLETED;
        if (L0(nVar, nVar2)) {
            return null;
        }
        if (I0() == nVar) {
            n1(n.BODY_STREAMING_STARTED);
            b("didReceiveResponseData", this.f60401d.b());
        } else if (I0() == nVar2) {
            return this.f60401d.b();
        }
        return null;
    }
}
