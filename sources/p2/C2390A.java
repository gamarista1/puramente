package p2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l2.C2170b;
import n2.u1;

/* renamed from: p2.A  reason: case insensitive filesystem */
public interface C2390A {

    /* renamed from: p2.A$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f25176a;

        /* renamed from: b  reason: collision with root package name */
        private final String f25177b;

        /* renamed from: c  reason: collision with root package name */
        private final int f25178c;

        public a(byte[] bArr, String str, int i10) {
            this.f25176a = bArr;
            this.f25177b = str;
            this.f25178c = i10;
        }

        public byte[] a() {
            return this.f25176a;
        }

        public String b() {
            return this.f25177b;
        }
    }

    /* renamed from: p2.A$b */
    public interface b {
        void a(C2390A a10, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* renamed from: p2.A$c */
    public interface c {
        C2390A a(UUID uuid);
    }

    /* renamed from: p2.A$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f25179a;

        /* renamed from: b  reason: collision with root package name */
        private final String f25180b;

        public d(byte[] bArr, String str) {
            this.f25179a = bArr;
            this.f25180b = str;
        }

        public byte[] a() {
            return this.f25179a;
        }

        public String b() {
            return this.f25180b;
        }
    }

    Map a(byte[] bArr);

    d b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr);

    int f();

    C2170b g(byte[] bArr);

    boolean h(byte[] bArr, String str);

    void i(byte[] bArr);

    byte[] j(byte[] bArr, byte[] bArr2);

    a k(byte[] bArr, List list, int i10, HashMap hashMap);

    void m(b bVar);

    void release();

    void l(byte[] bArr, u1 u1Var) {
    }
}
