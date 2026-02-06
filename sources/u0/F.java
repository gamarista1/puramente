package u0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26442a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f26443b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return F.f26443b;
        }

        private a() {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f26443b = C6496s.c(lowerCase, "robolectric");
    }
}
