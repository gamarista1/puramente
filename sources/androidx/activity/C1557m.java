package androidx.activity;

import android.content.IntentSender;
import androidx.activity.C1554j;

/* renamed from: androidx.activity.m  reason: case insensitive filesystem */
public final /* synthetic */ class C1557m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1554j.g f10815a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10816b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f10817c;

    public /* synthetic */ C1557m(C1554j.g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f10815a = gVar;
        this.f10816b = i10;
        this.f10817c = sendIntentException;
    }

    public final void run() {
        C1554j.g.t(this.f10815a, this.f10816b, this.f10817c);
    }
}
