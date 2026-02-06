package com.facebook.soloader;

import android.content.res.AssetManager;
import android.os.StrictMode;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.soloader.e  reason: case insensitive filesystem */
public class C3454e extends E {

    /* renamed from: a  reason: collision with root package name */
    protected final String f42516a;

    /* renamed from: b  reason: collision with root package name */
    protected q f42517b = null;

    /* renamed from: c  reason: collision with root package name */
    protected Set f42518c = null;

    public C3454e(String str) {
        this.f42516a = str;
    }

    static String g(String str) {
        if ("base".equals(str)) {
            return SoLoader.f42496d.getApplicationInfo().sourceDir;
        }
        String[] strArr = SoLoader.f42496d.getApplicationInfo().splitSourceDirs;
        if (strArr != null) {
            String str2 = "split_" + str + ".apk";
            for (String str3 : strArr) {
                if (str3.endsWith(str2)) {
                    return str3;
                }
            }
            throw new IllegalStateException("Could not find " + str + " split");
        }
        throw new IllegalStateException("No splits avaiable");
    }

    public String c() {
        return "DirectSplitSoSource";
    }

    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        Set set = this.f42518c;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        } else if (set.contains(str)) {
            return h(str, i10);
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void e(int i10) {
        AssetManager assets = SoLoader.f42496d.getAssets();
        InputStream open = assets.open(this.f42516a + ".soloader-manifest");
        try {
            this.f42517b = q.b(open);
            if (open != null) {
                open.close();
            }
            this.f42518c = new HashSet(this.f42517b.f42546b);
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public String f(String str) {
        Set set = this.f42518c;
        if (set == null || this.f42517b == null) {
            throw new IllegalStateException("prepare not called");
        } else if (!set.contains(str)) {
            return null;
        } else {
            return g(this.f42516a) + "!/lib/" + this.f42517b.f42545a + "/" + str;
        }
    }

    /* access modifiers changed from: protected */
    public int h(String str, int i10) {
        String f10 = f(str);
        f10.getClass();
        System.load(f10);
        return 1;
    }
}
