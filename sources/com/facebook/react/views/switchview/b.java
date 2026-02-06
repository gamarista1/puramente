package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b extends d {

    /* renamed from: b  reason: collision with root package name */
    private static final a f42094b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f42095a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.f42095a = z10;
    }

    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putBoolean("value", this.f42095a);
        return createMap;
    }

    public String getEventName() {
        return "topChange";
    }
}
