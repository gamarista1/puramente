package io.intercom.android.sdk.post;

import Y.r;
import android.os.Bundle;
import e.C1932e;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.TimeFormatter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import u1.b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u001c\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR?\u0010\"\u001a&\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001e0\u001e \u0017*\u0012\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010\u001d0\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lio/intercom/android/sdk/post/PostActivityV2;", "Lio/intercom/android/sdk/activities/IntercomBaseActivity;", "<init>", "()V", "Llf/M;", "openConversation", "Lio/intercom/android/sdk/models/Part;", "getPart", "()Lio/intercom/android/sdk/models/Part;", "", "getUserStatus", "()Ljava/lang/String;", "sendPostAsRead", "", "isComposerVisible", "()Z", "isPreview", "getConversationId", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lio/intercom/android/sdk/Injector;", "kotlin.jvm.PlatformType", "injector$delegate", "Lkotlin/Lazy;", "getInjector", "()Lio/intercom/android/sdk/Injector;", "injector", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfigProvider$delegate", "getAppConfigProvider", "()Lio/intercom/android/sdk/Provider;", "appConfigProvider", "Lio/intercom/android/sdk/utilities/TimeFormatter;", "timeFormatter$delegate", "getTimeFormatter", "()Lio/intercom/android/sdk/utilities/TimeFormatter;", "timeFormatter", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostActivityV2 extends IntercomBaseActivity {
    public static final int $stable = 8;
    private static final String COMPOSER_IS_VISIBLE = "composer_is_visible";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    private static final String POST_PREVIEW = "is_post_preview";
    private final Lazy appConfigProvider$delegate = C6531o.b(new b(this));
    private final Lazy injector$delegate = C6531o.b(new a());
    private final Lazy timeFormatter$delegate = C6531o.b(new c(this));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/post/PostActivityV2$Companion;", "", "<init>", "()V", "PARCEL_PART", "", "PARCEL_CONVERSATION_ID", "POST_PREVIEW", "LAST_PARTICIPANT", "COMPOSER_IS_VISIBLE", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* access modifiers changed from: private */
    public static final Provider appConfigProvider_delegate$lambda$1(PostActivityV2 postActivityV2) {
        C6496s.h(postActivityV2, "this$0");
        return postActivityV2.getInjector().getAppConfigProvider();
    }

    /* access modifiers changed from: private */
    public final Provider<AppConfig> getAppConfigProvider() {
        return (Provider) this.appConfigProvider$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final String getConversationId() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, "");
        C6496s.g(string, "getString(...)");
        return string;
    }

    /* access modifiers changed from: private */
    public final Injector getInjector() {
        return (Injector) this.injector$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final Part getPart() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Class<Part> cls = Part.class;
            extras.setClassLoader(cls.getClassLoader());
            if (extras.containsKey(PARCEL_PART)) {
                Part part = (Part) b.a(extras, PARCEL_PART, cls);
                if (part != null) {
                    return part;
                }
                Part part2 = Part.NULL;
                C6496s.g(part2, "NULL");
                return part2;
            }
        }
        Part part3 = Part.NULL;
        C6496s.g(part3, "NULL");
        return part3;
    }

    private final TimeFormatter getTimeFormatter() {
        return (TimeFormatter) this.timeFormatter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final String getUserStatus() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(LAST_PARTICIPANT)) {
            return "";
        }
        LastParticipatingAdmin lastParticipatingAdmin = (LastParticipatingAdmin) b.a(extras, LAST_PARTICIPANT, LastParticipatingAdmin.class);
        if (LastParticipatingAdmin.isNull(lastParticipatingAdmin)) {
            return "";
        }
        TimeFormatter timeFormatter = getTimeFormatter();
        C6496s.e(lastParticipatingAdmin);
        timeFormatter.getAdminActiveStatus(lastParticipatingAdmin, getAppConfigProvider());
        return "";
    }

    /* access modifiers changed from: private */
    public static final Injector injector_delegate$lambda$0() {
        return Injector.get();
    }

    /* access modifiers changed from: private */
    public final boolean isComposerVisible() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getBoolean(COMPOSER_IS_VISIBLE, true);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean isPreview() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        return extras.getBoolean(POST_PREVIEW, false);
    }

    /* access modifiers changed from: private */
    public final void openConversation() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, "");
        getInjector().getMetricTracker().openedConversationFromFull(string, getPart().getId());
        startActivity(ConversationScreenOpenerKt.getConversationIntent(this, string));
        finish();
    }

    /* access modifiers changed from: private */
    public final void sendPostAsRead() {
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey(PARCEL_CONVERSATION_ID)) {
            String string = extras.getString(PARCEL_CONVERSATION_ID, "");
            IntercomDataLayer dataLayer = getInjector().getDataLayer();
            C6496s.e(string);
            dataLayer.markConversationAsRead(string);
            getInjector().getApi().markConversationAsRead(string);
        }
    }

    /* access modifiers changed from: private */
    public static final TimeFormatter timeFormatter_delegate$lambda$2(PostActivityV2 postActivityV2) {
        C6496s.h(postActivityV2, "this$0");
        return new TimeFormatter(postActivityV2, postActivityV2.getInjector().getTimeProvider());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1932e.b(this, (r) null, c.c(-1329969746, true, new PostActivityV2$onCreate$1(this)), 1, (Object) null);
    }
}
