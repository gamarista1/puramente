package yd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yd.d  reason: case insensitive filesystem */
public final class C5297d extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62324b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f62325a;

    /* renamed from: yd.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C5297d(int i10, int i11, int i12) {
        super(i10, i11);
        this.f62325a = i12;
    }

    public short getCoalescingKey() {
        return (short) this.f62325a;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("headerHeight", (double) this.f62325a);
        return createMap;
    }

    public String getEventName() {
        return "topHeaderHeightChange";
    }
}
