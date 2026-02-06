package o7;

import Sg.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import d2.C1926a;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.C4021N;
import t7.C4049a;

/* renamed from: o7.c  reason: case insensitive filesystem */
public final class C3887c extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final a f47222b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static C3887c f47223c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f47224d = "com.parse.bolts.measurement_event";

    /* renamed from: a  reason: collision with root package name */
    private final Context f47225a;

    /* renamed from: o7.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3887c a(Context context) {
            C6496s.h(context, "context");
            if (C3887c.a() != null) {
                return C3887c.a();
            }
            C3887c cVar = new C3887c(context, (DefaultConstructorMarker) null);
            C3887c.b(cVar);
            C3887c.c(cVar);
            return C3887c.a();
        }

        private a() {
        }
    }

    public /* synthetic */ C3887c(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final /* synthetic */ C3887c a() {
        Class<C3887c> cls = C3887c.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f47223c;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void b(C3887c cVar) {
        Class<C3887c> cls = C3887c.class;
        if (!C4049a.d(cls)) {
            try {
                cVar.e();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void c(C3887c cVar) {
        Class<C3887c> cls = C3887c.class;
        if (!C4049a.d(cls)) {
            try {
                f47223c = cVar;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void d() {
        if (!C4049a.d(this)) {
            try {
                C1926a b10 = C1926a.b(this.f47225a);
                C6496s.g(b10, "getInstance(applicationContext)");
                b10.e(this);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void e() {
        if (!C4049a.d(this)) {
            try {
                C1926a b10 = C1926a.b(this.f47225a);
                C6496s.g(b10, "getInstance(applicationContext)");
                b10.c(this, new IntentFilter(f47224d));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void finalize() {
        if (!C4049a.d(this)) {
            try {
                d();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        Bundle bundle;
        if (!C4049a.d(this)) {
            try {
                C4021N n10 = new C4021N(context);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("bf_");
                Set<String> set = null;
                if (intent != null) {
                    str = intent.getStringExtra("event_name");
                } else {
                    str = null;
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                if (intent != null) {
                    bundle = intent.getBundleExtra("event_args");
                } else {
                    bundle = null;
                }
                Bundle bundle2 = new Bundle();
                if (bundle != null) {
                    set = bundle.keySet();
                }
                if (set != null) {
                    for (String next : set) {
                        C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                        bundle2.putString(new m("[ -]*$").e(new m("^[ -]*").e(new m("[^0-9a-zA-Z _-]").e(next, "-"), ""), ""), (String) bundle.get(next));
                    }
                }
                n10.d(sb3, bundle2);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private C3887c(Context context) {
        Context applicationContext = context.getApplicationContext();
        C6496s.g(applicationContext, "context.applicationContext");
        this.f47225a = applicationContext;
    }
}
