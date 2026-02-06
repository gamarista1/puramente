package io.intercom.android.sdk.overlay;

import Ug.K;
import Ug.L;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.overlay.InAppNotificationPresenter;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.ViewUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lf.C6514M;

public class OverlayPresenter implements InAppNotificationPresenter.Listener {
    private final Provider<Api> api;
    private final Provider<AppConfig> appConfigProvider;
    private final Handler handler;
    final InAppNotificationPresenter inAppNotificationPresenter;
    private final IntercomDataLayer intercomDataLayer;
    final DefaultLauncherPresenter launcherPresenter;
    private final MetricTracker metricTracker;
    private final Twig twig = LumberMill.getLogger();
    private final UserIdentity userIdentity;
    private final Set<String> viewedPartIds = new HashSet();

    public OverlayPresenter(Application application, Provider<AppConfig> provider, MetricTracker metricTracker2, UserIdentity userIdentity2, IntercomDataLayer intercomDataLayer2, Provider<Api> provider2) {
        this.appConfigProvider = provider;
        this.metricTracker = metricTracker2;
        this.userIdentity = userIdentity2;
        this.intercomDataLayer = intercomDataLayer2;
        this.api = provider2;
        LayoutInflater from = LayoutInflater.from(application);
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.handler = handler2;
        this.inAppNotificationPresenter = new InAppNotificationPresenter(from, handler2, this, metricTracker2, provider, new ContextLocaliser(provider), hostActivity());
        this.launcherPresenter = new DefaultLauncherPresenter(from, new LauncherOpenBehaviour(), metricTracker2);
        K b10 = L.b();
        intercomDataLayer2.unreadConversationIdsUpdates(b10, new d(this));
        intercomDataLayer2.configUpdates(b10, new e(this));
        intercomDataLayer2.overlayStateUpdates(b10, new f(this));
        intercomDataLayer2.listenToEvents(b10, new g(this));
    }

