package yd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yd.a  reason: case insensitive filesystem */
public final class C5294a extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0918a f62321a = new C0918a((DefaultConstructorMarker) null);

    /* renamed from: yd.a$a  reason: collision with other inner class name */
    public static final class C0918a {
        public /* synthetic */ C0918a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0918a() {
        }
    }

    public C5294a(int i10, int i11) {
        super(i10, i11);
    }

    public short getCoalescingKey() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    public String getEventName() {
        return "topAttached";
    }
}
