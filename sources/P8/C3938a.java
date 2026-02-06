package p8;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p8.a  reason: case insensitive filesystem */
public final class C3938a extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0715a f47580a = new C0715a((DefaultConstructorMarker) null);

    /* renamed from: p8.a$a  reason: collision with other inner class name */
    public static final class C0715a {
        public /* synthetic */ C0715a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0715a() {
        }
    }

    public C3938a(int i10, int i11) {
        super(i10, i11);
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    public String getEventName() {
        return "topDrawerClose";
    }
}
