package com.facebook.react.modules.network;

import Gh.C5407h;
import Gh.C5416q;
import Gh.H;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.D;
import rh.E;
import rh.F;
import rh.n;
import rh.u;
import rh.w;
import rh.x;
import rh.y;
import rh.z;

@Q7.a(name = "Networking")
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static c customClientBuilder;
    /* access modifiers changed from: private */
    public final C6703A mClient;
    private final e mCookieHandler;
    private final a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<e> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    /* access modifiers changed from: private */
    public final List<f> mResponseHandlers;
    /* access modifiers changed from: private */
    public boolean mShuttingDown;
    private final List<g> mUriHandlers;

    class a implements j {

        /* renamed from: a  reason: collision with root package name */
        long f41068a = System.nanoTime();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41069b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f41070c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f41071d;

        a(String str, ReactApplicationContext reactApplicationContext, int i10) {
            this.f41069b = str;
            this.f41070c = reactApplicationContext;
            this.f41071d = i10;
        }

        public void a(long j10, long j11, boolean z10) {
            long nanoTime = System.nanoTime();
            if ((z10 || NetworkingModule.shouldDispatch(nanoTime, this.f41068a)) && !this.f41069b.equals(AttributeType.TEXT)) {
                p.c(this.f41070c, this.f41071d, j10, j11);
                this.f41068a = nanoTime;
            }
        }
    }

    class b implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f41073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f41074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f41076d;

        b(int i10, ReactApplicationContext reactApplicationContext, String str, boolean z10) {
            this.f41073a = i10;
            this.f41074b = reactApplicationContext;
            this.f41075c = str;
            this.f41076d = z10;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            String str;
            if (!NetworkingModule.this.mShuttingDown) {
                NetworkingModule.this.removeRequest(this.f41073a);
                if (iOException.getMessage() != null) {
                    str = iOException.getMessage();
                } else {
                    str = "Error while executing request: " + iOException.getClass().getSimpleName();
                }
                p.f(this.f41074b, this.f41073a, str, iOException);
            }
        }

        public void onResponse(C6708e eVar, E e10) {
            y yVar;
            if (!NetworkingModule.this.mShuttingDown) {
                NetworkingModule.this.removeRequest(this.f41073a);
                p.h(this.f41074b, this.f41073a, e10.o(), NetworkingModule.translateHeaders(e10.F()), e10.g0().l().toString());
                try {
                    F a10 = e10.a();
                    if ("gzip".equalsIgnoreCase(e10.v("Content-Encoding")) && a10 != null) {
                        C5416q qVar = new C5416q(a10.y());
                        String v10 = e10.v("Content-Type");
                        if (v10 != null) {
                            yVar = y.g(v10);
                        } else {
                            yVar = null;
                        }
                        a10 = F.t(yVar, -1, H.d(qVar));
                    }
                    for (f fVar : NetworkingModule.this.mResponseHandlers) {
                        if (fVar.b(this.f41075c)) {
                            p.a(this.f41074b, this.f41073a, fVar.a(a10));
                            p.g(this.f41074b, this.f41073a);
                            return;
                        }
                    }
                    if (this.f41076d) {
                        if (this.f41075c.equals(AttributeType.TEXT)) {
                            NetworkingModule.this.readWithProgress(this.f41073a, a10);
                            p.g(this.f41074b, this.f41073a);
                            return;
                        }
                    }
                    String str = "";
                    if (this.f41075c.equals(AttributeType.TEXT)) {
                        try {
                            str = a10.E();
                        } catch (IOException e11) {
                            if (!e10.g0().h().equalsIgnoreCase("HEAD")) {
                                p.f(this.f41074b, this.f41073a, e11.getMessage(), e11);
                            }
                        }
                    } else if (this.f41075c.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                        str = Base64.encodeToString(a10.b(), 2);
                    }
                    p.b(this.f41074b, this.f41073a, str);
                    p.g(this.f41074b, this.f41073a);
                } catch (IOException e12) {
                    p.f(this.f41074b, this.f41073a, e12.getMessage(), e12);
                }
            }
        }
    }

    class c implements j {

        /* renamed from: a  reason: collision with root package name */
        long f41078a = System.nanoTime();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f41079b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41080c;

        c(ReactApplicationContext reactApplicationContext, int i10) {
            this.f41079b = reactApplicationContext;
            this.f41080c = i10;
        }

        public void a(long j10, long j11, boolean z10) {
            long nanoTime = System.nanoTime();
            if (z10 || NetworkingModule.shouldDispatch(nanoTime, this.f41078a)) {
                p.d(this.f41079b, this.f41080c, j10, j11);
                this.f41078a = nanoTime;
            }
        }
    }

    class d extends GuardedAsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f41082a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, int i10) {
            super(reactContext);
            this.f41082a = i10;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            G7.a.a(NetworkingModule.this.mClient, Integer.valueOf(this.f41082a));
        }
    }

    public interface e {
        boolean a(ReadableMap readableMap);

        D b(ReadableMap readableMap, String str);
    }

    public interface f {
        WritableMap a(F f10);

        boolean b(String str);
    }

    public interface g {
        WritableMap a(Uri uri);

        boolean b(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, C6703A a10, List<Object> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            C6703A.a B10 = a10.B();
            Iterator<Object> it = list.iterator();
            if (!it.hasNext()) {
                a10 = B10.c();
            } else {
                android.support.v4.media.session.c.a(it.next());
                throw null;
            }
        }
        this.mClient = a10;
        this.mCookieHandler = new e(reactApplicationContext);
        this.mCookieJarContainer = (a) a10.p();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i10) {
        this.mRequestIds.add(Integer.valueOf(i10));
    }

    private synchronized void cancelAllRequests() {
        try {
            for (Integer intValue : this.mRequestIds) {
                cancelRequest(intValue.intValue());
            }
            this.mRequestIds.clear();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private void cancelRequest(int i10) {
        new d(getReactApplicationContext(), i10).execute(new Void[0]);
    }

    private z.a constructMultipartBody(ReadableArray readableArray, String str, int i10) {
        y yVar;
        z.a aVar = new z.a();
        aVar.f(y.g(str));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        int size = readableArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = readableArray.getMap(i11);
            u extractHeaders = extractHeaders(map.getArray("headers"), (ReadableMap) null);
            if (extractHeaders == null) {
                p.f(reactApplicationContextIfActiveOrWarn, i10, "Missing or invalid header format for FormData part.", (Throwable) null);
                return null;
            }
            String a10 = extractHeaders.a(CONTENT_TYPE_HEADER_NAME);
            if (a10 != null) {
                yVar = y.g(a10);
                extractHeaders = extractHeaders.n().i(CONTENT_TYPE_HEADER_NAME).f();
            } else {
                yVar = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                aVar.c(extractHeaders, D.create(yVar, map.getString(REQUEST_BODY_KEY_STRING)));
            } else if (!map.hasKey("uri")) {
                p.f(reactApplicationContextIfActiveOrWarn, i10, "Unrecognized FormData part.", (Throwable) null);
            } else if (yVar == null) {
                p.f(reactApplicationContextIfActiveOrWarn, i10, "Binary FormData part needs a content-type header.", (Throwable) null);
                return null;
            } else {
                String string = map.getString("uri");
                InputStream h10 = o.h(getReactApplicationContext(), string);
                if (h10 == null) {
                    p.f(reactApplicationContextIfActiveOrWarn, i10, "Could not retrieve file for uri " + string, (Throwable) null);
                    return null;
                }
                aVar.c(extractHeaders, o.c(yVar, h10));
            }
        }
        return aVar;
    }

    private u extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        u.a aVar = new u.a();
        int size = readableArray.size();
        int i10 = 0;
        while (i10 < size) {
            ReadableArray array = readableArray.getArray(i10);
            if (array != null && array.size() == 2) {
                String a10 = f.a(array.getString(0));
                String string = array.getString(1);
                if (!(a10 == null || string == null)) {
                    aVar.e(a10, string);
                    i10++;
                }
            }
            return null;
        }
        if (aVar.g(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            aVar.a(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap == null || !readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            aVar.i(CONTENT_ENCODING_HEADER_NAME);
        }
        return aVar.f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ E lambda$sendRequestInternal$0(String str, ReactApplicationContext reactApplicationContext, int i10, w.a aVar) {
        E a10 = aVar.a(aVar.request());
        return a10.T().b(new l(a10.a(), new a(str, reactApplicationContext, i10))).c();
    }

    /* access modifiers changed from: private */
    public void readWithProgress(int i10, F f10) {
        long j10;
        Charset charset;
        long j11 = -1;
        try {
            l lVar = (l) f10;
            j10 = lVar.U();
            try {
                j11 = lVar.o();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j10 = -1;
        }
        if (f10.q() == null) {
            charset = StandardCharsets.UTF_8;
        } else {
            charset = f10.q().c(StandardCharsets.UTF_8);
        }
        m mVar = new m(charset);
        InputStream a10 = f10.a();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int read = a10.read(bArr);
                if (read != -1) {
                    p.e(reactApplicationContextIfActiveOrWarn, i10, mVar.a(bArr, read), j10, j11);
                } else {
                    return;
                }
            }
        } finally {
            a10.close();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void removeRequest(int i10) {
        this.mRequestIds.remove(Integer.valueOf(i10));
    }

    public static void setCustomClientBuilder(c cVar) {
    }

    /* access modifiers changed from: private */
    public static boolean shouldDispatch(long j10, long j11) {
        return j11 + 100000000 < j10;
    }

    /* access modifiers changed from: private */
    public static WritableMap translateHeaders(u uVar) {
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < uVar.size(); i10++) {
            String g10 = uVar.g(i10);
            if (bundle.containsKey(g10)) {
                bundle.putString(g10, bundle.getString(g10) + ", " + uVar.x(i10));
            } else {
                bundle.putString(g10, uVar.x(i10));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private D wrapRequestBodyWithProgressEmitter(D d10, int i10) {
        if (d10 == null) {
            return null;
        }
        return o.e(d10, new c(getReactApplicationContextIfActiveOrWarn(), i10));
    }

    public void abortRequest(double d10) {
        int i10 = (int) d10;
        cancelRequest(i10);
        removeRequest(i10);
    }

    public void addListener(String str) {
    }

    public void addRequestBodyHandler(e eVar) {
        this.mRequestBodyHandlers.add(eVar);
    }

    public void addResponseHandler(f fVar) {
        this.mResponseHandlers.add(fVar);
    }

    public void addUriHandler(g gVar) {
        this.mUriHandlers.add(gVar);
    }

    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.d(callback);
    }

    public void initialize() {
        this.mCookieJarContainer.a(new x(this.mCookieHandler));
    }

    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.e();
        this.mCookieJarContainer.c();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    public void removeListeners(double d10) {
    }

    public void removeRequestBodyHandler(e eVar) {
        this.mRequestBodyHandlers.remove(eVar);
    }

    public void removeResponseHandler(f fVar) {
        this.mResponseHandlers.remove(fVar);
    }

    public void removeUriHandler(g gVar) {
        this.mUriHandlers.remove(gVar);
    }

    public void sendRequest(String str, String str2, double d10, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z10, double d11, boolean z11) {
        int i10 = (int) d10;
        try {
            sendRequestInternal(str, str2, i10, readableArray, readableMap, str3, z10, (int) d11, z11);
        } catch (Throwable th2) {
            Throwable th3 = th2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to send url request: ");
            String str4 = str2;
            sb2.append(str2);
            U5.a.n("Networking", sb2.toString(), th3);
            p.f(getReactApplicationContextIfActiveOrWarn(), i10, th3.getMessage(), th3);
        }
    }

    public void sendRequestInternal(String str, String str2, int i10, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z10, int i11, boolean z11) {
        e eVar;
        D d10;
        Charset charset;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri parse = Uri.parse(str2);
            for (g next : this.mUriHandlers) {
                if (next.b(parse, str3)) {
                    p.a(reactApplicationContextIfActiveOrWarn, i10, next.a(parse));
                    p.g(reactApplicationContextIfActiveOrWarn, i10);
                    return;
                }
            }
            try {
                C.a l10 = new C.a().l(str2);
                if (i10 != 0) {
                    l10.k(Integer.valueOf(i10));
                }
                C6703A.a B10 = this.mClient.B();
                applyCustomBuilder(B10);
                if (!z11) {
                    B10.h(n.f73444b);
                }
                if (z10) {
                    B10.b(new g(this, str3, reactApplicationContextIfActiveOrWarn, i10));
                }
                if (i11 != this.mClient.i()) {
                    B10.e((long) i11, TimeUnit.MILLISECONDS);
                }
                C6703A c10 = B10.c();
                u extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    p.f(reactApplicationContextIfActiveOrWarn, i10, "Unrecognized headers format", (Throwable) null);
                    return;
                }
                String a10 = extractHeaders.a(CONTENT_TYPE_HEADER_NAME);
                String a11 = extractHeaders.a(CONTENT_ENCODING_HEADER_NAME);
                l10.f(extractHeaders);
                if (readableMap != null) {
                    Iterator<e> it = this.mRequestBodyHandlers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        eVar = it.next();
                        if (eVar.a(readableMap)) {
                            break;
                        }
                    }
                }
                eVar = null;
                if (readableMap != null) {
                    Locale locale = Locale.ROOT;
                    if (!str.toLowerCase(locale).equals(com.amazon.a.a.o.b.au) && !str.toLowerCase(locale).equals("head")) {
                        if (eVar != null) {
                            d10 = eVar.b(readableMap, a10);
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                            if (a10 == null) {
                                p.f(reactApplicationContextIfActiveOrWarn, i10, "Payload is set but no content-type header specified", (Throwable) null);
                                return;
                            }
                            String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                            y g10 = y.g(a10);
                            if (o.i(a11)) {
                                d10 = o.d(g10, string);
                                if (d10 == null) {
                                    p.f(reactApplicationContextIfActiveOrWarn, i10, "Failed to gzip request body", (Throwable) null);
                                    return;
                                }
                            } else {
                                if (g10 == null) {
                                    charset = StandardCharsets.UTF_8;
                                } else {
                                    charset = g10.c(StandardCharsets.UTF_8);
                                }
                                d10 = D.create(g10, string.getBytes(charset));
                            }
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                            if (a10 == null) {
                                p.f(reactApplicationContextIfActiveOrWarn, i10, "Payload is set but no content-type header specified", (Throwable) null);
                                return;
                            } else {
                                d10 = D.create(y.g(a10), C5407h.c(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                            }
                        } else if (readableMap.hasKey("uri")) {
                            if (a10 == null) {
                                p.f(reactApplicationContextIfActiveOrWarn, i10, "Payload is set but no content-type header specified", (Throwable) null);
                                return;
                            }
                            String string2 = readableMap.getString("uri");
                            InputStream h10 = o.h(getReactApplicationContext(), string2);
                            if (h10 == null) {
                                p.f(reactApplicationContextIfActiveOrWarn, i10, "Could not retrieve file for uri " + string2, (Throwable) null);
                                return;
                            }
                            d10 = o.c(y.g(a10), h10);
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                            if (a10 == null) {
                                a10 = "multipart/form-data";
                            }
                            z.a constructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), a10, i10);
                            if (constructMultipartBody != null) {
                                d10 = constructMultipartBody.e();
                            } else {
                                return;
                            }
                        } else {
                            d10 = o.g(str);
                        }
                        l10.g(str, wrapRequestBodyWithProgressEmitter(d10, i10));
                        addRequest(i10);
                        FirebasePerfOkHttpClient.enqueue(c10.a(l10.b()), new b(i10, reactApplicationContextIfActiveOrWarn, str3, z10));
                    }
                }
                d10 = o.g(str);
                l10.g(str, wrapRequestBodyWithProgressEmitter(d10, i10));
                addRequest(i10);
                FirebasePerfOkHttpClient.enqueue(c10.a(l10.b()), new b(i10, reactApplicationContextIfActiveOrWarn, str3, z10));
            } catch (Exception e10) {
                p.f(reactApplicationContextIfActiveOrWarn, i10, e10.getMessage(), (Throwable) null);
            }
        } catch (IOException e11) {
            p.f(reactApplicationContextIfActiveOrWarn, i10, e11.getMessage(), e11);
        }
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, C6703A a10) {
        this(reactApplicationContext, str, a10, (List<Object>) null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, (String) null, h.b(reactApplicationContext), (List<Object>) null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<Object> list) {
        this(reactApplicationContext, (String) null, h.b(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, h.b(reactApplicationContext), (List<Object>) null);
    }

    private static void applyCustomBuilder(C6703A.a aVar) {
    }
}
