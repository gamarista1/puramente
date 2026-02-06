package com.airbnb.android.react.lottie;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37036b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37037a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.f37037a = z10;
    }

    public short getCoalescingKey() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isCancelled", this.f37037a);
        return createMap;
    }

    public String getEventName() {
        return "topAnimationFinish";
    }
}
