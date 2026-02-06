package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import d2.C1926a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C3890f;
import o7.E;
import o7.M;
import o7.W;
import y7.G;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "", "resultCode", "Landroid/content/Intent;", "resultIntent", "Llf/M;", "a", "(ILandroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "", "Z", "shouldCloseCustomTab", "Landroid/content/BroadcastReceiver;", "b", "Landroid/content/BroadcastReceiver;", "redirectReceiver", "c", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomTabMainActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public static final a f39266c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final String f39267d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f39268e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f39269f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f39270g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f39271h;

    /* renamed from: i  reason: collision with root package name */
    public static final String f39272i;

    /* renamed from: j  reason: collision with root package name */
    public static final String f39273j;

    /* renamed from: a  reason: collision with root package name */
    private boolean f39274a = true;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f39275b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Bundle b(String str) {
            Uri parse = Uri.parse(str);
            Bundle q02 = W.q0(parse.getQuery());
            q02.putAll(W.q0(parse.getFragment()));
            return q02;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39276a;

        static {
            int[] iArr = new int[G.values().length];
            try {
                iArr[G.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f39276a = iArr;
        }
    }

    public static final class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CustomTabMainActivity f39277a;

        c(CustomTabMainActivity customTabMainActivity) {
            this.f39277a = customTabMainActivity;
        }

        public void onReceive(Context context, Intent intent) {
            C6496s.h(context, "context");
            C6496s.h(intent, "intent");
            Intent intent2 = new Intent(this.f39277a, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f39272i);
            String str = CustomTabMainActivity.f39270g;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            this.f39277a.startActivity(intent2);
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        Class<CustomTabMainActivity> cls = CustomTabMainActivity.class;
        sb2.append(cls.getSimpleName());
        sb2.append(".extra_action");
        f39267d = sb2.toString();
        f39268e = cls.getSimpleName() + ".extra_params";
        f39269f = cls.getSimpleName() + ".extra_chromePackage";
        f39270g = cls.getSimpleName() + ".extra_url";
        f39271h = cls.getSimpleName() + ".extra_targetApp";
        f39272i = cls.getSimpleName() + ".action_refresh";
        f39273j = cls.getSimpleName() + ".no_activity_exception";
    }

    private final void a(int i10, Intent intent) {
        Bundle bundle;
        BroadcastReceiver broadcastReceiver = this.f39275b;
        if (broadcastReceiver != null) {
            C1926a.b(this).e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f39270g);
            if (stringExtra != null) {
                bundle = f39266c.b(stringExtra);
            } else {
                bundle = new Bundle();
            }
            Intent intent2 = getIntent();
            C6496s.g(intent2, "intent");
            Intent n10 = M.n(intent2, bundle, (C3459v) null);
            if (n10 != null) {
                intent = n10;
            }
            setResult(i10, intent);
        } else {
            Intent intent3 = getIntent();
            C6496s.g(intent3, "intent");
            setResult(i10, M.n(intent3, (Bundle) null, (C3459v) null));
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String stringExtra;
        C3890f fVar;
        super.onCreate(bundle);
        String str = CustomTabActivity.f39262c;
        if (C6496s.c(str, getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null && (stringExtra = getIntent().getStringExtra(f39267d)) != null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f39268e);
            String stringExtra2 = getIntent().getStringExtra(f39269f);
            if (b.f39276a[G.f49607b.a(getIntent().getStringExtra(f39271h)).ordinal()] == 1) {
                fVar = new E(stringExtra, bundleExtra);
            } else {
                fVar = new C3890f(stringExtra, bundleExtra);
            }
            boolean a10 = fVar.a(this, stringExtra2);
            this.f39274a = false;
            if (!a10) {
                setResult(0, getIntent().putExtra(f39273j, true));
                finish();
                return;
            }
            c cVar = new c(this);
            this.f39275b = cVar;
            C1926a.b(this).c(cVar, new IntentFilter(str));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C6496s.h(intent, "intent");
        super.onNewIntent(intent);
        if (C6496s.c(f39272i, intent.getAction())) {
            C1926a.b(this).d(new Intent(CustomTabActivity.f39263d));
            a(-1, intent);
        } else if (C6496s.c(CustomTabActivity.f39262c, intent.getAction())) {
            a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f39274a) {
            a(0, (Intent) null);
        }
        this.f39274a = true;
    }
}
