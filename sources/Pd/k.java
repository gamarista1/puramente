package pd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61327b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f61328a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(int i10, WritableMap writableMap) {
        super(i10);
        C6496s.h(writableMap, "mData");
        this.f61328a = writableMap;
        writableMap.putString("navigationType", "other");
        writableMap.putBoolean("isTopFrame", true);
    }

    public boolean canCoalesce() {
        return false;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        C6496s.h(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), "topShouldStartLoadWithRequest", this.f61328a);
    }

    public short getCoalescingKey() {
        return 0;
    }

    public String getEventName() {
        return "topShouldStartLoadWithRequest";
    }
}
