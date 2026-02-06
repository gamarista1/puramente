package pd;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: pd.e  reason: case insensitive filesystem */
public final class C5140e extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61315b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f61316a;

    /* renamed from: pd.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5140e(int i10, WritableMap writableMap) {
        super(i10);
        C6496s.h(writableMap, "mEventData");
        this.f61316a = writableMap;
    }

    public boolean canCoalesce() {
        return false;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        C6496s.h(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f61316a);
    }

    public short getCoalescingKey() {
        return 0;
    }

    public String getEventName() {
        return "topLoadingFinish";
    }
}
