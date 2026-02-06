package T2;

import i2.C2073A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f5975a;

    /* renamed from: T2.a$a  reason: collision with other inner class name */
    static final class C0142a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f5976b;

        /* renamed from: c  reason: collision with root package name */
        public final List f5977c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List f5978d = new ArrayList();

        public C0142a(int i10, long j10) {
            super(i10);
            this.f5976b = j10;
        }

        public void d(C0142a aVar) {
            this.f5978d.add(aVar);
        }

        public void e(b bVar) {
            this.f5977c.add(bVar);
        }

        public C0142a f(int i10) {
            int size = this.f5978d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0142a aVar = (C0142a) this.f5978d.get(i11);
                if (aVar.f5975a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f5977c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f5977c.get(i11);
                if (bVar.f5975a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return a.a(this.f5975a) + " leaves: " + Arrays.toString(this.f5977c.toArray()) + " containers: " + Arrays.toString(this.f5978d.toArray());
        }
    }

    static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final C2073A f5979b;

        public b(int i10, C2073A a10) {
            super(i10);
            this.f5979b = a10;
        }
    }

    public a(int i10) {
        this.f5975a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f5975a);
    }
}
