package s;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.app.g;
import androidx.core.content.c;
import java.util.ArrayList;
import s.C2573a;

/* renamed from: s.d  reason: case insensitive filesystem */
public final class C2576d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f25762a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f25763b;

    C2576d(Intent intent, Bundle bundle) {
        this.f25762a = intent;
        this.f25763b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f25762a.setData(uri);
        c.startActivity(context, this.f25762a, this.f25763b);
    }

    /* renamed from: s.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f25764a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final C2573a.C0431a f25765b = new C2573a.C0431a();

        /* renamed from: c  reason: collision with root package name */
        private ArrayList f25766c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f25767d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList f25768e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray f25769f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f25770g;

        /* renamed from: h  reason: collision with root package name */
        private int f25771h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f25772i = true;

        public a() {
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            g.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f25764a.putExtras(bundle);
        }

        public C2576d a() {
            if (!this.f25764a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c((IBinder) null, (PendingIntent) null);
            }
            ArrayList arrayList = this.f25766c;
            if (arrayList != null) {
                this.f25764a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList arrayList2 = this.f25768e;
            if (arrayList2 != null) {
                this.f25764a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f25764a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f25772i);
            this.f25764a.putExtras(this.f25765b.a().a());
            Bundle bundle = this.f25770g;
            if (bundle != null) {
                this.f25764a.putExtras(bundle);
            }
            if (this.f25769f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f25769f);
                this.f25764a.putExtras(bundle2);
            }
            this.f25764a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f25771h);
            return new C2576d(this.f25764a, this.f25767d);
        }

        public a b(f fVar) {
            this.f25764a.setPackage(fVar.d().getPackageName());
            c(fVar.c(), fVar.e());
            return this;
        }

        public a(f fVar) {
            if (fVar != null) {
                b(fVar);
            }
        }
    }
}
