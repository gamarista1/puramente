package com.facebook.react;

import M7.b;
import U7.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import n7.C3863a;
import z8.C4236a;

/* renamed from: com.facebook.react.v  reason: case insensitive filesystem */
public class C3433v {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f41851a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41852b;

    /* renamed from: c  reason: collision with root package name */
    private h f41853c;

    /* renamed from: d  reason: collision with root package name */
    private Callback f41854d;

    /* renamed from: e  reason: collision with root package name */
    private C3448z f41855e;

    /* renamed from: com.facebook.react.v$a */
    class a extends C3448z {
        a(Activity activity, O o10, String str, Bundle bundle, boolean z10) {
            super(activity, o10, str, bundle, z10);
        }

        /* access modifiers changed from: protected */
        public Z b() {
            Z createRootView = C3433v.this.createRootView();
            if (createRootView == null) {
                return super.b();
            }
            return createRootView;
        }
    }

    @Deprecated
    public C3433v(Activity activity, String str) {
        this.f41851a = activity;
        this.f41852b = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        String mainComponentName = getMainComponentName();
        Bundle composeLaunchOptions = composeLaunchOptions();
        if (Build.VERSION.SDK_INT >= 26 && isWideColorGamutEnabled()) {
            this.f41851a.getWindow().setColorMode(1);
        }
        if (b.e()) {
            this.f41855e = new C3448z(getPlainActivity(), getReactHost(), mainComponentName, composeLaunchOptions);
        } else {
            this.f41855e = new a(getPlainActivity(), getReactNativeHost(), mainComponentName, composeLaunchOptions, isFabricEnabled());
        }
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i10, String[] strArr, int[] iArr, Object[] objArr) {
        h hVar = this.f41853c;
        if (hVar != null && hVar.onRequestPermissionsResult(i10, strArr, iArr)) {
            this.f41853c = null;
        }
    }

    /* access modifiers changed from: protected */
    public Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    /* access modifiers changed from: protected */
    public Z createRootView() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return (Context) C3863a.c(this.f41851a);
    }

    public ReactContext getCurrentReactContext() {
        return this.f41855e.c();
    }

    /* access modifiers changed from: protected */
    public Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.f41852b;
    }

    /* access modifiers changed from: protected */
    public Activity getPlainActivity() {
        return (Activity) getContext();
    }

    /* access modifiers changed from: protected */
    public r getReactActivity() {
        return (r) getContext();
    }

    /* access modifiers changed from: protected */
    public C3448z getReactDelegate() {
        return this.f41855e;
    }

    public A getReactHost() {
        return ((C3446x) getPlainActivity().getApplication()).b();
    }

    public J getReactInstanceManager() {
        return this.f41855e.e();
    }

    /* access modifiers changed from: protected */
    public O getReactNativeHost() {
        return ((C3446x) getPlainActivity().getApplication()).a();
    }

    /* access modifiers changed from: protected */
    public boolean isFabricEnabled() {
        return b.i();
    }

    /* access modifiers changed from: protected */
    public boolean isWideColorGamutEnabled() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void loadApp(String str) {
        this.f41855e.j(str);
        getPlainActivity().setContentView(this.f41855e.g());
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f41855e.k(i10, i11, intent, true);
    }

    public boolean onBackPressed() {
        return this.f41855e.l();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f41855e.m(configuration);
    }

    public void onCreate(Bundle bundle) {
        C4236a.o(0, "ReactActivityDelegate.onCreate::init", new C3398t(this));
    }

    public void onDestroy() {
        this.f41855e.n();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f41855e.q(i10, keyEvent);
    }

    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return this.f41855e.r(i10);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return this.f41855e.w(i10, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        return this.f41855e.s(intent);
    }

    public void onPause() {
        this.f41855e.o();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f41854d = new C3399u(this, i10, strArr, iArr);
    }

    public void onResume() {
        this.f41855e.p();
        Callback callback = this.f41854d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f41854d = null;
        }
    }

    public void onUserLeaveHint() {
        C3448z zVar = this.f41855e;
        if (zVar != null) {
            zVar.t();
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        this.f41855e.u(z10);
    }

    public void requestPermissions(String[] strArr, int i10, h hVar) {
        this.f41853c = hVar;
        getPlainActivity().requestPermissions(strArr, i10);
    }

    public C3433v(r rVar, String str) {
        this.f41851a = rVar;
        this.f41852b = str;
    }
}
