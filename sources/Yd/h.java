package yd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h extends d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62329e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f62330a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f62331b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f62332c;

    /* renamed from: d  reason: collision with root package name */
    private final short f62333d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(int i10, int i11, float f10, boolean z10, boolean z11, short s10) {
        super(i10, i11);
        this.f62330a = f10;
        this.f62331b = z10;
        this.f62332c = z11;
        this.f62333d = s10;
    }

    public short getCoalescingKey() {
        return this.f62333d;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, (double) this.f62330a);
        createMap.putInt("closing", this.f62331b ? 1 : 0);
        createMap.putInt("goingForward", this.f62332c ? 1 : 0);
        return createMap;
    }

    public String getEventName() {
        return "topTransitionProgress";
    }
}
