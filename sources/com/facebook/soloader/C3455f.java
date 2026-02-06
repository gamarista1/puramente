package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.soloader.f  reason: case insensitive filesystem */
public class C3455f extends E {

    /* renamed from: a  reason: collision with root package name */
    protected final File f42519a;

    /* renamed from: b  reason: collision with root package name */
    protected int f42520b;

    /* renamed from: c  reason: collision with root package name */
    protected final List f42521c;

    public C3455f(File file, int i10) {
        this(file, i10, new String[0]);
    }

    public String c() {
        return "DirectorySoSource";
    }

    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return g(str, i10, this.f42519a, threadPolicy);
    }

    public File f(String str) {
        File file = new File(this.f42519a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int g(String str, int i10, File file, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f42494b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        } else if (this.f42521c.contains(str)) {
            p.a("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
            return 0;
        } else {
            File f10 = f(str);
            if (f10 == null) {
                p.f("SoLoader", str + " file not found on " + file.getCanonicalPath());
                return 0;
            }
            String canonicalPath = f10.getCanonicalPath();
            p.a("SoLoader", str + " file found at " + canonicalPath);
            if ((i10 & 1) == 0 || (this.f42520b & 2) == 0) {
                if ((this.f42520b & 1) != 0) {
                    i iVar = new i(f10);
                    try {
                        t.h(str, iVar, i10, threadPolicy);
                        iVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                } else {
                    p.a("SoLoader", "Not resolving dependencies for " + str);
                }
                try {
                    SoLoader.f42494b.a(canonicalPath, i10);
                    return 1;
                } catch (UnsatisfiedLinkError e10) {
                    throw D.b(str, e10);
                }
            } else {
                p.a("SoLoader", str + " loaded implicitly");
                return 2;
            }
        }
        throw th;
    }

    public void h() {
        this.f42520b |= 1;
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f42519a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f42519a.getName();
        }
        return c() + "[root = " + str + " flags = " + this.f42520b + ']';
    }

    public C3455f(File file, int i10, String[] strArr) {
        this.f42519a = file;
        this.f42520b = i10;
        this.f42521c = Arrays.asList(strArr);
    }
}
