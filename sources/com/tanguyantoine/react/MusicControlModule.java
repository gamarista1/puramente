package com.tanguyantoine.react;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.core.app.o;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tanguyantoine.react.MusicControlNotification;
import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import s5.i;

public class MusicControlModule extends ReactContextBaseJavaModule {
    static MusicControlModule INSTANCE = null;
    /* access modifiers changed from: private */
    public static final String TAG = "MusicControlModule";
    private c afListener;
    /* access modifiers changed from: private */
    public Thread artworkThread;
    private String channelId = "react-native-music-control";
    private ServiceConnection connection = new a();
    public ReactApplicationContext context;
    private long controls = 0;
    private d emitter;
    private boolean init = false;
    /* access modifiers changed from: private */
    public boolean isPlaying = false;

    /* renamed from: md  reason: collision with root package name */
    private MediaMetadataCompat.b f59960md;

    /* renamed from: nb  reason: collision with root package name */
    public o.f f59961nb;
    public MusicControlNotification notification;
    public c notificationClose = c.PAUSED;
    private int notificationId = 100;

    /* renamed from: pb  reason: collision with root package name */
    private PlaybackStateCompat.d f59962pb;
    protected int ratingType = 6;
    private j receiver;
    private boolean remoteVolume = false;
    protected MediaSessionCompat session;
    private Map<String, Integer> skipOptions = new HashMap();
    private PlaybackStateCompat state;
    private k volume;

    class a implements ServiceConnection {
        a() {
        }

