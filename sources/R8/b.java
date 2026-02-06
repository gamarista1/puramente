package R8;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import lf.C6534r;
import q0.C2427m;
import q0.C2428n;
import yf.C6787a;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Lazy f33741a = C6531o.a(C6534r.NONE, a.f33742a);

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33742a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    public static final long c(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return C2427m.f25341b.a();
        }
        return C2428n.a((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
    }

    /* access modifiers changed from: private */
    public static final Handler d() {
        return (Handler) f33741a.getValue();
    }
}
