package com.facebook.react.fabric.mounting;

import android.view.View;
import com.facebook.react.uimanager.G;
import com.facebook.yoga.p;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/facebook/react/fabric/mounting/LayoutMetricsConversions;", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LayoutMetricsConversions {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/fabric/mounting/LayoutMetricsConversions$Companion;", "", "<init>", "()V", "", "viewMeasureSpec", "", "getMinSize", "(I)F", "getMaxSize", "minSize", "maxSize", "getYogaSize", "(FF)F", "Lcom/facebook/yoga/p;", "getYogaMeasureMode", "(FF)Lcom/facebook/yoga/p;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final float getMaxSize(int i10) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == 0) {
                return Float.POSITIVE_INFINITY;
            }
            return (float) size;
        }

        public final float getMinSize(int i10) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == 1073741824) {
                return (float) size;
            }
            return 0.0f;
        }

        public final p getYogaMeasureMode(float f10, float f11) {
            if (f10 == f11) {
                return p.EXACTLY;
            }
            if (Float.isInfinite(f11)) {
                return p.UNDEFINED;
            }
            return p.AT_MOST;
        }

        public final float getYogaSize(float f10, float f11) {
            if (f10 == f11) {
                return G.f41415a.b(f11);
            }
            if (Float.isInfinite(f11)) {
                return Float.POSITIVE_INFINITY;
            }
            return G.f41415a.b(f11);
        }
    }

    static float getMaxSize(int i10) {
        return Companion.getMaxSize(i10);
    }

    static float getMinSize(int i10) {
        return Companion.getMinSize(i10);
    }

    static p getYogaMeasureMode(float f10, float f11) {
        return Companion.getYogaMeasureMode(f10, f11);
    }

    static float getYogaSize(float f10, float f11) {
        return Companion.getYogaSize(f10, f11);
    }
}
