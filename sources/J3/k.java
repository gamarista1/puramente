package j3;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1778a;
import androidx.lifecycle.C1788k;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.C1800x;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import x3.C2912d;
import x3.C2913e;
import x3.C2914f;
import yf.C6787a;

public final class k implements C1798v, e0, C1788k, C2914f {

    /* renamed from: o  reason: collision with root package name */
    public static final a f22809o = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f22810a;

    /* renamed from: b  reason: collision with root package name */
    private s f22811b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f22812c;

    /* renamed from: d  reason: collision with root package name */
    private C1790m.b f22813d;

    /* renamed from: e  reason: collision with root package name */
    private final C2127D f22814e;

    /* renamed from: f  reason: collision with root package name */
    private final String f22815f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f22816g;

    /* renamed from: h  reason: collision with root package name */
    private C1800x f22817h;

    /* renamed from: i  reason: collision with root package name */
    private final C2913e f22818i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f22819j;

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f22820k;

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f22821l;

    /* renamed from: m  reason: collision with root package name */
    private C1790m.b f22822m;

    /* renamed from: n  reason: collision with root package name */
    private final c0.c f22823n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ k b(a aVar, Context context, s sVar, Bundle bundle, C1790m.b bVar, C2127D d10, String str, Bundle bundle2, int i10, Object obj) {
            Bundle bundle3;
            C1790m.b bVar2;
            C2127D d11;
            String str2;
            Bundle bundle4;
            if ((i10 & 4) != 0) {
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
            if ((i10 & 8) != 0) {
                bVar2 = C1790m.b.CREATED;
            } else {
                bVar2 = bVar;
            }
            if ((i10 & 16) != 0) {
                d11 = null;
            } else {
                d11 = d10;
            }
            if ((i10 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                C6496s.g(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            if ((i10 & 64) != 0) {
                bundle4 = null;
            } else {
                bundle4 = bundle2;
            }
            return aVar.a(context, sVar, bundle3, bVar2, d11, str2, bundle4);
        }

        public final k a(Context context, s sVar, Bundle bundle, C1790m.b bVar, C2127D d10, String str, Bundle bundle2) {
            C6496s.h(sVar, "destination");
            C6496s.h(bVar, "hostLifecycleState");
            String str2 = str;
            C6496s.h(str2, "id");
            return new k(context, sVar, bundle, bVar, d10, str2, bundle2, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    private static final class b extends C1778a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C2914f fVar) {
            super(fVar, (Bundle) null);
            C6496s.h(fVar, "owner");
        }

        /* access modifiers changed from: protected */
        public a0 c(String str, Class cls, P p10) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(cls, "modelClass");
            C6496s.h(p10, "handle");
            return new c(p10);
        }
    }

    private static final class c extends a0 {

        /* renamed from: a  reason: collision with root package name */
        private final P f22824a;

        public c(P p10) {
            C6496s.h(p10, "handle");
            this.f22824a = p10;
        }

        public final P b() {
            return this.f22824a;
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f22825a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar) {
            super(0);
            this.f22825a = kVar;
        }

        /* renamed from: a */
        public final W invoke() {
            Context context;
            Context a10 = this.f22825a.f22810a;
            Application application = null;
            if (a10 != null) {
                context = a10.getApplicationContext();
            } else {
                context = null;
            }
            if (context instanceof Application) {
                application = (Application) context;
            }
            k kVar = this.f22825a;
            return new W(application, kVar, kVar.c());
        }
    }

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f22826a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k kVar) {
            super(0);
            this.f22826a = kVar;
        }

        /* renamed from: a */
        public final P invoke() {
            if (!this.f22826a.f22819j) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            } else if (this.f22826a.getLifecycle().b() != C1790m.b.DESTROYED) {
                return ((c) new c0((e0) this.f22826a, (c0.c) new b(this.f22826a)).b(c.class)).b();
            } else {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            }
        }
    }

