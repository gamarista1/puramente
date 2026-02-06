package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f60005c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final a f60006a;

    /* renamed from: b  reason: collision with root package name */
    private final c f60007b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11, a aVar, c cVar) {
        super(i10, i11);
        C6496s.h(aVar, "mInsets");
        C6496s.h(cVar, "mFrame");
        this.f60006a = aVar;
        this.f60007b = cVar;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", q.b(this.f60006a));
        createMap.putMap("frame", q.d(this.f60007b));
        return createMap;
    }

    public String getEventName() {
        return "topInsetsChange";
    }
}
