package yd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class p extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62342b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f62343a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(int i10, int i11, String str) {
        super(i10, i11);
        this.f62343a = str;
    }

    public short getCoalescingKey() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(AttributeType.TEXT, this.f62343a);
        return createMap;
    }

    public String getEventName() {
        return "topSearchButtonPress";
    }
}
