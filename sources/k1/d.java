package K1;

import androidx.datastore.preferences.protobuf.C1752z;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.InputStream;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3991a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream inputStream) {
            C6496s.h(inputStream, MetricTracker.Object.INPUT);
            try {
                f O10 = f.O(inputStream);
                C6496s.g(O10, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return O10;
            } catch (C1752z e10) {
                throw new I1.a("Unable to parse preferences proto.", e10);
            }
        }

        private a() {
        }
    }
}
