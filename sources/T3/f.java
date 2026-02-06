package T3;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import app.puramente.app.DailyPhraseWidget;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppWidgetManager f6180a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6181b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RemoteViews f6182c;

    public /* synthetic */ f(AppWidgetManager appWidgetManager, int i10, RemoteViews remoteViews) {
        this.f6180a = appWidgetManager;
        this.f6181b = i10;
        this.f6182c = remoteViews;
    }

    public final void run() {
        DailyPhraseWidget.l(this.f6180a, this.f6181b, this.f6182c);
    }
}
