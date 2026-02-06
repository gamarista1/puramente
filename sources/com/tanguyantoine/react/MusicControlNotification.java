package com.tanguyantoine.react;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.view.KeyEvent;
import androidx.core.app.o;
import androidx.core.app.r;
import androidx.core.content.c;
import com.facebook.react.bridge.ReactApplicationContext;
import com.tanguyantoine.react.MusicControlModule;
import java.lang.ref.WeakReference;

public class MusicControlNotification {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f59972a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicControlModule f59973b;

    /* renamed from: c  reason: collision with root package name */
    private int f59974c;

    /* renamed from: d  reason: collision with root package name */
    private int f59975d;

    /* renamed from: e  reason: collision with root package name */
    private o.b f59976e;

    /* renamed from: f  reason: collision with root package name */
    private o.b f59977f;

    /* renamed from: g  reason: collision with root package name */
    private o.b f59978g;

    /* renamed from: h  reason: collision with root package name */
    private o.b f59979h;

    /* renamed from: i  reason: collision with root package name */
    private o.b f59980i;

    /* renamed from: j  reason: collision with root package name */
    private o.b f59981j;

    /* renamed from: k  reason: collision with root package name */
    private o.b f59982k;

    public static class NotificationService extends Service {

        /* renamed from: a  reason: collision with root package name */
        private final a f59983a = new a();

        /* renamed from: b  reason: collision with root package name */
        private Notification f59984b;

        public class a extends Binder {

            /* renamed from: a  reason: collision with root package name */
            private WeakReference f59985a;

            public a() {
            }

            public NotificationService a() {
                WeakReference weakReference = this.f59985a;
                if (weakReference == null) {
                    return null;
                }
                return (NotificationService) weakReference.get();
            }

            public void b(NotificationService notificationService) {
                this.f59985a = new WeakReference(notificationService);
            }
        }

