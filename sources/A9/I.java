package A9;

import android.util.SparseArray;
import ja.B;
import java.util.Collections;
import java.util.List;
import q9.m;

public interface I {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f29498a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29499b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f29500c;

        public a(String str, int i10, byte[] bArr) {
            this.f29498a = str;
            this.f29499b = i10;
            this.f29500c = bArr;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29501a;

        /* renamed from: b  reason: collision with root package name */
        public final String f29502b;

        /* renamed from: c  reason: collision with root package name */
        public final List f29503c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f29504d;

        public b(int i10, String str, List list, byte[] bArr) {
            List list2;
            this.f29501a = i10;
            this.f29502b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f29503c = list2;
            this.f29504d = bArr;
        }
    }

    public interface c {
        SparseArray a();

        I b(int i10, b bVar);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f29505a;

        /* renamed from: b  reason: collision with root package name */
        private final int f29506b;

        /* renamed from: c  reason: collision with root package name */
        private final int f29507c;

        /* renamed from: d  reason: collision with root package name */
        private int f29508d;

        /* renamed from: e  reason: collision with root package name */
        private String f29509e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f29508d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10;
            int i11 = this.f29508d;
            if (i11 == Integer.MIN_VALUE) {
                i10 = this.f29506b;
            } else {
                i10 = i11 + this.f29507c;
            }
            this.f29508d = i10;
            this.f29509e = this.f29505a + this.f29508d;
        }

        public String b() {
            d();
            return this.f29509e;
        }

        public int c() {
            d();
            return this.f29508d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f29505a = str;
            this.f29506b = i11;
            this.f29507c = i12;
            this.f29508d = Integer.MIN_VALUE;
            this.f29509e = "";
        }
    }

    void a();

    void b(ja.I i10, m mVar, d dVar);

    void c(B b10, int i10);
}
