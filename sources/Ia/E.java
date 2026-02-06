package ia;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.revenuecat.purchases.common.Constants;
import ja.C3645a;
import ja.M;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public final class E extends C3608f {

    /* renamed from: e  reason: collision with root package name */
    private final Resources f44388e;

    /* renamed from: f  reason: collision with root package name */
    private final String f44389f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f44390g;

    /* renamed from: h  reason: collision with root package name */
    private AssetFileDescriptor f44391h;

    /* renamed from: i  reason: collision with root package name */
    private InputStream f44392i;

    /* renamed from: j  reason: collision with root package name */
    private long f44393j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f44394k;

    public static class a extends C3613k {
        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public E(Context context) {
        super(false);
        this.f44388e = context.getResources();
        this.f44389f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    public void close() {
        this.f44390g = null;
        try {
            InputStream inputStream = this.f44392i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f44392i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f44391h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f44391h = null;
                if (this.f44394k) {
                    this.f44394k = false;
                    p();
                }
            } catch (IOException e10) {
                throw new a((String) null, e10, 2000);
            } catch (Throwable th2) {
                this.f44391h = null;
                if (this.f44394k) {
                    this.f44394k = false;
                    p();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new a((String) null, e11, 2000);
        } catch (Throwable th3) {
            this.f44392i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f44391h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f44391h = null;
                if (this.f44394k) {
                    this.f44394k = false;
                    p();
                }
                throw th3;
            } catch (IOException e12) {
                throw new a((String) null, e12, 2000);
            } catch (Throwable th4) {
                this.f44391h = null;
                if (this.f44394k) {
                    this.f44394k = false;
                    p();
                }
                throw th4;
            }
        }
    }

    public Uri getUri() {
        return this.f44390g;
    }

    public long m(n nVar) {
        int i10;
        String str;
        n nVar2 = nVar;
        Uri uri = nVar2.f44456a;
        this.f44390g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C3645a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                i10 = Integer.parseInt((String) C3645a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", (Throwable) null, ErrorCodes.PROTOCOL_EXCEPTION);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str2 = (String) C3645a.e(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
            }
            sb2.append(str);
            sb2.append(str2);
            i10 = this.f44388e.getIdentifier(sb2.toString(), "raw", this.f44389f);
            if (i10 == 0) {
                throw new a("Resource not found.", (Throwable) null, 2005);
            }
        } else {
            throw new a("URI must either use scheme rawresource or android.resource", (Throwable) null, ErrorCodes.PROTOCOL_EXCEPTION);
        }
        q(nVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f44388e.openRawResourceFd(i10);
            this.f44391h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f44392i = fileInputStream;
                int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i11 != 0) {
                    try {
                        if (nVar2.f44462g > length) {
                            throw new a((String) null, (Throwable) null, 2008);
                        }
                    } catch (a e10) {
                        throw e10;
                    } catch (IOException e11) {
                        throw new a((String) null, e11, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(nVar2.f44462g + startOffset) - startOffset;
                if (skip == nVar2.f44462g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f44393j = -1;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f44393j = size;
                            if (size < 0) {
                                throw new a((String) null, (Throwable) null, 2008);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f44393j = j10;
                        if (j10 < 0) {
                            throw new C3613k(2008);
                        }
                    }
                    long j11 = nVar2.f44463h;
                    if (j11 != -1) {
                        long j12 = this.f44393j;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f44393j = j11;
                    }
                    this.f44394k = true;
                    r(nVar);
                    long j13 = nVar2.f44463h;
                    if (j13 != -1) {
                        return j13;
                    }
                    return this.f44393j;
                }
                throw new a((String) null, (Throwable) null, 2008);
            }
            throw new a("Resource is compressed: " + uri, (Throwable) null, 2000);
        } catch (Resources.NotFoundException e12) {
            throw new a((String) null, e12, 2005);
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f44393j;
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
        int read = ((InputStream) M.j(this.f44392i)).read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f44393j;
            if (j11 != -1) {
                this.f44393j = j11 - ((long) read);
            }
            o(read);
            return read;
        } else if (this.f44393j == -1) {
            return -1;
        } else {
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }
}
