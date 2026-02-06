package yd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class q extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f62344c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f62345a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f62346b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public q(int i10, int i11, int i12, boolean z10) {
        super(i10, i11);
        this.f62345a = i12;
        this.f62346b = z10;
    }

    public short getCoalescingKey() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("index", this.f62345a);
        createMap.putBoolean("isStable", this.f62346b);
        return createMap;
    }

    public String getEventName() {
        return "topSheetDetentChanged";
    }
}
