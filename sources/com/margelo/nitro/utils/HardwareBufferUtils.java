package com.margelo.nitro.utils;

import android.hardware.HardwareBuffer;
import androidx.annotation.Keep;
import com.margelo.nitro.core.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/margelo/nitro/utils/HardwareBufferUtils;", "", "<init>", "()V", "Companion", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@B7.a
public final class HardwareBufferUtils {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object b(Object obj) {
            return HardwareBufferUtils.copyHardwareBuffer(obj);
        }

        public final HardwareBuffer a(HardwareBuffer hardwareBuffer) {
            C6496s.h(hardwareBuffer, "hardwareBuffer");
            Object b10 = b(hardwareBuffer);
            C6496s.f(b10, "null cannot be cast to non-null type android.hardware.HardwareBuffer");
            return b.a(b10);
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final native Object copyHardwareBuffer(Object obj);

    /* access modifiers changed from: private */
    public static final native void copyHardwareBuffer(Object obj, Object obj2);
}
