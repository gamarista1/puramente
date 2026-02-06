package com.facebook.react.modules.image;

import X6.C3096t;
import X7.b;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import c7.C3185e;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.image.f;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import d6.C3476b;
import d6.C3477c;
import i7.C3593b;
import i7.C3594c;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q8.C3959a;

@Q7.a(name = "ImageLoader")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "LX6/t;", "imagePipeline", "Lcom/facebook/react/views/image/f;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;LX6/t;Lcom/facebook/react/views/image/f;)V", "", "requestId", "Ld6/c;", "Ljava/lang/Void;", "request", "Llf/M;", "registerRequest", "(ILd6/c;)V", "removeRequest", "(I)Ld6/c;", "", "uriString", "Lcom/facebook/react/bridge/Promise;", "promise", "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "LX6/t;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/react/views/image/f;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()LX6/t;", "setImagePipeline", "(LX6/t;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private C3096t _imagePipeline;
    private final Object callerContext;
    private f callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<C3477c> enqueuedRequests;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends C3476b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f41058a;

        b(Promise promise) {
            this.f41058a = promise;
        }

        /* access modifiers changed from: protected */
        public void e(C3477c cVar) {
            C6496s.h(cVar, "dataSource");
            this.f41058a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.d());
        }

        /* access modifiers changed from: protected */
        public void f(C3477c cVar) {
            C6496s.h(cVar, "dataSource");
            if (cVar.c()) {
                X5.a aVar = (X5.a) cVar.a();
                if (aVar != null) {
                    try {
                        Object I10 = aVar.I();
                        C6496s.g(I10, "get(...)");
                        C3185e eVar = (C3185e) I10;
                        WritableMap createMap = Arguments.createMap();
                        C6496s.g(createMap, "createMap(...)");
                        createMap.putInt(Snapshot.WIDTH, eVar.e());
                        createMap.putInt(Snapshot.HEIGHT, eVar.d());
                        this.f41058a.resolve(createMap);
                    } catch (Exception e10) {
                        this.f41058a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, (Throwable) e10);
                    } catch (Throwable th2) {
                        X5.a.E(aVar);
                        throw th2;
                    }
                    X5.a.E(aVar);
                    return;
                }
                this.f41058a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
            }
        }
    }

    public static final class c extends C3476b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f41059a;

        c(Promise promise) {
            this.f41059a = promise;
        }

        /* access modifiers changed from: protected */
        public void e(C3477c cVar) {
            C6496s.h(cVar, "dataSource");
            this.f41059a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.d());
        }

        /* access modifiers changed from: protected */
        public void f(C3477c cVar) {
            C6496s.h(cVar, "dataSource");
            if (cVar.c()) {
                X5.a aVar = (X5.a) cVar.a();
                if (aVar != null) {
                    try {
                        Object I10 = aVar.I();
                        C6496s.g(I10, "get(...)");
                        C3185e eVar = (C3185e) I10;
                        WritableMap createMap = Arguments.createMap();
                        C6496s.g(createMap, "createMap(...)");
                        createMap.putInt(Snapshot.WIDTH, eVar.e());
                        createMap.putInt(Snapshot.HEIGHT, eVar.d());
                        this.f41059a.resolve(createMap);
                    } catch (Exception e10) {
                        this.f41059a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, (Throwable) e10);
                    } catch (Throwable th2) {
                        X5.a.E(aVar);
                        throw th2;
                    }
                    X5.a.E(aVar);
                    return;
                }
                this.f41059a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
            }
        }
    }

    public static final class d extends C3476b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageLoaderModule f41060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f41062c;

        d(ImageLoaderModule imageLoaderModule, int i10, Promise promise) {
            this.f41060a = imageLoaderModule;
            this.f41061b = i10;
            this.f41062c = promise;
        }

        /* access modifiers changed from: protected */
        public void e(C3477c cVar) {
            C6496s.h(cVar, "dataSource");
            try {
                C3477c unused = this.f41060a.removeRequest(this.f41061b);
                this.f41062c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, cVar.d());
            } finally {
                cVar.close();
            }
        }

        /* access modifiers changed from: protected */
        public void f(C3477c cVar) {
            C6496s.h(cVar, "dataSource");
            if (cVar.c()) {
                try {
                    C3477c unused = this.f41060a.removeRequest(this.f41061b);
                    this.f41062c.resolve(Boolean.TRUE);
                } catch (Exception e10) {
                    this.f41062c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, (Throwable) e10);
                } catch (Throwable th2) {
                    cVar.close();
                    throw th2;
                }
                cVar.close();
            }
        }
    }

    public static final class e extends GuardedAsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageLoaderModule f41063a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f41064b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f41065c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ImageLoaderModule imageLoaderModule, ReadableArray readableArray, Promise promise, ReactApplicationContext reactApplicationContext) {
            super((ReactContext) reactApplicationContext);
            this.f41063a = imageLoaderModule;
            this.f41064b = readableArray;
            this.f41065c = promise;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            C6496s.h(voidArr, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
            WritableMap createMap = Arguments.createMap();
            C6496s.g(createMap, "createMap(...)");
            C3096t access$getImagePipeline = this.f41063a.getImagePipeline();
            int size = this.f41064b.size();
            for (int i10 = 0; i10 < size; i10++) {
                String string = this.f41064b.getString(i10);
                if (!(string == null || string.length() == 0)) {
                    Uri parse = Uri.parse(string);
                    if (access$getImagePipeline.t(parse)) {
                        createMap.putString(string, "memory");
                    } else if (access$getImagePipeline.v(parse)) {
                        createMap.putString(string, "disk");
                    }
                }
            }
            this.f41065c.resolve(createMap);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final Object getCallerContext() {
        return this.callerContext;
    }

    /* access modifiers changed from: private */
    public final C3096t getImagePipeline() {
        C3096t tVar = this._imagePipeline;
        if (tVar != null) {
            return tVar;
        }
        C3096t a10 = j6.d.a();
        C6496s.g(a10, "getImagePipeline(...)");
        return a10;
    }

    private final void registerRequest(int i10, C3477c cVar) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(i10, cVar);
            C6514M m10 = C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public final C3477c removeRequest(int i10) {
        C3477c cVar;
        synchronized (this.enqueuedRequestMonitor) {
            cVar = this.enqueuedRequests.get(i10);
            this.enqueuedRequests.remove(i10);
        }
        return cVar;
    }

    private final void setImagePipeline(C3096t tVar) {
        this._imagePipeline = tVar;
    }

    public void abortRequest(double d10) {
        C3477c removeRequest = removeRequest((int) d10);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @ReactMethod
    public void getSize(String str, Promise promise) {
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (str == null || str.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C6496s.g(reactApplicationContext, "getReactApplicationContext(...)");
        C3593b a10 = C3594c.x(new C3959a(reactApplicationContext, str, 0.0d, 0.0d, (X7.a) null, 28, (DefaultConstructorMarker) null).f()).a();
        C6496s.g(a10, "build(...)");
        getImagePipeline().k(a10, getCallerContext()).e(new b(promise), R5.a.a());
    }

    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise) {
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (str == null || str.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C6496s.g(reactApplicationContext, "getReactApplicationContext(...)");
        C3594c x10 = C3594c.x(new C3959a(reactApplicationContext, str, 0.0d, 0.0d, (X7.a) null, 28, (DefaultConstructorMarker) null).f());
        C6496s.g(x10, "newBuilderWithSource(...)");
        getImagePipeline().k(b.a.c(X7.b.f35372D, x10, readableMap, (X7.a) null, 4, (Object) null), getCallerContext()).e(new c(promise), R5.a.a());
    }

    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C3477c valueAt = this.enqueuedRequests.valueAt(i10);
                    C6496s.g(valueAt, "valueAt(...)");
                    valueAt.close();
                }
                this.enqueuedRequests.clear();
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public void prefetchImage(String str, double d10, Promise promise) {
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        int i10 = (int) d10;
        if (str == null || str.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        C3593b a10 = C3594c.x(Uri.parse(str)).a();
        C6496s.g(a10, "build(...)");
        C3477c B10 = getImagePipeline().B(a10, getCallerContext());
        d dVar = new d(this, i10, promise);
        registerRequest(i10, B10);
        B10.e(dVar, R5.a.a());
    }

    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        C6496s.h(readableArray, "uris");
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        new e(this, readableArray, promise, getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, C3096t tVar, f fVar) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
        C6496s.h(tVar, "imagePipeline");
        C6496s.h(fVar, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        setImagePipeline(tVar);
        this.callerContext = null;
    }
}
