package z5;

import Cf.c;
import Sg.p;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.C4021N;

/* renamed from: z5.a  reason: case insensitive filesystem */
public final class C4232a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0757a f50076b = new C0757a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f50077c;

    /* renamed from: a  reason: collision with root package name */
    private final C4021N f50078a;

    /* renamed from: z5.a$a  reason: collision with other inner class name */
    public static final class C0757a {
        public /* synthetic */ C0757a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0757a() {
        }
    }

    static {
        boolean z10;
        if (c.f62630a.c() <= 1.0E-4d) {
            z10 = true;
        } else {
            z10 = false;
        }
        f50077c = z10;
    }

    public C4232a(Context context) {
        C6496s.h(context, "context");
        this.f50078a = new C4021N(context);
    }

    private final boolean a(String str) {
        if (str != null) {
            return p.O(str, "gps", false, 2, (Object) null);
        }
        return false;
    }

    public final void b(String str, Bundle bundle) {
        if (f50077c && a(str)) {
            this.f50078a.g(str, bundle);
        }
    }
}
