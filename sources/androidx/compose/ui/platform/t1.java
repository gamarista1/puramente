package androidx.compose.ui.platform;

import android.view.View;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

public interface t1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13953a = a.f13954a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f13954a = new a();

        private a() {
        }

        public final t1 a() {
            return b.f13955b;
        }
    }

    public static final class b implements t1 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f13955b = new b();

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1613a f13956a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0263b f13957b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ E1.b f13958c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1613a aVar, C0263b bVar, E1.b bVar2) {
                super(0);
                this.f13956a = aVar;
                this.f13957b = bVar;
                this.f13958c = bVar2;
            }

            public final void invoke() {
                this.f13956a.removeOnAttachStateChangeListener(this.f13957b);
                E1.a.g(this.f13956a, this.f13958c);
            }
        }

        /* renamed from: androidx.compose.ui.platform.t1$b$b  reason: collision with other inner class name */
        public static final class C0263b implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1613a f13959a;

            C0263b(C1613a aVar) {
                this.f13959a = aVar;
            }

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                if (!E1.a.f(this.f13959a)) {
                    this.f13959a.disposeComposition();
                }
            }
        }

        private b() {
        }

        /* access modifiers changed from: private */
        public static final void c(C1613a aVar) {
            aVar.disposeComposition();
        }

        public C6787a a(C1613a aVar) {
            C0263b bVar = new C0263b(aVar);
            aVar.addOnAttachStateChangeListener(bVar);
            u1 u1Var = new u1(aVar);
            E1.a.a(aVar, u1Var);
            return new a(aVar, bVar, u1Var);
        }
    }

    C6787a a(C1613a aVar);
}
