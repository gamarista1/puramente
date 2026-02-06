package k9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: k9.b  reason: case insensitive filesystem */
final class C3686b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f45509a;

    /* renamed from: b  reason: collision with root package name */
    private final a f45510b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f45511c;

    /* renamed from: k9.b$a */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C0691b f45512a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f45513b;

        public a(Handler handler, C0691b bVar) {
            this.f45513b = handler;
            this.f45512a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f45513b.post(this);
            }
        }

        public void run() {
            if (C3686b.this.f45511c) {
                this.f45512a.s();
            }
        }
    }

    /* renamed from: k9.b$b  reason: collision with other inner class name */
    public interface C0691b {
        void s();
    }

    public C3686b(Context context, Handler handler, C0691b bVar) {
        this.f45509a = context.getApplicationContext();
        this.f45510b = new a(handler, bVar);
    }

    public void b(boolean z10) {
        if (z10 && !this.f45511c) {
            this.f45509a.registerReceiver(this.f45510b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f45511c = true;
        } else if (!z10 && this.f45511c) {
            this.f45509a.unregisterReceiver(this.f45510b);
            this.f45511c = false;
        }
    }
}
