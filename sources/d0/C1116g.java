package D0;

import android.view.MotionEvent;
import androidx.collection.C1607v;
import java.util.List;

/* renamed from: D0.g  reason: case insensitive filesystem */
public final class C1116g {

    /* renamed from: a  reason: collision with root package name */
    private final C1607v f1462a;

    /* renamed from: b  reason: collision with root package name */
    private final C f1463b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1464c;

    public C1116g(C1607v vVar, C c10) {
        this.f1462a = vVar;
        this.f1463b = c10;
    }

    public final boolean a(long j10) {
        Object obj;
        List b10 = this.f1463b.b();
        int size = b10.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = b10.get(i10);
            if (z.d(((D) obj).d(), j10)) {
                break;
            }
            i10++;
        }
        D d10 = (D) obj;
        if (d10 != null) {
            return d10.a();
        }
        return false;
    }

    public final C1607v b() {
        return this.f1462a;
    }

    public final MotionEvent c() {
        return this.f1463b.a();
    }

    public final boolean d() {
        return this.f1464c;
    }

    public final void e(boolean z10) {
        this.f1464c = z10;
    }
}
