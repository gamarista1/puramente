package f2;

import com.google.common.collect.C4770v;
import i2.L;
import java.util.Collections;
import java.util.List;

public final class J {

    /* renamed from: c  reason: collision with root package name */
    private static final String f19790c = L.y0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f19791d = L.y0(1);

    /* renamed from: a  reason: collision with root package name */
    public final I f19792a;

    /* renamed from: b  reason: collision with root package name */
    public final C4770v f19793b;

    public J(I i10, List list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < i10.f19785a)) {
            this.f19792a = i10;
            this.f19793b = C4770v.z(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        return this.f19792a.f19787c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j10 = (J) obj;
        if (!this.f19792a.equals(j10.f19792a) || !this.f19793b.equals(j10.f19793b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f19792a.hashCode() + (this.f19793b.hashCode() * 31);
    }
}
