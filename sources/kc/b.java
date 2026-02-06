package Kc;

import android.util.Log;
import java.io.InputStream;

public class b {

    /* renamed from: f  reason: collision with root package name */
    private static final Runtime f51463f = Runtime.getRuntime();

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f51464a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f51465b;

    /* renamed from: c  reason: collision with root package name */
    private int f51466c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f51467d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f51468e = true;

    public b(InputStream inputStream, int i10) {
        this.f51464a = inputStream;
        this.f51465b = new byte[i10];
    }

    private int g(int i10) {
        int max = Math.max(this.f51465b.length * 2, i10);
        Runtime runtime = f51463f;
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f51468e || ((long) max) >= maxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.f51465b, 0, bArr, 0, this.f51466c);
                this.f51465b = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f51468e = false;
            }
        }
        return this.f51465b.length;
    }

    public int a(int i10) {
        int i11 = this.f51466c;
        int i12 = 0;
        if (i10 <= i11) {
            int i13 = i11 - i10;
            this.f51466c = i13;
            byte[] bArr = this.f51465b;
            System.arraycopy(bArr, i10, bArr, 0, i13);
            return i10;
        }
        this.f51466c = 0;
        while (i12 < i10) {
            int skip = (int) this.f51464a.skip((long) (i10 - i12));
            if (skip > 0) {
                i12 += skip;
            } else if (skip != 0) {
                continue;
            } else if (this.f51464a.read() == -1) {
                break;
            } else {
                i12++;
            }
        }
        return i12;
    }

    public int b() {
        return this.f51466c;
    }

    public void c() {
        this.f51464a.close();
    }

    public int d(int i10) {
        if (i10 > this.f51465b.length) {
            i10 = Math.min(i10, g(i10));
        }
        while (true) {
            int i11 = this.f51466c;
            if (i11 >= i10) {
                break;
            }
            int read = this.f51464a.read(this.f51465b, i11, i10 - i11);
            if (read == -1) {
                this.f51467d = true;
                break;
            }
            this.f51466c += read;
        }
        return this.f51466c;
    }

    public byte[] e() {
        return this.f51465b;
    }

    public boolean f() {
        return this.f51467d;
    }
}
