package k2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import i2.C2076a;
import i2.L;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: k2.a  reason: case insensitive filesystem */
public final class C2146a extends C2147b {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f23168e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f23169f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f23170g;

    /* renamed from: h  reason: collision with root package name */
    private long f23171h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f23172i;

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    public static final class C0373a extends g {
        public C0373a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C2146a(Context context) {
        super(false);
        this.f23168e = context.getAssets();
    }

    public void close() {
        this.f23169f = null;
        try {
            InputStream inputStream = this.f23170g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f23170g = null;
            if (this.f23172i) {
                this.f23172i = false;
                p();
            }
        } catch (IOException e10) {
            throw new C0373a(e10, 2000);
        } catch (Throwable th2) {
            this.f23170g = null;
            if (this.f23172i) {
                this.f23172i = false;
                p();
            }
            throw th2;
        }
    }

    public Uri getUri() {
        return this.f23169f;
    }

    public long m(j jVar) {
        int i10;
        try {
            Uri uri = jVar.f23194a;
            this.f23169f = uri;
            String str = (String) C2076a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            q(jVar);
            InputStream open = this.f23168e.open(str, 1);
            this.f23170g = open;
            if (open.skip(jVar.f23200g) >= jVar.f23200g) {
                long j10 = jVar.f23201h;
                if (j10 != -1) {
                    this.f23171h = j10;
                } else {
                    long available = (long) this.f23170g.available();
                    this.f23171h = available;
                    if (available == 2147483647L) {
                        this.f23171h = -1;
                    }
                }
                this.f23172i = true;
                r(jVar);
                return this.f23171h;
            }
            throw new C0373a((Throwable) null, 2008);
        } catch (C0373a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = 2000;
            }
            throw new C0373a(e11, i10);
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f23171h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new C0373a(e10, 2000);
            }
        }
        int read = ((InputStream) L.h(this.f23170g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f23171h;
        if (j11 != -1) {
            this.f23171h = j11 - ((long) read);
        }
        o(read);
        return read;
    }
}
