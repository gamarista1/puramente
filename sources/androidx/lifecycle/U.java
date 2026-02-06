package androidx.lifecycle;

import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import x3.C2912d;
import yf.C6787a;

public final class U implements C2912d.c {

    /* renamed from: a  reason: collision with root package name */
    private final C2912d f17169a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17170b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f17171c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f17172d;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f17173a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e0 e0Var) {
            super(0);
            this.f17173a = e0Var;
        }

        /* renamed from: a */
        public final V invoke() {
            return T.e(this.f17173a);
        }
    }

    public U(C2912d dVar, e0 e0Var) {
        C6496s.h(dVar, "savedStateRegistry");
        C6496s.h(e0Var, "viewModelStoreOwner");
        this.f17169a = dVar;
        this.f17172d = C6531o.b(new a(e0Var));
    }

    private final V c() {
        return (V) this.f17172d.getValue();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17171c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().b().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((P) entry.getValue()).e().a();
            if (!C6496s.c(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f17170b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        Bundle bundle;
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        d();
        Bundle bundle2 = this.f17171c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f17171c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f17171c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f17171c = null;
        }
        return bundle;
    }

    public final void d() {
        if (!this.f17170b) {
            Bundle b10 = this.f17169a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f17171c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b10 != null) {
                bundle.putAll(b10);
            }
            this.f17171c = bundle;
            this.f17170b = true;
            c();
        }
    }
}
