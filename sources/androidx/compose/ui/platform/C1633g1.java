package androidx.compose.ui.platform;

import android.view.RenderNode;

/* renamed from: androidx.compose.ui.platform.g1  reason: case insensitive filesystem */
final class C1633g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1633g1 f13743a = new C1633g1();

    private C1633g1() {
    }

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
