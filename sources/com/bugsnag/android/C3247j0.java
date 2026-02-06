package com.bugsnag.android;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.bugsnag.android.j0  reason: case insensitive filesystem */
public final class C3247j0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f38729a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38730b;

    public C3247j0(String str, String str2) {
        this.f38729a = str;
        this.f38730b = str2;
    }

    public final String a() {
        return this.f38729a;
    }

    public final String b() {
        return this.f38730b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3247j0(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "https://notify.bugsnag.com" : str, (i10 & 2) != 0 ? "https://sessions.bugsnag.com" : str2);
    }
}
