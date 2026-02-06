package j3;

import Rg.k;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import mf.C6558k;
import mf.C6565s;
import yf.C6798l;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f22944a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f22945b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f22946c;

    /* renamed from: d  reason: collision with root package name */
    private u f22947d;

    /* renamed from: e  reason: collision with root package name */
    private final List f22948e;

    /* renamed from: f  reason: collision with root package name */
    private Bundle f22949f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f22950a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f22951b;

        public a(int i10, Bundle bundle) {
            this.f22950a = i10;
            this.f22951b = bundle;
        }

        public final Bundle a() {
            return this.f22951b;
        }

        public final int b() {
            return this.f22950a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f22952a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Context invoke(Context context) {
            ContextWrapper contextWrapper;
            C6496s.h(context, "it");
            if (context instanceof ContextWrapper) {
                contextWrapper = (ContextWrapper) context;
            } else {
                contextWrapper = null;
            }
            if (contextWrapper != null) {
                return contextWrapper.getBaseContext();
            }
            return null;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22953a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Activity invoke(Context context) {
            C6496s.h(context, "it");
            if (context instanceof Activity) {
                return (Activity) context;
            }
            return null;
        }
    }

    public q(Context context) {
        Intent intent;
        C6496s.h(context, "context");
        this.f22944a = context;
        Activity activity = (Activity) k.r(k.y(k.h(context, b.f22952a), c.f22953a));
        this.f22945b = activity;
        if (activity != null) {
            intent = new Intent(context, activity.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f22946c = intent;
        this.f22948e = new ArrayList();
    }

    private final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        s sVar = null;
        for (a aVar : this.f22948e) {
            int b10 = aVar.b();
            Bundle a10 = aVar.a();
            s d10 = d(b10);
            if (d10 != null) {
                for (int valueOf : d10.n(sVar)) {
                    arrayList.add(Integer.valueOf(valueOf));
                    arrayList2.add(a10);
                }
                sVar = d10;
            } else {
                throw new IllegalArgumentException("Navigation destination " + s.f22957k.b(this.f22944a, b10) + " cannot be found in the navigation graph " + this.f22947d);
            }
        }
        this.f22946c.putExtra("android-support-nav:controller:deepLinkIds", C6565s.d1(arrayList));
        this.f22946c.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    private final s d(int i10) {
        C6558k kVar = new C6558k();
        u uVar = this.f22947d;
        C6496s.e(uVar);
        kVar.add(uVar);
        while (!kVar.isEmpty()) {
            s sVar = (s) kVar.removeFirst();
            if (sVar.x() == i10) {
                return sVar;
            }
            if (sVar instanceof u) {
                Iterator it = ((u) sVar).iterator();
                while (it.hasNext()) {
                    kVar.add((s) it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ q g(q qVar, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return qVar.f(i10, bundle);
    }

    private final void h() {
        for (a b10 : this.f22948e) {
            int b11 = b10.b();
            if (d(b11) == null) {
                String b12 = s.f22957k.b(this.f22944a, b11);
                throw new IllegalArgumentException("Navigation destination " + b12 + " cannot be found in the navigation graph " + this.f22947d);
            }
        }
    }

    public final q a(int i10, Bundle bundle) {
        this.f22948e.add(new a(i10, bundle));
        if (this.f22947d != null) {
            h();
        }
        return this;
    }

    public final y b() {
        if (this.f22947d == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        } else if (!this.f22948e.isEmpty()) {
            c();
            y b10 = y.h(this.f22944a).b(new Intent(this.f22946c));
            C6496s.g(b10, "create(context).addNextI…rentStack(Intent(intent))");
            int m10 = b10.m();
            for (int i10 = 0; i10 < m10; i10++) {
                Intent k10 = b10.k(i10);
                if (k10 != null) {
                    k10.putExtra("android-support-nav:controller:deepLinkIntent", this.f22946c);
                }
            }
            return b10;
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
    }

    public final q e(Bundle bundle) {
        this.f22949f = bundle;
        this.f22946c.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public final q f(int i10, Bundle bundle) {
        this.f22948e.clear();
        this.f22948e.add(new a(i10, bundle));
        if (this.f22947d != null) {
            h();
        }
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        this(nVar.D());
        C6496s.h(nVar, "navController");
        this.f22947d = nVar.H();
    }
}
