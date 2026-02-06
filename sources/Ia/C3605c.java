package ia;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import ja.C3645a;
import ja.M;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ia.c  reason: case insensitive filesystem */
public final class C3605c extends C3608f {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f44422e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f44423f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f44424g;

    /* renamed from: h  reason: collision with root package name */
    private long f44425h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f44426i;

    /* renamed from: ia.c$a */
    public static final class a extends C3613k {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C3605c(Context context) {
        super(false);
        this.f44422e = context.getAssets();
    }

    public void close() {
        this.f44423f = null;
        try {
            InputStream inputStream = this.f44424g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f44424g = null;
            if (this.f44426i) {
                this.f44426i = false;
                p();
            }
        } catch (IOException e10) {
            throw new a(e10, 2000);
        } catch (Throwable th2) {
            this.f44424g = null;
            if (this.f44426i) {
                this.f44426i = false;
                p();
            }
            throw th2;
        }
    }

    public Uri getUri() {
        return this.f44423f;
    }

    public long m(n nVar) {
        int i10;
        try {
            Uri uri = nVar.f44456a;
            this.f44423f = uri;
            String str = (String) C3645a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            q(nVar);
            InputStream open = this.f44422e.open(str, 1);
            this.f44424g = open;
            if (open.skip(nVar.f44462g) >= nVar.f44462g) {
                long j10 = nVar.f44463h;
                if (j10 != -1) {
                    this.f44425h = j10;
                } else {
                    long available = (long) this.f44424g.available();
                    this.f44425h = available;
                    if (available == 2147483647L) {
                        this.f44425h = -1;
                    }
                }
                this.f44426i = true;
                r(nVar);
                return this.f44425h;
            }
            throw new a((Throwable) null, 2008);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = 2000;
            }
            throw new a(e11, i10);
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f44425h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((InputStream) M.j(this.f44424g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f44425h;
        if (j11 != -1) {
            this.f44425h = j11 - ((long) read);
        }
        o(read);
        return read;
    }
}
