package pg;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import pg.p;

/* renamed from: pg.a  reason: case insensitive filesystem */
public abstract class C6639a implements p {

    /* renamed from: a  reason: collision with root package name */
    protected int f72484a = 0;

    /* access modifiers changed from: package-private */
    public v b() {
        return new v(this);
    }

    public void i(OutputStream outputStream) {
        int a10 = a();
        C6644f I10 = C6644f.I(outputStream, C6644f.t(C6644f.u(a10) + a10));
        I10.n0(a10);
        h(I10);
        I10.H();
    }

    /* renamed from: pg.a$a  reason: collision with other inner class name */
    public static abstract class C1046a implements p.a {
        protected static v i(p pVar) {
            return new v(pVar);
        }

        /* renamed from: pg.a$a$a  reason: collision with other inner class name */
        static final class C1047a extends FilterInputStream {

            /* renamed from: a  reason: collision with root package name */
            private int f72485a;

            C1047a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f72485a = i10;
            }

            public int available() {
                return Math.min(super.available(), this.f72485a);
            }

            public int read() {
                if (this.f72485a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f72485a--;
                }
                return read;
            }

            public long skip(long j10) {
                long skip = super.skip(Math.min(j10, (long) this.f72485a));
                if (skip >= 0) {
                    this.f72485a = (int) (((long) this.f72485a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i10, int i11) {
                int i12 = this.f72485a;
                if (i12 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i10, Math.min(i11, i12));
                if (read >= 0) {
                    this.f72485a -= read;
                }
                return read;
            }
        }
    }
}
