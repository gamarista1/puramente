package ae;

import Dd.d;
import android.util.Log;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f53619a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Lazy f53620b = C6531o.b(new f());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            return (o) g.f53620b.getValue();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final o c() {
        try {
            d newInstance = d.class.getConstructor((Class[]) null).newInstance((Object[]) null);
            C6496s.f(newInstance, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider");
            return newInstance;
        } catch (Exception e10) {
            Log.e("ExpoModulesHelper", "Couldn't get expo modules list.", e10);
            return null;
        }
    }
}
