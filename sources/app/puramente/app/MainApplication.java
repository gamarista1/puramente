package app.puramente.app;

import Dd.m;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.database.CursorWindow;
import com.bugsnag.android.C3270s;
import com.facebook.react.A;
import com.facebook.react.C3365k;
import com.facebook.react.C3446x;
import com.facebook.react.O;
import com.facebook.react.defaults.d;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import com.intercom.reactnative.IntercomModule;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lapp/puramente/app/MainApplication;", "Landroid/app/Application;", "Lcom/facebook/react/x;", "<init>", "()V", "Llf/M;", "onCreate", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/facebook/react/O;", "a", "Lcom/facebook/react/O;", "()Lcom/facebook/react/O;", "reactNativeHost", "Lcom/facebook/react/A;", "b", "()Lcom/facebook/react/A;", "reactHost", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainApplication extends Application implements C3446x {

    /* renamed from: a  reason: collision with root package name */
    private final O f19050a = new m(this, new a(this));

    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        private final boolean f19051c = true;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f19052d = true;

        a(MainApplication mainApplication) {
            super(mainApplication);
        }

        public boolean f() {
            return false;
        }

        /* access modifiers changed from: protected */
        public String getJSMainModuleName() {
            return ".expo/.virtual-metro-entry";
        }

        /* access modifiers changed from: protected */
        public List getPackages() {
            ArrayList a10 = new C3365k(this).a();
            C6496s.e(a10);
            return a10;
        }

        /* access modifiers changed from: protected */
        public Boolean k() {
            return Boolean.valueOf(this.f19052d);
        }

        /* access modifiers changed from: protected */
        public boolean l() {
            return this.f19051c;
        }
    }

    public O a() {
        return this.f19050a;
    }

    public A b() {
        m.a aVar = m.f50643f;
        Context applicationContext = getApplicationContext();
        C6496s.g(applicationContext, "getApplicationContext(...)");
        return aVar.a(applicationContext, a());
    }

    public void onConfigurationChanged(Configuration configuration) {
        C6496s.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Dd.a.c(this, configuration);
    }

    public void onCreate() {
        super.onCreate();
        C3270s.c(this);
        SoLoader.l(this, OpenSourceMergedSoMapping.f41360a);
        com.facebook.react.defaults.a.d(false, false, false, 7, (Object) null);
        IntercomModule.initialize(this, "android_sdk-75b8a76f6433f849aba815d93319cadfd2a38e9a", "on66nro2");
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            C6496s.g(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            declaredField.set((Object) null, 52428800);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Dd.a.b(this);
    }
}
