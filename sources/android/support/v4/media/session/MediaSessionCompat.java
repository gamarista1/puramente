package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.i;
import e2.C1944a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MediaSessionCompat {

    /* renamed from: d  reason: collision with root package name */
    static int f10665d;

    /* renamed from: a  reason: collision with root package name */
    private final c f10666a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaControllerCompat f10667b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f10668c;

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final MediaDescriptionCompat f10669a;

        /* renamed from: b  reason: collision with root package name */
        private final long f10670b;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        QueueItem(Parcel parcel) {
            this.f10669a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f10670b = parcel.readLong();
        }

        public MediaDescriptionCompat a() {
            return this.f10669a;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f10669a + ", Id=" + this.f10670b + " }";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f10669a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f10670b);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        ResultReceiver f10671a;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f10671a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f10671a.writeToParcel(parcel, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final Object f10672a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f10673b;

        /* renamed from: c  reason: collision with root package name */
        private b f10674c;

        /* renamed from: d  reason: collision with root package name */
        private G3.b f10675d;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        Token(Object obj) {
            this(obj, (b) null, (G3.b) null);
        }

        public b a() {
            b bVar;
            synchronized (this.f10672a) {
                bVar = this.f10674c;
            }
            return bVar;
        }

        public G3.b b() {
            G3.b bVar;
            synchronized (this.f10672a) {
                bVar = this.f10675d;
            }
            return bVar;
        }

        public Object c() {
            return this.f10673b;
        }

        public void d(b bVar) {
            synchronized (this.f10672a) {
                this.f10674c = bVar;
            }
        }

        public int describeContents() {
            return 0;
        }

        public void e(G3.b bVar) {
            synchronized (this.f10672a) {
                this.f10675d = bVar;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f10673b;
            if (obj2 != null) {
                Object obj3 = token.f10673b;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f10673b == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            Object obj = this.f10673b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f10673b, i10);
        }

        Token(Object obj, b bVar, G3.b bVar2) {
            this.f10672a = new Object();
            this.f10673b = obj;
            this.f10674c = bVar;
            this.f10675d = bVar2;
        }
    }

    class a extends b {
        a() {
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f10677a = new Object();

        /* renamed from: b  reason: collision with root package name */
        final MediaSession.Callback f10678b = new C0202b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f10679c;

        /* renamed from: d  reason: collision with root package name */
        WeakReference f10680d = new WeakReference((Object) null);

        /* renamed from: e  reason: collision with root package name */
        a f10681e;

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.f10677a) {
                        cVar = (c) b.this.f10680d.get();
                        bVar = b.this;
                        aVar = bVar.f10681e;
                    }
                    if (cVar != null && bVar == cVar.j() && aVar != null) {
                        cVar.n((androidx.media.a) message.obj);
                        b.this.a(cVar, aVar);
                        cVar.n((androidx.media.a) null);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b  reason: collision with other inner class name */
        private class C0202b extends MediaSession.Callback {
            C0202b() {
            }

            private void a(c cVar) {
                cVar.n((androidx.media.a) null);
            }

            private d b() {
                d dVar;
                synchronized (b.this.f10677a) {
                    dVar = (d) b.this.f10680d.get();
                }
                if (dVar == null || b.this != dVar.j()) {
                    return null;
                }
                return dVar;
            }

            private void c(c cVar) {
                if (Build.VERSION.SDK_INT < 28) {
                    String h10 = cVar.h();
                    if (TextUtils.isEmpty(h10)) {
                        h10 = "android.media.session.MediaController";
                    }
                    cVar.n(new androidx.media.a(h10, -1, -1));
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                /*
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$d r0 = r5.b()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.support.v4.media.session.MediaSessionCompat.a(r7)
                    r5.c(r0)
                    java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = 0
                    if (r1 == 0) goto L_0x003e
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.g()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.b r1 = r7.a()     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r1 != 0) goto L_0x0028
                    goto L_0x002c
                L_0x0028:
                    android.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x002c:
                    androidx.core.app.g.b(r6, r3, r2)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r1 = "android.support.v4.media.session.SESSION_TOKEN2"
                    G3.b r7 = r7.b()     // Catch:{ BadParcelableException -> 0x00b8 }
                    G3.a.c(r6, r1, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r7 = 0
                    r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x003e:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r1 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.b(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0054:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r4 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r1 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.c(r8, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x006e:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0082:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x00b2
                    java.util.List r6 = r0.f10692i     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 == 0) goto L_0x00bf
                    r6 = -1
                    int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 < 0) goto L_0x00a6
                    java.util.List r7 = r0.f10692i     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 >= r7) goto L_0x00a6
                    java.util.List r7 = r0.f10692i     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = r6
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x00a6:
                    if (r2 == 0) goto L_0x00bf
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = r2.a()     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b2:
                    android.support.v4.media.session.MediaSessionCompat$b r1 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    r1.d(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b8:
                    java.lang.String r6 = "MediaSessionCompat"
                    java.lang.String r7 = "Could not unparcel the extra data."
                    android.util.Log.e(r6, r7)
                L_0x00bf:
                    r5.a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.b.C0202b.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                d b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle2);
                            b.this.l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            b.this.m();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle3);
                            b.this.n(string, bundle3);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle4);
                            b.this.o(string2, bundle4);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle5);
                            b.this.p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle6);
                            b.this.w((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle6);
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        } else {
                            b.this.e(str, bundle);
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    a(b10);
                }
            }

            public void onFastForward() {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.f();
                    a(b10);
                }
            }

            public boolean onMediaButtonEvent(Intent intent) {
                d b10 = b();
                if (b10 == null) {
                    return false;
                }
                c(b10);
                boolean g10 = b.this.g(intent);
                a(b10);
                if (g10 || super.onMediaButtonEvent(intent)) {
                    return true;
                }
                return false;
            }

            public void onPause() {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.h();
                    a(b10);
                }
            }

            public void onPlay() {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.i();
                    a(b10);
                }
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                d b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.j(str, bundle);
                    a(b10);
                }
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                d b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.k(str, bundle);
                    a(b10);
                }
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.l(uri, bundle);
                    a(b10);
                }
            }

            public void onPrepare() {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.m();
                    a(b10);
                }
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                d b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.n(str, bundle);
                    a(b10);
                }
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                d b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.o(str, bundle);
                    a(b10);
                }
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.p(uri, bundle);
                    a(b10);
                }
            }

            public void onRewind() {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.r();
                    a(b10);
                }
            }

            public void onSeekTo(long j10) {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.s(j10);
                    a(b10);
                }
            }

            public void onSetPlaybackSpeed(float f10) {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.u(f10);
                    a(b10);
                }
            }

            public void onSetRating(Rating rating) {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.v(RatingCompat.a(rating));
                    a(b10);
                }
            }

            public void onSkipToNext() {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.z();
                    a(b10);
                }
            }

            public void onSkipToPrevious() {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.A();
                    a(b10);
                }
            }

            public void onSkipToQueueItem(long j10) {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.B(j10);
                    a(b10);
                }
            }

            public void onStop() {
                d b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.C();
                    a(b10);
                }
            }
        }

        public void A() {
        }

        public void B(long j10) {
        }

        public void C() {
        }

        /* access modifiers changed from: package-private */
        public void D(c cVar, Handler handler) {
            synchronized (this.f10677a) {
                try {
                    this.f10680d = new WeakReference(cVar);
                    a aVar = this.f10681e;
                    a aVar2 = null;
                    if (aVar != null) {
                        aVar.removeCallbacksAndMessages((Object) null);
                    }
                    if (cVar != null) {
                        if (handler != null) {
                            aVar2 = new a(handler.getLooper());
                        }
                    }
                    this.f10681e = aVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(c cVar, Handler handler) {
            long j10;
            boolean z10;
            boolean z11;
            if (this.f10679c) {
                boolean z12 = false;
                this.f10679c = false;
                handler.removeMessages(1);
                PlaybackStateCompat k10 = cVar.k();
                if (k10 == null) {
                    j10 = 0;
                } else {
                    j10 = k10.a();
                }
                if (k10 == null || k10.g() != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if ((516 & j10) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((j10 & 514) != 0) {
                    z12 = true;
                }
                if (z10 && z12) {
                    h();
                } else if (!z10 && z11) {
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            long j10;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f10677a) {
                cVar = (c) this.f10680d.get();
                aVar = this.f10681e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media.a p10 = cVar.p();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() != 0) {
                    a(cVar, aVar);
                } else if (this.f10679c) {
                    aVar.removeMessages(1);
                    this.f10679c = false;
                    PlaybackStateCompat k10 = cVar.k();
                    if (k10 == null) {
                        j10 = 0;
                    } else {
                        j10 = k10.a();
                    }
                    if ((j10 & 32) != 0) {
                        z();
                    }
                } else {
                    this.f10679c = true;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, p10), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            a(cVar, aVar);
            return false;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j10) {
        }

        public void t(boolean z10) {
        }

        public void u(float f10) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i10) {
        }

        public void y(int i10) {
        }

        public void z() {
        }
    }

    interface c {
        boolean a();

        void b(int i10);

        void c(b bVar, Handler handler);

        void d(MediaMetadataCompat mediaMetadataCompat);

        void e(int i10);

        void f(PlaybackStateCompat playbackStateCompat);

        Token g();

        String h();

        void i(int i10);

        b j();

        PlaybackStateCompat k();

        void l(PendingIntent pendingIntent);

        void m(boolean z10);

        void n(androidx.media.a aVar);

        void o(i iVar);

        androidx.media.a p();

        void release();
    }

    static class d implements c {

        /* renamed from: a  reason: collision with root package name */
        final MediaSession f10684a;

        /* renamed from: b  reason: collision with root package name */
        final a f10685b;

        /* renamed from: c  reason: collision with root package name */
        final Token f10686c;

        /* renamed from: d  reason: collision with root package name */
        final Object f10687d = new Object();

        /* renamed from: e  reason: collision with root package name */
        Bundle f10688e;

        /* renamed from: f  reason: collision with root package name */
        boolean f10689f = false;

        /* renamed from: g  reason: collision with root package name */
        final RemoteCallbackList f10690g = new RemoteCallbackList();

        /* renamed from: h  reason: collision with root package name */
        PlaybackStateCompat f10691h;

        /* renamed from: i  reason: collision with root package name */
        List f10692i;

        /* renamed from: j  reason: collision with root package name */
        MediaMetadataCompat f10693j;

        /* renamed from: k  reason: collision with root package name */
        int f10694k;

        /* renamed from: l  reason: collision with root package name */
        boolean f10695l;

        /* renamed from: m  reason: collision with root package name */
        int f10696m;

        /* renamed from: n  reason: collision with root package name */
        int f10697n;

        /* renamed from: o  reason: collision with root package name */
        b f10698o;

        /* renamed from: p  reason: collision with root package name */
        androidx.media.a f10699p;

        private static class a extends b.a {

            /* renamed from: a  reason: collision with root package name */
            private final AtomicReference f10700a;

            a(d dVar) {
                this.f10700a = new AtomicReference(dVar);
            }

            public void C(int i10) {
                throw new AssertionError();
            }

            public long D() {
                throw new AssertionError();
            }

            public void E(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public CharSequence E0() {
                throw new AssertionError();
            }

            public boolean F() {
                return false;
            }

            public void G(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public PendingIntent H() {
                throw new AssertionError();
            }

            public void H0(a aVar) {
                d dVar = (d) this.f10700a.get();
                if (dVar != null) {
                    dVar.f10690g.unregister(aVar);
                    Binder.getCallingPid();
                    Binder.getCallingUid();
                    synchronized (dVar.f10687d) {
                    }
                }
            }

            public int I() {
                d dVar = (d) this.f10700a.get();
                if (dVar != null) {
                    return dVar.f10694k;
                }
                return 0;
            }

            public void J(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public Bundle K() {
                d dVar = (d) this.f10700a.get();
                if (dVar.f10688e == null) {
                    return null;
                }
                return new Bundle(dVar.f10688e);
            }

            public void L(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void L0() {
                throw new AssertionError();
            }

            public void M(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void N(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public boolean O(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            public void P(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            public void R(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            public void U0(int i10, int i11, String str) {
                throw new AssertionError();
            }

            public int V() {
                d dVar = (d) this.f10700a.get();
                if (dVar != null) {
                    return dVar.f10697n;
                }
                return -1;
            }

            public void W0(boolean z10) {
                throw new AssertionError();
            }

            public void X(int i10) {
                throw new AssertionError();
            }

            public boolean Y() {
                d dVar = (d) this.f10700a.get();
                if (dVar == null || !dVar.f10695l) {
                    return false;
                }
                return true;
            }

            public void b0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public List d1() {
                return null;
            }

            public void g0(long j10) {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            public void h0(boolean z10) {
            }

            public ParcelableVolumeInfo i1() {
                throw new AssertionError();
            }

            public void j() {
                throw new AssertionError();
            }

            public PlaybackStateCompat k() {
                d dVar = (d) this.f10700a.get();
                if (dVar != null) {
                    return MediaSessionCompat.d(dVar.f10691h, dVar.f10693j);
                }
                return null;
            }

            public void k0(int i10) {
                throw new AssertionError();
            }

            public void l() {
                throw new AssertionError();
            }

            public String l0() {
                throw new AssertionError();
            }

            public String m() {
                throw new AssertionError();
            }

            public int n() {
                d dVar = (d) this.f10700a.get();
                if (dVar != null) {
                    return dVar.f10696m;
                }
                return -1;
            }

            public void next() {
                throw new AssertionError();
            }

            public void o() {
                throw new AssertionError();
            }

            public void p0(a aVar) {
                d dVar = (d) this.f10700a.get();
                if (dVar != null) {
                    dVar.f10690g.register(aVar, new androidx.media.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                    synchronized (dVar.f10687d) {
                    }
                }
            }

            public void pause() {
                throw new AssertionError();
            }

            public void previous() {
                throw new AssertionError();
            }

            public void r0(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            public void r1() {
                this.f10700a.set((Object) null);
            }

            public void s0(int i10, int i11, String str) {
                throw new AssertionError();
            }

            public void stop() {
                throw new AssertionError();
            }

            public void u0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public boolean v0() {
                throw new AssertionError();
            }

            public void w0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void x0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void y(long j10) {
                throw new AssertionError();
            }

            public void z(float f10) {
                throw new AssertionError();
            }
        }

        d(Context context, String str, G3.b bVar, Bundle bundle) {
            MediaSession q10 = q(context, str, bundle);
            this.f10684a = q10;
            a aVar = new a(this);
            this.f10685b = aVar;
            this.f10686c = new Token(q10.getSessionToken(), aVar, bVar);
            this.f10688e = bundle;
            b(3);
        }

        public boolean a() {
            return this.f10684a.isActive();
        }

        public void b(int i10) {
            this.f10684a.setFlags(i10 | 3);
        }

        public void c(b bVar, Handler handler) {
            MediaSession.Callback callback;
            synchronized (this.f10687d) {
                try {
                    this.f10698o = bVar;
                    MediaSession mediaSession = this.f10684a;
                    if (bVar == null) {
                        callback = null;
                    } else {
                        callback = bVar.f10678b;
                    }
                    mediaSession.setCallback(callback, handler);
                    if (bVar != null) {
                        bVar.D(this, handler);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f10693j = mediaMetadataCompat;
            MediaSession mediaSession = this.f10684a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.d();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        public void f(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f10691h = playbackStateCompat;
            synchronized (this.f10687d) {
                for (int beginBroadcast = this.f10690g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((a) this.f10690g.getBroadcastItem(beginBroadcast)).p1(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f10690g.finishBroadcast();
            }
            MediaSession mediaSession = this.f10684a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.e();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        public Token g() {
            return this.f10686c;
        }

        public String h() {
            try {
                return (String) this.f10684a.getClass().getMethod("getCallingPackage", (Class[]) null).invoke(this.f10684a, (Object[]) null);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
                return null;
            }
        }

        public void i(int i10) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            this.f10684a.setPlaybackToLocal(builder.build());
        }

        public b j() {
            b bVar;
            synchronized (this.f10687d) {
                bVar = this.f10698o;
            }
            return bVar;
        }

        public PlaybackStateCompat k() {
            return this.f10691h;
        }

        public void l(PendingIntent pendingIntent) {
            this.f10684a.setMediaButtonReceiver(pendingIntent);
        }

        public void m(boolean z10) {
            this.f10684a.setActive(z10);
        }

        public void n(androidx.media.a aVar) {
            synchronized (this.f10687d) {
                this.f10699p = aVar;
            }
        }

        public void o(i iVar) {
            this.f10684a.setPlaybackToRemote((VolumeProvider) iVar.d());
        }

        public androidx.media.a p() {
            androidx.media.a aVar;
            synchronized (this.f10687d) {
                aVar = this.f10699p;
            }
            return aVar;
        }

        public MediaSession q(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        public void release() {
            this.f10689f = true;
            this.f10690g.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f10684a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f10684a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                } catch (Exception e10) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                }
            }
            this.f10684a.setCallback((MediaSession.Callback) null);
            this.f10685b.r1();
            this.f10684a.release();
        }
    }

    static class e extends d {
        e(Context context, String str, G3.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        public void e(int i10) {
            this.f10684a.setRatingType(i10);
        }
    }

    static class f extends e {
        f(Context context, String str, G3.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        public void n(androidx.media.a aVar) {
        }

        public final androidx.media.a p() {
            return new androidx.media.a(this.f10684a.getCurrentControllerInfo());
        }
    }

    static class g extends f {
        g(Context context, String str, G3.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        public MediaSession q(Context context, String str, Bundle bundle) {
            return e.a(context, str, bundle);
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j10;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j11 = -1;
        if (playbackStateCompat.f() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.g() != 3 && playbackStateCompat.g() != 4 && playbackStateCompat.g() != 5) {
            return playbackStateCompat;
        }
        long c10 = playbackStateCompat.c();
        if (c10 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d10 = ((long) (playbackStateCompat.d() * ((float) (elapsedRealtime - c10)))) + playbackStateCompat.f();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            j11 = mediaMetadataCompat.c("android.media.metadata.DURATION");
        }
        if (j11 >= 0 && d10 > j11) {
            j10 = j11;
        } else if (d10 < 0) {
            j10 = 0;
        } else {
            j10 = d10;
        }
        return new PlaybackStateCompat.d(playbackStateCompat).d(playbackStateCompat.g(), j10, playbackStateCompat.d(), elapsedRealtime).a();
    }

    public static Bundle p(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public MediaControllerCompat b() {
        return this.f10667b;
    }

    public Token c() {
        return this.f10666a.g();
    }

    public boolean e() {
        return this.f10666a.a();
    }

    public void f() {
        this.f10666a.release();
    }

    public void g(boolean z10) {
        this.f10666a.m(z10);
        Iterator it = this.f10668c.iterator();
        if (it.hasNext()) {
            c.a(it.next());
            throw null;
        }
    }

    public void h(b bVar) {
        i(bVar, (Handler) null);
    }

    public void i(b bVar, Handler handler) {
        if (bVar == null) {
            this.f10666a.c((b) null, (Handler) null);
            return;
        }
        c cVar = this.f10666a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.c(bVar, handler);
    }

    public void j(int i10) {
        this.f10666a.b(i10);
    }

    public void k(MediaMetadataCompat mediaMetadataCompat) {
        this.f10666a.d(mediaMetadataCompat);
    }

    public void l(PlaybackStateCompat playbackStateCompat) {
        this.f10666a.f(playbackStateCompat);
    }

    public void m(int i10) {
        this.f10666a.i(i10);
    }

    public void n(i iVar) {
        if (iVar != null) {
            this.f10666a.o(iVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void o(int i10) {
        this.f10666a.e(i10);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (G3.b) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, G3.b bVar) {
        this.f10668c = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null && (componentName = C1944a.a(context)) == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                this.f10666a = new g(context, str, bVar, bundle);
            } else if (i10 >= 28) {
                this.f10666a = new f(context, str, bVar, bundle);
            } else {
                this.f10666a = new e(context, str, bVar, bundle);
            }
            i(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            this.f10666a.l(pendingIntent);
            this.f10667b = new MediaControllerCompat(context, this);
            if (f10665d == 0) {
                f10665d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }
}
