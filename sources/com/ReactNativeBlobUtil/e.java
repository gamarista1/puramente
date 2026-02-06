package com.ReactNativeBlobUtil;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.ReactNativeBlobUtil.g;
import com.ReactNativeBlobUtil.j;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rh.C6703A;
import rh.x;
import s4.C3984a;

class e {

    /* renamed from: b  reason: collision with root package name */
    static ReactApplicationContext f36648b;

    /* renamed from: c  reason: collision with root package name */
    private static final LinkedBlockingQueue f36649c;

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadPoolExecutor f36650d;

    /* renamed from: e  reason: collision with root package name */
    static LinkedBlockingQueue f36651e = new LinkedBlockingQueue();

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadPoolExecutor f36652f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static boolean f36653g = false;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final SparseArray f36654h = new SparseArray();

    /* renamed from: a  reason: collision with root package name */
    private final C6703A f36655a;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36657b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f36658c;

        a(String str, String str2, Promise promise) {
            this.f36656a = str;
            this.f36657b = str2;
            this.f36658c = promise;
        }

        public void run() {
            d.o(this.f36656a, this.f36657b, this.f36658c);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f36660a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36661b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36662c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36663d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f36664e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f36665f;

        b(ReactApplicationContext reactApplicationContext, String str, String str2, int i10, int i11, String str3) {
            this.f36660a = reactApplicationContext;
            this.f36661b = str;
            this.f36662c = str2;
            this.f36663d = i10;
            this.f36664e = i11;
            this.f36665f = str3;
        }

        public void run() {
            new l(this.f36660a).e(this.f36661b, this.f36662c, this.f36663d, this.f36664e, this.f36665f, e.f36648b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36667a;

        c(Callback callback) {
            this.f36667a = callback;
        }

        public void run() {
            d.e(this.f36667a, e.f36648b);
        }
    }

    class d implements ActivityEventListener {
        d() {
        }

        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            Integer num = c.f36641a;
            if (i10 == num.intValue() && i11 == -1) {
                ((Promise) e.f36654h.get(num.intValue())).resolve(intent.getData().toString());
                e.f36654h.remove(num.intValue());
            }
        }

        public void onNewIntent(Intent intent) {
        }
    }

    /* renamed from: com.ReactNativeBlobUtil.e$e  reason: collision with other inner class name */
    class C0602e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36671b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36672c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f36673d;

        C0602e(String str, String str2, String str3, Promise promise) {
            this.f36670a = str;
            this.f36671b = str2;
            this.f36672c = str3;
            this.f36673d = promise;
        }

        public void run() {
            d.b(this.f36670a, this.f36671b, this.f36672c, this.f36673d);
        }
    }

    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f36676b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f36677c;

        f(String str, ReadableArray readableArray, Promise promise) {
            this.f36675a = str;
            this.f36676b = readableArray;
            this.f36677c = promise;
        }

