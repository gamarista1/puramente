package r0;

import androidx.compose.ui.graphics.f;

public abstract class n2 {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return f.c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }
}
