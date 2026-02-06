package o9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l9.s0;
import n9.C3866b;

/* renamed from: o9.B  reason: case insensitive filesystem */
public interface C3912B {

    /* renamed from: o9.B$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f47410a;

        /* renamed from: b  reason: collision with root package name */
        private final String f47411b;

        /* renamed from: c  reason: collision with root package name */
        private final int f47412c;

        public a(byte[] bArr, String str, int i10) {
            this.f47410a = bArr;
            this.f47411b = str;
            this.f47412c = i10;
        }

        public byte[] a() {
            return this.f47410a;
        }

        public String b() {
            return this.f47411b;
        }
    }

    /* renamed from: o9.B$b */
    public interface b {
        void a(C3912B b10, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* renamed from: o9.B$c */
    public interface c {
        C3912B a(UUID uuid);
    }

    /* renamed from: o9.B$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f47413a;

        /* renamed from: b  reason: collision with root package name */
        private final String f47414b;

        public d(byte[] bArr, String str) {
            this.f47413a = bArr;
            this.f47414b = str;
        }

        public byte[] a() {
            return this.f47413a;
        }

        public String b() {
            return this.f47414b;
        }
    }

    Map a(byte[] bArr);

    d b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr);

    int f();

    C3866b g(byte[] bArr);

    boolean h(byte[] bArr, String str);

    void i(byte[] bArr);

    byte[] j(byte[] bArr, byte[] bArr2);

    a k(byte[] bArr, List list, int i10, HashMap hashMap);

    void m(b bVar);

    void release();

    void l(byte[] bArr, s0 s0Var) {
    }
}
