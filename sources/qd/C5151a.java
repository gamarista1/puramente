package qd;

import com.amazon.device.iap.internal.c.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qd.a  reason: case insensitive filesystem */
public final class C5151a extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final C0904a f61379c = new C0904a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f61380a;

    /* renamed from: b  reason: collision with root package name */
    private final float f61381b;

    /* renamed from: qd.a$a  reason: collision with other inner class name */
    public static final class C0904a {
        public /* synthetic */ C0904a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0904a() {
        }
    }

    public C5151a(int i10, int i11, float f10) {
        super(i10);
        this.f61380a = i11;
        this.f61381b = (Float.isInfinite(f10) || Float.isNaN(f10)) ? 0.0f : f10;
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f61380a);
        createMap.putDouble(b.as, (double) this.f61381b);
        C6496s.e(createMap);
        return createMap;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        C6496s.h(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    public String getEventName() {
        return "topPageScroll";
    }
}
