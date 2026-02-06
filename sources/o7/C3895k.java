package o7;

import android.app.Activity;
import android.util.Log;
import com.facebook.C3324n;
import com.facebook.C3459v;
import com.facebook.I;
import com.facebook.r;
import g.C2002e;
import g.C2003f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o7.k  reason: case insensitive filesystem */
public abstract class C3895k {

    /* renamed from: f  reason: collision with root package name */
    public static final a f47262f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final Object f47263g = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Activity f47264a;

    /* renamed from: b  reason: collision with root package name */
    private final B f47265b;

    /* renamed from: c  reason: collision with root package name */
    private List f47266c;

    /* renamed from: d  reason: collision with root package name */
    private int f47267d;

    /* renamed from: e  reason: collision with root package name */
    private C3324n f47268e;

    /* renamed from: o7.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: o7.k$b */
    protected abstract class b {

        /* renamed from: a  reason: collision with root package name */
        private Object f47269a = C3895k.f47263g;

        public b() {
        }

        public abstract boolean a(Object obj, boolean z10);

        public abstract C3885a b(Object obj);

        public Object c() {
            return this.f47269a;
        }
    }

    protected C3895k(Activity activity, int i10) {
        C6496s.h(activity, "activity");
        this.f47264a = activity;
        this.f47265b = null;
        this.f47267d = i10;
        this.f47268e = null;
    }

    private final List a() {
        if (this.f47266c == null) {
            this.f47266c = g();
        }
        List list = this.f47266c;
        C6496s.f(list, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
        return list;
    }

    private final C3885a d(Object obj, Object obj2) {
        boolean z10;
        C3885a aVar;
        if (obj2 == f47263g) {
            z10 = true;
        } else {
            z10 = false;
        }
        Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            b bVar = (b) it.next();
            if ((z10 || W.e(bVar.c(), obj2)) && bVar.a(obj, true)) {
                try {
                    aVar = bVar.b(obj);
                    break;
                } catch (C3459v e10) {
                    C3885a e11 = e();
                    C3894j.l(e11, e10);
                    aVar = e11;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        C3885a e12 = e();
        C3894j.h(e12);
        return e12;
    }

    private final void i(C3324n nVar) {
        C3324n nVar2 = this.f47268e;
        if (nVar2 == null) {
            this.f47268e = nVar;
        } else if (nVar2 != nVar) {
            Log.w("FacebookDialog", "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public boolean b(Object obj) {
        return c(obj, f47263g);
    }

    /* access modifiers changed from: protected */
    public boolean c(Object obj, Object obj2) {
        boolean z10;
        C6496s.h(obj2, "mode");
        if (obj2 == f47263g) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (b bVar : a()) {
            if ((z10 || W.e(bVar.c(), obj2)) && bVar.a(obj, false)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract C3885a e();

    /* access modifiers changed from: protected */
    public final Activity f() {
        Activity activity = this.f47264a;
        if (activity != null) {
            return activity;
        }
        B b10 = this.f47265b;
        if (b10 != null) {
            return b10.a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract List g();

    public final int h() {
        return this.f47267d;
    }

    public void j(C3324n nVar, r rVar) {
        C6496s.h(nVar, "callbackManager");
        C6496s.h(rVar, "callback");
        if (nVar instanceof C3889e) {
            i(nVar);
            k((C3889e) nVar, rVar);
            return;
        }
        throw new C3459v("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: protected */
    public abstract void k(C3889e eVar, r rVar);

    public final void l(C3324n nVar) {
        this.f47268e = nVar;
    }

    public void m(Object obj) {
        n(obj, f47263g);
    }

    /* access modifiers changed from: protected */
    public void n(Object obj, Object obj2) {
        C6496s.h(obj2, "mode");
        C3885a d10 = d(obj, obj2);
        if (d10 == null) {
            Log.e("FacebookDialog", "No code path should ever result in a null appCall");
            if (I.D()) {
                throw new IllegalStateException("No code path should ever result in a null appCall");
            }
        } else if (f() instanceof C2003f) {
            Activity f10 = f();
            C6496s.f(f10, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            C2002e activityResultRegistry = ((C2003f) f10).getActivityResultRegistry();
            C6496s.g(activityResultRegistry, "registryOwner.activityResultRegistry");
            C3894j.f(d10, activityResultRegistry, this.f47268e);
            d10.f();
        } else {
            B b10 = this.f47265b;
            if (b10 != null) {
                C3894j.g(d10, b10);
                return;
            }
            Activity activity = this.f47264a;
            if (activity != null) {
                C3894j.e(d10, activity);
            }
        }
    }

    protected C3895k(B b10, int i10) {
        C6496s.h(b10, "fragmentWrapper");
        this.f47265b = b10;
        this.f47264a = null;
        this.f47267d = i10;
        if (b10.a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
