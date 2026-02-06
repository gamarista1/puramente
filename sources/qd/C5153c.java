package qd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qd.c  reason: case insensitive filesystem */
public final class C5153c extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61384b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f61385a;

    /* renamed from: qd.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C5153c(int i10, int i11) {
        super(i10);
        this.f61385a = i11;
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f61385a);
        C6496s.e(createMap);
        return createMap;
    }

    public boolean canCoalesce() {
        return false;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        C6496s.h(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    public String getEventName() {
        return "topPageSelected";
    }
}
