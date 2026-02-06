package com.bumptech.glide.load.data;

import T4.a;
import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f39122a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f39123b;

    /* renamed from: c  reason: collision with root package name */
    private Object f39124c;

    public b(AssetManager assetManager, String str) {
        this.f39123b = assetManager;
        this.f39122a = str;
    }

    public void b() {
        Object obj = this.f39124c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(Object obj);

    public void cancel() {
    }

    public void d(h hVar, d.a aVar) {
        try {
            Object e10 = e(this.f39123b, this.f39122a);
            this.f39124c = e10;
            aVar.e(e10);
        } catch (IOException e11) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e11);
            }
            aVar.c(e11);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object e(AssetManager assetManager, String str);

    public a getDataSource() {
        return a.LOCAL;
    }
}
