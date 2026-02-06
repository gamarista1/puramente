package u3;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import u3.u;
import y3.h;

/* renamed from: u3.f  reason: case insensitive filesystem */
public class C2714f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26635a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26636b;

    /* renamed from: c  reason: collision with root package name */
    public final h.c f26637c;

    /* renamed from: d  reason: collision with root package name */
    public final u.e f26638d;

    /* renamed from: e  reason: collision with root package name */
    public final List f26639e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f26640f;

    /* renamed from: g  reason: collision with root package name */
    public final u.d f26641g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f26642h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f26643i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f26644j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f26645k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f26646l;

    /* renamed from: m  reason: collision with root package name */
    private final Set f26647m;

    /* renamed from: n  reason: collision with root package name */
    public final String f26648n;

    /* renamed from: o  reason: collision with root package name */
    public final File f26649o;

    /* renamed from: p  reason: collision with root package name */
    public final Callable f26650p;

    /* renamed from: q  reason: collision with root package name */
    public final List f26651q;

    /* renamed from: r  reason: collision with root package name */
    public final List f26652r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f26653s;

    public C2714f(Context context, String str, h.c cVar, u.e eVar, List list, boolean z10, u.d dVar, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, u.f fVar, List list2, List list3) {
        boolean z13;
        u.d dVar2 = dVar;
        Executor executor3 = executor;
        Executor executor4 = executor2;
        Intent intent2 = intent;
        List list4 = list2;
        List list5 = list3;
        C6496s.h(context, "context");
        C6496s.h(cVar, "sqliteOpenHelperFactory");
        C6496s.h(eVar, "migrationContainer");
        C6496s.h(dVar2, "journalMode");
        C6496s.h(executor3, "queryExecutor");
        C6496s.h(executor4, "transactionExecutor");
        C6496s.h(list4, "typeConverters");
        C6496s.h(list5, "autoMigrationSpecs");
        this.f26635a = context;
        this.f26636b = str;
        this.f26637c = cVar;
        this.f26638d = eVar;
        this.f26639e = list;
        this.f26640f = z10;
        this.f26641g = dVar2;
        this.f26642h = executor3;
        this.f26643i = executor4;
        this.f26644j = intent2;
        this.f26645k = z11;
        this.f26646l = z12;
        this.f26647m = set;
        this.f26648n = str2;
        this.f26649o = file;
        this.f26650p = callable;
        this.f26651q = list4;
        this.f26652r = list5;
        if (intent2 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f26653s = z13;
    }

    public boolean a(int i10, int i11) {
        if ((i10 > i11 && this.f26646l) || !this.f26645k) {
            return false;
        }
        Set set = this.f26647m;
        if (set == null || !set.contains(Integer.valueOf(i10))) {
            return true;
        }
        return false;
    }
}
