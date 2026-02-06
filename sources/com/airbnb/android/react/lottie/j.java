package com.airbnb.android.react.lottie;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import io.branch.rnbranch.RNBranchModule;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37034b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f37035a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(int i10, int i11, Throwable th2) {
        super(i10, i11);
        C6496s.h(th2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        this.f37035a = th2;
    }

    public short getCoalescingKey() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, this.f37035a.getMessage());
        return createMap;
    }

    public String getEventName() {
        return "topAnimationFailure";
    }
}
