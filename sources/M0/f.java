package M0;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.collection.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final C f4295a = new C(0, 1, (DefaultConstructorMarker) null);

    public final void a() {
        synchronized (this) {
            this.f4295a.i();
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final TypedValue b(Resources resources, int i10) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.f4295a.c(i10);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                this.f4295a.p(i10, typedValue);
            }
        }
        return typedValue;
    }
}
