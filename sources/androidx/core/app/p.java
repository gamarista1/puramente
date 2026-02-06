package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.C1588b;
import androidx.core.app.o;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15899a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f15900b;

    /* renamed from: c  reason: collision with root package name */
    private final o.f f15901c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f15902d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f15903e;

    /* renamed from: f  reason: collision with root package name */
    private final List f15904f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f15905g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f15906h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f15907i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    p(o.f fVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Icon icon;
        List<String> list;
        int i10;
        this.f15901c = fVar;
        Context context = fVar.f15857a;
        this.f15899a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15900b = e.a(context, fVar.f15844K);
        } else {
            this.f15900b = new Notification.Builder(fVar.f15857a);
        }
        Notification notification = fVar.f15853T;
        Notification.Builder lights = this.f15900b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, fVar.f15865i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(fVar.f15861e).setContentText(fVar.f15862f).setContentInfo(fVar.f15867k).setContentIntent(fVar.f15863g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = fVar.f15864h;
        if ((notification.flags & 128) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z13).setNumber(fVar.f15868l).setProgress(fVar.f15876t, fVar.f15877u, fVar.f15878v);
        Notification.Builder builder = this.f15900b;
        IconCompat iconCompat = fVar.f15866j;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = iconCompat.p(context);
        }
        c.b(builder, icon);
        this.f15900b.setSubText(fVar.f15873q).setUsesChronometer(fVar.f15871o).setPriority(fVar.f15869m);
        Iterator it = fVar.f15858b.iterator();
        while (it.hasNext()) {
            b((o.b) it.next());
        }
        Bundle bundle = fVar.f15837D;
        if (bundle != null) {
            this.f15905g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f15902d = fVar.f15841H;
        this.f15903e = fVar.f15842I;
        this.f15900b.setShowWhen(fVar.f15870n);
        a.h(this.f15900b, fVar.f15882z);
        a.f(this.f15900b, fVar.f15879w);
        a.i(this.f15900b, fVar.f15881y);
        a.g(this.f15900b, fVar.f15880x);
        this.f15906h = fVar.f15849P;
        b.b(this.f15900b, fVar.f15836C);
        b.c(this.f15900b, fVar.f15838E);
        b.f(this.f15900b, fVar.f15839F);
        b.d(this.f15900b, fVar.f15840G);
        b.e(this.f15900b, notification.sound, notification.audioAttributes);
        if (i11 < 28) {
            list = e(g(fVar.f15859c), fVar.f15856W);
        } else {
            list = fVar.f15856W;
        }
        if (list != null && !list.isEmpty()) {
            for (String a10 : list) {
                b.a(this.f15900b, a10);
            }
        }
        this.f15907i = fVar.f15843J;
        if (fVar.f15860d.size() > 0) {
            Bundle bundle2 = fVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < fVar.f15860d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), q.a((o.b) fVar.f15860d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            fVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f15905g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = fVar.f15855V;
        if (obj != null) {
            c.c(this.f15900b, obj);
        }
        this.f15900b.setExtras(fVar.f15837D);
        d.e(this.f15900b, fVar.f15875s);
        RemoteViews remoteViews = fVar.f15841H;
        if (remoteViews != null) {
            d.c(this.f15900b, remoteViews);
        }
        RemoteViews remoteViews2 = fVar.f15842I;
        if (remoteViews2 != null) {
            d.b(this.f15900b, remoteViews2);
        }
        RemoteViews remoteViews3 = fVar.f15843J;
        if (remoteViews3 != null) {
            d.d(this.f15900b, remoteViews3);
        }
        if (i13 >= 26) {
            e.b(this.f15900b, fVar.f15845L);
            e.e(this.f15900b, fVar.f15874r);
            e.f(this.f15900b, fVar.f15846M);
            e.g(this.f15900b, fVar.f15848O);
            e.d(this.f15900b, fVar.f15849P);
            if (fVar.f15835B) {
                e.c(this.f15900b, fVar.f15834A);
            }
            if (!TextUtils.isEmpty(fVar.f15844K)) {
                this.f15900b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i13 >= 28) {
            Iterator it2 = fVar.f15859c.iterator();
            while (it2.hasNext()) {
                f.a(this.f15900b, ((u) it2.next()).i());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            g.a(this.f15900b, fVar.f15851R);
            g.b(this.f15900b, o.e.j(fVar.f15852S));
            androidx.core.content.e eVar = fVar.f15847N;
            if (eVar != null) {
                g.d(this.f15900b, eVar.c());
            }
        }
        if (i14 >= 31 && (i10 = fVar.f15850Q) != 0) {
            h.b(this.f15900b, i10);
        }
        if (fVar.f15854U) {
            if (this.f15901c.f15880x) {
                this.f15906h = 2;
            } else {
                this.f15906h = 1;
            }
            this.f15900b.setVibrate((long[]) null);
            this.f15900b.setSound((Uri) null);
            int i15 = notification.defaults & -4;
            notification.defaults = i15;
            this.f15900b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f15901c.f15879w)) {
                    a.f(this.f15900b, "silent");
                }
                e.d(this.f15900b, this.f15906h);
            }
        }
    }

    private void b(o.b bVar) {
        Icon icon;
        Bundle bundle;
        IconCompat d10 = bVar.d();
        if (d10 != null) {
            icon = d10.o();
        } else {
            icon = null;
        }
        Notification.Action.Builder a10 = c.a(icon, bVar.h(), bVar.a());
        if (bVar.e() != null) {
            for (RemoteInput c10 : w.b(bVar.e())) {
                a.c(a10, c10);
            }
        }
        if (bVar.c() != null) {
            bundle = new Bundle(bVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(a10, bVar.b());
        bundle.putInt("android.support.action.semanticAction", bVar.f());
        if (i10 >= 28) {
            f.b(a10, bVar.f());
        }
        if (i10 >= 29) {
            g.c(a10, bVar.j());
        }
        if (i10 >= 31) {
            h.a(a10, bVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.g());
        a.b(a10, bundle);
        a.a(this.f15900b, a.d(a10));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C1588b bVar = new C1588b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((u) it.next()).h());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public Notification.Builder a() {
        return this.f15900b;
    }

    public Notification c() {
        RemoteViews remoteViews;
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        o.i iVar = this.f15901c.f15872p;
        if (iVar != null) {
            iVar.b(this);
        }
        if (iVar != null) {
            remoteViews = iVar.e(this);
        } else {
            remoteViews = null;
        }
        Notification d11 = d();
        if (remoteViews != null) {
            d11.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f15901c.f15841H;
            if (remoteViews2 != null) {
                d11.contentView = remoteViews2;
            }
        }
        if (!(iVar == null || (d10 = iVar.d(this)) == null)) {
            d11.bigContentView = d10;
        }
        if (!(iVar == null || (f10 = this.f15901c.f15872p.f(this)) == null)) {
            d11.headsUpContentView = f10;
        }
        if (!(iVar == null || (a10 = o.a(d11)) == null)) {
            iVar.a(a10);
        }
        return d11;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f15900b.build();
        }
        Notification build = this.f15900b.build();
        if (this.f15906h != 0) {
            if (!(a.e(build) == null || (build.flags & 512) == 0 || this.f15906h != 2)) {
                h(build);
            }
            if (a.e(build) != null && (build.flags & 512) == 0 && this.f15906h == 1) {
                h(build);
            }
        }
        return build;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f15899a;
    }
}
