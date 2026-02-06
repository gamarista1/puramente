package Hc;

import Jc.f;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import android.app.Application;
import android.content.Context;
import android.support.v4.media.session.c;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import ub.C5230g;
import yf.p;

/* renamed from: Hc.k  reason: case insensitive filesystem */
public final class C4308k {

    /* renamed from: c  reason: collision with root package name */
    public static final b f51022c = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5230g f51023a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final f f51024b;

    /* renamed from: Hc.k$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f51025a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4308k f51026b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f51027c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ G f51028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4308k kVar, g gVar, G g10, C6658d dVar) {
            super(2, dVar);
            this.f51026b = kVar;
            this.f51027c = gVar;
            this.f51028d = g10;
        }

        /* access modifiers changed from: private */
        public static final void j(String str, ub.p pVar) {
            Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            I.f50952a.a((E) null);
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f51026b, this.f51027c, this.f51028d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f51025a;
            if (i10 == 0) {
                w.b(obj);
                Ic.a aVar = Ic.a.f51165a;
                this.f51025a = 1;
                obj = aVar.b(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else if (i10 == 2) {
                w.b(obj);
                if (!this.f51026b.f51024b.d()) {
                    Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                } else {
                    E e10 = new E(this.f51027c);
                    e10.g(this.f51028d);
                    I.f50952a.a(e10);
                    this.f51026b.f51023a.h(new C4307j());
                }
                return C6514M.f71813a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterable values = ((Map) obj).values();
            if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                Iterator it = values.iterator();
                if (it.hasNext()) {
                    c.a(it.next());
                    throw null;
                }
            }
            Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
            return C6514M.f71813a;
        }
    }

    /* renamed from: Hc.k$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C4308k(C5230g gVar, f fVar, g gVar2, G g10) {
        C6496s.h(gVar, "firebaseApp");
        C6496s.h(fVar, "settings");
        C6496s.h(gVar2, "backgroundDispatcher");
        C6496s.h(g10, "lifecycleServiceBinder");
        this.f51023a = gVar;
        this.f51024b = fVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = gVar.m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(I.f50952a);
            C5600w0 unused = C5576k.d(L.a(gVar2), (g) null, (M) null, new a(this, gVar2, g10, (C6658d) null), 3, (Object) null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