        public void onBindingDied(ComponentName componentName) {
            Log.w(MusicControlModule.TAG, "Binding has dead.");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.w(MusicControlModule.TAG, "onServiceConnected");
            MusicControlNotification.NotificationService a10 = ((MusicControlNotification.NotificationService.a) iBinder).a();
            if (a10 != null) {
                a10.a();
            }
            MusicControlModule.this.context.unbindService(this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.w(MusicControlModule.TAG, "Service is disconnected..");
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f59964a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f59965b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f59966c;

        b(String str, boolean z10, boolean z11) {
            this.f59964a = str;
            this.f59965b = z10;
            this.f59966c = z11;
        }

        public void run() {
            MediaMetadataCompat.b bVar;
            try {
                Bitmap c10 = MusicControlModule.this.loadArtwork(this.f59964a, this.f59965b);
                MediaSessionCompat mediaSessionCompat = MusicControlModule.this.session;
                if (mediaSessionCompat != null) {
                    MediaMetadataCompat b10 = mediaSessionCompat.b().b();
                    if (b10 == null) {
                        bVar = new MediaMetadataCompat.b();
                    } else {
                        bVar = new MediaMetadataCompat.b(b10);
                    }
                    MusicControlModule.this.session.k(bVar.b("android.media.metadata.ART", c10).a());
                }
                o.f fVar = MusicControlModule.this.f59961nb;
                if (fVar != null) {
                    fVar.k(this.f59966c);
                    MusicControlModule.this.f59961nb.u(c10);
                    MusicControlModule musicControlModule = MusicControlModule.this;
                    musicControlModule.notification.e(musicControlModule.f59961nb, musicControlModule.isPlaying);
                }
                MusicControlModule.this.artworkThread = null;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public enum c {
        ALWAYS,
        PAUSED,
        NEVER
    }

    public MusicControlModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void createChannel(ReactApplicationContext reactApplicationContext) {
        h.a();
        NotificationChannel a10 = i.a(this.channelId, "Media playback", 2);
        a10.setDescription("Media playback controls");
        a10.setShowBadge(false);
        a10.setLockscreenVisibility(1);
        ((NotificationManager) reactApplicationContext.getSystemService("notification")).createNotificationChannel(a10);
    }

    private boolean hasControl(long j10) {
        if ((this.controls & j10) == j10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public Bitmap loadArtwork(String str, boolean z10) {
        Bitmap bitmap = null;
        if (z10) {
            try {
                if (!str.startsWith("http")) {
                    Drawable e10 = q8.c.d().e(getReactApplicationContext(), str);
                    if (e10 instanceof BitmapDrawable) {
                        return ((BitmapDrawable) e10).getBitmap();
                    }
                    return BitmapFactory.decodeFile(str);
                }
            } catch (IOException e11) {
                e = e11;
                Log.w(TAG, "Could not load the artwork", e);
                return bitmap;
            } catch (IndexOutOfBoundsException e12) {
                e = e12;
                Log.w(TAG, "Could not load the artwork", e);
                return bitmap;
            }
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        uRLConnection.connect();
        InputStream inputStream = uRLConnection.getInputStream();
        bitmap = BitmapFactory.decodeStream(inputStream);
        inputStream.close();
        return bitmap;
    }

    private void updateNotificationMediaStyle() {
        int i10;
        if (!Build.MANUFACTURER.toLowerCase(Locale.getDefault()).contains("huawei")) {
            androidx.media.app.c cVar = new androidx.media.app.c();
            cVar.h(this.session.c());
            if (hasControl(4) || hasControl(2) || hasControl(512)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (hasControl(32)) {
                i10++;
            }
            if (hasControl(16)) {
                i10++;
            }
            if (hasControl(64)) {
                i10++;
            }
            if (hasControl(8)) {
                i10++;
            }
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = i11;
            }
            cVar.i(iArr);
            this.f59961nb.H(cVar);
        }
    }

    public synchronized void destroy() {
        stopControl();
    }

    @ReactMethod
    public void enableBackgroundMode(boolean z10) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x015a, code lost:
        r2.controls |= r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0160, code lost:
        r2.controls &= ~r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0166, code lost:
        r2.notification.g(r2.controls, r2.skipOptions);
        r2.f59962pb.b(r2.controls);
        r3 = r2.f59962pb.a();
        r2.state = r3;
        r2.session.l(r3);
        updateNotificationMediaStyle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x018c, code lost:
        if (r2.session.e() == false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x018e, code lost:
        r2.notification.e(r2.f59961nb, r2.isPlaying);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0198, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0108, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0158, code lost:
        if (r4 == false) goto L_0x0160;
     */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void enableControl(java.lang.String r3, boolean r4, com.facebook.react.bridge.ReadableMap r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.init()     // Catch:{ all -> 0x001f }
            com.tanguyantoine.react.MusicControlNotification r0 = r2.notification     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x000a
            monitor-exit(r2)
            return
        L_0x000a:
            int r0 = r3.hashCode()     // Catch:{ all -> 0x001f }
            r1 = 3
            switch(r0) {
                case -810883302: goto L_0x0096;
                case -303403474: goto L_0x008c;
                case -276658028: goto L_0x0082;
                case 3443508: goto L_0x0078;
                case 3526264: goto L_0x006d;
                case 3540994: goto L_0x0063;
                case 37027584: goto L_0x0058;
                case 106440182: goto L_0x004e;
                case 251037443: goto L_0x0043;
                case 543295647: goto L_0x0038;
                case 1120478850: goto L_0x002d;
                case 1206998552: goto L_0x0022;
                case 2061494342: goto L_0x0014;
                default: goto L_0x0012;
            }     // Catch:{ all -> 0x001f }
        L_0x0012:
            goto L_0x00a1
        L_0x0014:
            java.lang.String r0 = "skipForward"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 0
            goto L_0x00a2
        L_0x001f:
            r3 = move-exception
            goto L_0x0199
        L_0x0022:
            java.lang.String r0 = "nextTrack"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 2
            goto L_0x00a2
        L_0x002d:
            java.lang.String r0 = "skipBackward"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 1
            goto L_0x00a2
        L_0x0038:
            java.lang.String r0 = "setRating"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 9
            goto L_0x00a2
        L_0x0043:
            java.lang.String r0 = "closeNotification"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 12
            goto L_0x00a2
        L_0x004e:
            java.lang.String r0 = "pause"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 5
            goto L_0x00a2
        L_0x0058:
            java.lang.String r0 = "remoteVolume"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 11
            goto L_0x00a2
        L_0x0063:
            java.lang.String r0 = "stop"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 7
            goto L_0x00a2
        L_0x006d:
            java.lang.String r0 = "seek"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 8
            goto L_0x00a2
        L_0x0078:
            java.lang.String r0 = "play"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 4
            goto L_0x00a2
        L_0x0082:
            java.lang.String r0 = "previousTrack"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = r1
            goto L_0x00a2
        L_0x008c:
            java.lang.String r0 = "togglePlayPause"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 6
            goto L_0x00a2
        L_0x0096:
            java.lang.String r0 = "volume"
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00a1
            r3 = 10
            goto L_0x00a2
        L_0x00a1:
            r3 = -1
        L_0x00a2:
            switch(r3) {
                case 0: goto L_0x013d;
                case 1: goto L_0x0121;
                case 2: goto L_0x011e;
                case 3: goto L_0x011b;
                case 4: goto L_0x0118;
                case 5: goto L_0x0115;
                case 6: goto L_0x0112;
                case 7: goto L_0x010f;
                case 8: goto L_0x010c;
                case 9: goto L_0x0109;
                case 10: goto L_0x00f1;
                case 11: goto L_0x00de;
                case 12: goto L_0x00a6;
                default: goto L_0x00a5;
            }     // Catch:{ all -> 0x001f }
        L_0x00a5:
            goto L_0x00dc
        L_0x00a6:
            if (r4 == 0) goto L_0x00dc
            java.lang.String r3 = "when"
            boolean r3 = r5.hasKey(r3)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00da
            java.lang.String r3 = "always"
            java.lang.String r4 = "when"
            java.lang.String r4 = r5.getString(r4)     // Catch:{ all -> 0x001f }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00c3
            com.tanguyantoine.react.MusicControlModule$c r3 = com.tanguyantoine.react.MusicControlModule.c.ALWAYS     // Catch:{ all -> 0x001f }
            r2.notificationClose = r3     // Catch:{ all -> 0x001f }
            goto L_0x00da
        L_0x00c3:
            java.lang.String r3 = "paused"
            java.lang.String r4 = "when"
            java.lang.String r4 = r5.getString(r4)     // Catch:{ all -> 0x001f }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x00d6
            com.tanguyantoine.react.MusicControlModule$c r3 = com.tanguyantoine.react.MusicControlModule.c.PAUSED     // Catch:{ all -> 0x001f }
            r2.notificationClose = r3     // Catch:{ all -> 0x001f }
            goto L_0x00da
        L_0x00d6:
            com.tanguyantoine.react.MusicControlModule$c r3 = com.tanguyantoine.react.MusicControlModule.c.NEVER     // Catch:{ all -> 0x001f }
            r2.notificationClose = r3     // Catch:{ all -> 0x001f }
        L_0x00da:
            monitor-exit(r2)
            return
        L_0x00dc:
            monitor-exit(r2)
            return
        L_0x00de:
            r2.remoteVolume = r4     // Catch:{ all -> 0x001f }
            if (r4 == 0) goto L_0x00ea
            android.support.v4.media.session.MediaSessionCompat r3 = r2.session     // Catch:{ all -> 0x001f }
            com.tanguyantoine.react.k r4 = r2.volume     // Catch:{ all -> 0x001f }
            r3.n(r4)     // Catch:{ all -> 0x001f }
            goto L_0x00ef
        L_0x00ea:
            android.support.v4.media.session.MediaSessionCompat r3 = r2.session     // Catch:{ all -> 0x001f }
            r3.m(r1)     // Catch:{ all -> 0x001f }
        L_0x00ef:
            monitor-exit(r2)
            return
        L_0x00f1:
            com.tanguyantoine.react.k r3 = r2.volume     // Catch:{ all -> 0x001f }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x001f }
            r5 = 0
            com.tanguyantoine.react.k r3 = r3.h(r4, r5, r5)     // Catch:{ all -> 0x001f }
            r2.volume = r3     // Catch:{ all -> 0x001f }
            boolean r4 = r2.remoteVolume     // Catch:{ all -> 0x001f }
            if (r4 == 0) goto L_0x0107
            android.support.v4.media.session.MediaSessionCompat r4 = r2.session     // Catch:{ all -> 0x001f }
            r4.n(r3)     // Catch:{ all -> 0x001f }
        L_0x0107:
            monitor-exit(r2)
            return
        L_0x0109:
            r0 = 128(0x80, double:6.32E-322)
            goto L_0x0158
        L_0x010c:
            r0 = 256(0x100, double:1.265E-321)
            goto L_0x0158
        L_0x010f:
            r0 = 1
            goto L_0x0158
        L_0x0112:
            r0 = 512(0x200, double:2.53E-321)
            goto L_0x0158
        L_0x0115:
            r0 = 2
            goto L_0x0158
        L_0x0118:
            r0 = 4
            goto L_0x0158
        L_0x011b:
            r0 = 16
            goto L_0x0158
        L_0x011e:
            r0 = 32
            goto L_0x0158
        L_0x0121:
            java.lang.String r3 = "interval"
            boolean r3 = r5.hasKey(r3)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x013a
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r2.skipOptions     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "skipBackward"
            java.lang.String r1 = "interval"
            int r5 = r5.getInt(r1)     // Catch:{ all -> 0x001f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x001f }
            r3.put(r0, r5)     // Catch:{ all -> 0x001f }
        L_0x013a:
            r0 = 8
            goto L_0x0158
        L_0x013d:
            java.lang.String r3 = "interval"
            boolean r3 = r5.hasKey(r3)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0156
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r2.skipOptions     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "skipForward"
            java.lang.String r1 = "interval"
            int r5 = r5.getInt(r1)     // Catch:{ all -> 0x001f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x001f }
            r3.put(r0, r5)     // Catch:{ all -> 0x001f }
        L_0x0156:
            r0 = 64
        L_0x0158:
            if (r4 == 0) goto L_0x0160
            long r3 = r2.controls     // Catch:{ all -> 0x001f }
            long r3 = r3 | r0
            r2.controls = r3     // Catch:{ all -> 0x001f }
            goto L_0x0166
        L_0x0160:
            long r3 = r2.controls     // Catch:{ all -> 0x001f }
            long r0 = ~r0     // Catch:{ all -> 0x001f }
            long r3 = r3 & r0
            r2.controls = r3     // Catch:{ all -> 0x001f }
        L_0x0166:
            com.tanguyantoine.react.MusicControlNotification r3 = r2.notification     // Catch:{ all -> 0x001f }
            long r4 = r2.controls     // Catch:{ all -> 0x001f }
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.skipOptions     // Catch:{ all -> 0x001f }
            r3.g(r4, r0)     // Catch:{ all -> 0x001f }
            android.support.v4.media.session.PlaybackStateCompat$d r3 = r2.f59962pb     // Catch:{ all -> 0x001f }
            long r4 = r2.controls     // Catch:{ all -> 0x001f }
            r3.b(r4)     // Catch:{ all -> 0x001f }
            android.support.v4.media.session.PlaybackStateCompat$d r3 = r2.f59962pb     // Catch:{ all -> 0x001f }
            android.support.v4.media.session.PlaybackStateCompat r3 = r3.a()     // Catch:{ all -> 0x001f }
            r2.state = r3     // Catch:{ all -> 0x001f }
            android.support.v4.media.session.MediaSessionCompat r4 = r2.session     // Catch:{ all -> 0x001f }
            r4.l(r3)     // Catch:{ all -> 0x001f }
            r2.updateNotificationMediaStyle()     // Catch:{ all -> 0x001f }
            android.support.v4.media.session.MediaSessionCompat r3 = r2.session     // Catch:{ all -> 0x001f }
            boolean r3 = r3.e()     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0197
            com.tanguyantoine.react.MusicControlNotification r3 = r2.notification     // Catch:{ all -> 0x001f }
            androidx.core.app.o$f r4 = r2.f59961nb     // Catch:{ all -> 0x001f }
            boolean r5 = r2.isPlaying     // Catch:{ all -> 0x001f }
            r3.e(r4, r5)     // Catch:{ all -> 0x001f }
        L_0x0197:
            monitor-exit(r2)
            return
        L_0x0199:
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tanguyantoine.react.MusicControlModule.enableControl(java.lang.String, boolean, com.facebook.react.bridge.ReadableMap):void");
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("STATE_ERROR", 7);
        hashMap.put("STATE_STOPPED", 1);
        hashMap.put("STATE_PLAYING", 3);
        hashMap.put("STATE_PAUSED", 2);
        hashMap.put("STATE_BUFFERING", 6);
        hashMap.put("RATING_HEART", 1);
        hashMap.put("RATING_THUMBS_UP_DOWN", 2);
        hashMap.put("RATING_3_STARS", 3);
        hashMap.put("RATING_4_STARS", 4);
        hashMap.put("RATING_5_STARS", 5);
        hashMap.put("RATING_PERCENTAGE", 6);
        return hashMap;
    }

    public String getName() {
        return "MusicControlManager";
    }

    public int getNotificationId() {
        return this.notificationId;
    }

    public void init() {
        if (!this.init) {
            INSTANCE = this;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            this.context = reactApplicationContext;
            this.emitter = new d(reactApplicationContext, this.notificationId);
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this.context, "MusicControl");
            this.session = mediaSessionCompat;
            mediaSessionCompat.j(3);
            this.session.h(new a(this.emitter));
            k kVar = new k(this.context, this.emitter, true, 100, 100);
            this.volume = kVar;
            if (this.remoteVolume) {
                this.session.n(kVar);
            } else {
                this.session.m(3);
            }
            this.f59960md = new MediaMetadataCompat.b();
            PlaybackStateCompat.d dVar = new PlaybackStateCompat.d();
            this.f59962pb = dVar;
            dVar.b(this.controls);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                createChannel(this.context);
            }
            o.f fVar = new o.f(this.context, this.channelId);
            this.f59961nb = fVar;
            fVar.N(1);
            this.f59961nb.A(1);
            updateNotificationMediaStyle();
            this.state = this.f59962pb.a();
            MusicControlNotification musicControlNotification = new MusicControlNotification(this, this.context);
            this.notification = musicControlNotification;
            musicControlNotification.g(this.controls, this.skipOptions);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("music_control_remove_notification");
            intentFilter.addAction("music_control_media_button");
            intentFilter.addAction("android.intent.action.MEDIA_BUTTON");
            intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
            this.receiver = new j(this, this.context);
            if (i10 < 34 || this.context.getApplicationInfo().targetSdkVersion < 34) {
                this.context.registerReceiver(this.receiver, intentFilter);
            } else {
                Intent unused = this.context.registerReceiver(this.receiver, intentFilter, 4);
            }
            Intent intent = new Intent(this.context, MusicControlNotification.NotificationService.class);
            this.afListener = new c(this.context, this.emitter, this.volume);
            if (i10 >= 26) {
                try {
                    this.context.bindService(intent, this.connection, 1);
                } catch (Exception unused2) {
                    androidx.core.content.c.startForegroundService(this.context, intent);
                }
            } else {
                this.context.startService(intent);
            }
            this.isPlaying = false;
            this.init = true;
        }
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    @ReactMethod
    public void observeAudioInterruptions(boolean z10) {
        if (z10) {
            this.afListener.b();
        } else {
            this.afListener.a();
        }
    }

    @ReactMethod
    public synchronized void resetNowPlaying() {
        try {
            if (this.init) {
                Thread thread = this.artworkThread;
                if (thread != null && thread.isAlive()) {
                    this.artworkThread.interrupt();
                }
                this.artworkThread = null;
                this.f59960md = new MediaMetadataCompat.b();
                MusicControlNotification musicControlNotification = this.notification;
                if (musicControlNotification != null) {
                    musicControlNotification.b();
                }
                this.session.g(false);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    @ReactMethod
    public synchronized void setNotificationIds(int i10, String str) {
        this.notificationId = i10;
        this.channelId = str;
    }

    @ReactMethod
    public synchronized void setNowPlaying(ReadableMap readableMap) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j10;
        int i10;
        boolean z10;
        String str7;
        String str8;
        RatingCompat ratingCompat;
        String str9;
        ReadableMap readableMap2 = readableMap;
        synchronized (this) {
            try {
                init();
                if (this.notification != null) {
                    Thread thread = this.artworkThread;
                    if (thread != null && thread.isAlive()) {
                        this.artworkThread.interrupt();
                    }
                    this.artworkThread = null;
                    this.f59960md = new MediaMetadataCompat.b();
                    if (readableMap2.hasKey(com.amazon.a.a.o.b.f37461S)) {
                        str = readableMap2.getString(com.amazon.a.a.o.b.f37461S);
                    } else {
                        str = null;
                    }
                    if (readableMap2.hasKey("artist")) {
                        str2 = readableMap2.getString("artist");
                    } else {
                        str2 = null;
                    }
                    if (readableMap2.hasKey("album")) {
                        str3 = readableMap2.getString("album");
                    } else {
                        str3 = null;
                    }
                    if (readableMap2.hasKey("genre")) {
                        str4 = readableMap2.getString("genre");
                    } else {
                        str4 = null;
                    }
                    if (readableMap2.hasKey(com.amazon.a.a.o.b.f37480c)) {
                        str5 = readableMap2.getString(com.amazon.a.a.o.b.f37480c);
                    } else {
                        str5 = null;
                    }
                    if (readableMap2.hasKey(AttributeType.DATE)) {
                        str6 = readableMap2.getString(AttributeType.DATE);
                    } else {
                        str6 = null;
                    }
                    if (readableMap2.hasKey("duration")) {
                        j10 = (long) (readableMap2.getDouble("duration") * 1000.0d);
                    } else {
                        j10 = 0;
                    }
                    if (readableMap2.hasKey("color")) {
                        i10 = readableMap2.getInt("color");
                    } else {
                        i10 = 0;
                    }
                    if (readableMap2.hasKey("colorized")) {
                        z10 = readableMap2.getBoolean("colorized");
                    } else if (!readableMap2.hasKey("color")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (readableMap2.hasKey("notificationIcon")) {
                        str7 = readableMap2.getString("notificationIcon");
                    } else {
                        str7 = null;
                    }
                    if (readableMap2.hasKey("rating")) {
                        int i11 = this.ratingType;
                        if (i11 == 6) {
                            str8 = str7;
                            ratingCompat = RatingCompat.i((float) readableMap2.getDouble("rating"));
                        } else {
                            str8 = str7;
                            if (i11 == 1) {
                                ratingCompat = RatingCompat.h(readableMap2.getBoolean("rating"));
                            } else if (i11 == 2) {
                                ratingCompat = RatingCompat.k(readableMap2.getBoolean("rating"));
                            } else {
                                ratingCompat = RatingCompat.j(i11, (float) readableMap2.getDouble("rating"));
                            }
                        }
                    } else {
                        str8 = str7;
                        ratingCompat = RatingCompat.l(this.ratingType);
                    }
                    this.f59960md.e("android.media.metadata.TITLE", str);
                    this.f59960md.e("android.media.metadata.ARTIST", str2);
                    this.f59960md.e("android.media.metadata.ALBUM", str3);
                    this.f59960md.e("android.media.metadata.GENRE", str4);
                    this.f59960md.e("android.media.metadata.DISPLAY_DESCRIPTION", str5);
                    this.f59960md.e("android.media.metadata.DATE", str6);
                    this.f59960md.c("android.media.metadata.DURATION", j10);
                    this.f59960md.d("android.media.metadata.RATING", ratingCompat);
                    this.f59961nb.o(str);
                    this.f59961nb.n(str2);
                    this.f59961nb.l(str3);
                    this.f59961nb.j(i10);
                    boolean z11 = false;
                    this.f59961nb.k(false);
                    if (str8 != null) {
                        this.notification.d(str8);
                    }
                    if (readableMap2.hasKey("artwork")) {
                        if (readableMap2.getType("artwork") == ReadableType.Map) {
                            str9 = readableMap2.getMap("artwork").getString("uri");
                            z11 = true;
                        } else {
                            str9 = readableMap2.getString("artwork");
                        }
                        Thread thread2 = new Thread(new b(str9, z11, z10));
                        this.artworkThread = thread2;
                        thread2.start();
                    } else {
                        this.f59960md.b("android.media.metadata.ART", (Bitmap) null);
                        this.f59961nb.u((Bitmap) null);
                    }
                    this.session.k(this.f59960md.a());
                    this.session.g(true);
                    this.notification.e(this.f59961nb, this.isPlaying);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    @ReactMethod
    public synchronized void stopControl() {
        try {
            if (this.init) {
                MusicControlNotification musicControlNotification = this.notification;
                if (musicControlNotification != null) {
                    musicControlNotification.b();
                }
                this.session.f();
                getReactApplicationContext().unregisterReceiver(this.receiver);
                Thread thread = this.artworkThread;
                if (thread != null && thread.isAlive()) {
                    this.artworkThread.interrupt();
                }
                this.artworkThread = null;
                this.session = null;
                this.notification = null;
                this.volume = null;
                this.receiver = null;
                this.state = null;
                this.f59960md = null;
                this.f59962pb = null;
                this.f59961nb = null;
                this.init = false;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012d, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7 A[Catch:{ all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9 A[Catch:{ all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f1 A[Catch:{ all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112 A[Catch:{ all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0127 A[Catch:{ all -> 0x0024 }] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updatePlayback(com.facebook.react.bridge.ReadableMap r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            monitor-enter(r18)
            r18.init()     // Catch:{ all -> 0x0024 }
            com.tanguyantoine.react.MusicControlNotification r2 = r1.notification     // Catch:{ all -> 0x0024 }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r18)
            return
        L_0x000e:
            java.lang.String r2 = "bufferedTime"
            boolean r2 = r0.hasKey(r2)     // Catch:{ all -> 0x0024 }
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = "bufferedTime"
            double r5 = r0.getDouble(r2)     // Catch:{ all -> 0x0024 }
            double r5 = r5 * r3
            long r5 = (long) r5     // Catch:{ all -> 0x0024 }
            goto L_0x002d
        L_0x0024:
            r0 = move-exception
            goto L_0x012e
        L_0x0027:
            android.support.v4.media.session.PlaybackStateCompat r2 = r1.state     // Catch:{ all -> 0x0024 }
            long r5 = r2.b()     // Catch:{ all -> 0x0024 }
        L_0x002d:
            java.lang.String r2 = "speed"
            boolean r2 = r0.hasKey(r2)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = "speed"
            double r7 = r0.getDouble(r2)     // Catch:{ all -> 0x0024 }
            float r2 = (float) r7     // Catch:{ all -> 0x0024 }
            goto L_0x0043
        L_0x003d:
            android.support.v4.media.session.PlaybackStateCompat r2 = r1.state     // Catch:{ all -> 0x0024 }
            float r2 = r2.d()     // Catch:{ all -> 0x0024 }
        L_0x0043:
            java.lang.String r7 = "state"
            boolean r7 = r0.hasKey(r7)     // Catch:{ all -> 0x0024 }
            if (r7 == 0) goto L_0x0053
            java.lang.String r7 = "state"
            int r7 = r0.getInt(r7)     // Catch:{ all -> 0x0024 }
        L_0x0051:
            r9 = r7
            goto L_0x005a
        L_0x0053:
            android.support.v4.media.session.PlaybackStateCompat r7 = r1.state     // Catch:{ all -> 0x0024 }
            int r7 = r7.g()     // Catch:{ all -> 0x0024 }
            goto L_0x0051
        L_0x005a:
            java.lang.String r7 = "maxVolume"
            boolean r7 = r0.hasKey(r7)     // Catch:{ all -> 0x0024 }
            if (r7 == 0) goto L_0x0069
            java.lang.String r7 = "maxVolume"
            int r7 = r0.getInt(r7)     // Catch:{ all -> 0x0024 }
            goto L_0x006f
        L_0x0069:
            com.tanguyantoine.react.k r7 = r1.volume     // Catch:{ all -> 0x0024 }
            int r7 = r7.b()     // Catch:{ all -> 0x0024 }
        L_0x006f:
            java.lang.String r8 = "volume"
            boolean r8 = r0.hasKey(r8)     // Catch:{ all -> 0x0024 }
            if (r8 == 0) goto L_0x007f
            java.lang.String r8 = "volume"
            int r8 = r0.getInt(r8)     // Catch:{ all -> 0x0024 }
        L_0x007d:
            r15 = r8
            goto L_0x0086
        L_0x007f:
            com.tanguyantoine.react.k r8 = r1.volume     // Catch:{ all -> 0x0024 }
            int r8 = r8.a()     // Catch:{ all -> 0x0024 }
            goto L_0x007d
        L_0x0086:
            java.lang.String r8 = "rating"
            boolean r8 = r0.hasKey(r8)     // Catch:{ all -> 0x0024 }
            if (r8 == 0) goto L_0x0095
            java.lang.String r8 = "rating"
            int r8 = r0.getInt(r8)     // Catch:{ all -> 0x0024 }
            goto L_0x0097
        L_0x0095:
            int r8 = r1.ratingType     // Catch:{ all -> 0x0024 }
        L_0x0097:
            r1.ratingType = r8     // Catch:{ all -> 0x0024 }
            r13 = 3
            if (r9 == r13) goto L_0x00a2
            r8 = 6
            if (r9 != r8) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r8 = 0
            goto L_0x00a3
        L_0x00a2:
            r8 = 1
        L_0x00a3:
            r1.isPlaying = r8     // Catch:{ all -> 0x0024 }
            if (r8 == 0) goto L_0x00ae
            r8 = 0
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x00ae
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00ae:
            r12 = r2
            java.lang.String r2 = "elapsedTime"
            boolean r2 = r0.hasKey(r2)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x00c9
            java.lang.String r2 = "elapsedTime"
            double r10 = r0.getDouble(r2)     // Catch:{ all -> 0x0024 }
            double r10 = r10 * r3
            long r2 = (long) r10     // Catch:{ all -> 0x0024 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0024 }
        L_0x00c3:
            r16 = r2
            r2 = r10
            r10 = r16
            goto L_0x00d6
        L_0x00c9:
            android.support.v4.media.session.PlaybackStateCompat r0 = r1.state     // Catch:{ all -> 0x0024 }
            long r2 = r0.f()     // Catch:{ all -> 0x0024 }
            android.support.v4.media.session.PlaybackStateCompat r0 = r1.state     // Catch:{ all -> 0x0024 }
            long r10 = r0.c()     // Catch:{ all -> 0x0024 }
            goto L_0x00c3
        L_0x00d6:
            android.support.v4.media.session.PlaybackStateCompat$d r8 = r1.f59962pb     // Catch:{ all -> 0x0024 }
            r0 = r13
            r13 = r2
            r8.d(r9, r10, r12, r13)     // Catch:{ all -> 0x0024 }
            android.support.v4.media.session.PlaybackStateCompat$d r2 = r1.f59962pb     // Catch:{ all -> 0x0024 }
            r2.c(r5)     // Catch:{ all -> 0x0024 }
            android.support.v4.media.session.PlaybackStateCompat$d r2 = r1.f59962pb     // Catch:{ all -> 0x0024 }
            long r3 = r1.controls     // Catch:{ all -> 0x0024 }
            r2.b(r3)     // Catch:{ all -> 0x0024 }
            android.support.v4.media.session.MediaSessionCompat r2 = r1.session     // Catch:{ all -> 0x0024 }
            boolean r2 = r2.e()     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x00fa
            com.tanguyantoine.react.MusicControlNotification r2 = r1.notification     // Catch:{ all -> 0x0024 }
            androidx.core.app.o$f r3 = r1.f59961nb     // Catch:{ all -> 0x0024 }
            boolean r4 = r1.isPlaying     // Catch:{ all -> 0x0024 }
            r2.e(r3, r4)     // Catch:{ all -> 0x0024 }
        L_0x00fa:
            android.support.v4.media.session.PlaybackStateCompat$d r2 = r1.f59962pb     // Catch:{ all -> 0x0024 }
            android.support.v4.media.session.PlaybackStateCompat r2 = r2.a()     // Catch:{ all -> 0x0024 }
            r1.state = r2     // Catch:{ all -> 0x0024 }
            android.support.v4.media.session.MediaSessionCompat r3 = r1.session     // Catch:{ all -> 0x0024 }
            r3.l(r2)     // Catch:{ all -> 0x0024 }
            android.support.v4.media.session.MediaSessionCompat r2 = r1.session     // Catch:{ all -> 0x0024 }
            int r3 = r1.ratingType     // Catch:{ all -> 0x0024 }
            r2.o(r3)     // Catch:{ all -> 0x0024 }
            boolean r2 = r1.remoteVolume     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0127
            android.support.v4.media.session.MediaSessionCompat r0 = r1.session     // Catch:{ all -> 0x0024 }
            com.tanguyantoine.react.k r2 = r1.volume     // Catch:{ all -> 0x0024 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0024 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0024 }
            r5 = 0
            com.tanguyantoine.react.k r2 = r2.h(r5, r3, r4)     // Catch:{ all -> 0x0024 }
            r0.n(r2)     // Catch:{ all -> 0x0024 }
            goto L_0x012c
        L_0x0127:
            android.support.v4.media.session.MediaSessionCompat r2 = r1.session     // Catch:{ all -> 0x0024 }
            r2.m(r0)     // Catch:{ all -> 0x0024 }
        L_0x012c:
            monitor-exit(r18)
            return
        L_0x012e:
            monitor-exit(r18)     // Catch:{ all -> 0x0024 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tanguyantoine.react.MusicControlModule.updatePlayback(com.facebook.react.bridge.ReadableMap):void");
    }
}
