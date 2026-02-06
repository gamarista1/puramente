package com.dylanvann.fastimage;

import android.app.Activity;
import com.bumptech.glide.m;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

class c {

    /* renamed from: a  reason: collision with root package name */
    ReactApplicationContext f39245a;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f39246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f39247b;

        a(ReadableArray readableArray, Activity activity) {
            this.f39246a = readableArray;
            this.f39247b = activity;
        }

        public void run() {
            Object obj;
            for (int i10 = 0; i10 < this.f39246a.size(); i10++) {
                ReadableMap map = this.f39246a.getMap(i10);
                FastImageSource c10 = b.c(this.f39247b, map);
                if (map == null || !map.hasKey("uri") || map.getString("uri").isEmpty()) {
                    System.out.println("Source is null or URI is empty");
                } else {
                    m D10 = com.bumptech.glide.c.D(this.f39247b.getApplicationContext());
                    if (c10.isBase64Resource()) {
                        obj = c10.getSource();
                    } else if (c10.isResource()) {
                        obj = c10.getUri();
                    } else {
                        obj = c10.getGlideUrl();
                    }
                    D10.load(obj).apply((com.bumptech.glide.request.a) b.d(this.f39247b, c10, map)).preload();
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f39249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f39250b;

        b(Activity activity, Promise promise) {
            this.f39249a = activity;
            this.f39250b = promise;
        }

        public void run() {
            com.bumptech.glide.c.e(this.f39249a.getApplicationContext()).c();
            this.f39250b.resolve((Object) null);
        }
    }

    c(ReactApplicationContext reactApplicationContext) {
        this.f39245a = reactApplicationContext;
    }

    private Activity c() {
        return this.f39245a.getCurrentActivity();
    }

    public void a(Promise promise) {
        Activity c10 = c();
        if (c10 == null) {
            promise.resolve((Object) null);
            return;
        }
        com.bumptech.glide.c.e(c10.getApplicationContext()).b();
        promise.resolve((Object) null);
    }

    public void b(Promise promise) {
        Activity c10 = c();
        if (c10 == null) {
            promise.resolve((Object) null);
        } else {
            c10.runOnUiThread(new b(c10, promise));
        }
    }

    public void d(ReadableArray readableArray) {
        Activity c10 = c();
        if (c10 != null) {
            c10.runOnUiThread(new a(readableArray, c10));
        }
    }
}
