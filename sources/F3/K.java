package f3;

import android.util.SparseArray;
import i2.C2073A;
import i2.G;
import java.util.Collections;
import java.util.List;
import z2.r;

public interface K {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f20471a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20472b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f20473c;

        public a(String str, int i10, byte[] bArr) {
            this.f20471a = str;
            this.f20472b = i10;
            this.f20473c = bArr;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f20474a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20475b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20476c;

        /* renamed from: d  reason: collision with root package name */
        public final List f20477d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f20478e;

        public b(int i10, String str, int i11, List list, byte[] bArr) {
            List list2;
            this.f20474a = i10;
            this.f20475b = str;
            this.f20476c = i11;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f20477d = list2;
            this.f20478e = bArr;
        }

        public int a() {
            int i10 = this.f20476c;
            if (i10 == 2) {
                return 2048;
            }
            if (i10 != 3) {
                return 0;
            }
            return 512;
        }
    }

    public interface c {
        SparseArray a();

        K b(int i10, b bVar);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f20479a;

        /* renamed from: b  reason: collision with root package name */
        private final int f20480b;

        /* renamed from: c  reason: collision with root package name */
        private final int f20481c;

        /* renamed from: d  reason: collision with root package name */
        private int f20482d;

        /* renamed from: e  reason: collision with root package name */
        private String f20483e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f20482d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10;
            int i11 = this.f20482d;
            if (i11 == Integer.MIN_VALUE) {
                i10 = this.f20480b;
            } else {
                i10 = i11 + this.f20481c;
            }
            this.f20482d = i10;
            this.f20483e = this.f20479a + this.f20482d;
        }

        public String b() {
            d();
            return this.f20483e;
        }

        public int c() {
            d();
            return this.f20482d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f20479a = str;
            this.f20480b = i11;
            this.f20481c = i12;
            this.f20482d = Integer.MIN_VALUE;
            this.f20483e = "";
        }
    }

    void a();

    void b(C2073A a10, int i10);

    void c(G g10, r rVar, d dVar);
}
