package o7;

import Sg.p;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.C3459v;
import com.facebook.C3461x;
import com.facebook.I;
import io.branch.rnbranch.RNBranchModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import t7.C4049a;
import y7.C4199e;
import y7.G;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    public static final M f47128a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f47129b = M.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final List f47130c;

    /* renamed from: d  reason: collision with root package name */
    private static final List f47131d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map f47132e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicBoolean f47133f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private static final Integer[] f47134g = {20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};

    private static final class a extends e {
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    private static final class b extends e {
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        public String d() {
            return "com.instagram.android";
        }

        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    private static final class c extends e {
        private final boolean g() {
            if (I.l().getApplicationInfo().targetSdkVersion >= 30) {
                return true;
            }
            return false;
        }

        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        public String d() {
            return "com.facebook.katana";
        }

        public void f() {
            if (g()) {
                Log.w(M.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    private static final class d extends e {
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    public static final class f {

        /* renamed from: c  reason: collision with root package name */
        public static final a f47136c = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public e f47137a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f47138b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(e eVar, int i10) {
                f fVar = new f((DefaultConstructorMarker) null);
                fVar.f47137a = eVar;
                fVar.f47138b = i10;
                return fVar;
            }

            public final f b() {
                f fVar = new f((DefaultConstructorMarker) null);
                fVar.f47138b = -1;
                return fVar;
            }

            private a() {
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e c() {
            return this.f47137a;
        }

        public final int d() {
            return this.f47138b;
        }

        private f() {
        }
    }

    private static final class g extends e {
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        M m10 = new M();
        f47128a = m10;
        f47130c = m10.f();
        f47131d = m10.e();
        f47132e = m10.d();
    }

    private M() {
    }

    public static final Bundle A(Intent intent) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(intent, "resultIntent");
            int z10 = z(intent);
            Bundle extras = intent.getExtras();
            if (!C(z10)) {
                return extras;
            }
            if (extras == null) {
                return extras;
            }
            return extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final boolean B(Intent intent) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            C6496s.h(intent, "resultIntent");
            Bundle q10 = q(intent);
            if (q10 != null) {
                return q10.containsKey(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            }
            return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final boolean C(int i10) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            if (!C6559l.W(f47134g, Integer.valueOf(i10)) || i10 < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final void D(Intent intent, String str, String str2, int i10, Bundle bundle) {
        Class<M> cls = M.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(intent, "intent");
                String m10 = I.m();
                String n10 = I.n();
                intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i10).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", m10);
                if (C(i10)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action_id", str);
                    W.t0(bundle2, "app_name", n10);
                    intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
                    return;
                }
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!W.e0(n10)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", n10);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void E() {
        Class<M> cls = M.class;
        if (!C4049a.d(cls)) {
            try {
                if (f47133f.compareAndSet(false, true)) {
                    I.t().execute(new L());
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void F() {
        Class<M> cls = M.class;
        if (!C4049a.d(cls)) {
            try {
                for (e a10 : f47130c) {
                    a10.a(true);
                }
                f47133f.set(false);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final Intent G(Context context, Intent intent, e eVar) {
        ResolveInfo resolveActivity;
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            String str = resolveActivity.activityInfo.packageName;
            C6496s.g(str, "resolveInfo.activityInfo.packageName");
            if (!C3900p.a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final Intent H(Context context, Intent intent, e eVar) {
        ResolveInfo resolveService;
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            String str = resolveService.serviceInfo.packageName;
            C6496s.g(str, "resolveInfo.serviceInfo.packageName");
            if (!C3900p.a(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(M m10, e eVar) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return m10.p(eVar);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f47129b;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final Map d() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List list = f47130c;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f47131d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final List e() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            ArrayList h10 = C6565s.h(new a());
            h10.addAll(f());
            return h10;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final List f() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return C6565s.h(new c(), new g());
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final Uri g(e eVar) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + eVar.d() + ".provider.PlatformProvider/versions");
            C6496s.g(parse, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final int h(TreeSet treeSet, int i10, int[] iArr) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return 0;
        }
        try {
            C6496s.h(iArr, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = iArr.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i11 = -1;
            while (descendingIterator.hasNext()) {
                Integer num = (Integer) descendingIterator.next();
                C6496s.g(num, "fbAppVersion");
                i11 = Math.max(i11, num.intValue());
                while (length >= 0 && iArr[length] > num.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == num.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i11, i10);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return 0;
        }
    }

    public static final Bundle i(C3459v vVar) {
        Class<M> cls = M.class;
        if (C4049a.d(cls) || vVar == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", vVar.toString());
            if (vVar instanceof C3461x) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final Intent j(Context context, String str, Collection collection, String str2, boolean z10, boolean z11, C4199e eVar, String str3, String str4, String str5, boolean z12, boolean z13, boolean z14) {
        Context context2 = context;
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context2, "context");
            C6496s.h(str, "applicationId");
            C6496s.h(collection, "permissions");
            C6496s.h(str2, "e2e");
            C6496s.h(eVar, "defaultAudience");
            C6496s.h(str3, "clientState");
            C6496s.h(str4, "authType");
            b bVar = new b();
            return G(context2, f47128a.k(bVar, str, collection, str2, z11, eVar, str3, str4, false, str5, z12, G.INSTAGRAM, z13, z14, "", (String) null, (String) null), bVar);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final Intent k(e eVar, String str, Collection collection, String str2, boolean z10, C4199e eVar2, String str3, String str4, boolean z11, String str5, boolean z12, G g10, boolean z13, boolean z14, String str6, String str7, String str8) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            String c10 = eVar.c();
            if (c10 == null) {
                return null;
            }
            String str9 = str;
            Intent putExtra = new Intent().setClassName(eVar.d(), c10).putExtra("client_id", str);
            C6496s.g(putExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", I.B());
            if (!W.f0(collection)) {
                putExtra.putExtra("scope", TextUtils.join(com.amazon.a.a.o.b.f.f37529a, collection));
            }
            if (!W.e0(str2)) {
                String str10 = str2;
                putExtra.putExtra("e2e", str2);
            }
            String str11 = str3;
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.e());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", com.amazon.a.a.o.b.f37475af);
            if (z10) {
                putExtra.putExtra("default_audience", eVar2.b());
            }
            putExtra.putExtra("legacy_override", I.w());
            String str12 = str4;
            putExtra.putExtra("auth_type", str4);
            if (z11) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            String str13 = str5;
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z12);
            if (z13) {
                putExtra.putExtra("fx_app", g10.toString());
            }
            if (z14) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final Intent l(Context context, String str, String str2, f fVar, Bundle bundle) {
        e c10;
        Intent G10;
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context, "context");
            if (fVar == null || (c10 = fVar.c()) == null || (G10 = G(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(c10.d()).addCategory("android.intent.category.DEFAULT"), c10)) == null) {
                return null;
            }
            D(G10, str, str2, fVar.d(), bundle);
            return G10;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final Intent m(Context context) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context, "context");
            for (e eVar : f47130c) {
                Intent H10 = H(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (H10 != null) {
                    return H10;
                }
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final Intent n(Intent intent, Bundle bundle, C3459v vVar) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(intent, "requestIntent");
            UUID r10 = r(intent);
            if (r10 == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", z(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", r10.toString());
            if (vVar != null) {
                bundle2.putBundle(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, i(vVar));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final List o(Context context, String str, Collection collection, String str2, boolean z10, boolean z11, C4199e eVar, String str3, String str4, boolean z12, String str5, boolean z13, boolean z14, boolean z15, String str6, String str7, String str8) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "applicationId");
            C6496s.h(collection, "permissions");
            C6496s.h(str2, "e2e");
            C6496s.h(eVar, "defaultAudience");
            C6496s.h(str3, "clientState");
            C6496s.h(str4, "authType");
            ArrayList arrayList = new ArrayList();
            for (e k10 : f47130c) {
                ArrayList arrayList2 = arrayList;
                Intent k11 = f47128a.k(k10, str, collection, str2, z11, eVar, str3, str4, z12, str5, z13, G.FACEBOOK, z14, z15, str6, str7, str8);
                if (k11 != null) {
                    arrayList2.add(k11);
                }
                String str9 = str;
                Collection collection2 = collection;
                String str10 = str2;
                C4199e eVar2 = eVar;
                String str11 = str3;
                String str12 = str4;
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0058 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[LOOP:0: B:28:0x006d->B:31:0x0073, LOOP_START, SYNTHETIC, Splitter:B:28:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b A[SYNTHETIC, Splitter:B:36:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094 A[Catch:{ all -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.TreeSet p(o7.M.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = t7.C4049a.d(r12)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            return r3
        L_0x000c:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch:{ all -> 0x008f }
            r2.<init>()     // Catch:{ all -> 0x008f }
            android.content.Context r4 = com.facebook.I.l()     // Catch:{ all -> 0x008f }
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch:{ all -> 0x008f }
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch:{ all -> 0x008f }
            android.net.Uri r6 = r12.g(r13)     // Catch:{ all -> 0x008f }
            android.content.Context r4 = com.facebook.I.l()     // Catch:{ all -> 0x0044 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r8.<init>()     // Catch:{ all -> 0x0044 }
            java.lang.String r13 = r13.d()     // Catch:{ all -> 0x0044 }
            r8.append(r13)     // Catch:{ all -> 0x0044 }
            java.lang.String r13 = ".provider.PlatformProvider"
            r8.append(r13)     // Catch:{ all -> 0x0044 }
            java.lang.String r13 = r8.toString()     // Catch:{ all -> 0x0044 }
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch:{ RuntimeException -> 0x0047 }
            goto L_0x004e
        L_0x0044:
            r13 = move-exception
            r0 = r3
            goto L_0x0092
        L_0x0047:
            r13 = move-exception
            java.lang.String r4 = f47129b     // Catch:{ all -> 0x0044 }
            android.util.Log.e(r4, r1, r13)     // Catch:{ all -> 0x0044 }
            r13 = r3
        L_0x004e:
            if (r13 == 0) goto L_0x0088
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ NullPointerException -> 0x0065, SecurityException -> 0x005f, IllegalArgumentException -> 0x0058 }
            goto L_0x006b
        L_0x0058:
            java.lang.String r13 = f47129b     // Catch:{ all -> 0x0044 }
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x0044 }
        L_0x005d:
            r13 = r3
            goto L_0x006b
        L_0x005f:
            java.lang.String r13 = f47129b     // Catch:{ all -> 0x0044 }
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x0044 }
            goto L_0x005d
        L_0x0065:
            java.lang.String r13 = f47129b     // Catch:{ all -> 0x0044 }
            android.util.Log.e(r13, r1)     // Catch:{ all -> 0x0044 }
            goto L_0x005d
        L_0x006b:
            if (r13 == 0) goto L_0x0089
        L_0x006d:
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0089
            int r1 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0083 }
            int r1 = r13.getInt(r1)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0083 }
            r2.add(r1)     // Catch:{ all -> 0x0083 }
            goto L_0x006d
        L_0x0083:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L_0x0092
        L_0x0088:
            r13 = r3
        L_0x0089:
            if (r13 == 0) goto L_0x0091
            r13.close()     // Catch:{ all -> 0x008f }
            goto L_0x0091
        L_0x008f:
            r13 = move-exception
            goto L_0x0098
        L_0x0091:
            return r2
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0.close()     // Catch:{ all -> 0x008f }
        L_0x0097:
            throw r13     // Catch:{ all -> 0x008f }
        L_0x0098:
            t7.C4049a.b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.M.p(o7.M$e):java.util.TreeSet");
    }

    public static final Bundle q(Intent intent) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(intent, "intent");
            if (!C(z(intent))) {
                return null;
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final UUID r(Intent intent) {
        String str;
        Class<M> cls = M.class;
        if (C4049a.d(cls) || intent == null) {
            return null;
        }
        try {
            if (C(z(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                if (bundleExtra != null) {
                    str = bundleExtra.getString("action_id");
                } else {
                    str = null;
                }
            } else {
                str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (str == null) {
                return null;
            }
            try {
                return UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final Bundle s(Intent intent) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(intent, "resultIntent");
            if (!B(intent)) {
                return null;
            }
            Bundle q10 = q(intent);
            if (q10 != null) {
                return q10.getBundle(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            }
            return intent.getExtras();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final C3459v t(Bundle bundle) {
        Class<M> cls = M.class;
        if (C4049a.d(cls) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string == null || !p.v(string, "UserCanceled", true)) {
                return new C3459v(string2);
            }
            return new C3461x(string2);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final f u(String str, int[] iArr) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "action");
            C6496s.h(iArr, "versionSpec");
            List list = (List) f47132e.get(str);
            if (list == null) {
                list = C6565s.n();
            }
            return f47128a.v(list, iArr);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final f v(List list, int[] iArr) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            E();
            if (list == null) {
                return f.f47136c.b();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                int h10 = h(eVar.b(), x(), iArr);
                if (h10 != -1) {
                    return f.f47136c.a(eVar, h10);
                }
            }
            return f.f47136c.b();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final int w(int i10) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return 0;
        }
        try {
            return f47128a.v(f47130c, new int[]{i10}).d();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return 0;
        }
    }

    public static final int x() {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return 0;
        }
        try {
            return f47134g[0].intValue();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return 0;
        }
    }

    public static final Bundle y(Intent intent) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(intent, "intent");
            if (!C(z(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final int z(Intent intent) {
        Class<M> cls = M.class;
        if (C4049a.d(cls)) {
            return 0;
        }
        try {
            C6496s.h(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return 0;
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        private TreeSet f47135a;

        public final synchronized void a(boolean z10) {
            if (!z10) {
                try {
                    TreeSet treeSet = this.f47135a;
                    if (!(treeSet == null || treeSet == null || treeSet.isEmpty())) {
                        TreeSet treeSet2 = this.f47135a;
                        if (treeSet2 == null || treeSet2.isEmpty()) {
                            f();
                        }
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            this.f47135a = M.b(M.f47128a, this);
            TreeSet treeSet22 = this.f47135a;
            f();
        }

        public final TreeSet b() {
            TreeSet treeSet = this.f47135a;
            if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                a(false);
            }
            return this.f47135a;
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }
}
