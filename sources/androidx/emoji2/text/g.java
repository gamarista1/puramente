package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.c f16622a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.i f16623b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f16624c;

    public /* synthetic */ g(EmojiCompatInitializer.c cVar, f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f16622a = cVar;
        this.f16623b = iVar;
        this.f16624c = threadPoolExecutor;
    }

    public final void run() {
        this.f16622a.d(this.f16623b, this.f16624c);
    }
}
