package androidx.compose.ui.platform;

import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0014@RX\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llf/M;", "Content", "(LY/m;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "content", "setContent", "(Lyf/p;)V", "LY/r0;", "a", "LY/r0;", "", "<set-?>", "b", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeView extends C1613a {

    /* renamed from: a  reason: collision with root package name */
    private final C1510r0 f13500a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13501b;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposeView f13502a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f13503b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ComposeView composeView, int i10) {
            super(2);
            this.f13502a = composeView;
            this.f13503b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f13502a.Content(mVar, M0.a(this.f13503b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public void Content(C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(420213850);
        if ((i10 & 6) == 0) {
            if (h10.C(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(420213850, i11, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            p pVar = (p) this.f13500a.getValue();
            if (pVar == null) {
                h10.T(358373017);
            } else {
                h10.T(150107752);
                pVar.invoke(h10, 0);
            }
            h10.M();
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(this, i10));
        }
    }

    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f13501b;
    }

    public final void setContent(p pVar) {
        this.f13501b = true;
        this.f13500a.setValue(pVar);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13500a = u1.d((Object) null, (o1) null, 2, (Object) null);
    }
}
