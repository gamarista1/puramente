package io.invertase.firebase.database;

public final /* synthetic */ class K implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseDatabaseTransactionModule f71320a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71321b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f71322c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f71323d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f71324e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Boolean f71325f;

    public /* synthetic */ K(ReactNativeFirebaseDatabaseTransactionModule reactNativeFirebaseDatabaseTransactionModule, String str, String str2, String str3, int i10, Boolean bool) {
        this.f71320a = reactNativeFirebaseDatabaseTransactionModule;
        this.f71321b = str;
        this.f71322c = str2;
        this.f71323d = str3;
        this.f71324e = i10;
        this.f71325f = bool;
    }

    public final void run() {
        this.f71320a.lambda$transactionStart$0(this.f71321b, this.f71322c, this.f71323d, this.f71324e, this.f71325f);
    }
}
