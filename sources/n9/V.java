package N9;

import android.os.Bundle;
import com.google.common.collect.C4770v;
import ja.C3647c;
import ja.s;
import java.util.ArrayList;
import k9.C3700i;

public final class V implements C3700i {

    /* renamed from: d  reason: collision with root package name */
    public static final V f33194d = new V(new T[0]);

    /* renamed from: e  reason: collision with root package name */
    public static final C3700i.a f33195e = new U();

    /* renamed from: a  reason: collision with root package name */
    public final int f33196a;

    /* renamed from: b  reason: collision with root package name */
    private final C4770v f33197b;

    /* renamed from: c  reason: collision with root package name */
    private int f33198c;

    public V(T... tArr) {
        this.f33197b = C4770v.A(tArr);
        this.f33196a = tArr.length;
        f();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ V e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        if (parcelableArrayList == null) {
            return new V(new T[0]);
        }
        return new V((T[]) C3647c.b(T.f33188f, parcelableArrayList).toArray(new T[0]));
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f33197b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f33197b.size(); i12++) {
                if (((T) this.f33197b.get(i10)).equals(this.f33197b.get(i12))) {
                    s.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public T b(int i10) {
        return (T) this.f33197b.get(i10);
    }

    public int c(T t10) {
        int indexOf = this.f33197b.indexOf(t10);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V.class != obj.getClass()) {
            return false;
        }
        V v10 = (V) obj;
        if (this.f33196a != v10.f33196a || !this.f33197b.equals(v10.f33197b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f33198c == 0) {
            this.f33198c = this.f33197b.hashCode();
        }
        return this.f33198c;
    }
}
