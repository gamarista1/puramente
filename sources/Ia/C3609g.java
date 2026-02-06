package ia;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import ja.M;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: ia.g  reason: case insensitive filesystem */
public final class C3609g extends C3608f {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f44439e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f44440f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f44441g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f44442h;

    /* renamed from: i  reason: collision with root package name */
    private long f44443i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f44444j;

    /* renamed from: ia.g$a */
    public static class a extends C3613k {
        public a(IOException iOException, int i10) {
            super((Throwable) iOException, i10);
        }
    }

    public C3609g(Context context) {
        super(false);
        this.f44439e = context.getContentResolver();
    }

    public void close() {
        this.f44440f = null;
        try {
            FileInputStream fileInputStream = this.f44442h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f44442h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f44441g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f44441g = null;
                if (this.f44444j) {
                    this.f44444j = false;
                    p();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            } catch (Throwable th2) {
                this.f44441g = null;
                if (this.f44444j) {
                    this.f44444j = false;
                    p();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new a(e11, 2000);
        } catch (Throwable th3) {
            this.f44442h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f44441g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f44441g = null;
                if (this.f44444j) {
                    this.f44444j = false;
                    p();
                }
                throw th3;
            } catch (IOException e12) {
                throw new a(e12, 2000);
            } catch (Throwable th4) {
                this.f44441g = null;
                if (this.f44444j) {
                    this.f44444j = false;
                    p();
                }
                throw th4;
            }
        }
    }

    public Uri getUri() {
        return this.f44440f;
    }

    public long m(n nVar) {
        AssetFileDescriptor assetFileDescriptor;
        n nVar2 = nVar;
        int i10 = 2000;
        try {
            Uri uri = nVar2.f44456a;
            this.f44440f = uri;
            q(nVar);
            if ("content".equals(nVar2.f44456a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = this.f44439e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f44439e.openAssetFileDescriptor(uri, "r");
            }
            this.f44441g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f44442h = fileInputStream;
                int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i11 != 0) {
                    if (nVar2.f44462g > length) {
                        throw new a((IOException) null, 2008);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long j10 = length;
                long skip = fileInputStream.skip(nVar2.f44462g + startOffset) - startOffset;
                if (skip == nVar2.f44462g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f44443i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f44443i = position;
                            if (position < 0) {
                                throw new a((IOException) null, 2008);
                            }
                        }
                    } else {
                        long j11 = j10 - skip;
                        this.f44443i = j11;
                        if (j11 < 0) {
                            throw new a((IOException) null, 2008);
                        }
                    }
                    long j12 = nVar2.f44463h;
                    if (j12 != -1) {
                        long j13 = this.f44443i;
                        if (j13 != -1) {
                            j12 = Math.min(j13, j12);
                        }
                        this.f44443i = j12;
                    }
                    this.f44444j = true;
                    r(nVar);
                    long j14 = nVar2.f44463h;
                    if (j14 != -1) {
                        return j14;
                    }
                    return this.f44443i;
                }
                throw new a((IOException) null, 2008);
            }
            throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new a(e11, i10);
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f44443i;
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
        int read = ((FileInputStream) M.j(this.f44442h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f44443i;
        if (j11 != -1) {
            this.f44443i = j11 - ((long) read);
        }
        o(read);
        return read;
    }
}
