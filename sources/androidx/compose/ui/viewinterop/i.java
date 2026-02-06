package androidx.compose.ui.viewinterop;

import J0.m0;
import Y.r;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.A1;
import androidx.compose.ui.platform.C1613a;
import h0.C2023g;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;
import yf.C6798l;

public final class i extends c implements A1 {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final View f14195A;

    /* renamed from: B  reason: collision with root package name */
    private final C0.b f14196B;

    /* renamed from: C  reason: collision with root package name */
    private final C2023g f14197C;

    /* renamed from: D  reason: collision with root package name */
    private final int f14198D;

    /* renamed from: E  reason: collision with root package name */
    private final String f14199E;

    /* renamed from: F  reason: collision with root package name */
    private C2023g.a f14200F;

    /* renamed from: G  reason: collision with root package name */
    private C6798l f14201G;

    /* renamed from: H  reason: collision with root package name */
    private C6798l f14202H;

    /* renamed from: I  reason: collision with root package name */
    private C6798l f14203I;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f14204a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(0);
            this.f14204a = iVar;
        }

        public final Object invoke() {
            SparseArray sparseArray = new SparseArray();
            this.f14204a.f14195A.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f14205a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(0);
            this.f14205a = iVar;
        }

        public final void invoke() {
            this.f14205a.getReleaseBlock().invoke(this.f14205a.f14195A);
            this.f14205a.z();
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f14206a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar) {
            super(0);
            this.f14206a = iVar;
        }

        public final void invoke() {
            this.f14206a.getResetBlock().invoke(this.f14206a.f14195A);
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f14207a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(0);
            this.f14207a = iVar;
        }

        public final void invoke() {
            this.f14207a.getUpdateBlock().invoke(this.f14207a.f14195A);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ i(Context context, r rVar, View view, C0.b bVar, C2023g gVar, int i10, m0 m0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : rVar, view, (i11 & 8) != 0 ? new C0.b() : bVar, gVar, i10, m0Var);
    }

    private final void setSavableRegistryEntry(C2023g.a aVar) {
        C2023g.a aVar2 = this.f14200F;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f14200F = aVar;
    }

    private final void y() {
        C2023g gVar = this.f14197C;
        if (gVar != null) {
            setSavableRegistryEntry(gVar.b(this.f14199E, new a(this)));
        }
    }

    /* access modifiers changed from: private */
    public final void z() {
        setSavableRegistryEntry((C2023g.a) null);
    }

    public final C0.b getDispatcher() {
        return this.f14196B;
    }

    public final C6798l getReleaseBlock() {
        return this.f14203I;
    }

    public final C6798l getResetBlock() {
        return this.f14202H;
    }

    public /* bridge */ /* synthetic */ C1613a getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final C6798l getUpdateBlock() {
        return this.f14201G;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(C6798l lVar) {
        this.f14203I = lVar;
        setRelease(new b(this));
    }

    public final void setResetBlock(C6798l lVar) {
        this.f14202H = lVar;
        setReset(new c(this));
    }

    public final void setUpdateBlock(C6798l lVar) {
        this.f14201G = lVar;
        setUpdate(new d(this));
    }

    private i(Context context, r rVar, View view, C0.b bVar, C2023g gVar, int i10, m0 m0Var) {
        super(context, rVar, i10, bVar, view, m0Var);
        this.f14195A = view;
        this.f14196B = bVar;
        this.f14197C = gVar;
        this.f14198D = i10;
        setClipChildren(false);
        String valueOf = String.valueOf(i10);
        this.f14199E = valueOf;
        SparseArray sparseArray = null;
        Object f10 = gVar != null ? gVar.f(valueOf) : null;
        sparseArray = f10 instanceof SparseArray ? (SparseArray) f10 : sparseArray;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        y();
        this.f14201G = e.e();
        this.f14202H = e.e();
        this.f14203I = e.e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(Context context, C6798l lVar, r rVar, C2023g gVar, int i10, m0 m0Var) {
        this(context, rVar, (View) lVar.invoke(context), (C0.b) null, gVar, i10, m0Var, 8, (DefaultConstructorMarker) null);
        C6798l lVar2 = lVar;
    }
}
