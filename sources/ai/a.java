package ai;

import Uh.b;
import bi.e;
import ci.c;
import ci.d;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public abstract class a implements b {

    /* renamed from: f  reason: collision with root package name */
    private static c f67090f = d.j(a.class);

    /* renamed from: a  reason: collision with root package name */
    protected String f67091a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f67092b;

    /* renamed from: c  reason: collision with root package name */
    boolean f67093c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f67094d;

    /* renamed from: e  reason: collision with root package name */
    private ByteBuffer f67095e = null;

    protected a(String str) {
        this.f67091a = str;
        this.f67093c = true;
    }

    private void d(ByteBuffer byteBuffer) {
        if (h()) {
            e.g(byteBuffer, getSize());
            byteBuffer.put(Uh.c.o(e()));
        } else {
            e.g(byteBuffer, 1);
            byteBuffer.put(Uh.c.o(e()));
            e.h(byteBuffer, getSize());
        }
        if ("uuid".equals(e())) {
            byteBuffer.put(f());
        }
    }

    private boolean h() {
        int i10;
        int i11;
        if ("uuid".equals(e())) {
            i10 = 24;
        } else {
            i10 = 8;
        }
        if (this.f67093c) {
            long c10 = c();
            ByteBuffer byteBuffer = this.f67095e;
            if (byteBuffer != null) {
                i11 = byteBuffer.limit();
            } else {
                i11 = 0;
            }
            if (c10 + ((long) i11) + ((long) i10) < 4294967296L) {
                return true;
            }
            return false;
        } else if (((long) (this.f67092b.limit() + i10)) < 4294967296L) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract void b(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract long c();

    public String e() {
        return this.f67091a;
    }

    public byte[] f() {
        return this.f67094d;
    }

    public boolean g() {
        return this.f67093c;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        int i10;
        if (this.f67093c) {
            ByteBuffer allocate = ByteBuffer.allocate(bi.a.a(getSize()));
            d(allocate);
            b(allocate);
            ByteBuffer byteBuffer = this.f67095e;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                while (this.f67095e.remaining() > 0) {
                    allocate.put(this.f67095e);
                }
            }
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            return;
        }
        int i11 = 16;
        if (h()) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        if (!"uuid".equals(e())) {
            i11 = 0;
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(i10 + i11);
        d(allocate2);
        writableByteChannel.write((ByteBuffer) allocate2.rewind());
        writableByteChannel.write((ByteBuffer) this.f67092b.position(0));
    }

    public long getSize() {
        long j10;
        int i10;
        int i11;
        if (this.f67093c) {
            j10 = c();
        } else {
            j10 = (long) this.f67092b.limit();
        }
        int i12 = 0;
        if (j10 >= 4294967288L) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        int i13 = i10 + 8;
        if ("uuid".equals(e())) {
            i11 = 16;
        } else {
            i11 = 0;
        }
        long j11 = j10 + ((long) (i13 + i11));
        ByteBuffer byteBuffer = this.f67095e;
        if (byteBuffer != null) {
            i12 = byteBuffer.limit();
        }
        return j11 + ((long) i12);
    }

    public final synchronized void i() {
        try {
            f67090f.e("parsing details of {}", e());
            ByteBuffer byteBuffer = this.f67092b;
            if (byteBuffer != null) {
                this.f67093c = true;
                byteBuffer.rewind();
                a(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.f67095e = byteBuffer.slice();
                }
                this.f67092b = null;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
