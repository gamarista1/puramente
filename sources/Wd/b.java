package wd;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.C6496s;
import vd.C5260d;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f62089a;

    /* renamed from: b  reason: collision with root package name */
    private final int f62090b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62091c;

    /* renamed from: d  reason: collision with root package name */
    private final int f62092d;

    public b(C5260d dVar) {
        C6496s.h(dVar, "handler");
        this.f62089a = dVar.O();
        this.f62090b = dVar.T();
        this.f62091c = dVar.S();
        this.f62092d = dVar.Q();
    }

    public void a(WritableMap writableMap) {
        C6496s.h(writableMap, "eventData");
        writableMap.putInt("numberOfPointers", this.f62089a);
        writableMap.putInt("handlerTag", this.f62090b);
        writableMap.putInt("state", this.f62091c);
        writableMap.putInt("pointerType", this.f62092d);
    }
}
