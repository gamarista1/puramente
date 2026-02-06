package q4;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.C1767o;
import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import p4.C3927b;
import p4.C3928c;
import p4.g;
import p4.h;
import yf.C6798l;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b \u0010!R$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010%8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lq4/c;", "Landroidx/fragment/app/o;", "<init>", "()V", "Lp4/g;", "result", "Llf/M;", "X", "(Lp4/g;)V", "Lkotlin/Function1;", "callback", "V", "(Lyf/l;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "outState", "onSaveInstanceState", "onStart", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Lp4/h$a;", "q", "Lp4/h$a;", "authenticationAttempt", "r", "Lyf/l;", "Landroid/webkit/WebView;", "W", "()Landroid/webkit/WebView;", "webViewIfCreated", "s", "a", "invertase_react-native-apple-authentication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: q4.c  reason: case insensitive filesystem */
public final class C3945c extends C1767o {

    /* renamed from: s  reason: collision with root package name */
    public static final a f47604s = new a((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    private h.a f47605q;

    /* renamed from: r  reason: collision with root package name */
    private C6798l f47606r;

    /* renamed from: q4.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3945c a(h.a aVar) {
            C6496s.h(aVar, "authenticationAttempt");
            C3945c cVar = new C3945c();
            Bundle bundle = new Bundle();
            bundle.putParcelable("authenticationAttempt", aVar);
            cVar.setArguments(bundle);
            return cVar;
        }

        private a() {
        }
    }

    /* renamed from: q4.c$b */
    /* synthetic */ class b extends C6494p implements C6798l {
        b(Object obj) {
            super(1, obj, C3945c.class, "onCallback", "onCallback(Lcom/RNAppleAuthentication/SignInWithAppleResult;)V", 0);
        }

        public final void i(g gVar) {
            C6496s.h(gVar, "p0");
            ((C3945c) this.receiver).X(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((g) obj);
            return C6514M.f71813a;
        }
    }

    private final WebView W() {
        View view = getView();
        if (view instanceof WebView) {
            return (WebView) view;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void X(g gVar) {
        Dialog H10 = H();
        if (H10 != null) {
            H10.dismiss();
        }
        C6798l lVar = this.f47606r;
        if (lVar != null) {
            lVar.invoke(gVar);
        }
    }

    public final void V(C6798l lVar) {
        C6496s.h(lVar, "callback");
        this.f47606r = lVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C6496s.h(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        X(g.a.f47556a);
    }

    public void onCreate(Bundle bundle) {
        h.a aVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            aVar = (h.a) arguments.getParcelable("authenticationAttempt");
        } else {
            aVar = null;
        }
        C6496s.e(aVar);
        this.f47605q = aVar;
        R(0, C3928c.f47554a);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C6496s.h(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        WebView webView = new WebView(requireContext());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        h.a aVar = this.f47605q;
        h.a aVar2 = null;
        if (aVar == null) {
            C6496s.v("authenticationAttempt");
            aVar = null;
        }
        webView.addJavascriptInterface(new C3927b(aVar.c(), new b(this)), "FormInterceptorInterface");
        h.a aVar3 = this.f47605q;
        if (aVar3 == null) {
            C6496s.v("authenticationAttempt");
            aVar3 = null;
        }
        webView.setWebViewClient(new C3944b(aVar3, C3927b.f47550c.a()));
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("webView");
            if (bundle2 != null) {
                webView.restoreState(bundle2);
            }
        } else {
            h.a aVar4 = this.f47605q;
            if (aVar4 == null) {
                C6496s.v("authenticationAttempt");
            } else {
                aVar2 = aVar4;
            }
            webView.loadUrl(aVar2.a());
        }
        return webView;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C6496s.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        WebView W10 = W();
        if (W10 != null) {
            W10.saveState(bundle2);
        }
        C6514M m10 = C6514M.f71813a;
        bundle.putBundle("webView", bundle2);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog H10 = H();
        if (H10 != null && (window = H10.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }
}
