package ia;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import ja.C3645a;
import ja.M;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class x extends C3608f {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f44554e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f44555f;

    /* renamed from: g  reason: collision with root package name */
    private long f44556g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f44557h;

    private static final class a {
        /* access modifiers changed from: private */
        public static boolean b(Throwable th2) {
            if (!(th2 instanceof ErrnoException) || ((ErrnoException) th2).errno != OsConstants.EACCES) {
                return false;
            }
            return true;
        }
    }

    public static class b extends C3613k {
        public b(Throwable th2, int i10) {
            super(th2, i10);
        }

        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public x() {
        super(false);
    }

    private static RandomAccessFile s(Uri uri) {
        int i10 = 2006;
        try {
            return new RandomAccessFile((String) C3645a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e10, ErrorCodes.PROTOCOL_EXCEPTION);
            }
            if (M.f44981a < 21 || !a.b(e10.getCause())) {
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
        this.f44555f = null;
        try {
            RandomAccessFile randomAccessFile = this.f44554e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f44554e = null;
            if (this.f44557h) {
                this.f44557h = false;
                p();
            }
        } catch (IOException e10) {
            throw new b(e10, 2000);
        } catch (Throwable th2) {
            this.f44554e = null;
            if (this.f44557h) {
                this.f44557h = false;
                p();
            }
            throw th2;
        }
    }

    public Uri getUri() {
        return this.f44555f;
    }

    public long m(n nVar) {
        Uri uri = nVar.f44456a;
        this.f44555f = uri;
        q(nVar);
        RandomAccessFile s10 = s(uri);
        this.f44554e = s10;
        try {
            s10.seek(nVar.f44462g);
            long j10 = nVar.f44463h;
            if (j10 == -1) {
                j10 = this.f44554e.length() - nVar.f44462g;
            }
            this.f44556g = j10;
            if (j10 >= 0) {
                this.f44557h = true;
                r(nVar);
                return this.f44556g;
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
        if (this.f44556g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) M.j(this.f44554e)).read(bArr, i10, (int) Math.min(this.f44556g, (long) i11));
            if (read > 0) {
                this.f44556g -= (long) read;
                o(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
