package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import e8.C3500a;
import java.util.Locale;
import n6.b;
import r8.C3981a;
import s8.q;

class a extends C3981a {

    /* renamed from: a  reason: collision with root package name */
    private Uri f42136a;

    /* renamed from: b  reason: collision with root package name */
    private ReadableMap f42137b;

    /* renamed from: c  reason: collision with root package name */
    private final b f42138c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f42139d;

    /* renamed from: e  reason: collision with root package name */
    private float f42140e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    private String f42141f;

    /* renamed from: g  reason: collision with root package name */
    private float f42142g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    private int f42143h = 0;

    public a(b bVar, Object obj) {
        this.f42138c = bVar;
        this.f42139d = obj;
    }

    private static Uri k(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    public q g() {
        return new b(getThemedContext().getResources(), (int) Math.ceil((double) this.f42142g), (int) Math.ceil((double) this.f42140e), this.f42143h, l(), j(), i(), h(), this.f42141f);
    }

    public Object h() {
        return this.f42139d;
    }

    public b i() {
        return this.f42138c;
    }

    public boolean isVirtual() {
        return true;
    }

    public ReadableMap j() {
        return this.f42137b;
    }

    public Uri l() {
        return this.f42136a;
    }

    @C3500a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f42137b = readableMap;
    }

    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f42142g = (float) dynamic.asDouble();
            return;
        }
        U5.a.I("ReactNative", "Inline images must not have percentage based height");
        this.f42142g = Float.NaN;
    }

    @C3500a(name = "resizeMode")
    public void setResizeMode(String str) {
        this.f42141f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1.getScheme() == null) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    @e8.C3500a(name = "src")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSource(com.facebook.react.bridge.ReadableArray r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0016
            int r1 = r4.size()
            if (r1 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            r1 = 0
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            if (r4 == 0) goto L_0x002f
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0025 }
            java.lang.String r2 = r1.getScheme()     // Catch:{ Exception -> 0x0024 }
            if (r2 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            if (r0 != 0) goto L_0x002f
            com.facebook.react.uimanager.h0 r0 = r3.getThemedContext()
            android.net.Uri r0 = k(r0, r4)
        L_0x002f:
            android.net.Uri r4 = r3.f42136a
            if (r0 == r4) goto L_0x0036
            r3.markUpdated()
        L_0x0036:
            r3.f42136a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.frescosupport.a.setSource(com.facebook.react.bridge.ReadableArray):void");
    }

    @C3500a(customType = "Color", name = "tintColor")
    public void setTintColor(int i10) {
        this.f42143h = i10;
    }

    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f42140e = (float) dynamic.asDouble();
            return;
        }
        U5.a.I("ReactNative", "Inline images must not have percentage based width");
        this.f42140e = Float.NaN;
    }
}
