package p8;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p8.d  reason: case insensitive filesystem */
public final class C3941d extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f47584b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f47585a;

    /* renamed from: p8.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3941d(int i10, int i11, int i12) {
        super(i10, i11);
        this.f47585a = i12;
    }

    public final int a() {
        return this.f47585a;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        C6496s.g(createMap, "createMap(...)");
        createMap.putInt("drawerState", a());
        return createMap;
    }

    public String getEventName() {
        return "topDrawerStateChanged";
    }
}
