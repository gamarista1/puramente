package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import i2.L;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class d extends C2147b {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f23177e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f23178f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f23179g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f23180h;

    /* renamed from: i  reason: collision with root package name */
    private long f23181i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f23182j;

    public static class a extends g {
        public a(IOException iOException, int i10) {
            super((Throwable) iOException, i10);
        }
    }

    public d(Context context) {
        super(false);
        this.f23177e = context.getContentResolver();
    }

    public void close() {
        this.f23178f = null;
        try {
            FileInputStream fileInputStream = this.f23180h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f23180h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f23179g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f23179g = null;
                if (this.f23182j) {
                    this.f23182j = false;
                    p();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            } catch (Throwable th2) {
                this.f23179g = null;
                if (this.f23182j) {
                    this.f23182j = false;
                    p();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new a(e11, 2000);
        } catch (Throwable th3) {
            this.f23180h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f23179g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f23179g = null;
                if (this.f23182j) {
                    this.f23182j = false;
                    p();
                }
                throw th3;
            } catch (IOException e12) {
                throw new a(e12, 2000);
            } catch (Throwable th4) {
                this.f23179g = null;
                if (this.f23182j) {
                    this.f23182j = false;
                    p();
                }
                throw th4;
            }
        }
    }

    public Uri getUri() {
        return this.f23178f;
    }

    public long m(j jVar) {
        AssetFileDescriptor assetFileDescriptor;
        j jVar2 = jVar;
        int i10 = 2000;
        try {
            Uri normalizeScheme = jVar2.f23194a.normalizeScheme();
            this.f23178f = normalizeScheme;
            q(jVar);
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = this.f23177e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f23177e.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f23179g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f23180h = fileInputStream;
                int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i11 != 0) {
                    if (jVar2.f23200g > length) {
                        throw new a((IOException) null, 2008);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long j10 = length;
                long skip = fileInputStream.skip(jVar2.f23200g + startOffset) - startOffset;
                if (skip == jVar2.f23200g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f23181i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f23181i = position;
                            if (position < 0) {
                                throw new a((IOException) null, 2008);
                            }
                        }
                    } else {
                        long j11 = j10 - skip;
                        this.f23181i = j11;
                        if (j11 < 0) {
                            throw new a((IOException) null, 2008);
                        }
                    }
                    long j12 = jVar2.f23201h;
                    if (j12 != -1) {
                        long j13 = this.f23181i;
                        if (j13 != -1) {
                            j12 = Math.min(j13, j12);
                        }
                        this.f23181i = j12;
                    }
                    this.f23182j = true;
                    r(jVar);
                    long j14 = jVar2.f23201h;
                    if (j14 != -1) {
                        return j14;
                    }
                    return this.f23181i;
                }
                throw new a((IOException) null, 2008);
            }
            throw new a(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
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
        long j10 = this.f23181i;
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
        int read = ((FileInputStream) L.h(this.f23180h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f23181i;
        if (j11 != -1) {
            this.f23181i = j11 - ((long) read);
        }
        o(read);
        return read;
    }
}
