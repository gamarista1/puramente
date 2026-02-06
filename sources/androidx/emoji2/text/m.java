package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class m {

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f16661a;

        a(ByteBuffer byteBuffer) {
            this.f16661a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public void b(int i10) {
            ByteBuffer byteBuffer = this.f16661a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        public int c() {
            return this.f16661a.getInt();
        }

        public long d() {
            return m.c(this.f16661a.getInt());
        }

        public long getPosition() {
            return (long) this.f16661a.position();
        }

        public int readUnsignedShort() {
            return m.d(this.f16661a.getShort());
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f16662a;

        /* renamed from: b  reason: collision with root package name */
        private final long f16663b;

        b(long j10, long j11) {
            this.f16662a = j10;
            this.f16663b = j11;
        }

        /* access modifiers changed from: package-private */
        public long a() {
            return this.f16662a;
        }
    }

    private interface c {
        void b(int i10);

        int c();

        long d();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j10;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.b(6);
            int i10 = 0;
            while (true) {
                if (i10 >= readUnsignedShort) {
                    j10 = -1;
                    break;
                }
                int c10 = cVar.c();
                cVar.b(4);
                j10 = cVar.d();
                cVar.b(4);
                if (1835365473 == c10) {
                    break;
                }
                i10++;
            }
            if (j10 != -1) {
                cVar.b((int) (j10 - cVar.getPosition()));
                cVar.b(12);
                long d10 = cVar.d();
                for (int i11 = 0; ((long) i11) < d10; i11++) {
                    int c11 = cVar.c();
                    long d11 = cVar.d();
                    long d12 = cVar.d();
                    if (1164798569 == c11 || 1701669481 == c11) {
                        return new b(d11 + j10, d12);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    static P1.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return P1.b.h(duplicate);
    }

    static long c(int i10) {
        return ((long) i10) & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
