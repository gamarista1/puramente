package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;
import s3.C2593a;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f17828a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f17829b;

    /* renamed from: c  reason: collision with root package name */
    private final f.c f17830c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f17831d;

    /* renamed from: e  reason: collision with root package name */
    private final File f17832e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17833f;

    /* renamed from: g  reason: collision with root package name */
    private final String f17834g;

    /* renamed from: h  reason: collision with root package name */
    private final String f17835h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17836i = false;

    /* renamed from: j  reason: collision with root package name */
    private c[] f17837j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f17838k;

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f17828a = assetManager;
        this.f17829b = executor;
        this.f17830c = cVar;
        this.f17833f = str;
        this.f17834g = str2;
        this.f17835h = str3;
        this.f17832e = file;
        this.f17831d = d();
    }

    private b b(c[] cVarArr, byte[] bArr) {
        InputStream h10;
        try {
            h10 = h(this.f17828a, this.f17835h);
            if (h10 != null) {
                this.f17837j = g.r(h10, g.p(h10, g.f17858b), bArr, cVarArr);
                h10.close();
                return this;
            }
            if (h10 != null) {
                h10.close();
            }
            return null;
        } catch (FileNotFoundException e10) {
            this.f17830c.a(9, e10);
        } catch (IOException e11) {
            this.f17830c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f17837j = null;
            this.f17830c.a(8, e12);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private void c() {
        if (!this.f17836i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return i.f17870a;
        }
        switch (i10) {
            case 24:
            case 25:
                return i.f17874e;
            case 26:
                return i.f17873d;
            case 27:
                return i.f17872c;
            case 28:
            case 29:
            case 30:
                return i.f17871b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f17834g);
        } catch (FileNotFoundException e10) {
            this.f17830c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f17830c.a(7, e11);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f17830c.a(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f17830c.b(5, (Object) null);
            }
            return null;
        }
    }

    private c[] j(InputStream inputStream) {
        try {
            c[] x10 = g.x(inputStream, g.p(inputStream, g.f17857a), this.f17833f);
            try {
                inputStream.close();
                return x10;
            } catch (IOException e10) {
                this.f17830c.a(7, e10);
                return x10;
            }
        } catch (IOException e11) {
            this.f17830c.a(7, e11);
            inputStream.close();
            return null;
        } catch (IllegalStateException e12) {
            this.f17830c.a(8, e12);
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f17830c.a(7, e13);
            }
            return null;
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f17830c.a(7, e14);
            }
            throw th2;
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || i10 == 24 || i10 == 25) {
            return true;
        }
        return false;
    }

    private void l(int i10, Object obj) {
        this.f17829b.execute(new C2593a(this, i10, obj));
    }

    public boolean e() {
        if (this.f17831d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f17832e.exists()) {
            try {
                if (!this.f17832e.createNewFile()) {
                    l(4, (Object) null);
                    return false;
                }
            } catch (IOException unused) {
                l(4, (Object) null);
                return false;
            }
        } else if (!this.f17832e.canWrite()) {
            l(4, (Object) null);
            return false;
        }
        this.f17836i = true;
        return true;
    }

    public b i() {
        b b10;
        c();
        if (this.f17831d == null) {
            return this;
        }
        InputStream f10 = f(this.f17828a);
        if (f10 != null) {
            this.f17837j = j(f10);
        }
        c[] cVarArr = this.f17837j;
        if (cVarArr == null || !k() || (b10 = b(cVarArr, this.f17831d)) == null) {
            return this;
        }
        return b10;
    }

    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f17837j;
        byte[] bArr = this.f17831d;
        if (!(cVarArr == null || bArr == null)) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                g.F(byteArrayOutputStream, bArr);
                if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f17830c.a(5, (Object) null);
                    this.f17837j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f17838k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f17837j = null;
            } catch (IOException e10) {
                this.f17830c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f17830c.a(8, e11);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return this;
        throw th;
    }

    public boolean n() {
        ByteArrayInputStream byteArrayInputStream;
        FileChannel channel;
        FileLock tryLock;
        byte[] bArr = this.f17838k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(this.f17832e);
            try {
                channel = fileOutputStream.getChannel();
                tryLock = channel.tryLock();
                d.l(byteArrayInputStream, fileOutputStream, tryLock);
                l(1, (Object) null);
                if (tryLock != null) {
                    tryLock.close();
                }
                channel.close();
                fileOutputStream.close();
                byteArrayInputStream.close();
                this.f17838k = null;
                this.f17837j = null;
                return true;
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            l(6, e10);
            this.f17838k = null;
            this.f17837j = null;
            return false;
        } catch (IOException e11) {
            l(7, e11);
            this.f17838k = null;
            this.f17837j = null;
            return false;
        } catch (Throwable th3) {
            this.f17838k = null;
            this.f17837j = null;
            throw th3;
        }
        throw th;
        throw th;
        throw th;
    }
}
