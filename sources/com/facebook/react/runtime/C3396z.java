package com.facebook.react.runtime;

import b8.d;
import com.facebook.react.runtime.ReactHostImpl;

/* renamed from: com.facebook.react.runtime.z  reason: case insensitive filesystem */
public final /* synthetic */ class C3396z implements ReactHostImpl.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f41356a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f41357b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f41358c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f41359d;

    public /* synthetic */ C3396z(ReactHostImpl reactHostImpl, String str, String str2, String str3) {
        this.f41356a = reactHostImpl;
        this.f41357b = str;
        this.f41358c = str2;
        this.f41359d = str3;
    }

    public final ReactInstance a(d dVar, String str) {
        return this.f41356a.R0(this.f41357b, this.f41358c, this.f41359d, dVar, str);
    }
}
