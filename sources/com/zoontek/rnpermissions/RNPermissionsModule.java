package com.zoontek.rnpermissions;

import Q7.a;
import U7.h;
import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.Map;

@a(name = "RNPermissions")
public class RNPermissionsModule extends NativeRNPermissionsSpec implements h {
    private final SparseArray<Callback> mCallbacks = new SparseArray<>();

    public RNPermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void check(String str, Promise promise) {
        a.a(getReactApplicationContext(), str, promise);
    }

    public void checkLocationAccuracy(Promise promise) {
        a.b(promise);
    }

    public void checkMultiple(ReadableArray readableArray, Promise promise) {
        a.c(getReactApplicationContext(), readableArray, promise);
    }

    public void checkNotifications(Promise promise) {
        a.d(getReactApplicationContext(), promise);
    }

    public String getName() {
        return NativeRNPermissionsSpec.NAME;
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getTypedExportedConstants() {
        return a.e();
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        return a.i(getReactApplicationContext(), this.mCallbacks, i10, iArr);
    }

    public void openPhotoPicker(Promise promise) {
        a.j(promise);
    }

    public void openSettings(Promise promise) {
        a.k(getReactApplicationContext(), promise);
    }

    public void request(String str, Promise promise) {
        a.l(getReactApplicationContext(), this, this.mCallbacks, str, promise);
    }

    public void requestLocationAccuracy(String str, Promise promise) {
        a.m(promise);
    }

    public void requestMultiple(ReadableArray readableArray, Promise promise) {
        a.n(getReactApplicationContext(), this, this.mCallbacks, readableArray, promise);
    }

    public void requestNotifications(ReadableArray readableArray, Promise promise) {
        a.o(getReactApplicationContext(), promise);
    }

    public void shouldShowRequestRationale(String str, Promise promise) {
        a.p(getReactApplicationContext(), str, promise);
    }
}
