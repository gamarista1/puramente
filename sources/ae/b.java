package Ae;

import Fe.C3016e;
import Fe.C3023l;
import Ug.C5572i;
import Ug.K;
import Ug.Z;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import dh.C5817a;
import dh.c;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final C5817a f50269a = c.b(false, 1, (Object) null);

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f50270a;

        /* renamed from: b  reason: collision with root package name */
        Object f50271b;

        /* renamed from: c  reason: collision with root package name */
        int f50272c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f50273d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50273d = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f50273d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C5817a aVar;
            Context context;
            String str;
            Object f10 = C6680b.f();
            int i10 = this.f50272c;
            if (i10 == 0) {
                w.b(obj);
                aVar = b.a();
                Context context2 = this.f50273d;
                this.f50270a = aVar;
                this.f50271b = context2;
                this.f50272c = 1;
                if (aVar.a((Object) null, this) == f10) {
                    return f10;
                }
                context = context2;
            } else if (i10 == 1) {
                context = (Context) this.f50271b;
                aVar = (C5817a) this.f50270a;
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                if (!TextUtils.isEmpty(C3016e.f31053z)) {
                    C3023l.l("UserAgent cached " + C3016e.f31053z);
                    str = C3016e.f31053z;
                } else {
                    try {
                        C3023l.l("Begin getUserAgentAsync " + Thread.currentThread());
                        str = WebSettings.getDefaultUserAgent(context);
                        try {
                            C3023l.l("End getUserAgentAsync " + Thread.currentThread() + ' ' + str);
                        } catch (Exception e10) {
                            e = e10;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        str = null;
                        C3023l.b("Failed to retrieve userAgent string. " + e.getMessage());
                        return str;
                    }
                }
                return str;
            } finally {
                aVar.e((Object) null);
            }
        }
    }

    /* renamed from: Ae.b$b  reason: collision with other inner class name */
    static final class C0762b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50275b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0762b(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50275b = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new C0762b(this.f50275b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((C0762b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f50274a == 0) {
                w.b(obj);
                if (!TextUtils.isEmpty(C3016e.f31053z)) {
                    C3023l.l("UserAgent cached " + C3016e.f31053z);
                    return C3016e.f31053z;
                }
                String str = null;
                try {
                    C3023l.l("Begin getUserAgentSync " + Thread.currentThread());
                    WebView webView = new WebView(this.f50275b);
                    str = webView.getSettings().getUserAgentString();
                    webView.destroy();
                    C3023l.l("End getUserAgentSync " + Thread.currentThread() + ' ' + str);
                    return str;
                } catch (Exception e10) {
                    C3023l.b("Failed to retrieve userAgent string. " + e10.getMessage());
                    return str;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final C5817a a() {
        return f50269a;
    }

    public static final Object b(Context context, C6658d dVar) {
        return C5572i.g(Z.a(), new a(context, (C6658d) null), dVar);
    }

    public static final Object c(Context context, C6658d dVar) {
        return C5572i.g(Z.c(), new C0762b(context, (C6658d) null), dVar);
    }
}