    private Activity hostActivity() {
        return ((OverlayState) this.intercomDataLayer.getOverlayState().getValue()).getResumedHostActivity();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C6514M lambda$new$0(Set set) {
        onStateChange(Integer.valueOf(set.size()), (OverlayState) this.intercomDataLayer.getOverlayState().getValue());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C6514M lambda$new$1(AppConfig appConfig) {
        onNewConfig();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C6514M lambda$new$2(OverlayState overlayState) {
        onStateChange(Integer.valueOf(((Set) this.intercomDataLayer.getUnreadConversationIds().getValue()).size()), overlayState);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C6514M lambda$new$3(IntercomEvent intercomEvent) {
        handleLifecycleEvents(intercomEvent);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewConfig$5(ViewGroup viewGroup) {
        this.launcherPresenter.displayLauncherOnAttachedRoot(viewGroup, this.appConfigProvider.get());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChange$4(ViewGroup viewGroup) {
        this.inAppNotificationPresenter.reset(viewGroup);
        this.launcherPresenter.displayLauncherOnAttachedRoot(viewGroup, this.appConfigProvider.get());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$preloadAvatarThenDisplayNotifications$7(String str, List list, Intercom.Visibility visibility, Activity activity) {
        if (str.equals(this.userIdentity.getFingerprint()) && shouldDisplayNotifications(list, visibility, activity)) {
            displayNotifications(list, activity);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$removeOverlaysIfPresent$6(View view) {
        if (view != null) {
            this.launcherPresenter.removeLauncher();
            this.inAppNotificationPresenter.reset((ViewGroup) view);
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        }
    }

    private void openCarousel(Activity activity) {
        activity.startActivity(new Intent(activity, IntercomCarouselActivity.class));
    }

    private void openMessenger(Conversation conversation) {
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            ArrayList arrayList = new ArrayList();
            Intent conversationIntent = ConversationScreenOpenerKt.getConversationIntent(hostActivity, conversation.getId());
            arrayList.add(IntercomRootActivityArgsKt.getIntentForArgs(hostActivity, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, IntercomRootActivity.class));
            arrayList.add(conversationIntent);
            hostActivity.startActivities((Intent[]) arrayList.toArray(new Intent[0]));
        }
    }

    private void openNote(Conversation conversation) {
        try {
            Activity hostActivity = hostActivity();
            if (hostActivity != null) {
                hostActivity.startActivity(IntercomNoteActivity.buildNoteIntent(hostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible()));
            }
        } catch (IllegalArgumentException e10) {
            Twig twig2 = this.twig;
            twig2.internal("Overlay", "Error loading the note " + e10.getMessage());
        }
    }

    private void openPost(Conversation conversation) {
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            hostActivity.startActivity(IntercomPostActivity.buildPostIntent(hostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible(), true));
        }
    }

    private void openSurvey(Activity activity) {
        activity.startActivity(IntercomSurveyActivity.buildIntent(activity));
    }

    private void removeOverlays(Activity activity) {
        if (activity != null) {
            removeOverlaysIfPresent(activity);
        }
    }

    private void trackInAppView(String str, String str2, @MetricTracker.InAppMessageViewContext int i10) {
        if (!this.viewedPartIds.contains(str2)) {
            this.viewedPartIds.add(str2);
            this.metricTracker.viewedInApp(str, str2, i10);
        }
    }

    public void cancelAnimations() {
        this.handler.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: package-private */
    public void displayNotifications(final List<Conversation> list, Activity activity) {
        DeliveryOption deliveryOption;
        final ViewGroup rootView = getRootView(activity);
        Conversation conversation = list.get(0);
        MessageStyle messageStyle = conversation.lastPart().getMessageStyle();
        DeliveryOption deliveryOption2 = conversation.lastPart().getDeliveryOption();
        if (list.size() > 1 || this.inAppNotificationPresenter.isDisplaying() || deliveryOption2 == DeliveryOption.SUMMARY || (deliveryOption2 == (deliveryOption = DeliveryOption.FULL) && MessageStyle.CHAT.equals(messageStyle))) {
            if (this.launcherPresenter.isDisplaying()) {
                final DefaultLauncher andUnsetLauncher = this.launcherPresenter.getAndUnsetLauncher();
                if (list.size() == 1) {
                    andUnsetLauncher.pulseForTransformation(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() {
                                public void onAnimationEnd(Animator animator) {
                                    andUnsetLauncher.removeView();
                                }
                            });
                            OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                        }
                    });
                } else {
                    andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            andUnsetLauncher.removeView();
                            OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                        }
                    });
                }
            } else {
                this.inAppNotificationPresenter.displayNotifications(rootView, list);
            }
        } else if (deliveryOption2 != deliveryOption) {
        } else {
            if (MessageStyle.POST.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openPost(conversation);
            } else if (MessageStyle.NOTE.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openNote(conversation);
            }
        }
    }

    public ViewGroup getRootView() {
        Activity hostActivity = hostActivity();
        hostActivity.getClass();
        return getRootView(hostActivity);
    }

    /* access modifiers changed from: package-private */
    public void handleLifecycleEvents(IntercomEvent intercomEvent) {
        OverlayState overlayState = (OverlayState) this.intercomDataLayer.getOverlayState().getValue();
        Activity pausedHostActivity = overlayState.getPausedHostActivity();
        Activity resumedHostActivity = overlayState.getResumedHostActivity();
        if (intercomEvent instanceof IntercomEvent.ActivityReadyForViewAttachment) {
            if (((IntercomEvent.ActivityReadyForViewAttachment) intercomEvent).getActivity() != pausedHostActivity) {
                removeOverlays(pausedHostActivity);
            }
        } else if (intercomEvent instanceof IntercomEvent.ActivityPaused) {
            removeOverlays(pausedHostActivity);
        } else if (intercomEvent instanceof IntercomEvent.ActivityStopped) {
            if (((IntercomEvent.ActivityStopped) intercomEvent).getActivity() == pausedHostActivity) {
                removeOverlays(pausedHostActivity);
            }
        } else if (intercomEvent instanceof IntercomEvent.AppEnteredBackground) {
            cancelAnimations();
            removeOverlays(pausedHostActivity);
            removeOverlays(resumedHostActivity);
        }
    }

    public void markAsDismissed(Conversation conversation) {
        this.api.get().markConversationAsDismissed(conversation.getId());
        this.intercomDataLayer.markConversationPartAsDismissed(conversation.lastPart().getId());
    }

    public void onNewConfig() {
        Intercom.Visibility launcherVisibility = ((OverlayState) this.intercomDataLayer.getOverlayState().getValue()).getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = ((OverlayState) this.intercomDataLayer.getOverlayState().getValue()).getInAppNotificationsVisibility();
        List<Conversation> conversations = ((OverlayState) this.intercomDataLayer.getOverlayState().getValue()).getConversations();
        Activity resumedHostActivity = ((OverlayState) this.intercomDataLayer.getOverlayState().getValue()).getResumedHostActivity();
        if (shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
            ViewGroup rootView = getRootView(resumedHostActivity);
            ViewUtils.waitForViewAttachment(rootView, new c(this, rootView));
            return;
        }
        this.launcherPresenter.setLauncherBackgroundColor(this.appConfigProvider.get());
    }

    public void onStateChange(Integer num, OverlayState overlayState) {
        Activity resumedHostActivity = overlayState.getResumedHostActivity();
        List<Conversation> conversations = overlayState.getConversations();
        SurveyData surveyData = overlayState.getSurveyData();
        Carousel carousel = overlayState.getCarousel();
        int bottomPadding = overlayState.getBottomPadding();
        Intercom.Visibility launcherVisibility = overlayState.getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = overlayState.getInAppNotificationsVisibility();
        this.launcherPresenter.setBottomPadding(bottomPadding);
        this.launcherPresenter.setUnreadCount(num.intValue());
        this.inAppNotificationPresenter.setBottomPadding(bottomPadding);
        if (resumedHostActivity != null && !resumedHostActivity.isFinishing() && !resumedHostActivity.isDestroyed()) {
            if (shouldDisplaySurvey(surveyData, resumedHostActivity)) {
                openSurvey(resumedHostActivity);
            } else if (shouldDisplayCarousel(carousel, resumedHostActivity)) {
                openCarousel(resumedHostActivity);
            } else if (shouldDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity)) {
                preloadAvatarThenDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity, this.userIdentity.getFingerprint());
            } else if (shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
                ViewGroup rootView = getRootView(resumedHostActivity);
                ViewUtils.waitForViewAttachment(rootView, new a(this, rootView));
            } else {
                removeOverlaysIfPresent(resumedHostActivity);
            }
        }
    }

