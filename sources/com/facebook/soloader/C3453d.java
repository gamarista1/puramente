package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.d  reason: case insensitive filesystem */
public class C3453d extends E implements w {

    /* renamed from: a  reason: collision with root package name */
    private final Map f42513a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f42514b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Set f42515c;

    public C3453d(Context context) {
        this.f42515c = l(context);
    }

    private void f(String str, String str2, String str3) {
        synchronized (this.f42514b) {
            try {
                String str4 = str + str2;
                if (!this.f42514b.containsKey(str4)) {
                    this.f42514b.put(str4, new HashSet());
                }
                ((Set) this.f42514b.get(str4)).add(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void g(String str, String str2) {
        synchronized (this.f42513a) {
            try {
                if (!this.f42513a.containsKey(str)) {
                    this.f42513a.put(str, new HashSet());
                }
                ((Set) this.f42513a.get(str)).add(str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void h(String str, String str2) {
        String j10 = j(str);
        ZipFile zipFile = new ZipFile(j10);
        try {
            String n10 = n(str, str2);
            ZipEntry entry = zipFile.getEntry(n10);
            if (entry == null) {
                p.b("SoLoader", n10 + " not found in " + j10);
                zipFile.close();
                return;
            }
            i(str, zipFile, entry, str2);
            zipFile.close();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private void i(String str, ZipFile zipFile, ZipEntry zipEntry, String str2) {
        j jVar = new j(zipFile, zipEntry);
        try {
            for (String str3 : t.b(str2, jVar)) {
                if (!str3.startsWith("/")) {
                    f(str, str2, str3);
                }
            }
            jVar.close();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static String j(String str) {
        return str.substring(0, str.indexOf(33));
    }

    private Set k(String str, String str2) {
        Set set;
        synchronized (this.f42514b) {
            set = (Set) this.f42514b.get(str + str2);
        }
        return set;
    }

    static Set l(Context context) {
        HashSet hashSet = new HashSet();
        String m10 = m(context.getApplicationInfo().sourceDir);
        if (m10 != null) {
            hashSet.add(m10);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String m11 : context.getApplicationInfo().splitSourceDirs) {
                String m12 = m(m11);
                if (m12 != null) {
                    hashSet.add(m12);
                }
            }
        }
        return hashSet;
    }

    private static String m(String str) {
        String[] j10 = SysUtil.j();
        String str2 = "empty";
        if (str == null || str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot compute fallback path, apk path is ");
            if (str == null) {
                str2 = "null";
            }
            sb2.append(str2);
            p.g("SoLoader", sb2.toString());
            return null;
        } else if (j10 == null || j10.length == 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot compute fallback path, supportedAbis is ");
            if (j10 == null) {
                str2 = "null";
            }
            sb3.append(str2);
            p.g("SoLoader", sb3.toString());
            return null;
        } else {
            return str + "!/lib/" + j10[0];
        }
    }

    private static String n(String str, String str2) {
        int indexOf = str.indexOf(33);
        return str.substring(indexOf + 2) + File.separator + str2;
    }

    private void p(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) {
        Set<String> k10 = k(str, str2);
        if (k10 == null) {
            h(str, str2);
            k10 = k(str, str2);
        }
        if (k10 != null) {
            for (String s10 : k10) {
                SoLoader.s(s10, i10, threadPolicy);
            }
        }
    }

    private void q() {
        String str;
        int indexOf;
        int i10;
        for (String str2 : this.f42515c) {
            if (TextUtils.isEmpty(str2) || (indexOf = str2.indexOf(33)) < 0 || (i10 = indexOf + 2) >= str2.length()) {
                str = null;
            } else {
                str = str2.substring(i10);
            }
            if (!TextUtils.isEmpty(str)) {
                ZipFile zipFile = new ZipFile(j(str2));
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                        if (zipEntry != null && zipEntry.getMethod() == 0 && zipEntry.getName().startsWith(str) && zipEntry.getName().endsWith(".so")) {
                            g(str2, zipEntry.getName().substring(str.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        return;
        throw th;
    }

    public E b(Context context) {
        C3453d dVar = new C3453d(context);
        try {
            dVar.q();
            return dVar;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String c() {
        return "DirectApkSoSource";
    }

    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f42494b != null) {
            for (String str2 : this.f42515c) {
                Set set = (Set) this.f42513a.get(str2);
                if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                    p.f("SoLoader", str + " not found on " + str2);
                } else {
                    p(str2, str, i10, threadPolicy);
                    try {
                        i10 |= 4;
                        SoLoader.f42494b.a(str2 + File.separator + str, i10);
                        p.a("SoLoader", str + " found on " + str2);
                        return 1;
                    } catch (UnsatisfiedLinkError e10) {
                        p.h("SoLoader", str + " not found on " + str2 + " flag: " + i10, e10);
                    }
                }
            }
            return 0;
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    /* access modifiers changed from: protected */
    public void e(int i10) {
        q();
    }

    public boolean o() {
        return !this.f42515c.isEmpty();
    }

    public String toString() {
        return c() + "[root = " + this.f42515c.toString() + ']';
    }
}
