package O4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f33347a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Charset f33348b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f33349c;

    /* renamed from: d  reason: collision with root package name */
    private int f33350d;

    /* renamed from: e  reason: collision with root package name */
    private int f33351e;

    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        public String toString() {
            int i10 = this.count;
            if (i10 > 0 && this.buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(this.buf, 0, i10, c.this.f33348b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() {
        InputStream inputStream = this.f33347a;
        byte[] bArr = this.f33349c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f33350d = 0;
            this.f33351e = read;
            return;
        }
        throw new EOFException();
    }

    public void close() {
        synchronized (this.f33347a) {
            try {
                if (this.f33349c != null) {
                    this.f33349c = null;
                    this.f33347a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean f() {
        if (this.f33351e == -1) {
            return true;
        }
        return false;
    }

    public String n() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f33347a) {
            try {
                if (this.f33349c != null) {
                    if (this.f33350d >= this.f33351e) {
                        b();
                    }
                    for (int i12 = this.f33350d; i12 != this.f33351e; i12++) {
                        byte[] bArr2 = this.f33349c;
                        if (bArr2[i12] == 10) {
                            int i13 = this.f33350d;
                            if (i12 != i13) {
                                i11 = i12 - 1;
                                if (bArr2[i11] == 13) {
                                    String str = new String(bArr2, i13, i11 - i13, this.f33348b.name());
                                    this.f33350d = i12 + 1;
                                    return str;
                                }
                            }
                            i11 = i12;
                            String str2 = new String(bArr2, i13, i11 - i13, this.f33348b.name());
                            this.f33350d = i12 + 1;
                            return str2;
                        }
                    }
                    a aVar = new a((this.f33351e - this.f33350d) + 80);
                    loop1:
                    while (true) {
                        byte[] bArr3 = this.f33349c;
                        int i14 = this.f33350d;
                        aVar.write(bArr3, i14, this.f33351e - i14);
                        this.f33351e = -1;
                        b();
                        i10 = this.f33350d;
                        while (true) {
                            if (i10 != this.f33351e) {
                                bArr = this.f33349c;
                                if (bArr[i10] == 10) {
                                    break loop1;
                                }
                                i10++;
                            }
                        }
                    }
                    int i15 = this.f33350d;
                    if (i10 != i15) {
                        aVar.write(bArr, i15, i10 - i15);
                    }
                    this.f33350d = i10 + 1;
                    String byteArrayOutputStream = aVar.toString();
                    return byteArrayOutputStream;
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(d.f33353a)) {
            this.f33347a = inputStream;
            this.f33348b = charset;
            this.f33349c = new byte[i10];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
