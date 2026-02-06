package j3;

import Ef.m;
import Rg.k;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import j3.C2128E;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

@C2128E.b("activity")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lj3/a;", "Lj3/E;", "Lj3/a$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "l", "()Lj3/a$b;", "", "k", "()Z", "destination", "Landroid/os/Bundle;", "args", "Lj3/z;", "navOptions", "Lj3/E$a;", "navigatorExtras", "Lj3/s;", "m", "(Lj3/a$b;Landroid/os/Bundle;Lj3/z;Lj3/E$a;)Lj3/s;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", "e", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j3.a  reason: case insensitive filesystem */
public class C2130a extends C2128E {

    /* renamed from: e  reason: collision with root package name */
    public static final C0363a f22783e = new C0363a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f22784c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f22785d;

    /* renamed from: j3.a$a  reason: collision with other inner class name */
    public static final class C0363a {
        public /* synthetic */ C0363a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0363a() {
        }
    }

    /* renamed from: j3.a$b */
    public static class b extends s {

        /* renamed from: m  reason: collision with root package name */
        private Intent f22786m;

        /* renamed from: n  reason: collision with root package name */
        private String f22787n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C2128E e10) {
            super(e10);
            C6496s.h(e10, "activityNavigator");
        }

        public boolean W() {
            return false;
        }

        public final String Z() {
            Intent intent = this.f22786m;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName a0() {
            Intent intent = this.f22786m;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String c0() {
            return this.f22787n;
        }

        public boolean equals(Object obj) {
            boolean z10;
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.f22786m;
                if (intent != null) {
                    z10 = intent.filterEquals(((b) obj).f22786m);
                } else if (((b) obj).f22786m == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && C6496s.c(this.f22787n, ((b) obj).f22787n)) {
                    return true;
                }
            }
            return false;
        }

        public final Intent f0() {
            return this.f22786m;
        }

        public int hashCode() {
            int i10;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f22786m;
            int i11 = 0;
            if (intent != null) {
                i10 = intent.filterHashCode();
            } else {
                i10 = 0;
            }
            int i12 = (hashCode + i10) * 31;
            String str = this.f22787n;
            if (str != null) {
                i11 = str.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            ComponentName a02 = a0();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (a02 != null) {
                sb2.append(" class=");
                sb2.append(a02.getClassName());
            } else {
                String Z10 = Z();
                if (Z10 != null) {
                    sb2.append(" action=");
                    sb2.append(Z10);
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "sb.toString()");
            return sb3;
        }
    }

    /* renamed from: j3.a$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22788a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Context invoke(Context context) {
            C6496s.h(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public C2130a(Context context) {
        Object obj;
        C6496s.h(context, "context");
        this.f22784c = context;
        Iterator it = k.h(context, c.f22788a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f22785d = (Activity) obj;
    }

    public boolean k() {
        Activity activity = this.f22785d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: l */
    public b a() {
        return new b(this);
    }

    /* renamed from: m */
    public s d(b bVar, Bundle bundle, z zVar, C2128E.a aVar) {
        Intent intent;
        int intExtra;
        C2126C c10;
        String str;
        C6496s.h(bVar, "destination");
        if (bVar.f0() != null) {
            Intent intent2 = new Intent(bVar.f0());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String c02 = bVar.c0();
                if (!(c02 == null || c02.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(c02);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            Map t10 = bVar.t();
                            C6496s.e(group);
                            C2137h hVar = (C2137h) t10.get(group);
                            if (hVar != null) {
                                c10 = hVar.a();
                            } else {
                                c10 = null;
                            }
                            if (c10 == null || (str = c10.serializeAsValue(c10.get(bundle, group))) == null) {
                                str = Uri.encode(String.valueOf(bundle.get(group)));
                            }
                            stringBuffer.append(str);
                        } else {
                            throw new IllegalArgumentException(("Could not find " + group + " in " + bundle + " to fill data pattern " + c02).toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            if (this.f22785d == null) {
                intent2.addFlags(268435456);
            }
            if (zVar != null && zVar.j()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f22785d;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", bVar.x());
            Resources resources = this.f22784c.getResources();
            if (zVar != null) {
                int c11 = zVar.c();
                int d10 = zVar.d();
                if ((c11 <= 0 || !C6496s.c(resources.getResourceTypeName(c11), "animator")) && (d10 <= 0 || !C6496s.c(resources.getResourceTypeName(d10), "animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c11);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d10);
                } else {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c11) + " and popExit resource " + resources.getResourceName(d10) + " when launching " + bVar);
                }
            }
            this.f22784c.startActivity(intent2);
            if (!(zVar == null || this.f22785d == null)) {
                int a10 = zVar.a();
                int b10 = zVar.b();
                if ((a10 > 0 && C6496s.c(resources.getResourceTypeName(a10), "animator")) || (b10 > 0 && C6496s.c(resources.getResourceTypeName(b10), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a10) + " and exit resource " + resources.getResourceName(b10) + "when launching " + bVar);
                } else if (a10 >= 0 || b10 >= 0) {
                    this.f22785d.overridePendingTransition(m.d(a10, 0), m.d(b10, 0));
                }
            }
            return null;
        }
        throw new IllegalStateException(("Destination " + bVar.x() + " does not have an Intent set.").toString());
    }
}
