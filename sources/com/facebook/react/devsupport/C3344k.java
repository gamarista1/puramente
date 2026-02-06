package com.facebook.react.devsupport;

import a8.C3140a;
import a8.e;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.C3335b;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.D;
import rh.E;
import rh.y;

/* renamed from: com.facebook.react.devsupport.k  reason: case insensitive filesystem */
public class C3344k {

    /* renamed from: a  reason: collision with root package name */
    private final V7.a f40830a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a8.d f40831b;

    /* renamed from: c  reason: collision with root package name */
    private final C6703A f40832c;

    /* renamed from: d  reason: collision with root package name */
    private final C3335b f40833d;

    /* renamed from: e  reason: collision with root package name */
    private final Y f40834e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Context f40835f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final String f40836g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public a8.b f40837h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public N f40838i;

    /* renamed from: com.facebook.react.devsupport.k$a */
    class a extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f40839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40840b;

        /* renamed from: com.facebook.react.devsupport.k$a$a  reason: collision with other inner class name */
        class C0641a extends a8.c {
            C0641a() {
            }

            public void a(Object obj) {
                a.this.f40839a.d();
            }
        }

        /* renamed from: com.facebook.react.devsupport.k$a$b */
        class b extends a8.c {
            b() {
            }

            public void a(Object obj) {
                a.this.f40839a.c();
            }
        }

        /* renamed from: com.facebook.react.devsupport.k$a$c */
        class c extends a8.g {
            c() {
            }

            public void b(Object obj, a8.h hVar) {
                a.this.f40839a.a(hVar);
            }
        }

        /* renamed from: com.facebook.react.devsupport.k$a$d */
        class d implements e.b {
            d() {
            }

            public void a() {
                a.this.f40839a.e();
            }

            public void onConnected() {
                a.this.f40839a.b();
            }
        }

