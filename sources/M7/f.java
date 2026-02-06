package M7;

public abstract class f extends e {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32681a;

    public f(boolean z10) {
        this.f32681a = z10;
    }

    public boolean enableBridgelessArchitecture() {
        return this.f32681a;
    }

    public boolean enableDeletionOfUnmountedViews() {
        return this.f32681a;
    }

    public boolean useNativeViewConfigsInBridgelessMode() {
        if (this.f32681a || super.useNativeViewConfigsInBridgelessMode()) {
            return true;
        }
        return false;
    }

    public boolean useTurboModuleInterop() {
        if (this.f32681a || super.useTurboModuleInterop()) {
            return true;
        }
        return false;
    }
}
