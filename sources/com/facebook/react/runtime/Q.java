package com.facebook.react.runtime;

import com.facebook.react.bridge.NativeArray;
import com.facebook.react.runtime.ReactHostImpl;

public final /* synthetic */ class Q implements ReactHostImpl.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f41209a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f41210b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ NativeArray f41211c;

    public /* synthetic */ Q(String str, String str2, NativeArray nativeArray) {
        this.f41209a = str;
        this.f41210b = str2;
        this.f41211c = nativeArray;
    }

    public final void a(ReactInstance reactInstance) {
        reactInstance.callFunctionOnModule(this.f41209a, this.f41210b, this.f41211c);
    }
}
