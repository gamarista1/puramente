package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import com.facebook.soloader.G;
import com.facebook.soloader.m;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.soloader.c  reason: case insensitive filesystem */
public class C3452c extends G implements w {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f42510f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f42511g;

    /* renamed from: com.facebook.soloader.c$a */
    protected class a extends G.e {
        protected a() {
        }

        public G.c[] b() {
            ArrayList arrayList = new ArrayList();
            Iterator it = C3452c.this.f42510f.iterator();
            while (it.hasNext()) {
                G.e q10 = ((m) it.next()).q();
                try {
                    arrayList.addAll(Arrays.asList(q10.b()));
                    q10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            return (G.c[]) arrayList.toArray(new G.c[arrayList.size()]);
            throw th;
        }

        public void f(File file) {
            Iterator it = C3452c.this.f42510f.iterator();
            while (it.hasNext()) {
                m.b bVar = (m.b) ((m) it.next()).q();
                try {
                    bVar.f(file);
                    bVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            return;
            throw th;
        }
    }

    public C3452c(Context context, String str, boolean z10) {
        super(context, str, z10);
        ArrayList arrayList = new ArrayList();
        this.f42510f = arrayList;
        this.f42511g = false;
        arrayList.add(new m(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$"));
        w(context, str);
    }

    private void w(Context context, String str) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            try {
                for (String file : context.getApplicationInfo().splitSourceDirs) {
                    m mVar = new m(context, str, new File(file), "^lib/([^/]+)/([^/]+\\.so)$");
                    if (mVar.v()) {
                        p.g("BackupSoSource", "adding backup source from split: " + mVar.toString());
                        this.f42510f.add(mVar);
                    }
                }
            } catch (IOException e10) {
                p.h("BackupSoSource", "failed to read split apks", e10);
            }
        }
    }

    public E b(Context context) {
        C3452c cVar = new C3452c(context, this.f42519a.getName());
        try {
            cVar.e(0);
            return cVar;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String c() {
        return "BackupSoSource";
    }

    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        if (!this.f42511g) {
            return 0;
        }
        return super.d(str, i10, threadPolicy);
    }

    public void e(int i10) {
        if ((i10 & 8) == 0) {
            super.e(i10);
            this.f42511g = true;
        }
    }

    /* access modifiers changed from: protected */
    public byte[] n() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 3);
            obtain.writeInt(SysUtil.g(this.f42482d));
            obtain.writeInt(this.f42510f.size());
            Iterator it = this.f42510f.iterator();
            while (it.hasNext()) {
                obtain.writeByteArray(((m) it.next()).n());
            }
            String str = this.f42482d.getApplicationInfo().sourceDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                obtain.writeByte((byte) 1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } catch (Throwable th2) {
            obtain.recycle();
            throw th2;
        }
    }

    public G.c[] o() {
        G.e q10 = ((m) this.f42510f.get(0)).q();
        try {
            G.c[] b10 = q10.b();
            q10.close();
            return b10;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public G.e q() {
        return new a();
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f42519a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f42519a.getName();
        }
        return c() + "[root = " + str + " flags = " + this.f42520b + " apks = " + this.f42510f.toString() + "]";
    }

    public boolean x(String str, int i10) {
        boolean z10;
        G.e q10 = q();
        try {
            G.c[] b10 = q10.b();
            int length = b10.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                } else if (b10[i11].f42489a.equals(str)) {
                    p.b("SoLoader", "Found " + str + " in " + c());
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
            q10.close();
            if (!z10) {
                return false;
            }
            p.b("SoLoader", "Preparing " + c());
            e(i10);
            return true;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public C3452c(Context context, String str) {
        this(context, str, true);
    }
}
