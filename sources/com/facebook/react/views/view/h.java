package com.facebook.react.views.view;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h extends d {

    /* renamed from: a  reason: collision with root package name */
    private static final a f42343a = new a((DefaultConstructorMarker) null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(int i10, int i11) {
        super(i10, i11);
    }

    public boolean canCoalesce() {
        return false;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        C6496s.g(createMap, "createMap(...)");
        return createMap;
    }

    public String getEventName() {
        return "topClick";
    }
}
