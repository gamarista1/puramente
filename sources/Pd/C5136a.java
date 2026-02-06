package pd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: pd.a  reason: case insensitive filesystem */
public final class C5136a extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final C0902a f61307b = new C0902a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f61308a;

    /* renamed from: pd.a$a  reason: collision with other inner class name */
    public static final class C0902a {
        public /* synthetic */ C0902a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0902a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5136a(int i10, WritableMap writableMap) {
        super(i10);
        C6496s.h(writableMap, "mEventData");
        this.f61308a = writableMap;
    }

    public boolean canCoalesce() {
        return false;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        C6496s.h(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f61308a);
    }

    public short getCoalescingKey() {
        return 0;
    }

    public String getEventName() {
        return "topLoadingSubResourceError";
    }
}
