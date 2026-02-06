package p8;

import com.amazon.device.iap.internal.c.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p8.c  reason: case insensitive filesystem */
public final class C3940c extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f47582b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f47583a;

    /* renamed from: p8.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3940c(int i10, int i11, float f10) {
        super(i10, i11);
        this.f47583a = f10;
    }

    public final float a() {
        return this.f47583a;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        C6496s.g(createMap, "createMap(...)");
        createMap.putDouble(b.as, (double) a());
        return createMap;
    }

    public String getEventName() {
        return "topDrawerSlide";
    }
}
