package i8;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import io.branch.rnbranch.RNBranchModule;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class n implements Interpolator {

    /* renamed from: b  reason: collision with root package name */
    public static final a f44348b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f44349a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(ReadableMap readableMap) {
            C6496s.h(readableMap, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
            if (readableMap.getType("springDamping") == ReadableType.Number) {
                return (float) readableMap.getDouble("springDamping");
            }
            return 0.5f;
        }

        private a() {
        }
    }

    public n(float f10) {
        this.f44349a = f10;
    }

    public static final float a(ReadableMap readableMap) {
        return f44348b.a(readableMap);
    }

    public float getInterpolation(float f10) {
        double pow = Math.pow(2.0d, (double) (((float) -10) * f10));
        float f11 = this.f44349a;
        return (float) (((double) 1) + (pow * Math.sin(((((double) (f10 - (f11 / ((float) 4)))) * 3.141592653589793d) * ((double) 2)) / ((double) f11))));
    }
}
