package com.facebook.react.defaults;

import com.facebook.react.C3433v;
import com.facebook.react.r;
import kotlin.jvm.internal.C6496s;

public abstract class b extends C3433v {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f40644f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(r rVar, String str, boolean z10) {
        super(rVar, str);
        C6496s.h(rVar, "activity");
        C6496s.h(str, "mainComponentName");
        this.f40644f = z10;
    }

    /* access modifiers changed from: protected */
    public boolean isFabricEnabled() {
        return this.f40644f;
    }
}
