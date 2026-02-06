package Ae;

import Fe.C3023l;
import Ug.C5572i;
import Ug.K;
import Ug.Z;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public abstract class a {

    /* renamed from: Ae.a$a  reason: collision with other inner class name */
    static final class C0761a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50263a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50264b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0761a(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50264b = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new C0761a(this.f50264b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((C0761a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f50263a == 0) {
                w.b(obj);
                try {
                    ContentResolver contentResolver = this.f50264b.getContentResolver();
                    return new Pair(kotlin.coroutines.jvm.internal.b.c(Settings.Secure.getInt(contentResolver, "limit_ad_tracking")), Settings.Secure.getString(contentResolver, "advertising_id"));
                } catch (Exception e10) {
                    C3023l.m("Caught getAmazonFireAdvertisingInfo exception: " + e10);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50266b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50266b = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f50266b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f50265a == 0) {
                w.b(obj);
                try {
                    return AdvertisingIdClient.getAdvertisingIdInfo(this.f50266b);
                } catch (Exception e10) {
                    C3023l.m("Caught getGoogleAdvertisingInfoObject exception: " + e10);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50268b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50268b = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f50268b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f50267a == 0) {
                w.b(obj);
                try {
                    return com.huawei.hms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(this.f50268b);
                } catch (Exception e10) {
                    C3023l.m("Caught getHuaweiAdvertisingInfoObject exception: " + e10);
                    AdvertisingIdClient.Info info = null;
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final Object a(Context context, C6658d dVar) {
        return C5572i.g(Z.a(), new C0761a(context, (C6658d) null), dVar);
    }

    public static final Object b(Context context, C6658d dVar) {
        return C5572i.g(Z.a(), new b(context, (C6658d) null), dVar);
    }

    public static final Object c(Context context, C6658d dVar) {
        return C5572i.g(Z.a(), new c(context, (C6658d) null), dVar);
    }
}
