package ge;

import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;

public class g implements C5008b, Qd.a {

    /* renamed from: a  reason: collision with root package name */
    private final Qd.a f60646a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f60647b;

    private static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private final String f60648a;

        /* renamed from: b  reason: collision with root package name */
        private final WritableMap f60649b;

        /* renamed from: c  reason: collision with root package name */
        private final Short f60650c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, String str, WritableMap writableMap, Short sh2) {
            super(i10, i11);
            C6496s.h(str, "eventName");
            this.f60648a = str;
            this.f60649b = writableMap;
            this.f60650c = sh2;
        }

        public boolean canCoalesce() {
            if (this.f60650c != null) {
                return true;
            }
            return false;
        }

        public short getCoalescingKey() {
            Short sh2 = this.f60650c;
            if (sh2 != null) {
                return sh2.shortValue();
            }
            return 0;
        }

        /* access modifiers changed from: protected */
        public WritableMap getEventData() {
            WritableMap writableMap = this.f60649b;
            if (writableMap != null) {
                return writableMap;
            }
            WritableMap createMap = Arguments.createMap();
            C6496s.g(createMap, "createMap(...)");
            return createMap;
        }

        public String getEventName() {
            return i.a(this.f60648a);
        }
    }

    public g(Qd.a aVar, WeakReference weakReference) {
        C6496s.h(aVar, "legacyEventEmitter");
        C6496s.h(weakReference, "reactContextHolder");
        this.f60646a = aVar;
        this.f60647b = weakReference;
    }

    public void a(String str, Bundle bundle) {
        this.f60646a.a(str, bundle);
    }

    public void b(View view, String str, WritableMap writableMap, Short sh2) {
        C6496s.h(view, "view");
        C6496s.h(str, "eventName");
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f60647b.get();
        if (reactApplicationContext != null) {
            int f10 = n0.f(view);
            int id2 = view.getId();
            EventDispatcher c10 = n0.c(reactApplicationContext, view.getId());
            if (c10 != null) {
                c10.h(new a(f10, id2, str, writableMap, sh2));
            }
        }
    }
}
