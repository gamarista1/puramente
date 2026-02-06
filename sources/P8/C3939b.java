package p8;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p8.b  reason: case insensitive filesystem */
public final class C3939b extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f47581a = new a((DefaultConstructorMarker) null);

    /* renamed from: p8.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3939b(int i10, int i11) {
        super(i10, i11);
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    public String getEventName() {
        return "topDrawerOpen";
    }
}
