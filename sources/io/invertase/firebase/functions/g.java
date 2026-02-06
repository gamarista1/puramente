package io.invertase.firebase.functions;

import com.facebook.react.bridge.ReadableMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f71415a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71416b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f71417c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ReadableMap f71418d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f71419e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Integer f71420f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f71421g;

    public /* synthetic */ g(String str, String str2, String str3, ReadableMap readableMap, String str4, Integer num, Object obj) {
        this.f71415a = str;
        this.f71416b = str2;
        this.f71417c = str3;
        this.f71418d = readableMap;
        this.f71419e = str4;
        this.f71420f = num;
        this.f71421g = obj;
    }

    public final Object call() {
        return h.k(this.f71415a, this.f71416b, this.f71417c, this.f71418d, this.f71419e, this.f71420f, this.f71421g);
    }
}
