package com.bumptech.glide;

import V4.j;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.g;
import com.bumptech.glide.request.h;
import g5.C3530c;
import i5.b;
import i5.l;
import i5.p;
import i5.q;
import i5.s;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m5.C3775b;

public class m implements ComponentCallbacks2, l {
    private static final h DECODE_TYPE_BITMAP = ((h) h.decodeTypeOf(Bitmap.class).lock());
    private static final h DECODE_TYPE_GIF = ((h) h.decodeTypeOf(C3530c.class).lock());
    private static final h DOWNLOAD_ONLY_OPTIONS = ((h) ((h) h.diskCacheStrategyOf(j.f34540c).priority(h.LOW)).skipMemoryCache(true));
    private final Runnable addSelfToLifecycle;
    private boolean clearOnStop;
    private final i5.b connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<g> defaultRequestListeners;
    protected final c glide;
    final i5.j lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private h requestOptions;
    private final q requestTracker;
    private final s targetTracker;
    private final p treeNode;

    class a implements Runnable {
        a() {
        }

        public void run() {
            m mVar = m.this;
            mVar.lifecycle.b(mVar);
        }
    }

    private class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final q f39151a;

        c(q qVar) {
            this.f39151a = qVar;
        }

        public void a(boolean z10) {
            if (z10) {
                synchronized (m.this) {
                    this.f39151a.f();
                }
            }
        }
    }

    public m(c cVar, i5.j jVar, p pVar, Context context2) {
        this(cVar, jVar, pVar, new q(), cVar.i(), context2);
    }

    private synchronized void e() {
        try {
            for (l5.j clear : this.targetTracker.j()) {
                clear(clear);
            }
            this.targetTracker.e();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private void j(l5.j jVar) {
        boolean untrack = untrack(jVar);
        d a10 = jVar.a();
        if (!untrack && !this.glide.w(jVar) && a10 != null) {
            jVar.f((d) null);
            a10.clear();
        }
    }

    private synchronized void k(h hVar) {
        this.requestOptions = (h) this.requestOptions.apply(hVar);
    }

    public m addDefaultRequestListener(g gVar) {
        this.defaultRequestListeners.add(gVar);
        return this;
    }

    public synchronized m applyDefaultRequestOptions(h hVar) {
        k(hVar);
        return this;
    }

    public l as(Class cls) {
        return new l(this.glide, this, cls, this.context);
    }

    public l asBitmap() {
        return as(Bitmap.class).apply((com.bumptech.glide.request.a) DECODE_TYPE_BITMAP);
    }

    public l asDrawable() {
        return as(Drawable.class);
    }

    public l asFile() {
        return as(File.class).apply((com.bumptech.glide.request.a) h.skipMemoryCacheOf(true));
    }

    public l asGif() {
        return as(C3530c.class).apply((com.bumptech.glide.request.a) DECODE_TYPE_GIF);
    }

    public void clear(View view) {
        clear((l5.j) new b(view));
    }

    public synchronized m clearOnStop() {
        this.clearOnStop = true;
        return this;
    }

    public l download(Object obj) {
        return downloadOnly().load(obj);
    }

    public l downloadOnly() {
        return as(File.class).apply((com.bumptech.glide.request.a) DOWNLOAD_ONLY_OPTIONS);
    }

    /* access modifiers changed from: package-private */
    public List<g> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    /* access modifiers changed from: package-private */
    public synchronized h getDefaultRequestOptions() {
        return this.requestOptions;
    }

    /* access modifiers changed from: package-private */
    public <T> n getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.k().e(cls);
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.c();
    }

    public l load(Bitmap bitmap) {
        return asDrawable().load(bitmap);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        e();
        this.requestTracker.b();
        this.lifecycle.a(this);
        this.lifecycle.a(this.connectivityMonitor);
        o5.l.w(this.addSelfToLifecycle);
        this.glide.A(this);
    }

    public void onLowMemory() {
    }

    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    public synchronized void onStop() {
        try {
            this.targetTracker.onStop();
            if (this.clearOnStop) {
                e();
            } else {
                pauseRequests();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.requestTracker.d();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        for (m pauseAllRequests : this.treeNode.a()) {
            pauseAllRequests.pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.requestTracker.e();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        for (m pauseRequests : this.treeNode.a()) {
            pauseRequests.pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.requestTracker.g();
    }

    public synchronized void resumeRequestsRecursive() {
        o5.l.b();
        resumeRequests();
        for (m resumeRequests : this.treeNode.a()) {
            resumeRequests.resumeRequests();
        }
    }

    public synchronized m setDefaultRequestOptions(h hVar) {
        setRequestOptions(hVar);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z10) {
        this.pauseAllRequestsOnTrimMemoryModerate = z10;
    }

    /* access modifiers changed from: protected */
    public synchronized void setRequestOptions(h hVar) {
        this.requestOptions = (h) ((h) hVar.clone()).autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    /* access modifiers changed from: package-private */
    public synchronized void track(l5.j jVar, d dVar) {
        this.targetTracker.k(jVar);
        this.requestTracker.h(dVar);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean untrack(l5.j jVar) {
        d a10 = jVar.a();
        if (a10 == null) {
            return true;
        }
        if (!this.requestTracker.a(a10)) {
            return false;
        }
        this.targetTracker.l(jVar);
        jVar.f((d) null);
        return true;
    }

    public void clear(l5.j jVar) {
        if (jVar != null) {
            j(jVar);
        }
    }

    public l load(Drawable drawable) {
        return asDrawable().load(drawable);
    }

    public l load(String str) {
        return asDrawable().load(str);
    }

    m(c cVar, i5.j jVar, p pVar, q qVar, i5.c cVar2, Context context2) {
        this.targetTracker = new s();
        a aVar = new a();
        this.addSelfToLifecycle = aVar;
        this.glide = cVar;
        this.lifecycle = jVar;
        this.treeNode = pVar;
        this.requestTracker = qVar;
        this.context = context2;
        i5.b a10 = cVar2.a(context2.getApplicationContext(), new c(qVar));
        this.connectivityMonitor = a10;
        cVar.v(this);
        if (o5.l.r()) {
            o5.l.v(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(a10);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(cVar.k().c());
        setRequestOptions(cVar.k().d());
    }

    public l load(Uri uri) {
        return asDrawable().load(uri);
    }

    public l load(File file) {
        return asDrawable().load(file);
    }

    public l load(Integer num) {
        return asDrawable().load(num);
    }

    public l load(URL url) {
        return asDrawable().load(url);
    }

    public l load(byte[] bArr) {
        return asDrawable().load(bArr);
    }

    public l load(Object obj) {
        return asDrawable().load(obj);
    }

    private static class b extends l5.d {
        b(View view) {
            super(view);
        }

        public void g(Drawable drawable) {
        }

        /* access modifiers changed from: protected */
        public void l(Drawable drawable) {
        }

        public void h(Object obj, C3775b bVar) {
        }
    }
}
