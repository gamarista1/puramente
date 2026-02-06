package com.facebook.react.runtime;

import K7.a;
import K7.b;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import b8.d;
import com.facebook.react.A;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.concurrent.atomic.AtomicReference;
import w.C2780Y;

public class h0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f41310a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f41311b;

    /* renamed from: c  reason: collision with root package name */
    private final b f41312c;

    /* renamed from: d  reason: collision with root package name */
    private Context f41313d;

    public h0(Context context, String str, Bundle bundle) {
        this(new SurfaceHandlerBinding(str), context);
        NativeMap nativeMap;
        if (bundle == null) {
            nativeMap = new WritableNativeMap();
        } else {
            nativeMap = (NativeMap) Arguments.fromBundle(bundle);
        }
        this.f41312c.setProps(nativeMap);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f41312c.setLayoutConstraints(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE), 0, 0, g(context), p(context), k(context));
    }

    public static h0 f(Context context, String str, Bundle bundle) {
        h0 h0Var = new h0(context, str, bundle);
        h0Var.d(new i0(context, h0Var));
        return h0Var;
    }

    private static boolean g(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().d(context);
    }

    private static float k(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static boolean p(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().i(context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r() {
        i0 i0Var = (i0) a();
        if (i0Var != null) {
            i0Var.removeAllViews();
            i0Var.setId(-1);
        }
    }

    public ViewGroup a() {
        return (ViewGroup) this.f41310a.get();
    }

    public void c(A a10) {
        boolean z10 = a10 instanceof ReactHostImpl;
        if (z10 && !C2780Y.a(this.f41311b, (Object) null, (ReactHostImpl) a10)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        } else if (!z10) {
            throw new IllegalArgumentException("ReactSurfaceImpl.attach can only attach to ReactHostImpl.");
        }
    }

    public void d(i0 i0Var) {
        if (C2780Y.a(this.f41310a, (Object) null, i0Var)) {
            this.f41313d = i0Var.getContext();
            return;
        }
        throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
    }

    public void e() {
        UiThreadUtil.runOnUiThread(new g0(this));
    }

    public Context h() {
        return this.f41313d;
    }

    /* access modifiers changed from: package-private */
    public EventDispatcher i() {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f41311b.get();
        if (reactHostImpl == null) {
            return null;
        }
        return reactHostImpl.o0();
    }

    public String j() {
        return this.f41312c.getModuleName();
    }

    /* access modifiers changed from: package-private */
    public ReactHostImpl l() {
        return (ReactHostImpl) this.f41311b.get();
    }

    /* access modifiers changed from: package-private */
    public b m() {
        return this.f41312c;
    }

    public int n() {
        return this.f41312c.getSurfaceId();
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        if (this.f41311b.get() != null) {
            return true;
        }
        return false;
    }

    public boolean q() {
        return this.f41312c.isRunning();
    }

    /* access modifiers changed from: package-private */
    public synchronized void s(int i10, int i11, int i12, int i13) {
        this.f41312c.setLayoutConstraints(i10, i11, i12, i13, g(this.f41313d), p(this.f41313d), k(this.f41313d));
    }

    public J7.a start() {
        if (this.f41310a.get() == null) {
            return d.l(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f41311b.get();
        if (reactHostImpl == null) {
            return d.l(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached."));
        }
        return reactHostImpl.J1(this);
    }

    public J7.a stop() {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f41311b.get();
        if (reactHostImpl == null) {
            return d.l(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached."));
        }
        return reactHostImpl.L1(this);
    }

    h0(b bVar, Context context) {
        this.f41310a = new AtomicReference((Object) null);
        this.f41311b = new AtomicReference((Object) null);
        this.f41312c = bVar;
        this.f41313d = context;
    }
}
