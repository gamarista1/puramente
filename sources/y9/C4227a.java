package y9;

import ja.B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: y9.a  reason: case insensitive filesystem */
abstract class C4227a {

    /* renamed from: a  reason: collision with root package name */
    public final int f49884a;

    /* renamed from: y9.a$a  reason: collision with other inner class name */
    static final class C0755a extends C4227a {

        /* renamed from: b  reason: collision with root package name */
        public final long f49885b;

        /* renamed from: c  reason: collision with root package name */
        public final List f49886c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List f49887d = new ArrayList();

        public C0755a(int i10, long j10) {
            super(i10);
            this.f49885b = j10;
        }

        public void d(C0755a aVar) {
            this.f49887d.add(aVar);
        }

        public void e(b bVar) {
            this.f49886c.add(bVar);
        }

        public C0755a f(int i10) {
            int size = this.f49887d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0755a aVar = (C0755a) this.f49887d.get(i11);
                if (aVar.f49884a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f49886c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f49886c.get(i11);
                if (bVar.f49884a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return C4227a.a(this.f49884a) + " leaves: " + Arrays.toString(this.f49886c.toArray()) + " containers: " + Arrays.toString(this.f49887d.toArray());
        }
    }

    /* renamed from: y9.a$b */
    static final class b extends C4227a {

        /* renamed from: b  reason: collision with root package name */
        public final B f49888b;

        public b(int i10, B b10) {
            super(i10);
            this.f49888b = b10;
        }
    }

    public C4227a(int i10) {
        this.f49884a = i10;
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
        return a(this.f49884a);
    }
}
