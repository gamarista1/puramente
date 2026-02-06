package com.bumptech.glide.load.data;

import T4.a;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f39146a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f39147b;

    /* renamed from: c  reason: collision with root package name */
    private Object f39148c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f39147b = contentResolver;
        this.f39146a = uri;
    }

    public void b() {
        Object obj = this.f39148c;
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

    public final void d(h hVar, d.a aVar) {
        try {
            Object e10 = e(this.f39146a, this.f39147b);
            this.f39148c = e10;
            aVar.e(e10);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e11);
            }
            aVar.c(e11);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object e(Uri uri, ContentResolver contentResolver);

    public a getDataSource() {
        return a.LOCAL;
    }
}
