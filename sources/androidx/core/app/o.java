package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m1.C2186b;
import n1.C2258t;

public abstract class o {

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f15792a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f15793b;

        /* renamed from: c  reason: collision with root package name */
        private final w[] f15794c;

        /* renamed from: d  reason: collision with root package name */
        private final w[] f15795d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15796e;

        /* renamed from: f  reason: collision with root package name */
        boolean f15797f;

        /* renamed from: g  reason: collision with root package name */
        private final int f15798g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f15799h;

        /* renamed from: i  reason: collision with root package name */
        public int f15800i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f15801j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f15802k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f15803l;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final IconCompat f15804a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f15805b;

            /* renamed from: c  reason: collision with root package name */
            private final PendingIntent f15806c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f15807d;

            /* renamed from: e  reason: collision with root package name */
            private final Bundle f15808e;

            /* renamed from: f  reason: collision with root package name */
            private ArrayList f15809f;

            /* renamed from: g  reason: collision with root package name */
            private int f15810g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f15811h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f15812i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f15813j;

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (w[]) null, true, 0, true, false, false);
            }

            private void c() {
                if (this.f15812i && this.f15806c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a(w wVar) {
                if (this.f15809f == null) {
                    this.f15809f = new ArrayList();
                }
                if (wVar != null) {
                    this.f15809f.add(wVar);
                }
                return this;
            }

            /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.o.b b() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.c()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList r3 = r0.f15809f
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.w r4 = (androidx.core.app.w) r4
                    boolean r5 = r4.k()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    androidx.core.app.w[] r3 = new androidx.core.app.w[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    androidx.core.app.w[] r1 = (androidx.core.app.w[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004f
                L_0x004d:
                    r10 = r4
                    goto L_0x005d
                L_0x004f:
                    int r1 = r2.size()
                    androidx.core.app.w[] r1 = new androidx.core.app.w[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    androidx.core.app.w[] r4 = (androidx.core.app.w[]) r4
                    goto L_0x004d
                L_0x005d:
                    androidx.core.app.o$b r1 = new androidx.core.app.o$b
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f15804a
                    java.lang.CharSequence r7 = r0.f15805b
                    android.app.PendingIntent r8 = r0.f15806c
                    android.os.Bundle r9 = r0.f15808e
                    boolean r12 = r0.f15807d
                    int r13 = r0.f15810g
                    boolean r14 = r0.f15811h
                    boolean r15 = r0.f15812i
                    boolean r2 = r0.f15813j
                    r5 = r1
                    r16 = r2
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.o.b.a.b():androidx.core.app.o$b");
            }

            public a d(boolean z10) {
                this.f15807d = z10;
                return this;
            }

            public a e(boolean z10) {
                this.f15812i = z10;
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.e((Resources) null, "", i10) : null, charSequence, pendingIntent, new Bundle(), (w[]) null, true, 0, true, false, false);
            }

            private a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                ArrayList arrayList;
                this.f15807d = true;
                this.f15811h = true;
                this.f15804a = iconCompat;
                this.f15805b = f.e(charSequence);
                this.f15806c = pendingIntent;
                this.f15808e = bundle;
                if (wVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(Arrays.asList(wVarArr));
                }
                this.f15809f = arrayList;
                this.f15807d = z10;
                this.f15810g = i10;
                this.f15811h = z11;
                this.f15812i = z12;
                this.f15813j = z13;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public b(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.e((Resources) null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f15802k;
        }

        public boolean b() {
            return this.f15796e;
        }

        public Bundle c() {
            return this.f15792a;
        }

        public IconCompat d() {
            int i10;
            if (this.f15793b == null && (i10 = this.f15800i) != 0) {
                this.f15793b = IconCompat.e((Resources) null, "", i10);
            }
            return this.f15793b;
        }

        public w[] e() {
            return this.f15794c;
        }

        public int f() {
            return this.f15798g;
        }

        public boolean g() {
            return this.f15797f;
        }

        public CharSequence h() {
            return this.f15801j;
        }

        public boolean i() {
            return this.f15803l;
        }

        public boolean j() {
            return this.f15799h;
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (w[]) null, (w[]) null, true, 0, true, false, false);
        }

        b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, w[] wVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f15797f = true;
            this.f15793b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.f15800i = iconCompat.g();
            }
            this.f15801j = f.e(charSequence);
            this.f15802k = pendingIntent;
            this.f15792a = bundle == null ? new Bundle() : bundle;
            this.f15794c = wVarArr;
            this.f15795d = wVarArr2;
            this.f15796e = z10;
            this.f15798g = i10;
            this.f15797f = z11;
            this.f15799h = z12;
            this.f15803l = z13;
        }
    }

    public static class c extends i {

        /* renamed from: e  reason: collision with root package name */
        private IconCompat f15814e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f15815f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f15816g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f15817h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f15818i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static class b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public void b(m mVar) {
            Context context;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(mVar.a()).setBigContentTitle(this.f15896b);
            IconCompat iconCompat = this.f15814e;
            Context context2 = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (mVar instanceof p) {
                        context = ((p) mVar).f();
                    } else {
                        context = null;
                    }
                    b.a(bigContentTitle, this.f15814e.p(context));
                } else if (iconCompat.i() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f15814e.f());
                }
            }
            if (this.f15816g) {
                if (this.f15815f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    if (mVar instanceof p) {
                        context2 = ((p) mVar).f();
                    }
                    a.a(bigContentTitle, this.f15815f.p(context2));
                }
            }
            if (this.f15898d) {
                bigContentTitle.setSummaryText(this.f15897c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f15818i);
                b.b(bigContentTitle, this.f15817h);
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public c h(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.c(bitmap);
            }
            this.f15815f = iconCompat;
            this.f15816g = true;
            return this;
        }

        public c i(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.c(bitmap);
            }
            this.f15814e = iconCompat;
            return this;
        }

        public c j(CharSequence charSequence) {
            this.f15896b = f.e(charSequence);
            return this;
        }

        public c k(CharSequence charSequence) {
            this.f15897c = f.e(charSequence);
            this.f15898d = true;
            return this;
        }
    }

    public static class d extends i {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f15819e;

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(m mVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(mVar.a()).setBigContentTitle(this.f15896b).bigText(this.f15819e);
            if (this.f15898d) {
                bigText.setSummaryText(this.f15897c);
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public d h(CharSequence charSequence) {
            this.f15819e = f.e(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f15896b = f.e(charSequence);
            return this;
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private PendingIntent f15820a;

        /* renamed from: b  reason: collision with root package name */
        private PendingIntent f15821b;

        /* renamed from: c  reason: collision with root package name */
        private IconCompat f15822c;

        /* renamed from: d  reason: collision with root package name */
        private int f15823d;

        /* renamed from: e  reason: collision with root package name */
        private int f15824e;

        /* renamed from: f  reason: collision with root package name */
        private int f15825f;

        /* renamed from: g  reason: collision with root package name */
        private String f15826g;

        private static class a {
            static Notification.BubbleMetadata a(e eVar) {
                if (eVar == null || eVar.f() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(eVar.e().o()).setIntent(eVar.f()).setDeleteIntent(eVar.b()).setAutoExpandBubble(eVar.a()).setSuppressNotification(eVar.h());
                if (eVar.c() != 0) {
                    suppressNotification.setDesiredHeight(eVar.c());
                }
                if (eVar.d() != 0) {
                    suppressNotification.setDesiredHeightResId(eVar.d());
                }
                return suppressNotification.build();
            }
        }

        private static class b {
            static Notification.BubbleMetadata a(e eVar) {
                Notification.BubbleMetadata.Builder builder;
                if (eVar == null) {
                    return null;
                }
                if (eVar.g() != null) {
                    builder = new Notification.BubbleMetadata.Builder(eVar.g());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(eVar.f(), eVar.e().o());
                }
                builder.setDeleteIntent(eVar.b()).setAutoExpandBubble(eVar.a()).setSuppressNotification(eVar.h());
                if (eVar.c() != 0) {
                    builder.setDesiredHeight(eVar.c());
                }
                if (eVar.d() != 0) {
                    builder.setDesiredHeightResId(eVar.d());
                }
                return builder.build();
            }
        }

        public static final class c {

            /* renamed from: a  reason: collision with root package name */
            private PendingIntent f15827a;

            /* renamed from: b  reason: collision with root package name */
            private IconCompat f15828b;

            /* renamed from: c  reason: collision with root package name */
            private int f15829c;

            /* renamed from: d  reason: collision with root package name */
            private int f15830d;

            /* renamed from: e  reason: collision with root package name */
            private int f15831e;

            /* renamed from: f  reason: collision with root package name */
            private PendingIntent f15832f;

            /* renamed from: g  reason: collision with root package name */
            private String f15833g;

            public c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                } else if (iconCompat != null) {
                    this.f15827a = pendingIntent;
                    this.f15828b = iconCompat;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }

            private c c(int i10, boolean z10) {
                if (z10) {
                    this.f15831e = i10 | this.f15831e;
                } else {
                    this.f15831e = (~i10) & this.f15831e;
                }
                return this;
            }

            public e a() {
                String str = this.f15833g;
                if (str == null && this.f15827a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                } else if (str == null && this.f15828b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                } else {
                    e eVar = new e(this.f15827a, this.f15832f, this.f15828b, this.f15829c, this.f15830d, this.f15831e, str);
                    eVar.i(this.f15831e);
                    return eVar;
                }
            }

            public c b(int i10) {
                this.f15829c = Math.max(i10, 0);
                this.f15830d = 0;
                return this;
            }

            public c d(boolean z10) {
                c(2, z10);
                return this;
            }
        }

        public static Notification.BubbleMetadata j(e eVar) {
            if (eVar == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.a(eVar);
            }
            if (i10 == 29) {
                return a.a(eVar);
            }
            return null;
        }

        public boolean a() {
            if ((this.f15825f & 1) != 0) {
                return true;
            }
            return false;
        }

        public PendingIntent b() {
            return this.f15821b;
        }

        public int c() {
            return this.f15823d;
        }

        public int d() {
            return this.f15824e;
        }

        public IconCompat e() {
            return this.f15822c;
        }

        public PendingIntent f() {
            return this.f15820a;
        }

        public String g() {
            return this.f15826g;
        }

        public boolean h() {
            if ((this.f15825f & 2) != 0) {
                return true;
            }
            return false;
        }

        public void i(int i10) {
            this.f15825f = i10;
        }

        private e(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i10, int i11, int i12, String str) {
            this.f15820a = pendingIntent;
            this.f15822c = iconCompat;
            this.f15823d = i10;
            this.f15824e = i11;
            this.f15821b = pendingIntent2;
            this.f15825f = i12;
            this.f15826g = str;
        }
    }

    public static class g extends i {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList f15883e = new ArrayList();

        public void b(m mVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(mVar.a()).setBigContentTitle(this.f15896b);
            if (this.f15898d) {
                bigContentTitle.setSummaryText(this.f15897c);
            }
            Iterator it = this.f15883e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public g h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f15883e.add(f.e(charSequence));
            }
            return this;
        }

        public g i(CharSequence charSequence) {
            this.f15896b = f.e(charSequence);
            return this;
        }
    }

    public static class h extends i {

        /* renamed from: e  reason: collision with root package name */
        private final List f15884e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private final List f15885f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private u f15886g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f15887h;

        /* renamed from: i  reason: collision with root package name */
        private Boolean f15888i;

        static class a {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class c {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        public static final class d {

            /* renamed from: a  reason: collision with root package name */
            private final CharSequence f15889a;

            /* renamed from: b  reason: collision with root package name */
            private final long f15890b;

            /* renamed from: c  reason: collision with root package name */
            private final u f15891c;

            /* renamed from: d  reason: collision with root package name */
            private Bundle f15892d = new Bundle();

            /* renamed from: e  reason: collision with root package name */
            private String f15893e;

            /* renamed from: f  reason: collision with root package name */
            private Uri f15894f;

            static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            static class b {
                static Parcelable a(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public d(CharSequence charSequence, long j10, u uVar) {
                this.f15889a = charSequence;
                this.f15890b = j10;
                this.f15891c = uVar;
            }

            static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = ((d) list.get(i10)).i();
                }
                return bundleArr;
            }

            private Bundle i() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f15889a;
                if (charSequence != null) {
                    bundle.putCharSequence(AttributeType.TEXT, charSequence);
                }
                bundle.putLong(com.amazon.a.a.h.a.f37179b, this.f15890b);
                u uVar = this.f15891c;
                if (uVar != null) {
                    bundle.putCharSequence("sender", uVar.d());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f15891c.i()));
                    } else {
                        bundle.putBundle("person", this.f15891c.j());
                    }
                }
                String str = this.f15893e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f15894f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f15892d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f15893e;
            }

            public Uri c() {
                return this.f15894f;
            }

            public u d() {
                return this.f15891c;
            }

            public CharSequence e() {
                return this.f15889a;
            }

            public long f() {
                return this.f15890b;
            }

            public d g(String str, Uri uri) {
                this.f15893e = str;
                this.f15894f = uri;
                return this;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r3v0 */
            /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r3v5 */
            /* JADX WARNING: type inference failed for: r3v6 */
            /* access modifiers changed from: package-private */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message h() {
                /*
                    r6 = this;
                    androidx.core.app.u r0 = r6.d()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    r3 = 0
                    if (r1 < r2) goto L_0x001f
                    java.lang.CharSequence r1 = r6.e()
                    long r4 = r6.f()
                    if (r0 != 0) goto L_0x0016
                    goto L_0x001a
                L_0x0016:
                    android.app.Person r3 = r0.i()
                L_0x001a:
                    android.app.Notification$MessagingStyle$Message r0 = androidx.core.app.o.h.d.b.b(r1, r4, r3)
                    goto L_0x0032
                L_0x001f:
                    java.lang.CharSequence r1 = r6.e()
                    long r4 = r6.f()
                    if (r0 != 0) goto L_0x002a
                    goto L_0x002e
                L_0x002a:
                    java.lang.CharSequence r3 = r0.d()
                L_0x002e:
                    android.app.Notification$MessagingStyle$Message r0 = androidx.core.app.o.h.d.a.a(r1, r4, r3)
                L_0x0032:
                    java.lang.String r1 = r6.b()
                    if (r1 == 0) goto L_0x0043
                    java.lang.String r1 = r6.b()
                    android.net.Uri r2 = r6.c()
                    androidx.core.app.o.h.d.a.b(r0, r1, r2)
                L_0x0043:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.o.h.d.h():android.app.Notification$MessagingStyle$Message");
            }
        }

        public h(u uVar) {
            if (!TextUtils.isEmpty(uVar.d())) {
                this.f15886g = uVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f15886g.d());
            bundle.putBundle("android.messagingStyleUser", this.f15886g.j());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f15887h);
            if (this.f15887h != null && this.f15888i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f15887h);
            }
            if (!this.f15884e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f15884e));
            }
            if (!this.f15885f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f15885f));
            }
            Boolean bool = this.f15888i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        public void b(m mVar) {
            Notification.MessagingStyle messagingStyle;
            j(i());
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle = c.a(this.f15886g.i());
            } else {
                messagingStyle = a.b(this.f15886g.d());
            }
            for (d h10 : this.f15884e) {
                a.a(messagingStyle, h10.h());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                for (d h11 : this.f15885f) {
                    b.a(messagingStyle, h11.h());
                }
            }
            if (this.f15888i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(messagingStyle, this.f15887h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(messagingStyle, this.f15888i.booleanValue());
            }
            messagingStyle.setBuilder(mVar.a());
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public h h(d dVar) {
            if (dVar != null) {
                this.f15884e.add(dVar);
                if (this.f15884e.size() > 25) {
                    this.f15884e.remove(0);
                }
            }
            return this;
        }

        public boolean i() {
            f fVar = this.f15895a;
            if (fVar == null || fVar.f15857a.getApplicationInfo().targetSdkVersion >= 28 || this.f15888i != null) {
                Boolean bool = this.f15888i;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } else if (this.f15887h != null) {
                return true;
            } else {
                return false;
            }
        }

        public h j(boolean z10) {
            this.f15888i = Boolean.valueOf(z10);
            return this;
        }
    }

    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        protected f f15895a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f15896b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f15897c;

        /* renamed from: d  reason: collision with root package name */
        boolean f15898d = false;

        public void a(Bundle bundle) {
            if (this.f15898d) {
                bundle.putCharSequence("android.summaryText", this.f15897c);
            }
            CharSequence charSequence = this.f15896b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(m mVar);

        /* access modifiers changed from: protected */
        public String c() {
            return null;
        }

        public RemoteViews d(m mVar) {
            return null;
        }

        public RemoteViews e(m mVar) {
            return null;
        }

        public RemoteViews f(m mVar) {
            return null;
        }

        public void g(f fVar) {
            if (this.f15895a != fVar) {
                this.f15895a = fVar;
                if (fVar != null) {
                    fVar.H(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C2186b.f23598b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C2186b.f23597a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
    }

    public static class f {

        /* renamed from: A  reason: collision with root package name */
        boolean f15834A;

        /* renamed from: B  reason: collision with root package name */
        boolean f15835B;

        /* renamed from: C  reason: collision with root package name */
        String f15836C;

        /* renamed from: D  reason: collision with root package name */
        Bundle f15837D;

        /* renamed from: E  reason: collision with root package name */
        int f15838E;

        /* renamed from: F  reason: collision with root package name */
        int f15839F;

        /* renamed from: G  reason: collision with root package name */
        Notification f15840G;

        /* renamed from: H  reason: collision with root package name */
        RemoteViews f15841H;

        /* renamed from: I  reason: collision with root package name */
        RemoteViews f15842I;

        /* renamed from: J  reason: collision with root package name */
        RemoteViews f15843J;

        /* renamed from: K  reason: collision with root package name */
        String f15844K;

        /* renamed from: L  reason: collision with root package name */
        int f15845L;

        /* renamed from: M  reason: collision with root package name */
        String f15846M;

        /* renamed from: N  reason: collision with root package name */
        androidx.core.content.e f15847N;

        /* renamed from: O  reason: collision with root package name */
        long f15848O;

        /* renamed from: P  reason: collision with root package name */
        int f15849P;

        /* renamed from: Q  reason: collision with root package name */
        int f15850Q;

        /* renamed from: R  reason: collision with root package name */
        boolean f15851R;

        /* renamed from: S  reason: collision with root package name */
        e f15852S;

        /* renamed from: T  reason: collision with root package name */
        Notification f15853T;

        /* renamed from: U  reason: collision with root package name */
        boolean f15854U;

        /* renamed from: V  reason: collision with root package name */
        Object f15855V;

        /* renamed from: W  reason: collision with root package name */
        public ArrayList f15856W;

        /* renamed from: a  reason: collision with root package name */
        public Context f15857a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f15858b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList f15859c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList f15860d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f15861e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f15862f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f15863g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f15864h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f15865i;

        /* renamed from: j  reason: collision with root package name */
        IconCompat f15866j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f15867k;

        /* renamed from: l  reason: collision with root package name */
        int f15868l;

        /* renamed from: m  reason: collision with root package name */
        int f15869m;

        /* renamed from: n  reason: collision with root package name */
        boolean f15870n;

        /* renamed from: o  reason: collision with root package name */
        boolean f15871o;

        /* renamed from: p  reason: collision with root package name */
        i f15872p;

        /* renamed from: q  reason: collision with root package name */
        CharSequence f15873q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f15874r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence[] f15875s;

        /* renamed from: t  reason: collision with root package name */
        int f15876t;

        /* renamed from: u  reason: collision with root package name */
        int f15877u;

        /* renamed from: v  reason: collision with root package name */
        boolean f15878v;

        /* renamed from: w  reason: collision with root package name */
        String f15879w;

        /* renamed from: x  reason: collision with root package name */
        boolean f15880x;

        /* renamed from: y  reason: collision with root package name */
        String f15881y;

        /* renamed from: z  reason: collision with root package name */
        boolean f15882z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public f(Context context, String str) {
            this.f15858b = new ArrayList();
            this.f15859c = new ArrayList();
            this.f15860d = new ArrayList();
            this.f15870n = true;
            this.f15882z = false;
            this.f15838E = 0;
            this.f15839F = 0;
            this.f15845L = 0;
            this.f15849P = 0;
            this.f15850Q = 0;
            Notification notification = new Notification();
            this.f15853T = notification;
            this.f15857a = context;
            this.f15844K = str;
            notification.when = System.currentTimeMillis();
            this.f15853T.audioStreamType = -1;
            this.f15869m = 0;
            this.f15856W = new ArrayList();
            this.f15851R = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        private void r(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f15853T;
                notification.flags = i10 | notification.flags;
                return;
            }
            Notification notification2 = this.f15853T;
            notification2.flags = (~i10) & notification2.flags;
        }

        public f A(int i10) {
            this.f15869m = i10;
            return this;
        }

        public f B(String str) {
            this.f15846M = str;
            return this;
        }

        public f C(C2258t tVar) {
            if (tVar == null) {
                return this;
            }
            this.f15846M = tVar.c();
            if (this.f15847N == null) {
                if (tVar.d() != null) {
                    this.f15847N = tVar.d();
                } else if (tVar.c() != null) {
                    this.f15847N = new androidx.core.content.e(tVar.c());
                }
            }
            if (this.f15861e == null) {
                o(tVar.i());
            }
            return this;
        }

        public f D(boolean z10) {
            this.f15870n = z10;
            return this;
        }

        public f E(boolean z10) {
            this.f15854U = z10;
            return this;
        }

        public f F(int i10) {
            this.f15853T.icon = i10;
            return this;
        }

        public f G(Uri uri) {
            Notification notification = this.f15853T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder d10 = a.d(a.c(a.b(), 4), 5);
            this.f15853T.audioAttributes = a.a(d10);
            return this;
        }

        public f H(i iVar) {
            if (this.f15872p != iVar) {
                this.f15872p = iVar;
                if (iVar != null) {
                    iVar.g(this);
                }
            }
            return this;
        }

        public f I(CharSequence charSequence) {
            this.f15873q = e(charSequence);
            return this;
        }

        public f J(CharSequence charSequence) {
            this.f15853T.tickerText = e(charSequence);
            return this;
        }

        public f K(long j10) {
            this.f15848O = j10;
            return this;
        }

        public f L(boolean z10) {
            this.f15871o = z10;
            return this;
        }

        public f M(long[] jArr) {
            this.f15853T.vibrate = jArr;
            return this;
        }

        public f N(int i10) {
            this.f15839F = i10;
            return this;
        }

        public f O(long j10) {
            this.f15853T.when = j10;
            return this;
        }

        public f a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f15858b.add(new b(i10, charSequence, pendingIntent));
            return this;
        }

        public f b(b bVar) {
            if (bVar != null) {
                this.f15858b.add(bVar);
            }
            return this;
        }

        public Notification c() {
            return new p(this).c();
        }

        public Bundle d() {
            if (this.f15837D == null) {
                this.f15837D = new Bundle();
            }
            return this.f15837D;
        }

        public f f(boolean z10) {
            r(16, z10);
            return this;
        }

        public f g(e eVar) {
            this.f15852S = eVar;
            return this;
        }

        public f h(String str) {
            this.f15836C = str;
            return this;
        }

        public f i(String str) {
            this.f15844K = str;
            return this;
        }

        public f j(int i10) {
            this.f15838E = i10;
            return this;
        }

        public f k(boolean z10) {
            this.f15834A = z10;
            this.f15835B = true;
            return this;
        }

        public f l(CharSequence charSequence) {
            this.f15867k = e(charSequence);
            return this;
        }

        public f m(PendingIntent pendingIntent) {
            this.f15863g = pendingIntent;
            return this;
        }

        public f n(CharSequence charSequence) {
            this.f15862f = e(charSequence);
            return this;
        }

        public f o(CharSequence charSequence) {
            this.f15861e = e(charSequence);
            return this;
        }

        public f p(int i10) {
            Notification notification = this.f15853T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public f q(PendingIntent pendingIntent) {
            this.f15853T.deleteIntent = pendingIntent;
            return this;
        }

        public f s(String str) {
            this.f15879w = str;
            return this;
        }

        public f t(boolean z10) {
            this.f15880x = z10;
            return this;
        }

        public f u(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.c(o.b(this.f15857a, bitmap));
            }
            this.f15866j = iconCompat;
            return this;
        }

        public f v(int i10, int i11, int i12) {
            int i13;
            Notification notification = this.f15853T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            if (i11 == 0 || i12 == 0) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            notification.flags = i13 | (notification.flags & -2);
            return this;
        }

        public f w(boolean z10) {
            this.f15882z = z10;
            return this;
        }

        public f x(int i10) {
            this.f15868l = i10;
            return this;
        }

        public f y(boolean z10) {
            r(2, z10);
            return this;
        }

        public f z(boolean z10) {
            r(8, z10);
            return this;
        }

        public f(Context context) {
            this(context, (String) null);
        }
    }
}
