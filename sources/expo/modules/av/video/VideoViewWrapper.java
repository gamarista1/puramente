package expo.modules.av.video;

import Ff.l;
import ae.C4464a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import ve.b;
import ve.c;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00158FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR!\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR!\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a¨\u0006+"}, d2 = {"Lexpo/modules/av/video/VideoViewWrapper;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lae/a;", "appContext", "<init>", "(Landroid/content/Context;Lae/a;)V", "Llf/M;", "requestLayout", "()V", "Lexpo/modules/av/video/g;", "a", "Lexpo/modules/av/video/g;", "getVideoViewInstance", "()Lexpo/modules/av/video/g;", "videoViewInstance", "Ljava/lang/Runnable;", "b", "Ljava/lang/Runnable;", "mLayoutRunnable", "Lve/b;", "Landroid/os/Bundle;", "onStatusUpdate$delegate", "Lve/c;", "getOnStatusUpdate", "()Lve/b;", "onStatusUpdate", "onLoadStart$delegate", "getOnLoadStart", "onLoadStart", "onLoad$delegate", "getOnLoad", "onLoad", "onError$delegate", "getOnError", "onError", "onReadyForDisplay$delegate", "getOnReadyForDisplay", "onReadyForDisplay", "onFullscreenUpdate$delegate", "getOnFullscreenUpdate", "onFullscreenUpdate", "expo-av_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class VideoViewWrapper extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ l[] f60296c;

    /* renamed from: a  reason: collision with root package name */
    private final g f60297a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f60298b = new i(this);
    private final c onError$delegate;
    private final c onFullscreenUpdate$delegate;
    private final c onLoad$delegate;
    private final c onLoadStart$delegate;
    private final c onReadyForDisplay$delegate;
    private final c onStatusUpdate$delegate;

    static {
        Class<VideoViewWrapper> cls = VideoViewWrapper.class;
        f60296c = new l[]{O.i(new F(cls, "onStatusUpdate", "getOnStatusUpdate()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.i(new F(cls, "onLoadStart", "getOnLoadStart()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.i(new F(cls, "onLoad", "getOnLoad()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.i(new F(cls, "onError", "getOnError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.i(new F(cls, "onReadyForDisplay", "getOnReadyForDisplay()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.i(new F(cls, "onFullscreenUpdate", "getOnFullscreenUpdate()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoViewWrapper(Context context, C4464a aVar) {
        super(context);
        C6496s.h(context, "context");
        C6496s.h(aVar, "appContext");
        g gVar = new g(context, this, aVar);
        this.f60297a = gVar;
        addView(gVar, generateDefaultLayoutParams());
        this.onStatusUpdate$delegate = new c(this, (C6798l) null);
        this.onLoadStart$delegate = new c(this, (C6798l) null);
        this.onLoad$delegate = new c(this, (C6798l) null);
        this.onError$delegate = new c(this, (C6798l) null);
        this.onReadyForDisplay$delegate = new c(this, (C6798l) null);
        this.onFullscreenUpdate$delegate = new c(this, (C6798l) null);
    }

    /* access modifiers changed from: private */
    public static final void b(VideoViewWrapper videoViewWrapper) {
        videoViewWrapper.measure(View.MeasureSpec.makeMeasureSpec(videoViewWrapper.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(videoViewWrapper.getHeight(), 1073741824));
        videoViewWrapper.layout(videoViewWrapper.getLeft(), videoViewWrapper.getTop(), videoViewWrapper.getRight(), videoViewWrapper.getBottom());
    }

    public final b getOnError() {
        return this.onError$delegate.a(this, f60296c[3]);
    }

    public final b getOnFullscreenUpdate() {
        return this.onFullscreenUpdate$delegate.a(this, f60296c[5]);
    }

    public final b getOnLoad() {
        return this.onLoad$delegate.a(this, f60296c[2]);
    }

    public final b getOnLoadStart() {
        return this.onLoadStart$delegate.a(this, f60296c[1]);
    }

    public final b getOnReadyForDisplay() {
        return this.onReadyForDisplay$delegate.a(this, f60296c[4]);
    }

    public final b getOnStatusUpdate() {
        return this.onStatusUpdate$delegate.a(this, f60296c[0]);
    }

    public final g getVideoViewInstance() {
        return this.f60297a;
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.f60298b);
    }
}
