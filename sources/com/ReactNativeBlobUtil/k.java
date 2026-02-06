package com.ReactNativeBlobUtil;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.u;
import rh.w;

public class k extends BroadcastReceiver implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public static HashMap f36720A = new HashMap();

    /* renamed from: B  reason: collision with root package name */
    static HashMap f36721B = new HashMap();

    /* renamed from: C  reason: collision with root package name */
    static HashMap f36722C = new HashMap();

    /* renamed from: D  reason: collision with root package name */
    static rh.k f36723D = new rh.k();

    /* renamed from: z  reason: collision with root package name */
    public static HashMap f36724z = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    b f36725a;

    /* renamed from: b  reason: collision with root package name */
    String f36726b;

    /* renamed from: c  reason: collision with root package name */
    String f36727c;

    /* renamed from: d  reason: collision with root package name */
    String f36728d;

    /* renamed from: e  reason: collision with root package name */
    String f36729e;

    /* renamed from: f  reason: collision with root package name */
    String f36730f;

    /* renamed from: g  reason: collision with root package name */
    String f36731g;

    /* renamed from: h  reason: collision with root package name */
    ReadableArray f36732h;

    /* renamed from: i  reason: collision with root package name */
    ReadableMap f36733i;

    /* renamed from: j  reason: collision with root package name */
    Callback f36734j;

    /* renamed from: k  reason: collision with root package name */
    long f36735k;

    /* renamed from: l  reason: collision with root package name */
    long f36736l;

    /* renamed from: m  reason: collision with root package name */
    a f36737m;

    /* renamed from: n  reason: collision with root package name */
    g f36738n;

    /* renamed from: o  reason: collision with root package name */
    i f36739o;

    /* renamed from: p  reason: collision with root package name */
    h f36740p = h.Auto;

    /* renamed from: q  reason: collision with root package name */
    WritableMap f36741q;

    /* renamed from: r  reason: collision with root package name */
    boolean f36742r = false;

    /* renamed from: s  reason: collision with root package name */
    ArrayList f36743s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    C6703A f36744t;

    /* renamed from: u  reason: collision with root package name */
    boolean f36745u;

    /* renamed from: v  reason: collision with root package name */
    private final int f36746v = 1314;

    /* renamed from: w  reason: collision with root package name */
    private ScheduledExecutorService f36747w = Executors.newScheduledThreadPool(1);
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public Future f36748x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public Handler f36749y = new Handler(new a());

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            float f10;
            if (message.what == 1314 && message.getData().getLong("downloadManagerId") == k.this.f36736l) {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(new long[]{k.this.f36736l});
                Cursor query2 = ((DownloadManager) e.f36648b.getApplicationContext().getSystemService("download")).query(query);
                if (query2 != null && query2.moveToFirst()) {
                    long j10 = (long) query2.getInt(query2.getColumnIndex("bytes_so_far"));
                    long j11 = query2.getLong(query2.getColumnIndex("total_size"));
                    query2.close();
                    j l10 = k.l(k.this.f36726b);
                    if (j11 > 0) {
                        f10 = (float) (j10 / j11);
                    } else {
                        f10 = 0.0f;
                    }
                    if (l10 != null && l10.a(f10)) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("taskId", String.valueOf(k.this.f36726b));
                        createMap.putString("written", String.valueOf(j10));
                        createMap.putString("total", String.valueOf(j11));
                        createMap.putString("chunk", "");
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e.f36648b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", createMap);
                    }
                    if (j11 == j10) {
                        k.this.f36748x.cancel(true);
                    }
                }
            }
            return true;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Message obtainMessage = k.this.f36749y.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putLong("downloadManagerId", k.this.f36736l);
            obtainMessage.setData(bundle);
            obtainMessage.what = 1314;
            k.this.f36749y.sendMessage(obtainMessage);
        }
    }

    class c implements w {
        c() {
        }

        public E intercept(w.a aVar) {
            k.this.f36743s.add(aVar.request().l().toString());
            return aVar.a(aVar.request());
        }
    }

    class d implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f36753a;

        d(C c10) {
            this.f36753a = c10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: r4.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: r4.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: r4.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: r4.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: r4.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: r4.b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public rh.E intercept(rh.w.a r14) {
            /*
                r13 = this;
                r0 = 1
                r1 = 0
                rh.C r2 = r13.f36753a     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                rh.E r1 = r14.a(r2)     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                int[] r2 = com.ReactNativeBlobUtil.k.f.f36757b     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.k r3 = com.ReactNativeBlobUtil.k.this     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.k$i r3 = r3.f36739o     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                int r3 = r3.ordinal()     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                r2 = r2[r3]     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                if (r2 == r0) goto L_0x0050
                r3 = 2
                if (r2 == r3) goto L_0x0033
                r4.a r2 = new r4.a     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.facebook.react.bridge.ReactApplicationContext r3 = com.ReactNativeBlobUtil.e.f36648b     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.k r4 = com.ReactNativeBlobUtil.k.this     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                java.lang.String r4 = r4.f36726b     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                rh.F r5 = r1.a()     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.k r6 = com.ReactNativeBlobUtil.k.this     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.b r6 = r6.f36725a     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                java.lang.Boolean r6 = r6.f36638m     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                boolean r6 = r6.booleanValue()     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                r2.<init>(r3, r4, r5, r6)     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                goto L_0x0069
            L_0x0033:
                r4.b r2 = new r4.b     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.facebook.react.bridge.ReactApplicationContext r8 = com.ReactNativeBlobUtil.e.f36648b     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.k r3 = com.ReactNativeBlobUtil.k.this     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                java.lang.String r9 = r3.f36726b     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                rh.F r10 = r1.a()     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.k r3 = com.ReactNativeBlobUtil.k.this     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                java.lang.String r11 = r3.f36730f     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.b r3 = r3.f36725a     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                java.lang.Boolean r3 = r3.f36636k     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                boolean r12 = r3.booleanValue()     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                r7 = r2
                r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                goto L_0x0069
            L_0x0050:
                r4.a r2 = new r4.a     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.facebook.react.bridge.ReactApplicationContext r3 = com.ReactNativeBlobUtil.e.f36648b     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.k r4 = com.ReactNativeBlobUtil.k.this     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                java.lang.String r4 = r4.f36726b     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                rh.F r5 = r1.a()     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.k r6 = com.ReactNativeBlobUtil.k.this     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                com.ReactNativeBlobUtil.b r6 = r6.f36725a     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                java.lang.Boolean r6 = r6.f36638m     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                boolean r6 = r6.booleanValue()     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                r2.<init>(r3, r4, r5, r6)     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
            L_0x0069:
                rh.E$a r3 = r1.T()     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                rh.E$a r2 = r3.b(r2)     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                rh.E r14 = r2.c()     // Catch:{ SocketException -> 0x0086, SocketTimeoutException -> 0x007c, Exception -> 0x0076 }
                return r14
            L_0x0076:
                if (r1 == 0) goto L_0x008f
                r1.close()
                goto L_0x008f
            L_0x007c:
                com.ReactNativeBlobUtil.k r2 = com.ReactNativeBlobUtil.k.this
                r2.f36742r = r0
                if (r1 == 0) goto L_0x008f
                r1.close()
                goto L_0x008f
            L_0x0086:
                com.ReactNativeBlobUtil.k r2 = com.ReactNativeBlobUtil.k.this
                r2.f36742r = r0
                if (r1 == 0) goto L_0x008f
                r1.close()
            L_0x008f:
                rh.C r0 = r14.request()
                rh.E r14 = r14.a(r0)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.k.d.intercept(rh.w$a):rh.E");
        }
    }

    class e implements C6709f {
        e() {
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            k.f(k.this.f36726b);
            k kVar = k.this;
            if (kVar.f36741q == null) {
                kVar.f36741q = Arguments.createMap();
            }
            if (iOException.getClass().equals(SocketTimeoutException.class)) {
                k.this.f36741q.putBoolean("timeout", true);
                k.this.o("The request timed out.", null, null);
            } else {
                k.this.o(iOException.getLocalizedMessage(), null, null);
            }
            k.this.q();
        }

        public void onResponse(C6708e eVar, E e10) {
            String str;
            String str2;
            boolean z10;
            boolean z11;
            ReadableMap readableMap = k.this.f36725a.f36630e;
            if (readableMap != null) {
                String str3 = "";
                if (readableMap.hasKey(com.amazon.a.a.o.b.f37461S)) {
                    str = k.this.f36725a.f36630e.getString(com.amazon.a.a.o.b.f37461S);
                } else {
                    str = str3;
                }
                if (readableMap.hasKey(com.amazon.a.a.o.b.f37480c)) {
                    str3 = readableMap.getString(com.amazon.a.a.o.b.f37480c);
                }
                String str4 = str3;
                if (readableMap.hasKey("mime")) {
                    str2 = readableMap.getString("mime");
                } else {
                    str2 = "text/plain";
                }
                String str5 = str2;
                if (readableMap.hasKey("mediaScannable")) {
                    z10 = readableMap.getBoolean("mediaScannable");
                } else {
                    z10 = false;
                }
                if (readableMap.hasKey("notification")) {
                    z11 = readableMap.getBoolean("notification");
                } else {
                    z11 = false;
                }
                k kVar = k.this;
                ((DownloadManager) e.f36648b.getSystemService("download")).addCompletedDownload(str, str4, z10, str5, kVar.f36730f, kVar.f36735k, z11);
            }
            k.this.g(e10);
        }
    }

    static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36756a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f36757b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                com.ReactNativeBlobUtil.k$i[] r0 = com.ReactNativeBlobUtil.k.i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36757b = r0
                r1 = 1
                com.ReactNativeBlobUtil.k$i r2 = com.ReactNativeBlobUtil.k.i.KeepInMemory     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f36757b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ReactNativeBlobUtil.k$i r3 = com.ReactNativeBlobUtil.k.i.FileStorage     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.ReactNativeBlobUtil.k$g[] r2 = com.ReactNativeBlobUtil.k.g.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f36756a = r2
                com.ReactNativeBlobUtil.k$g r3 = com.ReactNativeBlobUtil.k.g.SingleFile     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f36756a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.ReactNativeBlobUtil.k$g r2 = com.ReactNativeBlobUtil.k.g.AsIs     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f36756a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.ReactNativeBlobUtil.k$g r1 = com.ReactNativeBlobUtil.k.g.Form     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f36756a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.ReactNativeBlobUtil.k$g r1 = com.ReactNativeBlobUtil.k.g.WithoutBody     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.k.f.<clinit>():void");
        }
    }

    enum g {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    enum h {
        Auto,
        UTF8,
        BASE64
    }

    enum i {
        KeepInMemory,
        FileStorage
    }

    public k(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, C6703A a10, Callback callback) {
        this.f36727c = str2.toUpperCase(Locale.ROOT);
        b bVar = new b(readableMap);
        this.f36725a = bVar;
        this.f36726b = str;
        this.f36728d = str3;
        this.f36733i = readableMap2;
        this.f36734j = callback;
        this.f36729e = str4;
        this.f36732h = readableArray;
        this.f36744t = a10;
        this.f36745u = false;
        if ((bVar.f36626a.booleanValue() || this.f36725a.f36628c != null) && !r()) {
            this.f36739o = i.FileStorage;
        } else {
            this.f36739o = i.KeepInMemory;
        }
        if (str4 != null) {
            this.f36738n = g.SingleFile;
        } else if (readableArray != null) {
            this.f36738n = g.Form;
        } else {
            this.f36738n = g.WithoutBody;
        }
    }

    public static void f(String str) {
        C6708e eVar = (C6708e) f36724z.get(str);
        if (eVar != null) {
            eVar.cancel();
            f36724z.remove(str);
        }
        if (f36720A.containsKey(str)) {
            ((DownloadManager) e.f36648b.getApplicationContext().getSystemService("download")).remove(new long[]{((Long) f36720A.get(str)).longValue()});
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:51|52|53|54|(1:56)(1:57)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0173 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0179 A[Catch:{ IOException -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018a A[Catch:{ IOException -> 0x01a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(rh.E r11) {
        /*
            r10 = this;
            boolean r0 = r10.p(r11)
            com.facebook.react.bridge.WritableMap r1 = r10.n(r11, r0)
            com.facebook.react.bridge.WritableMap r2 = r1.copy()
            r10.h(r2)
            com.facebook.react.bridge.WritableMap r2 = r10.n(r11, r0)
            r10.h(r2)
            int[] r2 = com.ReactNativeBlobUtil.k.f.f36757b
            com.ReactNativeBlobUtil.k$i r3 = r10.f36739o
            int r3 = r3.ordinal()
            r2 = r2[r3]
            java.lang.String r3 = "UTF-8"
            java.lang.String r4 = "path"
            java.lang.String r5 = "utf8"
            r6 = 0
            r7 = 2
            r8 = 1
            r9 = 0
            if (r2 == r8) goto L_0x00e8
            if (r2 == r7) goto L_0x0057
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0048 }
            rh.F r2 = r11.a()     // Catch:{ IOException -> 0x0048 }
            byte[] r2 = r2.b()     // Catch:{ IOException -> 0x0048 }
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0048 }
            com.facebook.react.bridge.WritableMap r2 = r1.copy()     // Catch:{ IOException -> 0x0048 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r5, r0, r2}     // Catch:{ IOException -> 0x0048 }
            r10.o(r0)     // Catch:{ IOException -> 0x0048 }
            goto L_0x01af
        L_0x0048:
            java.lang.String r0 = "ReactNativeBlobUtil failed to encode response data to UTF8 string."
            com.facebook.react.bridge.WritableMap r1 = r1.copy()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            r10.o(r0)
            goto L_0x01af
        L_0x0057:
            rh.F r0 = r11.a()
            r0.b()     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            r4.b r0 = (r4.b) r0     // Catch:{ ClassCastException -> 0x0090 }
            if (r0 == 0) goto L_0x0077
            boolean r0 = r0.F()
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "Download interrupted."
            com.facebook.react.bridge.WritableMap r1 = r1.copy()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            r10.o(r0)
            goto L_0x01af
        L_0x0077:
            java.lang.String r0 = r10.f36730f
            java.lang.String r2 = "?append=true"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)
            r10.f36730f = r0
            com.facebook.react.bridge.WritableMap r1 = r1.copy()
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r4, r0, r1}
            r10.o(r0)
            goto L_0x01af
        L_0x0090:
            if (r0 == 0) goto L_0x00da
            Gh.g r11 = r0.y()     // Catch:{ IOException -> 0x00b9 }
            Gh.e r11 = r11.x()     // Catch:{ IOException -> 0x00b9 }
            long r2 = r11.B0()     // Catch:{ IOException -> 0x00b9 }
            r4 = 0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a6
            r11 = r8
            goto L_0x00a7
        L_0x00a6:
            r11 = r6
        L_0x00a7:
            long r2 = r0.o()     // Catch:{ IOException -> 0x00b9 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b0
            r6 = r8
        L_0x00b0:
            if (r11 == 0) goto L_0x00bd
            if (r6 == 0) goto L_0x00bd
            java.lang.String r9 = r0.E()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00bd
        L_0x00b9:
            r11 = move-exception
            r11.printStackTrace()
        L_0x00bd:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Unexpected FileStorage response file: "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.facebook.react.bridge.WritableMap r0 = r1.copy()
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0}
            r10.o(r11)
            goto L_0x00e7
        L_0x00da:
            java.lang.String r11 = "Unexpected FileStorage response with no file."
            com.facebook.react.bridge.WritableMap r0 = r1.copy()
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0}
            r10.o(r11)
        L_0x00e7:
            return
        L_0x00e8:
            if (r0 == 0) goto L_0x0131
            com.ReactNativeBlobUtil.b r0 = r10.f36725a     // Catch:{ IOException -> 0x01a2 }
            java.lang.Boolean r0 = r0.f36635j     // Catch:{ IOException -> 0x01a2 }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x01a2 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = r10.f36726b     // Catch:{ IOException -> 0x01a2 }
            java.lang.String r0 = com.ReactNativeBlobUtil.d.n(r0)     // Catch:{ IOException -> 0x01a2 }
            rh.F r2 = r11.a()     // Catch:{ IOException -> 0x01a2 }
            java.io.InputStream r2 = r2.a()     // Catch:{ IOException -> 0x01a2 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01a2 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x01a2 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x01a2 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x01a2 }
            r5 = 10240(0x2800, float:1.4349E-41)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x01a2 }
        L_0x0110:
            int r7 = r2.read(r5)     // Catch:{ IOException -> 0x01a2 }
            r8 = -1
            if (r7 == r8) goto L_0x011b
            r3.write(r5, r6, r7)     // Catch:{ IOException -> 0x01a2 }
            goto L_0x0110
        L_0x011b:
            r2.close()     // Catch:{ IOException -> 0x01a2 }
            r3.flush()     // Catch:{ IOException -> 0x01a2 }
            r3.close()     // Catch:{ IOException -> 0x01a2 }
            com.facebook.react.bridge.WritableMap r2 = r1.copy()     // Catch:{ IOException -> 0x01a2 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r4, r0, r2}     // Catch:{ IOException -> 0x01a2 }
            r10.o(r0)     // Catch:{ IOException -> 0x01a2 }
            goto L_0x01af
        L_0x0131:
            rh.F r0 = r11.a()     // Catch:{ IOException -> 0x01a2 }
            byte[] r0 = r0.b()     // Catch:{ IOException -> 0x01a2 }
            boolean r2 = r10.r()     // Catch:{ IOException -> 0x01a2 }
            if (r2 != 0) goto L_0x019a
            com.ReactNativeBlobUtil.k$h r2 = r10.f36740p     // Catch:{ IOException -> 0x01a2 }
            com.ReactNativeBlobUtil.k$h r4 = com.ReactNativeBlobUtil.k.h.BASE64     // Catch:{ IOException -> 0x01a2 }
            java.lang.String r6 = "base64"
            if (r2 != r4) goto L_0x0157
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r7)     // Catch:{ IOException -> 0x01a2 }
            com.facebook.react.bridge.WritableMap r2 = r1.copy()     // Catch:{ IOException -> 0x01a2 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r6, r0, r2}     // Catch:{ IOException -> 0x01a2 }
            r10.o(r0)     // Catch:{ IOException -> 0x01a2 }
            return
        L_0x0157:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r3)     // Catch:{ CharacterCodingException -> 0x0173 }
            java.nio.charset.CharsetDecoder r3 = r2.newDecoder()     // Catch:{ CharacterCodingException -> 0x0173 }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ CharacterCodingException -> 0x0173 }
            r3.decode(r4)     // Catch:{ CharacterCodingException -> 0x0173 }
            java.lang.String r3 = new java.lang.String     // Catch:{ CharacterCodingException -> 0x0173 }
            r3.<init>(r0, r2)     // Catch:{ CharacterCodingException -> 0x0173 }
            java.lang.Object[] r2 = new java.lang.Object[]{r9, r5, r3}     // Catch:{ CharacterCodingException -> 0x0173 }
            r10.o(r2)     // Catch:{ CharacterCodingException -> 0x0173 }
            goto L_0x01af
        L_0x0173:
            com.ReactNativeBlobUtil.k$h r2 = r10.f36740p     // Catch:{ IOException -> 0x01a2 }
            com.ReactNativeBlobUtil.k$h r3 = com.ReactNativeBlobUtil.k.h.UTF8     // Catch:{ IOException -> 0x01a2 }
            if (r2 != r3) goto L_0x018a
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01a2 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01a2 }
            com.facebook.react.bridge.WritableMap r0 = r1.copy()     // Catch:{ IOException -> 0x01a2 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r5, r2, r0}     // Catch:{ IOException -> 0x01a2 }
            r10.o(r0)     // Catch:{ IOException -> 0x01a2 }
            goto L_0x01af
        L_0x018a:
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r7)     // Catch:{ IOException -> 0x01a2 }
            com.facebook.react.bridge.WritableMap r2 = r1.copy()     // Catch:{ IOException -> 0x01a2 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r6, r0, r2}     // Catch:{ IOException -> 0x01a2 }
            r10.o(r0)     // Catch:{ IOException -> 0x01a2 }
            goto L_0x01af
        L_0x019a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01a2 }
            java.lang.String r2 = "Write file with transform was specified but the shared file transformer is not set"
            r0.<init>(r2)     // Catch:{ IOException -> 0x01a2 }
            throw r0     // Catch:{ IOException -> 0x01a2 }
        L_0x01a2:
            java.lang.String r0 = "ReactNativeBlobUtil failed to encode response data to BASE64 string."
            com.facebook.react.bridge.WritableMap r1 = r1.copy()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            r10.o(r0)
        L_0x01af:
            rh.F r11 = r11.a()
            r11.close()
            r10.q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.k.g(rh.E):void");
    }

    private void h(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e.f36648b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilState", writableMap);
    }

    private String j(HashMap hashMap, String str) {
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) hashMap.get(str.toLowerCase(Locale.ROOT));
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    private String k(u uVar, String str) {
        String a10 = uVar.a(str);
        if (a10 != null) {
            return a10;
        }
        Locale locale = Locale.ROOT;
        if (uVar.a(str.toLowerCase(locale)) == null) {
            return "";
        }
        return uVar.a(str.toLowerCase(locale));
    }

    public static j l(String str) {
        if (!f36721B.containsKey(str)) {
            return null;
        }
        return (j) f36721B.get(str);
    }

    public static j m(String str) {
        if (!f36722C.containsKey(str)) {
            return null;
        }
        return (j) f36722C.get(str);
    }

    private WritableMap n(E e10, boolean z10) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("status", e10.o());
        createMap.putString("state", "2");
        createMap.putString("taskId", this.f36726b);
        createMap.putBoolean("timeout", this.f36742r);
        WritableMap createMap2 = Arguments.createMap();
        for (int i10 = 0; i10 < e10.F().size(); i10++) {
            createMap2.putString(e10.F().g(i10), e10.F().x(i10));
        }
        WritableArray createArray = Arguments.createArray();
        Iterator it = this.f36743s.iterator();
        while (it.hasNext()) {
            createArray.pushString((String) it.next());
        }
        createMap.putArray("redirects", createArray);
        createMap.putMap("headers", createMap2);
        u F10 = e10.F();
        if (z10) {
            createMap.putString("respType", "blob");
        } else if (k(F10, "content-type").equalsIgnoreCase("text/")) {
            createMap.putString("respType", AttributeType.TEXT);
        } else if (k(F10, "content-type").contains("application/json")) {
            createMap.putString("respType", "json");
        } else {
            createMap.putString("respType", "");
        }
        return createMap;
    }

    /* access modifiers changed from: private */
    public void o(Object... objArr) {
        if (!this.f36745u) {
            this.f36734j.invoke(objArr);
            this.f36745u = true;
        }
    }

    private boolean p(E e10) {
        boolean z10;
        String k10 = k(e10.F(), "Content-Type");
        boolean equalsIgnoreCase = k10.equalsIgnoreCase("text/");
        boolean equalsIgnoreCase2 = k10.equalsIgnoreCase("application/json");
        if (this.f36725a.f36640o != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f36725a.f36640o.size()) {
                    break;
                }
                Locale locale = Locale.ROOT;
                if (k10.toLowerCase(locale).contains(this.f36725a.f36640o.getString(i10).toLowerCase(locale))) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if ((equalsIgnoreCase2 || !equalsIgnoreCase) && !z10) {
                return false;
            }
            return true;
        }
        z10 = false;
        if (equalsIgnoreCase2) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void q() {
        if (f36724z.containsKey(this.f36726b)) {
            f36724z.remove(this.f36726b);
        }
        if (f36720A.containsKey(this.f36726b)) {
            f36720A.remove(this.f36726b);
        }
        if (f36722C.containsKey(this.f36726b)) {
            f36722C.remove(this.f36726b);
        }
        if (f36721B.containsKey(this.f36726b)) {
            f36721B.remove(this.f36726b);
        }
        a aVar = this.f36737m;
        if (aVar != null) {
            aVar.b();
        }
    }

    private boolean r() {
        if (!this.f36725a.f36627b.booleanValue() || (!this.f36725a.f36626a.booleanValue() && this.f36725a.f36628c == null)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013b A[SYNTHETIC, Splitter:B:42:0x013b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            r11 = 0
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "android.intent.action.DOWNLOAD_COMPLETE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x016d
            com.facebook.react.bridge.ReactApplicationContext r0 = com.ReactNativeBlobUtil.e.f36648b
            android.content.Context r0 = r0.getApplicationContext()
            android.os.Bundle r12 = r12.getExtras()
            java.lang.String r1 = "extra_download_id"
            long r1 = r12.getLong(r1)
            long r3 = r10.f36736l
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x016d
            r10.q()
            android.app.DownloadManager$Query r12 = new android.app.DownloadManager$Query
            r12.<init>()
            long r1 = r10.f36736l
            r3 = 1
            long[] r3 = new long[r3]
            r3[r11] = r1
            r12.setFilterById(r3)
            java.lang.String r1 = "download"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.DownloadManager r1 = (android.app.DownloadManager) r1
            r1.query(r12)
            android.database.Cursor r12 = r1.query(r12)
            java.lang.String r2 = "Download manager failed to download from  "
            r3 = 0
            if (r12 != 0) goto L_0x0067
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r12 = r10.f36728d
            r11.append(r12)
            java.lang.String r12 = ". Query was unsuccessful "
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r3, r3}
            r10.o(r11)
            return
        L_0x0067:
            boolean r4 = r12.moveToFirst()     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x00d0
            java.lang.String r4 = "status"
            int r4 = r12.getColumnIndex(r4)     // Catch:{ all -> 0x009f }
            int r4 = r12.getInt(r4)     // Catch:{ all -> 0x009f }
            r5 = 16
            if (r4 != r5) goto L_0x00a2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r11.<init>()     // Catch:{ all -> 0x009f }
            r11.append(r2)     // Catch:{ all -> 0x009f }
            java.lang.String r0 = r10.f36728d     // Catch:{ all -> 0x009f }
            r11.append(r0)     // Catch:{ all -> 0x009f }
            java.lang.String r0 = ". Status Code = "
            r11.append(r0)     // Catch:{ all -> 0x009f }
            r11.append(r4)     // Catch:{ all -> 0x009f }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x009f }
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r3, r3}     // Catch:{ all -> 0x009f }
            r10.o(r11)     // Catch:{ all -> 0x009f }
            r12.close()
            return
        L_0x009f:
            r11 = move-exception
            goto L_0x0169
        L_0x00a2:
            java.lang.String r2 = "local_uri"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x00d0
            android.net.Uri r5 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x009f }
            android.content.ContentResolver r4 = r0.getContentResolver()     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "_data"
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch:{ all -> 0x009f }
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x00d0
            r0.moveToFirst()     // Catch:{ all -> 0x009f }
            java.lang.String r11 = r0.getString(r11)     // Catch:{ all -> 0x009f }
            r0.close()     // Catch:{ all -> 0x009f }
            goto L_0x00d1
        L_0x00d0:
            r11 = r3
        L_0x00d1:
            r12.close()
            com.ReactNativeBlobUtil.b r12 = r10.f36725a
            com.facebook.react.bridge.ReadableMap r12 = r12.f36630e
            java.lang.String r0 = "path"
            boolean r12 = r12.hasKey(r0)
            if (r12 != 0) goto L_0x013b
            com.ReactNativeBlobUtil.b r12 = r10.f36725a
            com.facebook.react.bridge.ReadableMap r12 = r12.f36630e
            java.lang.String r2 = "storeLocal"
            boolean r12 = r12.hasKey(r2)
            if (r12 == 0) goto L_0x00ed
            goto L_0x013b
        L_0x00ed:
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r12 < r2) goto L_0x0127
            com.ReactNativeBlobUtil.b r12 = r10.f36725a
            com.facebook.react.bridge.ReadableMap r12 = r12.f36630e
            java.lang.String r2 = "storeInDownloads"
            boolean r12 = r12.hasKey(r2)
            if (r12 == 0) goto L_0x0127
            com.ReactNativeBlobUtil.b r12 = r10.f36725a
            com.facebook.react.bridge.ReadableMap r12 = r12.f36630e
            boolean r12 = r12.getBoolean(r2)
            if (r12 == 0) goto L_0x0127
            long r11 = r10.f36736l
            android.net.Uri r11 = r1.getUriForDownloadedFile(r11)
            if (r11 != 0) goto L_0x011b
            java.lang.String r11 = "Download manager could not resolve downloaded file uri."
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0, r3}
            r10.o(r11)
            goto L_0x016d
        L_0x011b:
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r11 = new java.lang.Object[]{r3, r0, r11}
            r10.o(r11)
            goto L_0x016d
        L_0x0127:
            if (r11 != 0) goto L_0x0133
            java.lang.String r11 = "Download manager could not resolve downloaded file path."
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0, r3}
            r10.o(r11)
            goto L_0x016d
        L_0x0133:
            java.lang.Object[] r11 = new java.lang.Object[]{r3, r0, r11}
            r10.o(r11)
            goto L_0x016d
        L_0x013b:
            java.lang.String r11 = r10.f36731g     // Catch:{ Exception -> 0x0150 }
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x0150 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x0150 }
            boolean r12 = r12.exists()     // Catch:{ Exception -> 0x0150 }
            if (r12 == 0) goto L_0x0152
            java.lang.Object[] r11 = new java.lang.Object[]{r3, r0, r11}     // Catch:{ Exception -> 0x0150 }
            r10.o(r11)     // Catch:{ Exception -> 0x0150 }
            goto L_0x016d
        L_0x0150:
            r11 = move-exception
            goto L_0x015a
        L_0x0152:
            java.lang.Exception r11 = new java.lang.Exception     // Catch:{ Exception -> 0x0150 }
            java.lang.String r12 = "Download manager download failed, the file does not downloaded to destination."
            r11.<init>(r12)     // Catch:{ Exception -> 0x0150 }
            throw r11     // Catch:{ Exception -> 0x0150 }
        L_0x015a:
            r11.printStackTrace()
            java.lang.String r11 = r11.getLocalizedMessage()
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r3}
            r10.o(r11)
            goto L_0x016d
        L_0x0169:
            r12.close()
            throw r11
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.k.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:195:0x04b7 A[Catch:{ Exception -> 0x0331 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0568 A[Catch:{ Exception -> 0x0331 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05b0 A[Catch:{ Exception -> 0x0331 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            java.lang.String r0 = "post"
            java.lang.String r1 = "Content-Type"
            com.facebook.react.bridge.ReactApplicationContext r2 = com.ReactNativeBlobUtil.e.f36648b
            android.content.Context r2 = r2.getApplicationContext()
            com.ReactNativeBlobUtil.b r3 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r3 = r3.f36630e
            java.lang.String r4 = "."
            java.lang.String r5 = "path"
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x029c
            java.lang.String r9 = "useDownloadManager"
            boolean r3 = r3.hasKey(r9)
            if (r3 == 0) goto L_0x029c
            com.ReactNativeBlobUtil.b r3 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r3 = r3.f36630e
            boolean r3 = r3.getBoolean(r9)
            if (r3 == 0) goto L_0x029c
            java.lang.String r0 = r15.f36728d
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.app.DownloadManager$Request r1 = new android.app.DownloadManager$Request
            r1.<init>(r0)
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r3 = "notification"
            boolean r0 = r0.hasKey(r3)
            if (r0 == 0) goto L_0x004e
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            boolean r0 = r0.getBoolean(r3)
            if (r0 == 0) goto L_0x004e
            r1.setNotificationVisibility(r7)
            goto L_0x0051
        L_0x004e:
            r1.setNotificationVisibility(r6)
        L_0x0051:
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r3 = "title"
            boolean r0 = r0.hasKey(r3)
            if (r0 == 0) goto L_0x0068
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r0 = r0.getString(r3)
            r1.setTitle(r0)
        L_0x0068:
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r7 = "description"
            boolean r0 = r0.hasKey(r7)
            if (r0 == 0) goto L_0x007f
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r0 = r0.getString(r7)
            r1.setDescription(r0)
        L_0x007f:
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            boolean r0 = r0.hasKey(r5)
            java.lang.String r7 = "file://"
            java.lang.String r9 = "'"
            java.lang.String r10 = "Failed to create parent directory of '"
            if (r0 == 0) goto L_0x00ec
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r0 = r0.getString(r5)
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            java.io.File r11 = r5.getParentFile()
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x00d4
            if (r11 == 0) goto L_0x00d4
            boolean r5 = r11.exists()
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r11.mkdirs()
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r11.exists()
            if (r5 != 0) goto L_0x00d4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r8, r8}
            r15.o(r0)
            return
        L_0x00d4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r1.setDestinationUri(r5)
            r15.f36731g = r0
        L_0x00ec:
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r5 = "storeLocal"
            boolean r0 = r0.hasKey(r5)
            if (r0 == 0) goto L_0x017c
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            boolean r0 = r0.getBoolean(r5)
            if (r0 == 0) goto L_0x017c
            com.facebook.react.bridge.ReactApplicationContext r0 = com.ReactNativeBlobUtil.e.f36648b
            java.util.Map r0 = com.ReactNativeBlobUtil.d.m(r0)
            java.lang.String r5 = "DownloadDir"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            java.io.File r11 = r5.getParentFile()
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x0164
            if (r11 == 0) goto L_0x0164
            boolean r5 = r11.exists()
            if (r5 != 0) goto L_0x0164
            boolean r5 = r11.mkdirs()
            if (r5 != 0) goto L_0x0164
            boolean r5 = r11.exists()
            if (r5 != 0) goto L_0x0164
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r8, r8}
            r15.o(r0)
            return
        L_0x0164:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r1.setDestinationUri(r5)
            r15.f36731g = r0
        L_0x017c:
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r5 = "mime"
            boolean r0 = r0.hasKey(r5)
            if (r0 == 0) goto L_0x0193
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r0 = r0.getString(r5)
            r1.setMimeType(r0)
        L_0x0193:
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r5 = "mediaScannable"
            boolean r0 = r0.hasKey(r5)
            if (r0 == 0) goto L_0x01ac
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            boolean r0 = r0.getBoolean(r5)
            if (r0 == 0) goto L_0x01ac
            r1.allowScanningByMediaScanner()
        L_0x01ac:
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L_0x0207
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r5 = "storeInDownloads"
            boolean r0 = r0.hasKey(r5)
            if (r0 == 0) goto L_0x0207
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            boolean r0 = r0.getBoolean(r5)
            if (r0 == 0) goto L_0x0207
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            com.facebook.react.bridge.ReadableMap r0 = r0.f36630e
            java.lang.String r0 = r0.getString(r3)
            if (r0 == 0) goto L_0x01d8
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x01e0
        L_0x01d8:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
        L_0x01e0:
            com.ReactNativeBlobUtil.b r3 = r15.f36725a
            java.lang.String r3 = r3.f36629d
            if (r3 == 0) goto L_0x0202
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0202
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r4)
            com.ReactNativeBlobUtil.b r0 = r15.f36725a
            java.lang.String r0 = r0.f36629d
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x0202:
            java.lang.String r3 = android.os.Environment.DIRECTORY_DOWNLOADS
            r1.setDestinationInExternalPublicDir(r3, r0)
        L_0x0207:
            com.facebook.react.bridge.ReadableMap r0 = r15.f36733i
            com.facebook.react.bridge.ReadableMapKeySetIterator r0 = r0.keySetIterator()
        L_0x020d:
            boolean r3 = r0.hasNextKey()
            if (r3 == 0) goto L_0x0221
            java.lang.String r3 = r0.nextKey()
            com.facebook.react.bridge.ReadableMap r4 = r15.f36733i
            java.lang.String r4 = r4.getString(r3)
            r1.addRequestHeader(r3, r4)
            goto L_0x020d
        L_0x0221:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0252 }
            java.lang.String r3 = r15.f36728d     // Catch:{ MalformedURLException -> 0x0252 }
            r0.<init>(r3)     // Catch:{ MalformedURLException -> 0x0252 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0252 }
            r3.<init>()     // Catch:{ MalformedURLException -> 0x0252 }
            java.lang.String r4 = r0.getProtocol()     // Catch:{ MalformedURLException -> 0x0252 }
            r3.append(r4)     // Catch:{ MalformedURLException -> 0x0252 }
            java.lang.String r4 = "://"
            r3.append(r4)     // Catch:{ MalformedURLException -> 0x0252 }
            java.lang.String r0 = r0.getHost()     // Catch:{ MalformedURLException -> 0x0252 }
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x0252 }
            java.lang.String r0 = r3.toString()     // Catch:{ MalformedURLException -> 0x0252 }
            android.webkit.CookieManager r3 = android.webkit.CookieManager.getInstance()     // Catch:{ MalformedURLException -> 0x0252 }
            java.lang.String r0 = r3.getCookie(r0)     // Catch:{ MalformedURLException -> 0x0252 }
            java.lang.String r3 = "Cookie"
            r1.addRequestHeader(r3, r0)     // Catch:{ MalformedURLException -> 0x0252 }
            goto L_0x0256
        L_0x0252:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0256:
            java.lang.String r0 = "download"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.DownloadManager r0 = (android.app.DownloadManager) r0
            long r0 = r0.enqueue(r1)
            r15.f36736l = r0
            java.util.HashMap r3 = f36720A
            java.lang.String r4 = r15.f36726b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r4, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            java.lang.String r3 = "android.intent.action.DOWNLOAD_COMPLETE"
            if (r0 < r1) goto L_0x0280
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r3)
            android.content.Intent unused = r2.registerReceiver(r15, r0, r6)
            goto L_0x0288
        L_0x0280:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r3)
            r2.registerReceiver(r15, r0)
        L_0x0288:
            java.util.concurrent.ScheduledExecutorService r4 = r15.f36747w
            com.ReactNativeBlobUtil.k$b r5 = new com.ReactNativeBlobUtil.k$b
            r5.<init>()
            r8 = 100
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6 = 0
            java.util.concurrent.ScheduledFuture r0 = r4.scheduleAtFixedRate(r5, r6, r8, r10)
            r15.f36748x = r0
            return
        L_0x029c:
            java.lang.String r2 = r15.f36726b
            com.ReactNativeBlobUtil.b r3 = r15.f36725a
            java.lang.String r3 = r3.f36629d
            java.lang.String r9 = ""
            if (r3 == 0) goto L_0x02c1
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x02ad
            goto L_0x02c1
        L_0x02ad:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            com.ReactNativeBlobUtil.b r4 = r15.f36725a
            java.lang.String r4 = r4.f36629d
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x02c2
        L_0x02c1:
            r3 = r9
        L_0x02c2:
            com.ReactNativeBlobUtil.b r4 = r15.f36725a
            java.lang.String r4 = r4.f36633h
            if (r4 == 0) goto L_0x02fa
            java.lang.String r2 = com.ReactNativeBlobUtil.m.b(r4)
            if (r2 != 0) goto L_0x02d0
            java.lang.String r2 = r15.f36726b
        L_0x02d0:
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = com.ReactNativeBlobUtil.d.n(r2)
            r10.append(r11)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            r4.<init>(r10)
            boolean r10 = r4.exists()
            if (r10 == 0) goto L_0x02fa
            java.lang.String r0 = r4.getAbsolutePath()
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r5, r0}
            r15.o(r0)
            return
        L_0x02fa:
            com.ReactNativeBlobUtil.b r4 = r15.f36725a
            java.lang.String r5 = r4.f36628c
            if (r5 == 0) goto L_0x0303
            r15.f36730f = r5
            goto L_0x0320
        L_0x0303:
            java.lang.Boolean r4 = r4.f36626a
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0320
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = com.ReactNativeBlobUtil.d.n(r2)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r15.f36730f = r2
        L_0x0320:
            com.ReactNativeBlobUtil.b r2 = r15.f36725a     // Catch:{ Exception -> 0x0331 }
            java.lang.Boolean r2 = r2.f36631f     // Catch:{ Exception -> 0x0331 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0331 }
            if (r2 == 0) goto L_0x0334
            rh.A r2 = r15.f36744t     // Catch:{ Exception -> 0x0331 }
            rh.A$a r2 = com.ReactNativeBlobUtil.m.c(r2)     // Catch:{ Exception -> 0x0331 }
            goto L_0x033a
        L_0x0331:
            r0 = move-exception
            goto L_0x05f9
        L_0x0334:
            rh.A r2 = r15.f36744t     // Catch:{ Exception -> 0x0331 }
            rh.A$a r2 = r2.B()     // Catch:{ Exception -> 0x0331 }
        L_0x033a:
            com.ReactNativeBlobUtil.b r3 = r15.f36725a     // Catch:{ Exception -> 0x0331 }
            java.lang.Boolean r3 = r3.f36632g     // Catch:{ Exception -> 0x0331 }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0331 }
            r4 = 0
            if (r3 == 0) goto L_0x0390
            com.facebook.react.bridge.ReactApplicationContext r3 = com.ReactNativeBlobUtil.e.f36648b     // Catch:{ Exception -> 0x0331 }
            java.lang.String r5 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r5)     // Catch:{ Exception -> 0x0331 }
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch:{ Exception -> 0x0331 }
            android.net.Network[] r5 = r3.getAllNetworks()     // Catch:{ Exception -> 0x0331 }
            int r10 = r5.length     // Catch:{ Exception -> 0x0331 }
            r11 = r4
        L_0x0355:
            if (r11 >= r10) goto L_0x0383
            r12 = r5[r11]     // Catch:{ Exception -> 0x0331 }
            android.net.NetworkInfo r13 = r3.getNetworkInfo(r12)     // Catch:{ Exception -> 0x0331 }
            android.net.NetworkCapabilities r14 = r3.getNetworkCapabilities(r12)     // Catch:{ Exception -> 0x0331 }
            if (r14 == 0) goto L_0x0380
            if (r13 != 0) goto L_0x0366
            goto L_0x0380
        L_0x0366:
            boolean r13 = r13.isConnected()     // Catch:{ Exception -> 0x0331 }
            if (r13 != 0) goto L_0x036d
            goto L_0x0380
        L_0x036d:
            boolean r13 = r14.hasTransport(r7)     // Catch:{ Exception -> 0x0331 }
            if (r13 == 0) goto L_0x0380
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY     // Catch:{ Exception -> 0x0331 }
            r2.R(r3)     // Catch:{ Exception -> 0x0331 }
            javax.net.SocketFactory r3 = r12.getSocketFactory()     // Catch:{ Exception -> 0x0331 }
            r2.U(r3)     // Catch:{ Exception -> 0x0331 }
            goto L_0x0390
        L_0x0380:
            int r11 = r11 + 1
            goto L_0x0355
        L_0x0383:
            java.lang.String r0 = "No available WiFi connections."
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r8, r8}     // Catch:{ Exception -> 0x0331 }
            r15.o(r0)     // Catch:{ Exception -> 0x0331 }
            r15.q()     // Catch:{ Exception -> 0x0331 }
            return
        L_0x0390:
            rh.C$a r3 = new rh.C$a     // Catch:{ Exception -> 0x0331 }
            r3.<init>()     // Catch:{ Exception -> 0x0331 }
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x03a0 }
            java.lang.String r10 = r15.f36728d     // Catch:{ MalformedURLException -> 0x03a0 }
            r5.<init>(r10)     // Catch:{ MalformedURLException -> 0x03a0 }
            r3.m(r5)     // Catch:{ MalformedURLException -> 0x03a0 }
            goto L_0x03a4
        L_0x03a0:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ Exception -> 0x0331 }
        L_0x03a4:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x0331 }
            r5.<init>()     // Catch:{ Exception -> 0x0331 }
            com.facebook.react.bridge.ReadableMap r10 = r15.f36733i     // Catch:{ Exception -> 0x0331 }
            if (r10 == 0) goto L_0x03f4
            com.facebook.react.bridge.ReadableMapKeySetIterator r10 = r10.keySetIterator()     // Catch:{ Exception -> 0x0331 }
        L_0x03b1:
            boolean r11 = r10.hasNextKey()     // Catch:{ Exception -> 0x0331 }
            if (r11 == 0) goto L_0x03f4
            java.lang.String r11 = r10.nextKey()     // Catch:{ Exception -> 0x0331 }
            com.facebook.react.bridge.ReadableMap r12 = r15.f36733i     // Catch:{ Exception -> 0x0331 }
            java.lang.String r12 = r12.getString(r11)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r13 = "RNFB-Response"
            boolean r13 = r11.equalsIgnoreCase(r13)     // Catch:{ Exception -> 0x0331 }
            if (r13 == 0) goto L_0x03e3
            java.lang.String r11 = "base64"
            boolean r11 = r12.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x0331 }
            if (r11 == 0) goto L_0x03d6
            com.ReactNativeBlobUtil.k$h r11 = com.ReactNativeBlobUtil.k.h.BASE64     // Catch:{ Exception -> 0x0331 }
            r15.f36740p = r11     // Catch:{ Exception -> 0x0331 }
            goto L_0x03b1
        L_0x03d6:
            java.lang.String r11 = "utf8"
            boolean r11 = r12.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x0331 }
            if (r11 == 0) goto L_0x03b1
            com.ReactNativeBlobUtil.k$h r11 = com.ReactNativeBlobUtil.k.h.UTF8     // Catch:{ Exception -> 0x0331 }
            r15.f36740p = r11     // Catch:{ Exception -> 0x0331 }
            goto L_0x03b1
        L_0x03e3:
            java.util.Locale r13 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x0331 }
            java.lang.String r14 = r11.toLowerCase(r13)     // Catch:{ Exception -> 0x0331 }
            r3.e(r14, r12)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r11 = r11.toLowerCase(r13)     // Catch:{ Exception -> 0x0331 }
            r5.put(r11, r12)     // Catch:{ Exception -> 0x0331 }
            goto L_0x03b1
        L_0x03f4:
            java.lang.String r10 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            boolean r10 = r10.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r11 = "content-type"
            if (r10 != 0) goto L_0x0419
            java.lang.String r10 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            java.lang.String r12 = "put"
            boolean r10 = r10.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0331 }
            if (r10 != 0) goto L_0x0419
            java.lang.String r10 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            java.lang.String r12 = "patch"
            boolean r10 = r10.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0331 }
            if (r10 == 0) goto L_0x0413
            goto L_0x0419
        L_0x0413:
            com.ReactNativeBlobUtil.k$g r1 = com.ReactNativeBlobUtil.k.g.WithoutBody     // Catch:{ Exception -> 0x0331 }
            r15.f36738n = r1     // Catch:{ Exception -> 0x0331 }
            goto L_0x049f
        L_0x0419:
            java.lang.String r10 = r15.j(r5, r1)     // Catch:{ Exception -> 0x0331 }
            java.util.Locale r12 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x0331 }
            java.lang.String r10 = r10.toLowerCase(r12)     // Catch:{ Exception -> 0x0331 }
            com.facebook.react.bridge.ReadableArray r13 = r15.f36732h     // Catch:{ Exception -> 0x0331 }
            if (r13 == 0) goto L_0x042c
            com.ReactNativeBlobUtil.k$g r13 = com.ReactNativeBlobUtil.k.g.Form     // Catch:{ Exception -> 0x0331 }
            r15.f36738n = r13     // Catch:{ Exception -> 0x0331 }
            goto L_0x0443
        L_0x042c:
            if (r10 == 0) goto L_0x0434
            boolean r13 = r10.isEmpty()     // Catch:{ Exception -> 0x0331 }
            if (r13 == 0) goto L_0x0443
        L_0x0434:
            boolean r13 = r10.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0331 }
            if (r13 != 0) goto L_0x043f
            java.lang.String r13 = "application/octet-stream"
            r3.e(r1, r13)     // Catch:{ Exception -> 0x0331 }
        L_0x043f:
            com.ReactNativeBlobUtil.k$g r13 = com.ReactNativeBlobUtil.k.g.SingleFile     // Catch:{ Exception -> 0x0331 }
            r15.f36738n = r13     // Catch:{ Exception -> 0x0331 }
        L_0x0443:
            java.lang.String r13 = r15.f36729e     // Catch:{ Exception -> 0x0331 }
            if (r13 == 0) goto L_0x049f
            java.lang.String r14 = "ReactNativeBlobUtil-file://"
            boolean r13 = r13.startsWith(r14)     // Catch:{ Exception -> 0x0331 }
            if (r13 != 0) goto L_0x049b
            java.lang.String r13 = r15.f36729e     // Catch:{ Exception -> 0x0331 }
            java.lang.String r14 = "ReactNativeBlobUtil-content://"
            boolean r13 = r13.startsWith(r14)     // Catch:{ Exception -> 0x0331 }
            if (r13 == 0) goto L_0x045a
            goto L_0x049b
        L_0x045a:
            java.lang.String r13 = r10.toLowerCase(r12)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r14 = ";base64"
            boolean r13 = r13.contains(r14)     // Catch:{ Exception -> 0x0331 }
            if (r13 != 0) goto L_0x0478
            java.lang.String r12 = r10.toLowerCase(r12)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r13 = "application/octet"
            boolean r12 = r12.startsWith(r13)     // Catch:{ Exception -> 0x0331 }
            if (r12 == 0) goto L_0x0473
            goto L_0x0478
        L_0x0473:
            com.ReactNativeBlobUtil.k$g r1 = com.ReactNativeBlobUtil.k.g.AsIs     // Catch:{ Exception -> 0x0331 }
            r15.f36738n = r1     // Catch:{ Exception -> 0x0331 }
            goto L_0x049f
        L_0x0478:
            java.lang.String r12 = ";base64"
            java.lang.String r10 = r10.replace(r12, r9)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r12 = ";BASE64"
            java.lang.String r9 = r10.replace(r12, r9)     // Catch:{ Exception -> 0x0331 }
            boolean r10 = r5.containsKey(r11)     // Catch:{ Exception -> 0x0331 }
            if (r10 == 0) goto L_0x048d
            r5.put(r11, r9)     // Catch:{ Exception -> 0x0331 }
        L_0x048d:
            boolean r10 = r5.containsKey(r1)     // Catch:{ Exception -> 0x0331 }
            if (r10 == 0) goto L_0x0496
            r5.put(r1, r9)     // Catch:{ Exception -> 0x0331 }
        L_0x0496:
            com.ReactNativeBlobUtil.k$g r1 = com.ReactNativeBlobUtil.k.g.SingleFile     // Catch:{ Exception -> 0x0331 }
            r15.f36738n = r1     // Catch:{ Exception -> 0x0331 }
            goto L_0x049f
        L_0x049b:
            com.ReactNativeBlobUtil.k$g r1 = com.ReactNativeBlobUtil.k.g.SingleFile     // Catch:{ Exception -> 0x0331 }
            r15.f36738n = r1     // Catch:{ Exception -> 0x0331 }
        L_0x049f:
            java.lang.String r1 = "Transfer-Encoding"
            java.lang.String r1 = r15.j(r5, r1)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r9 = "chunked"
            boolean r1 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0331 }
            int[] r9 = com.ReactNativeBlobUtil.k.f.f36756a     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.k$g r10 = r15.f36738n     // Catch:{ Exception -> 0x0331 }
            int r10 = r10.ordinal()     // Catch:{ Exception -> 0x0331 }
            r9 = r9[r10]     // Catch:{ Exception -> 0x0331 }
            if (r9 == r7) goto L_0x0568
            if (r9 == r6) goto L_0x053d
            r5 = 3
            if (r9 == r5) goto L_0x04f2
            r1 = 4
            if (r9 == r1) goto L_0x04c1
            goto L_0x0592
        L_0x04c1:
            java.lang.String r1 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x04e5
            java.lang.String r0 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            java.lang.String r1 = "put"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x04e5
            java.lang.String r0 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            java.lang.String r1 = "patch"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0331 }
            if (r0 == 0) goto L_0x04de
            goto L_0x04e5
        L_0x04de:
            java.lang.String r0 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            r3.g(r0, r8)     // Catch:{ Exception -> 0x0331 }
            goto L_0x0592
        L_0x04e5:
            java.lang.String r0 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            byte[] r1 = new byte[r4]     // Catch:{ Exception -> 0x0331 }
            rh.D r1 = rh.D.create((rh.y) r8, (byte[]) r1)     // Catch:{ Exception -> 0x0331 }
            r3.g(r0, r1)     // Catch:{ Exception -> 0x0331 }
            goto L_0x0592
        L_0x04f2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0331 }
            r0.<init>()     // Catch:{ Exception -> 0x0331 }
            java.lang.String r5 = "ReactNativeBlobUtil-"
            r0.append(r5)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r5 = r15.f36726b     // Catch:{ Exception -> 0x0331 }
            r0.append(r5)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r5 = new com.ReactNativeBlobUtil.a     // Catch:{ Exception -> 0x0331 }
            java.lang.String r6 = r15.f36726b     // Catch:{ Exception -> 0x0331 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r1 = r5.a(r1)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.k$g r5 = r15.f36738n     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r1 = r1.m(r5)     // Catch:{ Exception -> 0x0331 }
            com.facebook.react.bridge.ReadableArray r5 = r15.f36732h     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r1 = r1.j(r5)     // Catch:{ Exception -> 0x0331 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0331 }
            r5.<init>()     // Catch:{ Exception -> 0x0331 }
            java.lang.String r6 = "multipart/form-data; boundary="
            r5.append(r6)     // Catch:{ Exception -> 0x0331 }
            r5.append(r0)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0331 }
            rh.y r0 = rh.y.g(r0)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r0 = r1.l(r0)     // Catch:{ Exception -> 0x0331 }
            r15.f36737m = r0     // Catch:{ Exception -> 0x0331 }
            java.lang.String r1 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            r3.g(r1, r0)     // Catch:{ Exception -> 0x0331 }
            goto L_0x0592
        L_0x053d:
            com.ReactNativeBlobUtil.a r0 = new com.ReactNativeBlobUtil.a     // Catch:{ Exception -> 0x0331 }
            java.lang.String r6 = r15.f36726b     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r0 = r0.a(r1)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.k$g r1 = r15.f36738n     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r0 = r0.m(r1)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r1 = r15.f36729e     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r0 = r0.k(r1)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r1 = r15.j(r5, r11)     // Catch:{ Exception -> 0x0331 }
            rh.y r1 = rh.y.g(r1)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r0 = r0.l(r1)     // Catch:{ Exception -> 0x0331 }
            r15.f36737m = r0     // Catch:{ Exception -> 0x0331 }
            java.lang.String r1 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            r3.g(r1, r0)     // Catch:{ Exception -> 0x0331 }
            goto L_0x0592
        L_0x0568:
            com.ReactNativeBlobUtil.a r0 = new com.ReactNativeBlobUtil.a     // Catch:{ Exception -> 0x0331 }
            java.lang.String r6 = r15.f36726b     // Catch:{ Exception -> 0x0331 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r0 = r0.a(r1)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.k$g r1 = r15.f36738n     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r0 = r0.m(r1)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r1 = r15.f36729e     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r0 = r0.k(r1)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r1 = r15.j(r5, r11)     // Catch:{ Exception -> 0x0331 }
            rh.y r1 = rh.y.g(r1)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.a r0 = r0.l(r1)     // Catch:{ Exception -> 0x0331 }
            r15.f36737m = r0     // Catch:{ Exception -> 0x0331 }
            java.lang.String r1 = r15.f36727c     // Catch:{ Exception -> 0x0331 }
            r3.g(r1, r0)     // Catch:{ Exception -> 0x0331 }
        L_0x0592:
            rh.C r0 = r3.b()     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.k$c r1 = new com.ReactNativeBlobUtil.k$c     // Catch:{ Exception -> 0x0331 }
            r1.<init>()     // Catch:{ Exception -> 0x0331 }
            r2.b(r1)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.k$d r1 = new com.ReactNativeBlobUtil.k$d     // Catch:{ Exception -> 0x0331 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0331 }
            r2.a(r1)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.b r1 = r15.f36725a     // Catch:{ Exception -> 0x0331 }
            long r5 = r1.f36637l     // Catch:{ Exception -> 0x0331 }
            r8 = 0
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x05bc
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0331 }
            r2.f(r5, r1)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.b r3 = r15.f36725a     // Catch:{ Exception -> 0x0331 }
            long r5 = r3.f36637l     // Catch:{ Exception -> 0x0331 }
            r2.S(r5, r1)     // Catch:{ Exception -> 0x0331 }
        L_0x05bc:
            rh.k r1 = f36723D     // Catch:{ Exception -> 0x0331 }
            r2.g(r1)     // Catch:{ Exception -> 0x0331 }
            r2.T(r4)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.b r1 = r15.f36725a     // Catch:{ Exception -> 0x0331 }
            java.lang.Boolean r1 = r1.f36639n     // Catch:{ Exception -> 0x0331 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0331 }
            r2.j(r1)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.b r1 = r15.f36725a     // Catch:{ Exception -> 0x0331 }
            java.lang.Boolean r1 = r1.f36639n     // Catch:{ Exception -> 0x0331 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0331 }
            r2.k(r1)     // Catch:{ Exception -> 0x0331 }
            r2.T(r7)     // Catch:{ Exception -> 0x0331 }
            rh.A$a r1 = i(r2)     // Catch:{ Exception -> 0x0331 }
            rh.A r1 = r1.c()     // Catch:{ Exception -> 0x0331 }
            rh.e r0 = r1.a(r0)     // Catch:{ Exception -> 0x0331 }
            java.util.HashMap r1 = f36724z     // Catch:{ Exception -> 0x0331 }
            java.lang.String r2 = r15.f36726b     // Catch:{ Exception -> 0x0331 }
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0331 }
            com.ReactNativeBlobUtil.k$e r1 = new com.ReactNativeBlobUtil.k$e     // Catch:{ Exception -> 0x0331 }
            r1.<init>()     // Catch:{ Exception -> 0x0331 }
            com.google.firebase.perf.network.FirebasePerfOkHttpClient.enqueue(r0, r1)     // Catch:{ Exception -> 0x0331 }
            goto L_0x0622
        L_0x05f9:
            r0.printStackTrace()
            r15.q()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ReactNativeBlobUtil request error: "
            r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.Throwable r0 = r0.getCause()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r15.o(r0)
        L_0x0622:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.k.run():void");
    }

    public static C6703A.a i(C6703A.a aVar) {
        return aVar;
    }
}
