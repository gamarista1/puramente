package u3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import u3.j;
import u3.k;
import u3.o;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final String f26693a;

    /* renamed from: b  reason: collision with root package name */
    private final o f26694b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f26695c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f26696d;

    /* renamed from: e  reason: collision with root package name */
    private int f26697e;

    /* renamed from: f  reason: collision with root package name */
    public o.c f26698f;

    /* renamed from: g  reason: collision with root package name */
    private k f26699g;

    /* renamed from: h  reason: collision with root package name */
    private final j f26700h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f26701i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final ServiceConnection f26702j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f26703k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f26704l;

    public static final class a extends o.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f26705b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, String[] strArr) {
            super(strArr);
            this.f26705b = rVar;
        }

        public boolean b() {
            return true;
        }

        public void c(Set set) {
            C6496s.h(set, "tables");
            if (!this.f26705b.j().get()) {
                try {
                    k h10 = this.f26705b.h();
                    if (h10 != null) {
                        int c10 = this.f26705b.c();
                        Object[] array = set.toArray(new String[0]);
                        C6496s.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        h10.j0(c10, (String[]) array);
                    }
                } catch (RemoteException e10) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e10);
                }
            }
        }
    }

    public static final class b extends j.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f26706a;

        b(r rVar) {
            this.f26706a = rVar;
        }

        /* access modifiers changed from: private */
        public static final void c(r rVar, String[] strArr) {
            C6496s.h(rVar, "this$0");
            C6496s.h(strArr, "$tables");
            rVar.e().j((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public void i(String[] strArr) {
            C6496s.h(strArr, "tables");
            this.f26706a.d().execute(new s(this.f26706a, strArr));
        }
    }

    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f26707a;

        c(r rVar) {
            this.f26707a = rVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C6496s.h(componentName, "name");
            C6496s.h(iBinder, "service");
            this.f26707a.m(k.a.a(iBinder));
            this.f26707a.d().execute(this.f26707a.i());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C6496s.h(componentName, "name");
            this.f26707a.d().execute(this.f26707a.g());
            this.f26707a.m((k) null);
        }
    }

    public r(Context context, String str, Intent intent, o oVar, Executor executor) {
        C6496s.h(context, "context");
        C6496s.h(str, "name");
        C6496s.h(intent, "serviceIntent");
        C6496s.h(oVar, "invalidationTracker");
        C6496s.h(executor, "executor");
        this.f26693a = str;
        this.f26694b = oVar;
        this.f26695c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f26696d = applicationContext;
        c cVar = new c(this);
        this.f26702j = cVar;
        this.f26703k = new p(this);
        this.f26704l = new q(this);
        Object[] array = oVar.h().keySet().toArray(new String[0]);
        C6496s.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a(this, (String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* access modifiers changed from: private */
    public static final void k(r rVar) {
        C6496s.h(rVar, "this$0");
        rVar.f26694b.m(rVar.f());
    }

    /* access modifiers changed from: private */
    public static final void n(r rVar) {
        C6496s.h(rVar, "this$0");
        try {
            k kVar = rVar.f26699g;
            if (kVar != null) {
                rVar.f26697e = kVar.a1(rVar.f26700h, rVar.f26693a);
                rVar.f26694b.b(rVar.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f26697e;
    }

    public final Executor d() {
        return this.f26695c;
    }

    public final o e() {
        return this.f26694b;
    }

    public final o.c f() {
        o.c cVar = this.f26698f;
        if (cVar != null) {
            return cVar;
        }
        C6496s.v("observer");
        return null;
    }

    public final Runnable g() {
        return this.f26704l;
    }

    public final k h() {
        return this.f26699g;
    }

    public final Runnable i() {
        return this.f26703k;
    }

    public final AtomicBoolean j() {
        return this.f26701i;
    }

    public final void l(o.c cVar) {
        C6496s.h(cVar, "<set-?>");
        this.f26698f = cVar;
    }

    public final void m(k kVar) {
        this.f26699g = kVar;
    }
}
