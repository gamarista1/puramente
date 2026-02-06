package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f10706a;

    /* renamed from: b  reason: collision with root package name */
    final long f10707b;

    /* renamed from: c  reason: collision with root package name */
    final long f10708c;

    /* renamed from: d  reason: collision with root package name */
    final float f10709d;

    /* renamed from: e  reason: collision with root package name */
    final long f10710e;

    /* renamed from: f  reason: collision with root package name */
    final int f10711f;

    /* renamed from: g  reason: collision with root package name */
    final CharSequence f10712g;

    /* renamed from: h  reason: collision with root package name */
    final long f10713h;

    /* renamed from: i  reason: collision with root package name */
    List f10714i;

    /* renamed from: j  reason: collision with root package name */
    final long f10715j;

    /* renamed from: k  reason: collision with root package name */
    final Bundle f10716k;

    /* renamed from: l  reason: collision with root package name */
    private PlaybackState f10717l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f10718a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f10719b;

        /* renamed from: c  reason: collision with root package name */
        private final int f10720c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f10721d;

        /* renamed from: e  reason: collision with root package name */
        private PlaybackState.CustomAction f10722e;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f10718a = parcel.readString();
            this.f10719b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10720c = parcel.readInt();
            this.f10721d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public Object a() {
            PlaybackState.CustomAction customAction = this.f10722e;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder e10 = b.e(this.f10718a, this.f10719b, this.f10720c);
            b.w(e10, this.f10721d);
            return b.b(e10);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f10719b + ", mIcon=" + this.f10720c + ", mExtras=" + this.f10721d;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f10718a);
            TextUtils.writeToParcel(this.f10719b, parcel, i10);
            parcel.writeInt(this.f10720c);
            parcel.writeBundle(this.f10721d);
        }
    }

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List list, long j14, Bundle bundle) {
        this.f10706a = i10;
        this.f10707b = j10;
        this.f10708c = j11;
        this.f10709d = f10;
        this.f10710e = j12;
        this.f10711f = i11;
        this.f10712g = charSequence;
        this.f10713h = j13;
        this.f10714i = new ArrayList(list);
        this.f10715j = j14;
        this.f10716k = bundle;
    }

    public long a() {
        return this.f10710e;
    }

    public long b() {
        return this.f10708c;
    }

    public long c() {
        return this.f10713h;
    }

    public float d() {
        return this.f10709d;
    }

    public int describeContents() {
        return 0;
    }

    public Object e() {
        if (this.f10717l == null) {
            PlaybackState.Builder d10 = b.d();
            b.x(d10, this.f10706a, this.f10707b, this.f10709d, this.f10713h);
            b.u(d10, this.f10708c);
            b.s(d10, this.f10710e);
            b.v(d10, this.f10712g);
            for (CustomAction a10 : this.f10714i) {
                b.a(d10, (PlaybackState.CustomAction) a10.a());
            }
            b.t(d10, this.f10715j);
            c.b(d10, this.f10716k);
            this.f10717l = b.c(d10);
        }
        return this.f10717l;
    }

    public long f() {
        return this.f10707b;
    }

    public int g() {
        return this.f10706a;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f10706a + ", position=" + this.f10707b + ", buffered position=" + this.f10708c + ", speed=" + this.f10709d + ", updated=" + this.f10713h + ", actions=" + this.f10710e + ", error code=" + this.f10711f + ", error message=" + this.f10712g + ", custom actions=" + this.f10714i + ", active item id=" + this.f10715j + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10706a);
        parcel.writeLong(this.f10707b);
        parcel.writeFloat(this.f10709d);
        parcel.writeLong(this.f10713h);
        parcel.writeLong(this.f10708c);
        parcel.writeLong(this.f10710e);
        TextUtils.writeToParcel(this.f10712g, parcel, i10);
        parcel.writeTypedList(this.f10714i);
        parcel.writeLong(this.f10715j);
        parcel.writeBundle(this.f10716k);
        parcel.writeInt(this.f10711f);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final List f10723a;

        /* renamed from: b  reason: collision with root package name */
        private int f10724b;

        /* renamed from: c  reason: collision with root package name */
        private long f10725c;

        /* renamed from: d  reason: collision with root package name */
        private long f10726d;

        /* renamed from: e  reason: collision with root package name */
        private float f10727e;

        /* renamed from: f  reason: collision with root package name */
        private long f10728f;

        /* renamed from: g  reason: collision with root package name */
        private int f10729g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f10730h;

        /* renamed from: i  reason: collision with root package name */
        private long f10731i;

        /* renamed from: j  reason: collision with root package name */
        private long f10732j;

        /* renamed from: k  reason: collision with root package name */
        private Bundle f10733k;

        public d() {
            this.f10723a = new ArrayList();
            this.f10732j = -1;
        }

        public PlaybackStateCompat a() {
            return new PlaybackStateCompat(this.f10724b, this.f10725c, this.f10726d, this.f10727e, this.f10728f, this.f10729g, this.f10730h, this.f10731i, this.f10723a, this.f10732j, this.f10733k);
        }

        public d b(long j10) {
            this.f10728f = j10;
            return this;
        }

        public d c(long j10) {
            this.f10726d = j10;
            return this;
        }

        public d d(int i10, long j10, float f10, long j11) {
            this.f10724b = i10;
            this.f10725c = j10;
            this.f10731i = j11;
            this.f10727e = f10;
            return this;
        }

        public d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f10723a = arrayList;
            this.f10732j = -1;
            this.f10724b = playbackStateCompat.f10706a;
            this.f10725c = playbackStateCompat.f10707b;
            this.f10727e = playbackStateCompat.f10709d;
            this.f10731i = playbackStateCompat.f10713h;
            this.f10726d = playbackStateCompat.f10708c;
            this.f10728f = playbackStateCompat.f10710e;
            this.f10729g = playbackStateCompat.f10711f;
            this.f10730h = playbackStateCompat.f10712g;
            List list = playbackStateCompat.f10714i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f10732j = playbackStateCompat.f10715j;
            this.f10733k = playbackStateCompat.f10716k;
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f10706a = parcel.readInt();
        this.f10707b = parcel.readLong();
        this.f10709d = parcel.readFloat();
        this.f10713h = parcel.readLong();
        this.f10708c = parcel.readLong();
        this.f10710e = parcel.readLong();
        this.f10712g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f10714i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f10715j = parcel.readLong();
        this.f10716k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f10711f = parcel.readInt();
    }
}
