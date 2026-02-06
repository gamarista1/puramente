package N7;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.C6496s;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f33023a;

    /* renamed from: b  reason: collision with root package name */
    private final WritableMap f33024b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, WritableMap writableMap, int i10, int i11) {
        super(i10, i11);
        C6496s.h(str, "eventName");
        this.f33023a = str;
        this.f33024b = writableMap;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        return this.f33024b;
    }

    public String getEventName() {
        return this.f33023a;
    }
}
