package g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: g.g  reason: case insensitive filesystem */
public final class C2004g implements Parcelable {
    public static final Parcelable.Creator<C2004g> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final c f20823e = new c((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final IntentSender f20824a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f20825b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20826c;

    /* renamed from: d  reason: collision with root package name */
    private final int f20827d;

    /* renamed from: g.g$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final IntentSender f20828a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f20829b;

        /* renamed from: c  reason: collision with root package name */
        private int f20830c;

        /* renamed from: d  reason: collision with root package name */
        private int f20831d;

        public a(IntentSender intentSender) {
            C6496s.h(intentSender, "intentSender");
            this.f20828a = intentSender;
        }

        public final C2004g a() {
            return new C2004g(this.f20828a, this.f20829b, this.f20830c, this.f20831d);
        }

        public final a b(Intent intent) {
            this.f20829b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f20831d = i10;
            this.f20830c = i11;
            return this;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.app.PendingIntent r2) {
            /*
                r1 = this;
                java.lang.String r0 = "pendingIntent"
                kotlin.jvm.internal.C6496s.h(r2, r0)
                android.content.IntentSender r2 = r2.getIntentSender()
                java.lang.String r0 = "pendingIntent.intentSender"
                kotlin.jvm.internal.C6496s.g(r2, r0)
                r1.<init>((android.content.IntentSender) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.C2004g.a.<init>(android.app.PendingIntent):void");
        }
    }

    /* renamed from: g.g$b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public C2004g createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "inParcel");
            return new C2004g(parcel);
        }

        /* renamed from: b */
        public C2004g[] newArray(int i10) {
            return new C2004g[i10];
        }
    }

    /* renamed from: g.g$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public C2004g(IntentSender intentSender, Intent intent, int i10, int i11) {
        C6496s.h(intentSender, "intentSender");
        this.f20824a = intentSender;
        this.f20825b = intent;
        this.f20826c = i10;
        this.f20827d = i11;
    }

    public final Intent a() {
        return this.f20825b;
    }

    public final int b() {
        return this.f20826c;
    }

    public final int c() {
        return this.f20827d;
    }

    public final IntentSender d() {
        return this.f20824a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeParcelable(this.f20824a, i10);
        parcel.writeParcelable(this.f20825b, i10);
        parcel.writeInt(this.f20826c);
        parcel.writeInt(this.f20827d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2004g(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.C6496s.e(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C2004g.<init>(android.os.Parcel):void");
    }
}
