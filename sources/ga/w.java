package ga;

import N9.T;
import android.os.Bundle;
import com.google.common.collect.C4770v;
import com.google.common.primitives.f;
import ja.C3645a;
import java.util.Collections;
import java.util.List;
import k9.C3700i;

public final class w implements C3700i {

    /* renamed from: c  reason: collision with root package name */
    public static final C3700i.a f43915c = new v();

    /* renamed from: a  reason: collision with root package name */
    public final T f43916a;

    /* renamed from: b  reason: collision with root package name */
    public final C4770v f43917b;

    public w(T t10, List list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < t10.f33189a)) {
            this.f43916a = t10;
            this.f43917b = C4770v.z(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ w d(Bundle bundle) {
        return new w((T) T.f33188f.a((Bundle) C3645a.e(bundle.getBundle(c(0)))), f.c((int[]) C3645a.e(bundle.getIntArray(c(1)))));
    }

    public int b() {
        return this.f43916a.f33191c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f43916a.equals(wVar.f43916a) || !this.f43917b.equals(wVar.f43917b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f43916a.hashCode() + (this.f43917b.hashCode() * 31);
    }
}