        public void a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                try {
                    c.startForegroundService(this, new Intent(this, NotificationService.class));
                    MusicControlModule musicControlModule = MusicControlModule.INSTANCE;
                    if (musicControlModule == null) {
                        musicControlModule.init();
                    }
                    MusicControlModule musicControlModule2 = MusicControlModule.INSTANCE;
                    this.f59984b = musicControlModule2.notification.c(musicControlModule2.f59961nb, false);
                    if (i10 >= 29) {
                        startForeground(MusicControlModule.INSTANCE.getNotificationId(), this.f59984b, 2);
                    } else {
                        startForeground(MusicControlModule.INSTANCE.getNotificationId(), this.f59984b);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        public IBinder onBind(Intent intent) {
            this.f59983a.b(this);
            return this.f59983a;
        }

        public void onCreate() {
            super.onCreate();
            try {
                MusicControlModule musicControlModule = MusicControlModule.INSTANCE;
                if (musicControlModule == null) {
                    musicControlModule.init();
                }
                MusicControlModule musicControlModule2 = MusicControlModule.INSTANCE;
                this.f59984b = musicControlModule2.notification.c(musicControlModule2.f59961nb, false);
                if (Build.VERSION.SDK_INT >= 29) {
                    startForeground(MusicControlModule.INSTANCE.getNotificationId(), this.f59984b, 2);
                } else {
                    startForeground(MusicControlModule.INSTANCE.getNotificationId(), this.f59984b);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void onDestroy() {
            MusicControlModule musicControlModule = MusicControlModule.INSTANCE;
            if (musicControlModule != null) {
                musicControlModule.destroy();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                stopForeground(true);
            }
            stopSelf();
        }

        public int onStartCommand(Intent intent, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 26) {
                MusicControlModule musicControlModule = MusicControlModule.INSTANCE;
                if (musicControlModule == null) {
                    try {
                        musicControlModule.init();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                try {
                    MusicControlModule musicControlModule2 = MusicControlModule.INSTANCE;
                    this.f59984b = musicControlModule2.notification.c(musicControlModule2.f59961nb, false);
                    if (Build.VERSION.SDK_INT >= 29) {
                        startForeground(MusicControlModule.INSTANCE.getNotificationId(), this.f59984b, 2);
                    } else {
                        startForeground(MusicControlModule.INSTANCE.getNotificationId(), this.f59984b);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            return 2;
        }

        public void onTaskRemoved(Intent intent) {
            MusicControlModule musicControlModule = MusicControlModule.INSTANCE;
            if (musicControlModule != null) {
                musicControlModule.destroy();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                stopForeground(true);
            }
            stopSelf();
        }
    }

    public MusicControlNotification(MusicControlModule musicControlModule, ReactApplicationContext reactApplicationContext) {
        this.f59972a = reactApplicationContext;
        this.f59973b = musicControlModule;
        Resources resources = reactApplicationContext.getResources();
        String packageName = reactApplicationContext.getPackageName();
        int identifier = resources.getIdentifier("music_control_icon", "drawable", packageName);
        this.f59974c = identifier;
        if (identifier == 0) {
            this.f59974c = resources.getIdentifier("play", "drawable", packageName);
        }
    }

    private o.b a(String str, String str2, long j10, long j11, o.b bVar) {
        if ((j10 & j11) == 0) {
            return null;
        }
        if (bVar != null) {
            return bVar;
        }
        Resources resources = this.f59972a.getResources();
        String packageName = this.f59972a.getPackageName();
        int identifier = resources.getIdentifier(str, "drawable", packageName);
        int f10 = f(j11);
        Intent intent = new Intent("music_control_media_button");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, f10));
        intent.putExtra("music_control_package_name", packageName);
        return new o.b(identifier, (CharSequence) str2, PendingIntent.getBroadcast(this.f59972a, f10, intent, 201326592));
    }

    private int f(long j10) {
        if (j10 == 4) {
            return 126;
        }
        if (j10 == 2) {
            return 127;
        }
        if (j10 == 32) {
            return 87;
        }
        if (j10 == 16) {
            return 88;
        }
        if (j10 == 1) {
            return 86;
        }
        if (j10 == 64) {
            return 90;
        }
        if (j10 == 8) {
            return 89;
        }
        return j10 == 512 ? 85 : 0;
    }

    public void b() {
        r.f(this.f59972a).b(MusicControlModule.INSTANCE.getNotificationId());
        try {
            this.f59972a.stopService(new Intent(this.f59972a, NotificationService.class));
        } catch (Exception e10) {
            System.out.println(e10.getMessage());
        }
    }

    public synchronized Notification c(o.f fVar, boolean z10) {
        try {
            fVar.f15858b.clear();
            o.b bVar = this.f59980i;
            if (bVar != null) {
                fVar.b(bVar);
            }
            o.b bVar2 = this.f59982k;
            if (bVar2 != null) {
                fVar.b(bVar2);
            }
            o.b bVar3 = this.f59976e;
            if (bVar3 != null && !z10) {
                fVar.b(bVar3);
            }
            o.b bVar4 = this.f59977f;
            if (bVar4 != null && z10) {
                fVar.b(bVar4);
            }
            o.b bVar5 = this.f59978g;
            if (bVar5 != null) {
                fVar.b(bVar5);
            }
            o.b bVar6 = this.f59979h;
            if (bVar6 != null) {
                fVar.b(bVar6);
            }
            o.b bVar7 = this.f59981j;
            if (bVar7 != null) {
                fVar.b(bVar7);
            }
            MusicControlModule.c cVar = this.f59973b.notificationClose;
            if (cVar == MusicControlModule.c.ALWAYS) {
                fVar.y(false);
            } else if (cVar == MusicControlModule.c.PAUSED) {
                fVar.y(z10);
            } else {
                fVar.y(true);
            }
            int i10 = this.f59975d;
            if (i10 == 0) {
                i10 = this.f59974c;
            }
            fVar.F(i10);
            fVar.m(PendingIntent.getActivity(this.f59972a, 0, this.f59972a.getPackageManager().getLaunchIntentForPackage(this.f59972a.getPackageName()), 67108864));
        } catch (Exception e10) {
            System.out.println(e10.getMessage());
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        Intent intent = new Intent("music_control_remove_notification");
        intent.putExtra("music_control_package_name", this.f59972a.getApplicationInfo().packageName);
        fVar.q(PendingIntent.getBroadcast(this.f59972a, 0, intent, 201326592));
        return fVar.c();
    }

    public synchronized void d(String str) {
        if (str == null) {
            this.f59975d = 0;
        } else {
            this.f59975d = this.f59972a.getResources().getIdentifier(str, "drawable", this.f59972a.getPackageName());
        }
    }

    public synchronized void e(o.f fVar, boolean z10) {
        r.f(this.f59972a).h(MusicControlModule.INSTANCE.getNotificationId(), c(fVar, z10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0101 A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x012d A[Catch:{ all -> 0x008e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void g(long r14, java.util.Map r16) {
        /*
            r13 = this;
            r9 = r13
            r0 = r16
            monitor-enter(r13)
            java.lang.String r2 = "play"
            java.lang.String r3 = "Play"
            androidx.core.app.o$b r8 = r9.f59976e     // Catch:{ all -> 0x008e }
            r6 = 4
            r1 = r13
            r4 = r14
            androidx.core.app.o$b r1 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x008e }
            r9.f59976e = r1     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "pause"
            java.lang.String r3 = "Pause"
            androidx.core.app.o$b r8 = r9.f59977f     // Catch:{ all -> 0x008e }
            r6 = 2
            r1 = r13
            r4 = r14
            androidx.core.app.o$b r1 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x008e }
            r9.f59977f = r1     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "stop"
            java.lang.String r3 = "Stop"
            androidx.core.app.o$b r8 = r9.f59978g     // Catch:{ all -> 0x008e }
            r6 = 1
            r1 = r13
            r4 = r14
            androidx.core.app.o$b r1 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x008e }
            r9.f59978g = r1     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "next"
            java.lang.String r3 = "Next"
            androidx.core.app.o$b r8 = r9.f59979h     // Catch:{ all -> 0x008e }
            r6 = 32
            r1 = r13
            r4 = r14
            androidx.core.app.o$b r1 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x008e }
            r9.f59979h = r1     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "previous"
            java.lang.String r3 = "Previous"
            androidx.core.app.o$b r8 = r9.f59980i     // Catch:{ all -> 0x008e }
            r6 = 16
            r1 = r13
            r4 = r14
            androidx.core.app.o$b r1 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x008e }
            r9.f59980i = r1     // Catch:{ all -> 0x008e }
            r10 = 30
            r11 = 5
            r12 = 10
            if (r0 == 0) goto L_0x00bd
            java.lang.String r1 = "skipForward"
            boolean r1 = r0.containsKey(r1)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = "skipForward"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x008e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x008e }
            int r1 = r1.intValue()     // Catch:{ all -> 0x008e }
            if (r1 == r12) goto L_0x0091
            java.lang.String r1 = "skipForward"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x008e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x008e }
            int r1 = r1.intValue()     // Catch:{ all -> 0x008e }
            if (r1 == r11) goto L_0x0091
            java.lang.String r1 = "skipForward"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x008e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x008e }
            int r1 = r1.intValue()     // Catch:{ all -> 0x008e }
            if (r1 != r10) goto L_0x00bd
            goto L_0x0091
        L_0x008e:
            r0 = move-exception
            goto L_0x013f
        L_0x0091:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "skip_forward_"
            r1.append(r2)     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "skipForward"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x008e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x008e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008e }
            r1.append(r2)     // Catch:{ all -> 0x008e }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x008e }
            java.lang.String r3 = "Skip Forward"
            androidx.core.app.o$b r8 = r9.f59981j     // Catch:{ all -> 0x008e }
            r6 = 64
            r1 = r13
            r4 = r14
            androidx.core.app.o$b r1 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x008e }
            r9.f59981j = r1     // Catch:{ all -> 0x008e }
            goto L_0x00cd
        L_0x00bd:
            java.lang.String r2 = "skip_forward_10"
            java.lang.String r3 = "Skip Forward"
            androidx.core.app.o$b r8 = r9.f59981j     // Catch:{ all -> 0x008e }
            r6 = 64
            r1 = r13
            r4 = r14
            androidx.core.app.o$b r1 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x008e }
            r9.f59981j = r1     // Catch:{ all -> 0x008e }
        L_0x00cd:
            if (r0 == 0) goto L_0x012d
            java.lang.String r1 = "skipBackward"
            boolean r1 = r0.containsKey(r1)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x012d
            java.lang.String r1 = "skipBackward"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x008e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x008e }
            int r1 = r1.intValue()     // Catch:{ all -> 0x008e }
            if (r1 == r12) goto L_0x0101
            java.lang.String r1 = "skipBackward"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x008e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x008e }
            int r1 = r1.intValue()     // Catch:{ all -> 0x008e }
            if (r1 == r11) goto L_0x0101
            java.lang.String r1 = "skipBackward"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x008e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x008e }
            int r1 = r1.intValue()     // Catch:{ all -> 0x008e }
            if (r1 != r10) goto L_0x012d
        L_0x0101:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "skip_backward_"
            r1.append(r2)     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "skipBackward"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x008e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008e }
            r1.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x008e }
            java.lang.String r3 = "Skip Backward"
            androidx.core.app.o$b r8 = r9.f59982k     // Catch:{ all -> 0x008e }
            r6 = 8
            r1 = r13
            r4 = r14
            androidx.core.app.o$b r0 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x008e }
            r9.f59982k = r0     // Catch:{ all -> 0x008e }
            goto L_0x013d
        L_0x012d:
            java.lang.String r2 = "skip_backward_10"
            java.lang.String r3 = "Skip Backward"
            androidx.core.app.o$b r8 = r9.f59982k     // Catch:{ all -> 0x008e }
            r6 = 8
            r1 = r13
            r4 = r14
            androidx.core.app.o$b r0 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ all -> 0x008e }
            r9.f59982k = r0     // Catch:{ all -> 0x008e }
        L_0x013d:
            monitor-exit(r13)
            return
        L_0x013f:
            monitor-exit(r13)     // Catch:{ all -> 0x008e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tanguyantoine.react.MusicControlNotification.g(long, java.util.Map):void");
    }
}
