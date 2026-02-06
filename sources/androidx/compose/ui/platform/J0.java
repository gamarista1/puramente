package androidx.compose.ui.platform;

public abstract class J0 {
    private static final float a(float f10) {
        double floor;
        if (f10 >= 0.0f) {
            floor = Math.ceil((double) f10);
        } else {
            floor = Math.floor((double) f10);
        }
        return (float) floor;
    }

    public static final int b(float f10) {
        return ((int) a(f10)) * -1;
    }
}
