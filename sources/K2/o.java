package k2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import i2.C2076a;
import i2.L;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class o extends C2147b {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f23255e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f23256f;

    /* renamed from: g  reason: collision with root package name */
    private long f23257g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23258h;

    private static final class a {
        /* access modifiers changed from: private */
        public static boolean b(Throwable th2) {
            if (!(th2 instanceof ErrnoException) || ((ErrnoException) th2).errno != OsConstants.EACCES) {
                return false;
            }
            return true;
        }
    }

    public static class b extends g {
        public b(Throwable th2, int i10) {
            super(th2, i10);
        }

        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public o() {
        super(false);
    }

    private static RandomAccessFile s(Uri uri) {
        int i10 = 2006;
        try {
            return new RandomAccessFile((String) C2076a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e10, ErrorCodes.PROTOCOL_EXCEPTION);
            }
            if (L.f22072a < 21 || !a.b(e10.getCause())) {
                i10 = 2005;
            }
            throw new b(e10, i10);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    public void close() {
        this.f23256f = null;
        try {
            RandomAccessFile randomAccessFile = this.f23255e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f23255e = null;
            if (this.f23258h) {
                this.f23258h = false;
                p();
            }
        } catch (IOException e10) {
            throw new b(e10, 2000);
        } catch (Throwable th2) {
            this.f23255e = null;
            if (this.f23258h) {
                this.f23258h = false;
                p();
            }
            throw th2;
        }
    }

    public Uri getUri() {
        return this.f23256f;
    }

    public long m(j jVar) {
        Uri uri = jVar.f23194a;
        this.f23256f = uri;
        q(jVar);
        RandomAccessFile s10 = s(uri);
        this.f23255e = s10;
        try {
            s10.seek(jVar.f23200g);
            long j10 = jVar.f23201h;
            if (j10 == -1) {
                j10 = this.f23255e.length() - jVar.f23200g;
            }
            this.f23257g = j10;
            if (j10 >= 0) {
                this.f23258h = true;
                r(jVar);
                return this.f23257g;
            }
            throw new b((String) null, (Throwable) null, 2008);
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f23257g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) L.h(this.f23255e)).read(bArr, i10, (int) Math.min(this.f23257g, (long) i11));
            if (read > 0) {
                this.f23257g -= (long) read;
                o(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
