package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.c;
import com.bumptech.glide.m;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.g;
import com.bumptech.glide.request.h;
import g5.C3530c;
import i5.j;
import i5.p;
import java.io.File;
import java.net.URL;

public class GlideRequests extends m {
    public GlideRequests(c cVar, j jVar, p pVar, Context context) {
        super(cVar, jVar, pVar, context);
    }

    /* access modifiers changed from: protected */
    public void setRequestOptions(h hVar) {
        if (hVar instanceof GlideOptions) {
            super.setRequestOptions(hVar);
        } else {
            super.setRequestOptions(new GlideOptions().apply((a) hVar));
        }
    }

    public GlideRequests addDefaultRequestListener(g gVar) {
        return (GlideRequests) super.addDefaultRequestListener(gVar);
    }

    public synchronized GlideRequests applyDefaultRequestOptions(h hVar) {
        return (GlideRequests) super.applyDefaultRequestOptions(hVar);
    }

    public <ResourceType> GlideRequest<ResourceType> as(Class<ResourceType> cls) {
        return new GlideRequest<>(this.glide, this, cls, this.context);
    }

    public GlideRequest<Bitmap> asBitmap() {
        return (GlideRequest) super.asBitmap();
    }

    public GlideRequest<Drawable> asDrawable() {
        return (GlideRequest) super.asDrawable();
    }

    public GlideRequest<File> asFile() {
        return (GlideRequest) super.asFile();
    }

    public GlideRequest<C3530c> asGif() {
        return (GlideRequest) super.asGif();
    }

    public synchronized GlideRequests clearOnStop() {
        return (GlideRequests) super.clearOnStop();
    }

    public GlideRequest<File> download(Object obj) {
        return (GlideRequest) super.download(obj);
    }

    public GlideRequest<File> downloadOnly() {
        return (GlideRequest) super.downloadOnly();
    }

    public synchronized GlideRequests setDefaultRequestOptions(h hVar) {
        return (GlideRequests) super.setDefaultRequestOptions(hVar);
    }

    public GlideRequest<Drawable> load(Bitmap bitmap) {
        return (GlideRequest) super.load(bitmap);
    }

    public GlideRequest<Drawable> load(Drawable drawable) {
        return (GlideRequest) super.load(drawable);
    }

    public GlideRequest<Drawable> load(String str) {
        return (GlideRequest) super.load(str);
    }

    public GlideRequest<Drawable> load(Uri uri) {
        return (GlideRequest) super.load(uri);
    }

    public GlideRequest<Drawable> load(File file) {
        return (GlideRequest) super.load(file);
    }

    public GlideRequest<Drawable> load(Integer num) {
        return (GlideRequest) super.load(num);
    }

    @Deprecated
    public GlideRequest<Drawable> load(URL url) {
        return (GlideRequest) super.load(url);
    }

    public GlideRequest<Drawable> load(byte[] bArr) {
        return (GlideRequest) super.load(bArr);
    }

    public GlideRequest<Drawable> load(Object obj) {
        return (GlideRequest) super.load(obj);
    }
}