    public /* synthetic */ k(Context context, s sVar, Bundle bundle, C1790m.b bVar, C2127D d10, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, sVar, bundle, bVar, d10, str, bundle2);
    }

    private final W d() {
        return (W) this.f22820k.getValue();
    }

    public final Bundle c() {
        if (this.f22812c == null) {
            return null;
        }
        return new Bundle(this.f22812c);
    }

    public final s e() {
        return this.f22811b;
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!C6496s.c(this.f22815f, kVar.f22815f) || !C6496s.c(this.f22811b, kVar.f22811b) || !C6496s.c(getLifecycle(), kVar.getLifecycle()) || !C6496s.c(getSavedStateRegistry(), kVar.getSavedStateRegistry())) {
            return false;
        }
        if (!C6496s.c(this.f22812c, kVar.f22812c)) {
            Bundle bundle = this.f22812c;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Iterable<String> iterable = keySet;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    Object obj3 = this.f22812c.get(str);
                    Bundle bundle2 = kVar.f22812c;
                    if (bundle2 != null) {
                        obj2 = bundle2.get(str);
                    } else {
                        obj2 = null;
                    }
                    if (!C6496s.c(obj3, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final String f() {
        return this.f22815f;
    }

    public final C1790m.b g() {
        return this.f22822m;
    }

    public Z1.a getDefaultViewModelCreationExtras() {
        Context context;
        Application application = null;
        Z1.b bVar = new Z1.b((Z1.a) null, 1, (DefaultConstructorMarker) null);
        Context context2 = this.f22810a;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = (Application) context;
        }
        if (application != null) {
            bVar.c(c0.a.f17204h, application);
        }
        bVar.c(T.f17166a, this);
        bVar.c(T.f17167b, this);
        Bundle c10 = c();
        if (c10 != null) {
            bVar.c(T.f17168c, c10);
        }
        return bVar;
    }

    public c0.c getDefaultViewModelProviderFactory() {
        return this.f22823n;
    }

    public C1790m getLifecycle() {
        return this.f22817h;
    }

    public C2912d getSavedStateRegistry() {
        return this.f22818i.b();
    }

    public d0 getViewModelStore() {
        if (!this.f22819j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        } else if (getLifecycle().b() != C1790m.b.DESTROYED) {
            C2127D d10 = this.f22814e;
            if (d10 != null) {
                return d10.a(this.f22815f);
            }
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        } else {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
    }

    public final void h(C1790m.a aVar) {
        C6496s.h(aVar, "event");
        this.f22813d = aVar.c();
        l();
    }

    public int hashCode() {
        Set<String> keySet;
        int i10;
        int hashCode = (this.f22815f.hashCode() * 31) + this.f22811b.hashCode();
        Bundle bundle = this.f22812c;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i11 = hashCode * 31;
                Object obj = this.f22812c.get(str);
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                hashCode = i11 + i10;
            }
        }
        return (((hashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final void i(Bundle bundle) {
        C6496s.h(bundle, "outBundle");
        this.f22818i.e(bundle);
    }

    public final void j(s sVar) {
        C6496s.h(sVar, "<set-?>");
        this.f22811b = sVar;
    }

    public final void k(C1790m.b bVar) {
        C6496s.h(bVar, "maxState");
        this.f22822m = bVar;
        l();
    }

    public final void l() {
        if (!this.f22819j) {
            this.f22818i.c();
            this.f22819j = true;
            if (this.f22814e != null) {
                T.c(this);
            }
            this.f22818i.d(this.f22816g);
        }
        if (this.f22813d.ordinal() < this.f22822m.ordinal()) {
            this.f22817h.n(this.f22813d);
        } else {
            this.f22817h.n(this.f22822m);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append('(' + this.f22815f + ')');
        sb2.append(" destination=");
        sb2.append(this.f22811b);
        String sb3 = sb2.toString();
        C6496s.g(sb3, "sb.toString()");
        return sb3;
    }

    private k(Context context, s sVar, Bundle bundle, C1790m.b bVar, C2127D d10, String str, Bundle bundle2) {
        this.f22810a = context;
        this.f22811b = sVar;
        this.f22812c = bundle;
        this.f22813d = bVar;
        this.f22814e = d10;
        this.f22815f = str;
        this.f22816g = bundle2;
        this.f22817h = new C1800x(this);
        this.f22818i = C2913e.f28425d.a(this);
        this.f22820k = C6531o.b(new d(this));
        this.f22821l = C6531o.b(new e(this));
        this.f22822m = C1790m.b.INITIALIZED;
        this.f22823n = d();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(k kVar, Bundle bundle) {
        this(kVar.f22810a, kVar.f22811b, bundle, kVar.f22813d, kVar.f22814e, kVar.f22815f, kVar.f22816g);
        C6496s.h(kVar, "entry");
        this.f22813d = kVar.f22813d;
        k(kVar.f22822m);
    }
}
