package com.facebook.react;

import U7.b;
import U7.g;
import U7.h;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.d;

public abstract class r extends d implements b, g {

    /* renamed from: a  reason: collision with root package name */
    private final C3433v f41182a = F();

    protected r() {
    }

    /* access modifiers changed from: protected */
    public abstract C3433v F();

    public C3448z G() {
        return this.f41182a.getReactDelegate();
    }

    public void a() {
        super.onBackPressed();
    }

    public void b(String[] strArr, int i10, h hVar) {
        this.f41182a.requestPermissions(strArr, i10, hVar);
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f41182a.onActivityResult(i10, i11, intent);
    }

    public void onBackPressed() {
        if (!this.f41182a.onBackPressed()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f41182a.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41182a.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f41182a.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f41182a.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        if (this.f41182a.onKeyLongPress(i10, keyEvent) || super.onKeyLongPress(i10, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f41182a.onKeyUp(i10, keyEvent) || super.onKeyUp(i10, keyEvent)) {
            return true;
        }
        return false;
    }

    public void onNewIntent(Intent intent) {
        if (!this.f41182a.onNewIntent(intent)) {
            super.onNewIntent(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f41182a.onPause();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this.f41182a.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f41182a.onResume();
    }

    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f41182a.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f41182a.onWindowFocusChanged(z10);
    }
}