        a(h hVar, String str) {
            this.f40839a = hVar;
            this.f40840b = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            HashMap hashMap = new HashMap();
            hashMap.put("reload", new C0641a());
            hashMap.put("devMenu", new b());
            hashMap.put("captureHeap", new c());
            Map f10 = this.f40839a.f();
            if (f10 != null) {
                hashMap.putAll(f10);
            }
            hashMap.putAll(new C3140a().d());
            C3344k.this.f40837h = new a8.b(this.f40840b, C3344k.this.f40831b, hashMap, new d());
            C3344k.this.f40837h.f();
            return null;
        }
    }

    /* renamed from: com.facebook.react.devsupport.k$b */
    class b extends AsyncTask {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (C3344k.this.f40837h != null) {
                C3344k.this.f40837h.e();
                C3344k.this.f40837h = null;
            }
            return null;
        }
    }

    /* renamed from: com.facebook.react.devsupport.k$c */
    class c extends AsyncTask {
        c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (InspectorFlags.getFuseboxEnabled()) {
                C3344k.this.f40838i = new CxxInspectorPackagerConnection(C3344k.this.t(), (String) com.facebook.react.modules.systeminfo.a.e(C3344k.this.f40835f).get("deviceName"), C3344k.this.f40836g);
            } else {
                C3344k kVar = C3344k.this;
                kVar.f40838i = new O(kVar.t(), C3344k.this.f40836g);
            }
            C3344k.this.f40838i.connect();
            return null;
        }
    }

    /* renamed from: com.facebook.react.devsupport.k$d */
    class d extends AsyncTask {
        d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (C3344k.this.f40838i != null) {
                C3344k.this.f40838i.closeQuietly();
                C3344k.this.f40838i = null;
            }
            return null;
        }
    }

    /* renamed from: com.facebook.react.devsupport.k$g */
    private enum g {
        BUNDLE("bundle"),
        MAP("map");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f40856a;

        private g(String str) {
            this.f40856a = str;
        }

        public String b() {
            return this.f40856a;
        }
    }

    /* renamed from: com.facebook.react.devsupport.k$h */
    public interface h {
        void a(a8.h hVar);

        void b();

        void c();

        void d();

        void e();

        Map f();
    }

    public C3344k(V7.a aVar, Context context, a8.d dVar) {
        this.f40830a = aVar;
        this.f40831b = dVar;
        C6703A.a aVar2 = new C6703A.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C6703A c10 = aVar2.f(5000, timeUnit).S(0, timeUnit).W(0, timeUnit).c();
        this.f40832c = c10;
        this.f40833d = new C3335b(c10);
        this.f40834e = new Y(c10);
        this.f40835f = context;
        this.f40836g = context.getPackageName();
    }

    private String k(String str, g gVar) {
        return l(str, gVar, this.f40831b.b());
    }

    private String l(String str, g gVar, String str2) {
        return m(str, gVar, str2, false, true);
    }

    private String m(String str, g gVar, String str2, boolean z10, boolean z11) {
        String str3;
        boolean q10 = q();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : this.f40831b.a().entrySet()) {
            if (((String) entry.getValue()).length() != 0) {
                sb2.append("&" + ((String) entry.getKey()) + com.amazon.a.a.o.b.f.f37530b + Uri.encode((String) entry.getValue()));
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", new Object[]{str2, str, gVar.b(), Boolean.valueOf(q10), Boolean.valueOf(q10), Boolean.valueOf(u()), this.f40836g, z10 ? com.amazon.a.a.o.b.f37475af : com.amazon.a.a.o.b.f37476ag, z11 ? com.amazon.a.a.o.b.f37475af : com.amazon.a.a.o.b.f37476ag}));
        if (InspectorFlags.getFuseboxEnabled()) {
            str3 = "&excludeSource=true&sourcePaths=url-server";
        } else {
            str3 = "";
        }
        sb3.append(str3);
        sb3.append(sb2.toString());
        return sb3.toString();
    }

    private String n() {
        return String.format(Locale.US, "http://%s/launch-js-devtools", new Object[]{this.f40831b.b()});
    }

    private boolean q() {
        return this.f40830a.h();
    }

    private String s() {
        String str;
        String str2 = this.f40836g;
        String string = Settings.Secure.getString(this.f40835f.getContentResolver(), "android_id");
        Locale locale = Locale.US;
        if (InspectorFlags.getFuseboxEnabled()) {
            str = "fusebox";
        } else {
            str = "legacy";
        }
        return v(String.format(locale, "android-%s-%s-%s", new Object[]{str2, string, str}));
    }

    /* access modifiers changed from: private */
    public String t() {
        return String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s&device=%s", new Object[]{this.f40831b.b(), Uri.encode(com.facebook.react.modules.systeminfo.a.d()), Uri.encode(this.f40836g), Uri.encode(s())});
    }

    private boolean u() {
        return this.f40830a.g();
    }

    private static String v(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.reset();
            try {
                byte[] digest = instance.digest(str.getBytes(Constants.ENCODING));
                return String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", new Object[]{Byte.valueOf(digest[0]), Byte.valueOf(digest[1]), Byte.valueOf(digest[2]), Byte.valueOf(digest[3]), Byte.valueOf(digest[4]), Byte.valueOf(digest[5]), Byte.valueOf(digest[6]), Byte.valueOf(digest[7]), Byte.valueOf(digest[8]), Byte.valueOf(digest[9]), Byte.valueOf(digest[10]), Byte.valueOf(digest[11]), Byte.valueOf(digest[12]), Byte.valueOf(digest[13]), Byte.valueOf(digest[14]), Byte.valueOf(digest[15]), Byte.valueOf(digest[16]), Byte.valueOf(digest[17]), Byte.valueOf(digest[18]), Byte.valueOf(digest[19])});
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError("This environment doesn't support UTF-8 encoding", e10);
            }
        } catch (NoSuchAlgorithmException e11) {
            throw new AssertionError("Could not get standard SHA-256 algorithm", e11);
        }
    }

    public void A() {
        if (this.f40838i != null) {
            U5.a.I("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void B(String str, h hVar) {
        if (this.f40837h != null) {
            U5.a.I("ReactNative", "Packager connection already open, nooping.");
        } else {
            new a(hVar, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void i() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void j() {
        new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void o() {
        N n10 = this.f40838i;
        if (n10 != null) {
            n10.sendEventToAllConnections("{ \"id\":1,\"method\":\"Debugger.disable\" }");
        }
    }

    public void p(I7.b bVar, File file, String str, C3335b.c cVar) {
        this.f40833d.e(bVar, file, str, cVar);
    }

    public String r(String str) {
        return l(str, g.BUNDLE, this.f40831b.b());
    }

    public String w(String str) {
        return k(str, g.BUNDLE);
    }

    public void x(I7.g gVar) {
        String b10 = this.f40831b.b();
        if (b10 == null) {
            U5.a.I("ReactNative", "No packager host configured.");
            gVar.a(false);
            return;
        }
        this.f40834e.b(b10, gVar);
    }

    public void y() {
        FirebasePerfOkHttpClient.enqueue(this.f40832c.a(new C.a().l(n()).b()), new e());
    }

    public void z(ReactContext reactContext, String str) {
        FirebasePerfOkHttpClient.enqueue(this.f40832c.a(new C.a().l(String.format(Locale.US, "http://%s/open-debugger?device=%s", new Object[]{this.f40831b.b(), Uri.encode(s())})).g("POST", D.create((y) null, "")).b()), new f(reactContext, str));
    }

    /* renamed from: com.facebook.react.devsupport.k$e */
    class e implements C6709f {
        e() {
        }

        public void onFailure(C6708e eVar, IOException iOException) {
        }

        public void onResponse(C6708e eVar, E e10) {
        }
    }

    /* renamed from: com.facebook.react.devsupport.k$f */
    class f implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactContext f40850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f40851b;

        f(ReactContext reactContext, String str) {
            this.f40850a = reactContext;
            this.f40851b = str;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            l8.c.d(this.f40850a, this.f40851b);
        }

        public void onResponse(C6708e eVar, E e10) {
        }
    }
}
