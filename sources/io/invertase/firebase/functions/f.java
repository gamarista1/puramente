package io.invertase.firebase.functions;

import com.facebook.react.bridge.ReadableMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f71408a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71409b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f71410c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ReadableMap f71411d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f71412e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Integer f71413f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f71414g;

    public /* synthetic */ f(String str, String str2, String str3, ReadableMap readableMap, String str4, Integer num, Object obj) {
        this.f71408a = str;
        this.f71409b = str2;
        this.f71410c = str3;
        this.f71411d = readableMap;
        this.f71412e = str4;
        this.f71413f = num;
        this.f71414g = obj;
    }

    public final Object call() {
        return h.l(this.f71408a, this.f71409b, this.f71410c, this.f71411d, this.f71412e, this.f71413f, this.f71414g);
    }
}