    public void openNotification(Conversation conversation) {
        Part lastAdminPart = conversation.getLastAdminPart();
        MessageStyle messageStyle = lastAdminPart.getMessageStyle();
        if (MessageStyle.POST.equals(messageStyle)) {
            trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
            openPost(conversation);
        } else if (MessageStyle.NOTE.equals(messageStyle)) {
            trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
            openNote(conversation);
        } else {
            openMessenger(conversation);
            if (!MessageStyle.CHAT.equals(messageStyle) || DeliveryOption.FULL != lastAdminPart.getDeliveryOption()) {
                this.metricTracker.openedConversationFromSnippet(conversation.getId(), lastAdminPart.getId());
            } else {
                this.metricTracker.openedConversationFromFull(conversation.getId(), lastAdminPart.getId());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void preloadAvatarThenDisplayNotifications(List<Conversation> list, Intercom.Visibility visibility, Activity activity, String str) {
        AvatarUtils.preloadAvatar(list.get(0).lastAdmin().getAvatar(), new h(this, str, list, visibility, activity), activity);
    }

    public void refreshStateBecauseUserIdentityIsNotInStoreYet() {
        onStateChange(Integer.valueOf(((Set) this.intercomDataLayer.getUnreadConversationIds().getValue()).size()), (OverlayState) this.intercomDataLayer.getOverlayState().getValue());
    }

    public void removeOverlaysIfPresent(Activity activity) {
        activity.runOnUiThread(new b(this, activity.findViewById(R.id.intercom_overlay_root)));
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDisplayCarousel(Carousel carousel, Activity activity) {
        if (Carousel.NULL.equals(carousel) || this.userIdentity.isSoftReset() || activity == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDisplayLauncher(List<Conversation> list, Intercom.Visibility visibility, Intercom.Visibility visibility2, Activity activity) {
        if (visibility == Intercom.Visibility.VISIBLE) {
            for (Conversation lastPart : list) {
                if (DeliveryOption.BADGE != lastPart.lastPart().getDeliveryOption()) {
                    return false;
                }
            }
        }
        if (visibility2 != Intercom.Visibility.VISIBLE || this.userIdentity.isSoftReset() || !this.userIdentity.identityExists() || !this.appConfigProvider.get().isReceivedFromServer() || activity == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDisplayNotifications(List<Conversation> list, Intercom.Visibility visibility, Activity activity) {
        if (visibility != Intercom.Visibility.VISIBLE || this.userIdentity.isSoftReset() || list.isEmpty() || activity == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDisplaySurvey(SurveyData surveyData, Activity activity) {
        if (SurveyData.Companion.getNULL().equals(surveyData) || this.userIdentity.isSoftReset() || activity == null) {
            return false;
        }
        return true;
    }

    public void softReset() {
        cancelAnimations();
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            removeOverlaysIfPresent(hostActivity);
        }
    }

    private ViewGroup getRootView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.intercom_overlay_root);
        if (viewGroup != null) {
            return viewGroup;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setId(R.id.intercom_overlay_root);
        activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 80));
        return frameLayout;
    }
}
