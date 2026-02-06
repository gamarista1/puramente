package qd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qd.b  reason: case insensitive filesystem */
public final class C5152b extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61382b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f61383a;

    /* renamed from: qd.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5152b(int i10, String str) {
        super(i10);
        C6496s.h(str, "mPageScrollState");
        this.f61383a = str;
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("pageScrollState", this.f61383a);
        C6496s.e(createMap);
        return createMap;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        C6496s.h(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    public String getEventName() {
        return "topPageScrollStateChanged";
    }
}
