package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import d2.C1926a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Llf/M;", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "Landroid/content/BroadcastReceiver;", "a", "Landroid/content/BroadcastReceiver;", "closeReceiver", "b", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomTabActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39261b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final String f39262c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f39263d;

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f39264a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CustomTabActivity f39265a;

        b(CustomTabActivity customTabActivity) {
            this.f39265a = customTabActivity;
        }

        public void onReceive(Context context, Intent intent) {
            C6496s.h(context, "context");
            C6496s.h(intent, "intent");
            this.f39265a.finish();
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        Class<CustomTabActivity> cls = CustomTabActivity.class;
        sb2.append(cls.getSimpleName());
        sb2.append(".action_customTabRedirect");
        f39262c = sb2.toString();
        f39263d = cls.getSimpleName() + ".action_destroy";
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f39262c);
            intent2.putExtra(CustomTabMainActivity.f39270g, getIntent().getDataString());
            C1926a.b(this).d(intent2);
            b bVar = new b(this);
            C1926a.b(this).c(bVar, new IntentFilter(f39263d));
            this.f39264a = bVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f39262c);
        intent.putExtra(CustomTabMainActivity.f39270g, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f39264a;
        if (broadcastReceiver != null) {
            C1926a.b(this).e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
