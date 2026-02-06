package o7;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.I;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class E extends C3890f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f47102c = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String str, Bundle bundle) {
            C6496s.h(str, "action");
            if (C6496s.c(str, "oauth")) {
                return W.g(P.k(), "oauth/authorize", bundle);
            }
            String k10 = P.k();
            return W.g(k10, I.w() + "/dialog/" + str, bundle);
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E(String str, Bundle bundle) {
        super(str, bundle);
        C6496s.h(str, "action");
        b(f47102c.a(str, bundle == null ? new Bundle() : bundle));
    }
}
