package S9;

import android.util.SparseArray;
import ja.I;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray f34134a = new SparseArray();

    public I a(int i10) {
        I i11 = (I) this.f34134a.get(i10);
        if (i11 != null) {
            return i11;
        }
        I i12 = new I(9223372036854775806L);
        this.f34134a.put(i10, i12);
        return i12;
    }

    public void b() {
        this.f34134a.clear();
    }
}
