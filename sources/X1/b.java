package x1;

import android.util.LongSparseArray;
import mf.M;

public abstract class b {

    public static final class a extends M {

        /* renamed from: a  reason: collision with root package name */
        private int f28211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongSparseArray f28212b;

        a(LongSparseArray longSparseArray) {
            this.f28212b = longSparseArray;
        }

        public long a() {
            LongSparseArray longSparseArray = this.f28212b;
            int i10 = this.f28211a;
            this.f28211a = i10 + 1;
            return longSparseArray.keyAt(i10);
        }

        public boolean hasNext() {
            if (this.f28211a < this.f28212b.size()) {
                return true;
            }
            return false;
        }
    }

    public static final M a(LongSparseArray longSparseArray) {
        return new a(longSparseArray);
    }
}
