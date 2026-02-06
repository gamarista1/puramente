package yd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yd.c  reason: case insensitive filesystem */
public final class C5296c extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62323a = new a((DefaultConstructorMarker) null);

    /* renamed from: yd.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C5296c(int i10, int i11) {
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
        return "topDetached";
    }
}
