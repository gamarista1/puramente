package k2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.revenuecat.purchases.common.Constants;
import i2.C2076a;
import i2.L;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

public final class v extends C2147b {

    /* renamed from: e  reason: collision with root package name */
    private final Context f23270e;

    /* renamed from: f  reason: collision with root package name */
    private j f23271f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f23272g;

    /* renamed from: h  reason: collision with root package name */
    private InputStream f23273h;

    /* renamed from: i  reason: collision with root package name */
    private long f23274i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f23275j;

    public static class a extends g {
        public a(String str) {
            super(str, (Throwable) null, 2000);
        }

        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public v(Context context) {
        super(false);
        this.f23270e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor s(Context context, j jVar) {
        Resources resources;
        int i10;
        String str;
        Uri normalizeScheme = jVar.f23194a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                i10 = t(pathSegments.get(0));
            } else {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String str2 = (String) C2076a.e(normalizeScheme.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                str = context.getPackageName();
            } else {
                str = normalizeScheme.getHost();
            }
            if (str.equals(context.getPackageName())) {
                resources = context.getResources();
            } else {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(str);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (str2.matches("\\d+")) {
                i10 = t(str2);
            } else {
                i10 = resources.getIdentifier(str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2, "raw", (String) null);
                if (i10 == 0) {
                    throw new a("Resource not found.", (Throwable) null, 2005);
                }
            }
        } else {
            throw new a("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only " + "android.resource" + " is supported.", (Throwable) null, ErrorCodes.PROTOCOL_EXCEPTION);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i10);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new a("Resource is compressed: " + normalizeScheme, (Throwable) null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a((String) null, e11, 2005);
        }
    }

    private static int t(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", (Throwable) null, ErrorCodes.PROTOCOL_EXCEPTION);
        }
    }

    public void close() {
        this.f23271f = null;
        try {
            InputStream inputStream = this.f23273h;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f23273h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f23272g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f23272g = null;
                if (this.f23275j) {
                    this.f23275j = false;
                    p();
                }
            } catch (IOException e10) {
                throw new a((String) null, e10, 2000);
            } catch (Throwable th2) {
                this.f23272g = null;
                if (this.f23275j) {
                    this.f23275j = false;
                    p();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new a((String) null, e11, 2000);
        } catch (Throwable th3) {
            this.f23273h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f23272g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f23272g = null;
                if (this.f23275j) {
                    this.f23275j = false;
                    p();
                }
                throw th3;
            } catch (IOException e12) {
                throw new a((String) null, e12, 2000);
            } catch (Throwable th4) {
                this.f23272g = null;
                if (this.f23275j) {
                    this.f23275j = false;
                    p();
                }
                throw th4;
            }
        }
    }

    public Uri getUri() {
        j jVar = this.f23271f;
        if (jVar != null) {
            return jVar.f23194a;
        }
        return null;
    }

    public long m(j jVar) {
        this.f23271f = jVar;
        q(jVar);
        AssetFileDescriptor s10 = s(this.f23270e, jVar);
        this.f23272g = s10;
        long length = s10.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f23272g.getFileDescriptor());
        this.f23273h = fileInputStream;
        int i10 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if (i10 != 0) {
            try {
                if (jVar.f23200g > length) {
                    throw new a((String) null, (Throwable) null, 2008);
                }
            } catch (a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new a((String) null, e11, 2000);
            }
        }
        long startOffset = this.f23272g.getStartOffset();
        long skip = fileInputStream.skip(jVar.f23200g + startOffset) - startOffset;
        if (skip == jVar.f23200g) {
            if (i10 == 0) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f23274i = -1;
                } else {
                    long size = channel.size() - channel.position();
                    this.f23274i = size;
                    if (size < 0) {
                        throw new a((String) null, (Throwable) null, 2008);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f23274i = j10;
                if (j10 < 0) {
                    throw new g(2008);
                }
            }
            long j11 = jVar.f23201h;
            if (j11 != -1) {
                long j12 = this.f23274i;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f23274i = j11;
            }
            this.f23275j = true;
            r(jVar);
            long j13 = jVar.f23201h;
            if (j13 != -1) {
                return j13;
            }
            return this.f23274i;
        }
        throw new a((String) null, (Throwable) null, 2008);
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f23274i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new a((String) null, e10, 2000);
            }
        }
        int read = ((InputStream) L.h(this.f23273h)).read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f23274i;
            if (j11 != -1) {
                this.f23274i = j11 - ((long) read);
            }
            o(read);
            return read;
        } else if (this.f23274i == -1) {
            return -1;
        } else {
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }
}
