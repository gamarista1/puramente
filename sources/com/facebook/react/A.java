package com.facebook.react;

import I7.e;
import J7.a;
import U7.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;

public interface A {
    a d(String str);

    K7.a e(Context context, String str, Bundle bundle);

    e f();

    void g(Activity activity, b bVar);

    boolean h();

    ReactContext i();

    void j(B b10);

    void k(Context context);

    void l(Activity activity);

    void m(B b10);

    void n(Activity activity);

    void o(Activity activity);

    void onActivityResult(Activity activity, int i10, int i11, Intent intent);

    void onNewIntent(Intent intent);

    void onWindowFocusChange(boolean z10);

    a start();
}