        public void run() {
            d.c(this.f36675a, this.f36676b, this.f36677c);
        }
    }

    class g implements LifecycleEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f36679a;

        g(Promise promise) {
            this.f36679a = promise;
        }

        public void onHostDestroy() {
        }

        public void onHostPause() {
        }

        public void onHostResume() {
            if (e.f36653g) {
                this.f36679a.resolve((Object) null);
            }
            e.f36648b.removeLifecycleEventListener(this);
        }
    }

    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36682b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f36683c;

        h(String str, String str2, Callback callback) {
            this.f36681a = str;
            this.f36682b = str2;
            this.f36683c = callback;
        }

        public void run() {
            d.a(this.f36681a, this.f36682b, this.f36683c);
        }
    }

    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36686b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f36687c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f36688d;

        i(String str, String str2, boolean z10, Promise promise) {
            this.f36685a = str;
            this.f36686b = str2;
            this.f36687c = z10;
            this.f36688d = promise;
        }

        public void run() {
            d.v(this.f36685a, this.f36686b, this.f36687c, this.f36688d);
        }
    }

    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36690a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f36691b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f36692c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f36693d;

        j(String str, ReadableArray readableArray, boolean z10, Promise promise) {
            this.f36690a = str;
            this.f36691b = readableArray;
            this.f36692c = z10;
            this.f36693d = promise;
        }

        public void run() {
            d.C(this.f36690a, this.f36691b, this.f36692c, this.f36693d);
        }
    }

    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36695a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36696b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36697c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f36698d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f36699e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Promise f36700f;

        k(String str, String str2, String str3, boolean z10, boolean z11, Promise promise) {
            this.f36695a = str;
            this.f36696b = str2;
            this.f36697c = str3;
            this.f36698d = z10;
            this.f36699e = z11;
            this.f36700f = promise;
        }

        public void run() {
            d.D(this.f36695a, this.f36696b, this.f36697c, this.f36698d, this.f36699e, this.f36700f);
        }
    }

    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f36702a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f36703b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f36704c;

        l(ReadableArray readableArray, ReactApplicationContext reactApplicationContext, Callback callback) {
            this.f36702a = readableArray;
            this.f36703b = reactApplicationContext;
            this.f36704c = callback;
        }

        public void run() {
            int size = this.f36702a.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = this.f36702a.getMap(i10);
                if (map.hasKey("path")) {
                    strArr[i10] = map.getString("path");
                    if (map.hasKey("mime")) {
                        strArr2[i10] = map.getString("mime");
                    } else {
                        strArr2[i10] = null;
                    }
                }
            }
            new d(this.f36703b).x(strArr, strArr2, this.f36704c);
        }
    }

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f36649c = linkedBlockingQueue;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        LinkedBlockingQueue linkedBlockingQueue2 = linkedBlockingQueue;
        f36650d = new ThreadPoolExecutor(5, 10, 5000, timeUnit, linkedBlockingQueue2);
        f36652f = new ThreadPoolExecutor(2, 10, 5000, timeUnit, linkedBlockingQueue2);
    }

    public e(ReactApplicationContext reactApplicationContext) {
        C6703A f10 = com.facebook.react.modules.network.h.f();
        this.f36655a = f10;
        ((com.facebook.react.modules.network.a) f10.p()).a(new x(new com.facebook.react.modules.network.e(reactApplicationContext)));
        f36648b = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new d());
    }

    public void A(String str, String str2, Callback callback) {
        d.u(str, str2, callback);
    }

    public void B(String str, String str2, boolean z10, Promise promise) {
        f36650d.execute(new i(str, str2, z10, promise));
    }

    public void C(String str, String str2, int i10, int i11, String str3) {
        f36652f.execute(new b(f36648b, str, str2, i10, i11, str3));
    }

    public void D(ReadableArray readableArray, Callback callback) {
        d.w(readableArray, callback);
    }

    public void E(ReadableArray readableArray, Callback callback) {
        f36650d.execute(new l(readableArray, f36648b, callback));
    }

    public void F(String str, String str2, long j10, long j11, Promise promise) {
        d.y(str, str2, j10, j11, "", promise);
    }

    public void G(String str, Callback callback) {
        d.z(str, callback);
    }

    public void H(String str, Callback callback) {
        d.B(str, callback);
    }

    public void I(String str, ReadableArray readableArray, Callback callback) {
        l.f(str, readableArray, callback);
    }

    public void J(String str, String str2, Callback callback) {
        l.g(str, str2, callback);
    }

    public void K(String str, String str2, String str3, boolean z10, boolean z11, Promise promise) {
        f36650d.execute(new k(str, str2, str3, z10, z11, promise));
    }

    public void L(String str, ReadableArray readableArray, boolean z10, Promise promise) {
        f36650d.execute(new j(str, readableArray, z10, promise));
    }

    public void M(String str, String str2, boolean z10, Callback callback) {
        new l(f36648b).h(str, str2, z10, callback);
    }

    public void N(String str, String str2, boolean z10, Promise promise) {
        if (g.f(Uri.parse(str), str2, z10, promise, f36648b)) {
            promise.resolve("Success");
        }
    }

    public void c(String str, String str2, String str3, Promise promise) {
        Uri uri;
        try {
            if (!m.e(str)) {
                ReactApplicationContext reactApplicationContext = f36648b;
                uri = androidx.core.content.d.getUriForFile(reactApplicationContext, f36648b.getPackageName() + ".provider", new File(str));
            } else {
                uri = Uri.parse(str);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, str2);
            intent.setFlags(1);
            intent.addFlags(268435456);
            if (str3 != null) {
                intent = Intent.createChooser(intent, str3);
            }
            try {
                f36648b.startActivity(intent);
                promise.resolve(Boolean.TRUE);
            } catch (ActivityNotFoundException unused) {
                promise.reject("ENOAPP", "No app installed for " + str2);
            }
            f36653g = true;
            f36648b.addLifecycleEventListener(new g(promise));
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    public void d(ReadableMap readableMap, Promise promise) {
        String str;
        String str2;
        boolean z10;
        ReadableMap readableMap2 = readableMap;
        Promise promise2 = promise;
        DownloadManager downloadManager = (DownloadManager) f36648b.getSystemService("download");
        if (readableMap2 == null || !readableMap2.hasKey("path")) {
            promise2.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload config or path missing.");
            return;
        }
        String f10 = m.f(readableMap2.getString("path"));
        if (f10 == null) {
            promise2.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload can not resolve URI:" + readableMap2.getString("path"));
            return;
        }
        try {
            WritableMap A10 = d.A(f10);
            String str3 = "";
            if (readableMap2.hasKey(com.amazon.a.a.o.b.f37461S)) {
                str = readableMap2.getString(com.amazon.a.a.o.b.f37461S);
            } else {
                str = str3;
            }
            if (readableMap2.hasKey(com.amazon.a.a.o.b.f37480c)) {
                str3 = readableMap2.getString(com.amazon.a.a.o.b.f37480c);
            }
            if (readableMap2.hasKey("mime")) {
                str2 = readableMap2.getString("mime");
            } else {
                str2 = null;
            }
            long longValue = Long.valueOf(A10.getString("size")).longValue();
            if (!readableMap2.hasKey("showNotification") || !readableMap2.getBoolean("showNotification")) {
                z10 = false;
            } else {
                z10 = true;
            }
            downloadManager.addCompletedDownload(str, str3, true, str2, f10, longValue, z10);
            promise2.resolve((Object) null);
        } catch (Exception e10) {
            promise2.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    public void e(String str, Callback callback) {
        try {
            k.f(str);
            callback.invoke(null, str);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage(), null);
        }
    }

    public void f(String str, Callback callback) {
        l.a(str, callback);
    }

    public void g(String str, String str2, Promise promise) {
        g.a(Uri.parse(str), str2, promise);
    }

    public void h(ReadableMap readableMap, String str, String str2, Promise promise) {
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
        } else if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
        } else if (str2 == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid path");
        } else {
            Uri b10 = g.b(new C3984a(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder")), g.a.valueOf(str), f36648b);
            if (b10 == null) {
                promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
            } else if (g.f(b10, str2, false, promise, f36648b)) {
                promise.resolve(b10.toString());
            }
        }
    }

    public void i(String str, String str2, Callback callback) {
        f36650d.execute(new h(str, str2, callback));
    }

    public void j(String str, String str2, String str3, Promise promise) {
        f36650d.execute(new C0602e(str, str2, str3, promise));
    }

    public void k(String str, ReadableArray readableArray, Promise promise) {
        f36650d.execute(new f(str, readableArray, promise));
    }

    public void l(ReadableMap readableMap, String str, Promise promise) {
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
            return;
        }
        if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
        }
        Uri b10 = g.b(new C3984a(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder")), g.a.valueOf(str), f36648b);
        if (b10 != null) {
            promise.resolve(b10.toString());
        } else {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
        }
    }

    public void m(Callback callback) {
        f36652f.execute(new c(callback));
    }

    public void n(String str, int i10, int i11) {
        k.f36721B.put(str, new j(true, i10, i11, j.a.Download));
    }

    public void o(String str, int i10, int i11) {
        k.f36722C.put(str, new j(true, i10, i11, j.a.Upload));
    }

    public void p(String str, Callback callback) {
        d.f(str, callback);
    }

    public void q(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        new k(readableMap, str, str2, str3, readableMap2, str4, (ReadableArray) null, this.f36655a, callback).run();
    }

    public void r(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        new k(readableMap, str, str2, str3, readableMap2, (String) null, readableArray, this.f36655a, callback).run();
    }

    public void s(String str, String str2, Promise promise) {
        g.c(Uri.parse(str), str2, promise);
    }

    public void t(String str, Promise promise) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (str != null) {
            intent.setType(str);
        } else {
            intent.setType("*/*");
        }
        SparseArray sparseArray = f36654h;
        Integer num = c.f36641a;
        sparseArray.put(num.intValue(), promise);
        f36648b.startActivityForResult(intent, num.intValue(), (Bundle) null);
    }

    public void u(Promise promise) {
        d.k(f36648b, promise);
    }

    public void v(Promise promise) {
        d.l(f36648b, promise);
    }

    public void w(String str, String str2, Promise promise) {
        f36650d.execute(new a(str, str2, promise));
    }

    public void x(String str, Promise promise) {
        d.r(str, promise);
    }

    public void y(String str, Callback callback) {
        d.s(str, callback);
    }

    public void z(String str, Promise promise) {
        d.t(str, promise);
    }
}
