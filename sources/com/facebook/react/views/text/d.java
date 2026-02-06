package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f42125b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static d f42126c;

    /* renamed from: a  reason: collision with root package name */
    private final D7.a f42127a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            d a10 = d.f42126c;
            if (a10 != null) {
                return a10;
            }
            d dVar = new d(D7.a.f30562c.c(), (DefaultConstructorMarker) null);
            d.f42126c = dVar;
            return dVar;
        }

        private a() {
        }
    }

    public /* synthetic */ d(D7.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public static final d c() {
        return f42125b.a();
    }

    public final Typeface d(String str, int i10, int i11, AssetManager assetManager) {
        C6496s.h(str, "fontFamilyName");
        C6496s.h(assetManager, "assetManager");
        return this.f42127a.d(str, i10, i11, assetManager);
    }

    public final Typeface e(String str, int i10, AssetManager assetManager) {
        C6496s.h(str, "fontFamilyName");
        C6496s.h(assetManager, "assetManager");
        return this.f42127a.e(str, i10, assetManager);
    }

    private d(D7.a aVar) {
        this.f42127a = aVar;
    }
}
