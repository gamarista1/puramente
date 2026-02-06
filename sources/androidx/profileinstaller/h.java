package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static final d f17859a = d.A();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f17860b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c f17861c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f17862a;

        /* renamed from: b  reason: collision with root package name */
        final int f17863b;

        /* renamed from: c  reason: collision with root package name */
        final long f17864c;

        /* renamed from: d  reason: collision with root package name */
        final long f17865d;

        b(int i10, int i11, long j10, long j11) {
            this.f17862a = i10;
            this.f17863b = i11;
            this.f17864c = j10;
            this.f17865d = j11;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f17862a);
                dataOutputStream.writeInt(this.f17863b);
                dataOutputStream.writeLong(this.f17864c);
                dataOutputStream.writeLong(this.f17865d);
                dataOutputStream.close();
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f17863b == bVar.f17863b && this.f17864c == bVar.f17864c && this.f17862a == bVar.f17862a && this.f17865d == bVar.f17865d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f17863b), Long.valueOf(this.f17864c), Integer.valueOf(this.f17862a), Long.valueOf(this.f17865d)});
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f17866a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f17867b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f17868c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f17869d;

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f17866a = i10;
            this.f17868c = z11;
            this.f17867b = z10;
            this.f17869d = z12;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f17861c = cVar;
        f17859a.u(cVar);
        return f17861c;
    }

    static c c(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        b bVar;
        b bVar2;
        AssetFileDescriptor openFd;
        Throwable th2;
        c cVar;
        if (!z10 && (cVar = f17861c) != null) {
            return cVar;
        }
        synchronized (f17860b) {
            if (!z10) {
                c cVar2 = f17861c;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            int i10 = 0;
            try {
                openFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (openFd.getLength() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                openFd.close();
            } catch (IOException unused) {
                z11 = false;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                if (i11 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    if (!file.exists() || length <= 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (!file2.exists() || length2 <= 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                bVar = b.a(file3);
                            } catch (IOException unused2) {
                                return b(131072, z12, z13, z11);
                            }
                        } else {
                            bVar = null;
                        }
                        if (bVar != null && bVar.f17864c == a10) {
                            int i12 = bVar.f17863b;
                            if (i12 != 2) {
                                i10 = i12;
                                if (z10 && z13 && i10 != 1) {
                                    i10 = 2;
                                }
                                if (bVar != null && bVar.f17863b == 2 && i10 == 1 && length < bVar.f17865d) {
                                    i10 = 3;
                                }
                                bVar2 = new b(1, i10, a10, length2);
                                if (bVar == null || !bVar.equals(bVar2)) {
                                    bVar2.b(file3);
                                }
                                c b10 = b(i10, z12, z13, z11);
                                return b10;
                            }
                        }
                        if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                        i10 = 2;
                        i10 = 3;
                        bVar2 = new b(1, i10, a10, length2);
                        try {
                            bVar2.b(file3);
                        } catch (IOException unused3) {
                            i10 = 196608;
                        }
                        c b102 = b(i10, z12, z13, z11);
                        return b102;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        return b(65536, z12, z13, z11);
                    }
                }
            }
            c b11 = b(262144, false, false, z11);
            return b11;
        }
        throw th2;
    }
}
