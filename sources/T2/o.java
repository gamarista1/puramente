package T2;

import i2.C2073A;
import i2.p;
import java.nio.ByteBuffer;
import java.util.UUID;

public abstract class o {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f6114a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6115b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f6116c;

        /* renamed from: d  reason: collision with root package name */
        public final UUID[] f6117d;

        a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f6114a = uuid;
            this.f6115b = i10;
            this.f6116c = bArr;
            this.f6117d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, (UUID[]) null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i10;
        int i11;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        int i12 = i10 + 32;
        if (uuidArr != null) {
            i12 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i12);
        allocate.putInt(i12);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i11 = 16777216;
        } else {
            i11 = 0;
        }
        allocate.putInt(i11);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        if (d(bArr) != null) {
            return true;
        }
        return false;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        C2073A a10 = new C2073A(bArr);
        if (a10.g() < 32) {
            return null;
        }
        a10.U(0);
        int a11 = a10.a();
        int q10 = a10.q();
        if (q10 != a11) {
            p.h("PsshAtomUtil", "Advertised atom size (" + q10 + ") does not match buffer size: " + a11);
            return null;
        }
        int q11 = a10.q();
        if (q11 != 1886614376) {
            p.h("PsshAtomUtil", "Atom type is not pssh: " + q11);
            return null;
        }
        int c10 = a.c(a10.q());
        if (c10 > 1) {
            p.h("PsshAtomUtil", "Unsupported pssh version: " + c10);
            return null;
        }
        UUID uuid = new UUID(a10.A(), a10.A());
        if (c10 == 1) {
            int L10 = a10.L();
            uuidArr = new UUID[L10];
            for (int i10 = 0; i10 < L10; i10++) {
                uuidArr[i10] = new UUID(a10.A(), a10.A());
            }
        } else {
            uuidArr = null;
        }
        int L11 = a10.L();
        int a12 = a10.a();
        if (L11 != a12) {
            p.h("PsshAtomUtil", "Atom data size (" + L11 + ") does not match the bytes left: " + a12);
            return null;
        }
        byte[] bArr2 = new byte[L11];
        a10.l(bArr2, 0, L11);
        return new a(uuid, c10, bArr2, uuidArr);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f6114a)) {
            return d10.f6116c;
        }
        p.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d10.f6114a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f6114a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f6115b;
    }
}
