package y9;

import ja.B;
import ja.s;
import java.nio.ByteBuffer;
import java.util.UUID;

public abstract class l {

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final UUID f50012a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f50013b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f50014c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f50012a = uuid;
            this.f50013b = i10;
            this.f50014c = bArr;
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
        if (!(bArr == null || bArr.length == 0)) {
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

    private static a d(byte[] bArr) {
        B b10 = new B(bArr);
        if (b10.f() < 32) {
            return null;
        }
        b10.P(0);
        if (b10.n() != b10.a() + 4 || b10.n() != 1886614376) {
            return null;
        }
        int c10 = C4227a.c(b10.n());
        if (c10 > 1) {
            s.i("PsshAtomUtil", "Unsupported pssh version: " + c10);
            return null;
        }
        UUID uuid = new UUID(b10.w(), b10.w());
        if (c10 == 1) {
            b10.Q(b10.H() * 16);
        }
        int H10 = b10.H();
        if (H10 != b10.a()) {
            return null;
        }
        byte[] bArr2 = new byte[H10];
        b10.j(bArr2, 0, H10);
        return new a(uuid, c10, bArr2);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f50012a)) {
            return d10.f50014c;
        }
        s.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d10.f50012a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f50012a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f50013b;
    }
}
