package com.facebook.react.modules.permissions;

import U7.g;
import U7.h;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "PermissionsAndroid")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010(\u001a\u00020%8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/facebook/react/modules/permissions/PermissionsModule;", "Lcom/facebook/fbreact/specs/NativePermissionsAndroidSpec;", "LU7/h;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "permission", "Lcom/facebook/react/bridge/Promise;", "promise", "Llf/M;", "checkPermission", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "shouldShowRequestPermissionRationale", "requestPermission", "Lcom/facebook/react/bridge/ReadableArray;", "permissions", "requestMultiplePermissions", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "", "requestCode", "", "", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "Landroid/util/SparseArray;", "Lcom/facebook/react/bridge/Callback;", "callbacks", "Landroid/util/SparseArray;", "I", "GRANTED", "Ljava/lang/String;", "DENIED", "NEVER_ASK_AGAIN", "LU7/g;", "getPermissionAwareActivity", "()LU7/g;", "permissionAwareActivity", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionsModule extends NativePermissionsAndroidSpec implements h {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    /* access modifiers changed from: private */
    public final String DENIED = "denied";
    /* access modifiers changed from: private */
    public final String GRANTED = "granted";
    /* access modifiers changed from: private */
    public final String NEVER_ASK_AGAIN = "never_ask_again";
    private final SparseArray<Callback> callbacks = new SparseArray<>();
    private int requestCode;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f41107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableNativeMap f41108b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PermissionsModule f41109c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f41110d;

        b(ArrayList arrayList, WritableNativeMap writableNativeMap, PermissionsModule permissionsModule, Promise promise) {
            this.f41107a = arrayList;
            this.f41108b = writableNativeMap;
            this.f41109c = permissionsModule;
            this.f41110d = promise;
        }

        public void invoke(Object... objArr) {
            C6496s.h(objArr, "args");
            int[] iArr = objArr[0];
            C6496s.f(iArr, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr2 = iArr;
            g gVar = objArr[1];
            C6496s.f(gVar, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
            g gVar2 = gVar;
            int size = this.f41107a.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = this.f41107a.get(i10);
                C6496s.g(obj, "get(...)");
                String str = (String) obj;
                if (iArr2.length > i10 && iArr2[i10] == 0) {
                    this.f41108b.putString(str, this.f41109c.GRANTED);
                } else if (gVar2.shouldShowRequestPermissionRationale(str)) {
                    this.f41108b.putString(str, this.f41109c.DENIED);
                } else {
                    this.f41108b.putString(str, this.f41109c.NEVER_ASK_AGAIN);
                }
            }
            this.f41110d.resolve(this.f41108b);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f41111a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PermissionsModule f41112b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41113c;

        c(Promise promise, PermissionsModule permissionsModule, String str) {
            this.f41111a = promise;
            this.f41112b = permissionsModule;
            this.f41113c = str;
        }

        public void invoke(Object... objArr) {
            C6496s.h(objArr, "args");
            int[] iArr = objArr[0];
            C6496s.f(iArr, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr2 = iArr;
            if (iArr2.length <= 0 || iArr2[0] != 0) {
                g gVar = objArr[1];
                C6496s.f(gVar, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
                if (gVar.shouldShowRequestPermissionRationale(this.f41113c)) {
                    this.f41111a.resolve(this.f41112b.DENIED);
                } else {
                    this.f41111a.resolve(this.f41112b.NEVER_ASK_AGAIN);
                }
            } else {
                this.f41111a.resolve(this.f41112b.GRANTED);
            }
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final g getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof g) {
            return (g) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    public void checkPermission(String str, Promise promise) {
        boolean z10;
        C6496s.h(str, "permission");
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        promise.resolve(Boolean.valueOf(z10));
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        C6496s.h(strArr, "permissions");
        C6496s.h(iArr, "grantResults");
        try {
            Callback callback = this.callbacks.get(i10);
            if (callback != null) {
                callback.invoke(iArr, getPermissionAwareActivity());
                this.callbacks.remove(i10);
            } else {
                U5.a.K("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(i10));
            }
            if (this.callbacks.size() == 0) {
                return true;
            }
            return false;
        } catch (IllegalStateException e10) {
            U5.a.p("PermissionsModule", e10, "Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", new Object[0]);
            return false;
        }
    }

    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        C6496s.h(readableArray, "permissions");
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int size = readableArray.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            String string = readableArray.getString(i11);
            if (string != null) {
                if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, this.GRANTED);
                    i10++;
                } else {
                    arrayList.add(string);
                }
            }
        }
        if (readableArray.size() == i10) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            g permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new b(arrayList, writableNativeMap, this, promise));
            permissionAwareActivity.b((String[]) arrayList.toArray(new String[0]), this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e10) {
            promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e10);
        }
    }

    public void requestPermission(String str, Promise promise) {
        C6496s.h(str, "permission");
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve(this.GRANTED);
            return;
        }
        try {
            g permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new c(promise, this, str));
            permissionAwareActivity.b(new String[]{str}, this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e10) {
            promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e10);
        }
    }

    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        C6496s.h(str, "permission");
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e10) {
            promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e10);
        }
    }
}
