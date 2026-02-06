package pd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: pd.f  reason: case insensitive filesystem */
public final class C5141f extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61317b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f61318a;

    /* renamed from: pd.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5141f(int i10, WritableMap writableMap) {
        super(i10);
        C6496s.h(writableMap, "mEventData");
        this.f61318a = writableMap;
    }

    public boolean canCoalesce() {
        return false;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        C6496s.h(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f61318a);
    }

    public short getCoalescingKey() {
        return 0;
    }

    public String getEventName() {
        return "topLoadingProgress";
    }
}
