package com.intercom.reactnative;

import Q7.a;
import android.app.Activity;
import android.app.Application;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.messaging.W;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.api.ReactNativeHeaderInterceptor;
import io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback;
import io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback;
import io.intercom.android.sdk.helpcenter.api.HelpCenterArticleSearchResult;
import io.intercom.android.sdk.helpcenter.api.SearchRequestCallback;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.push.IntercomPushClient;
import java.util.List;
import java.util.Map;

@a(name = "IntercomModule")
public class IntercomModule extends ReactContextBaseJavaModule {
    public static final String NAME = "IntercomModule";
    private static final IntercomPushClient intercomPushClient = new IntercomPushClient();

    public IntercomModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void handleRemotePushMessage(Application application, W w10) {
        try {
            intercomPushClient.handlePush(application, (Map<String, String>) w10.p0());
        } catch (Exception e10) {
            Log.e(NAME, "handleRemotePushMessage error:");
            Log.e(NAME, e10.toString());
        }
    }

    public static synchronized void initialize(Application application, String str, String str2) {
        synchronized (IntercomModule.class) {
            ReactNativeHeaderInterceptor.setReactNativeVersion(application.getApplicationContext(), BuildConfig.INTERCOM_VERSION_NAME);
            Intercom.initialize(application, str, str2);
        }
    }

    public static boolean isIntercomPush(W w10) {
        try {
            return intercomPushClient.isIntercomPush((Map<String, String>) w10.p0());
        } catch (Exception e10) {
            Log.e(NAME, "isIntercomPush error:");
            Log.e(NAME, e10.toString());
            return false;
        }
    }

    public static void sendTokenToIntercom(Application application, String str) {
        intercomPushClient.sendTokenToIntercom(application, str);
        Log.d(NAME, "sendTokenToIntercom");
    }

    @ReactMethod
    public void fetchHelpCenterCollection(String str, final Promise promise) {
        try {
            if (str.equals("")) {
                promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTION, "collectionID can't be empty");
                return;
            }
            AnonymousClass5 r22 = new CollectionContentRequestCallback() {
                public void onComplete(HelpCenterCollectionContent helpCenterCollectionContent) {
                    promise.resolve(IntercomHelpCenterHelpers.parseHelpCenterCollectionsContentToReadableMap(helpCenterCollectionContent));
                }

                public void onError(int i10) {
                    Log.e(IntercomModule.NAME, "fetchHelpCenterCollection error");
                    promise.reject(String.valueOf(i10), "fetchHelpCenterCollection error");
                }

                public void onFailure() {
                    Log.e(IntercomModule.NAME, "fetchHelpCenterCollection failure");
                    promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTION, "fetchHelpCenterCollection failure");
                }
            };
            Log.d(NAME, "fetchHelpCenterCollection");
            Intercom.client().fetchHelpCenterCollection(str, r22);
        } catch (Exception e10) {
            Log.e(NAME, "fetchHelpCenterCollection error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTION, e10.toString());
        }
    }

    @ReactMethod
    public void fetchHelpCenterCollections(final Promise promise) {
        try {
            AnonymousClass4 r12 = new CollectionRequestCallback() {
                public void onComplete(List<HelpCenterCollection> list) {
                    promise.resolve(IntercomHelpCenterHelpers.parseHelpCenterCollectionsToReadableArray(list));
                }

                public void onError(int i10) {
                    Log.e(IntercomModule.NAME, "fetchHelpCenterCollections error");
                    promise.reject(String.valueOf(i10), "fetchHelpCenterCollections error");
                }

                public void onFailure() {
                    Log.e(IntercomModule.NAME, "fetchHelpCenterCollections failure");
                    promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTIONS, "fetchHelpCenterCollections failure");
                }
            };
            Log.d(NAME, "fetchHelpCenterCollections");
            Intercom.client().fetchHelpCenterCollections(r12);
        } catch (Exception e10) {
            Log.e(NAME, "fetchHelpCenterCollections error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.FETCH_HELP_CENTER_COLLECTIONS, e10.toString());
        }
    }

    @ReactMethod
    public void fetchLoggedInUserAttributes(Promise promise) {
        promise.resolve(IntercomHelpers.deconstructRegistration(Intercom.client().fetchLoggedInUserAttributes()));
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getUnreadConversationCount(Promise promise) {
        try {
            promise.resolve(Integer.valueOf(Intercom.client().getUnreadConversationCount()));
            Log.d(NAME, "getUnreadConversationCount");
        } catch (Exception e10) {
            Log.e(NAME, "getUnreadConversationCount error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.GET_UNREAD_CONVERSATION, e10.toString());
        }
    }

    @ReactMethod
    public void handlePushMessage(Promise promise) {
        try {
            Intercom.client().handlePushMessage();
            promise.resolve(Boolean.TRUE);
            Log.d(NAME, "handlePushMessage");
        } catch (Exception e10) {
            Log.e(NAME, "handlePushMessage error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.HANDLE_PUSH_MESSAGE, e10.toString());
        }
    }

    @ReactMethod
    public void hideIntercom(Promise promise) {
        try {
            Intercom.client().hideIntercom();
            Log.d(NAME, "hideIntercom");
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            Log.e(NAME, "hideIntercom error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.HIDE_INTERCOM, e10.toString());
        }
    }

    @ReactMethod
    public void isUserLoggedIn(Promise promise) {
        promise.resolve(Boolean.valueOf(Intercom.client().isUserLoggedIn()));
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, Promise promise) {
        if (readableMap != null) {
            try {
                Intercom.client().logEvent(str, IntercomHelpers.deconstructReadableMap(readableMap, Boolean.FALSE));
            } catch (Exception e10) {
                Log.e(NAME, "logEvent error:");
                Log.e(NAME, e10.toString());
                promise.reject(IntercomErrorCodes.LOG_EVENT_HASH, e10.toString());
                return;
            }
        } else {
            Intercom.client().logEvent(str);
        }
        Log.d(NAME, "logEvent");
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void loginUnidentifiedUser(final Promise promise) {
        Intercom.client().loginUnidentifiedUser(new IntercomStatusCallback() {
            public void onFailure(IntercomError intercomError) {
                Log.e("ERROR", intercomError.getErrorMessage());
                promise.reject(String.valueOf(intercomError.getErrorCode()), intercomError.getErrorMessage());
            }

            public void onSuccess() {
                promise.resolve(Boolean.TRUE);
            }
        });
    }

    @ReactMethod
    public void loginUserWithUserAttributes(ReadableMap readableMap, final Promise promise) {
        boolean z10;
        Registration registration;
        boolean z11 = false;
        if (!readableMap.hasKey("email") || IntercomHelpers.getValueAsStringForKey(readableMap, "email").length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (readableMap.hasKey("userId") && IntercomHelpers.getValueAsStringForKey(readableMap, "userId").length() > 0) {
            z11 = true;
        }
        if (z10 && z11) {
            registration = new Registration().withEmail(IntercomHelpers.getValueAsStringForKey(readableMap, "email")).withUserId(IntercomHelpers.getValueAsStringForKey(readableMap, "userId"));
        } else if (z10) {
            registration = new Registration().withEmail(IntercomHelpers.getValueAsStringForKey(readableMap, "email"));
        } else if (z11) {
            registration = new Registration().withUserId(IntercomHelpers.getValueAsStringForKey(readableMap, "userId"));
        } else {
            Log.e(NAME, "loginUserWithUserAttributes called with invalid userId or email");
            Log.e(NAME, "You must provide userId or email");
            promise.reject(IntercomErrorCodes.IDENTIFIED_REGISTRATION, "Invalid userId or email");
            registration = null;
        }
        if (registration != null) {
            Intercom.client().loginIdentifiedUser(registration, new IntercomStatusCallback() {
                public void onFailure(IntercomError intercomError) {
                    Log.e("ERROR", intercomError.getErrorMessage());
                    promise.reject(String.valueOf(intercomError.getErrorCode()), intercomError.getErrorMessage());
                }

                public void onSuccess() {
                    promise.resolve(Boolean.TRUE);
                }
            });
        }
    }

    @ReactMethod
    public void logout(Promise promise) {
        try {
            Intercom.client().logout();
            Log.d(NAME, MetricTracker.Object.LOGOUT);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            Log.e(NAME, "logout error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.LOGOUT, e10.toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9 A[Catch:{ Exception -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b6 A[Catch:{ Exception -> 0x0018 }] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void presentContent(com.facebook.react.bridge.ReadableMap r9, com.facebook.react.bridge.Promise r10) {
        /*
            r8 = this;
            java.lang.String r0 = "203"
            java.lang.String r1 = "type"
            boolean r2 = r9.hasKey(r1)     // Catch:{ Exception -> 0x0018 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = r9.getString(r1)     // Catch:{ Exception -> 0x0018 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0018 }
            if (r2 <= 0) goto L_0x001b
            r2 = r4
            goto L_0x001c
        L_0x0018:
            r9 = move-exception
            goto L_0x00c2
        L_0x001b:
            r2 = r3
        L_0x001c:
            if (r2 == 0) goto L_0x00bc
            java.lang.String r1 = r9.getString(r1)     // Catch:{ Exception -> 0x0018 }
            int r2 = r1.hashCode()     // Catch:{ Exception -> 0x0018 }
            r5 = 2
            r6 = 4
            r7 = 3
            switch(r2) {
                case -1837720742: goto L_0x0054;
                case -1237531517: goto L_0x004a;
                case -14395178: goto L_0x0041;
                case 152800841: goto L_0x0037;
                case 785535328: goto L_0x002d;
                default: goto L_0x002c;
            }     // Catch:{ Exception -> 0x0018 }
        L_0x002c:
            goto L_0x005e
        L_0x002d:
            java.lang.String r2 = "CAROUSEL"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0018 }
            if (r1 == 0) goto L_0x005e
            r3 = r4
            goto L_0x005f
        L_0x0037:
            java.lang.String r2 = "HELP_CENTER_COLLECTIONS"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0018 }
            if (r1 == 0) goto L_0x005e
            r3 = r7
            goto L_0x005f
        L_0x0041:
            java.lang.String r2 = "ARTICLE"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0018 }
            if (r1 == 0) goto L_0x005e
            goto L_0x005f
        L_0x004a:
            java.lang.String r2 = "CONVERSATION"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0018 }
            if (r1 == 0) goto L_0x005e
            r3 = r6
            goto L_0x005f
        L_0x0054:
            java.lang.String r2 = "SURVEY"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0018 }
            if (r1 == 0) goto L_0x005e
            r3 = r5
            goto L_0x005f
        L_0x005e:
            r3 = -1
        L_0x005f:
            java.lang.String r1 = "id"
            if (r3 == 0) goto L_0x009d
            if (r3 == r4) goto L_0x0093
            if (r3 == r5) goto L_0x0089
            if (r3 == r7) goto L_0x0078
            if (r3 == r6) goto L_0x006d
            r9 = 0
            goto L_0x00a7
        L_0x006d:
            io.intercom.android.sdk.IntercomContent$Conversation r2 = new io.intercom.android.sdk.IntercomContent$Conversation     // Catch:{ Exception -> 0x0018 }
            java.lang.String r9 = r9.getString(r1)     // Catch:{ Exception -> 0x0018 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x0018 }
        L_0x0076:
            r9 = r2
            goto L_0x00a7
        L_0x0078:
            java.lang.String r1 = "ids"
            com.facebook.react.bridge.ReadableArray r9 = r9.getArray(r1)     // Catch:{ Exception -> 0x0018 }
            java.util.List r9 = com.intercom.reactnative.IntercomHelpers.readableArrayToStringList(r9)     // Catch:{ Exception -> 0x0018 }
            io.intercom.android.sdk.IntercomContent$HelpCenterCollections r1 = new io.intercom.android.sdk.IntercomContent$HelpCenterCollections     // Catch:{ Exception -> 0x0018 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x0018 }
            r9 = r1
            goto L_0x00a7
        L_0x0089:
            io.intercom.android.sdk.IntercomContent$Survey r2 = new io.intercom.android.sdk.IntercomContent$Survey     // Catch:{ Exception -> 0x0018 }
            java.lang.String r9 = r9.getString(r1)     // Catch:{ Exception -> 0x0018 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0076
        L_0x0093:
            io.intercom.android.sdk.IntercomContent$Carousel r2 = new io.intercom.android.sdk.IntercomContent$Carousel     // Catch:{ Exception -> 0x0018 }
            java.lang.String r9 = r9.getString(r1)     // Catch:{ Exception -> 0x0018 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0076
        L_0x009d:
            io.intercom.android.sdk.IntercomContent$Article r2 = new io.intercom.android.sdk.IntercomContent$Article     // Catch:{ Exception -> 0x0018 }
            java.lang.String r9 = r9.getString(r1)     // Catch:{ Exception -> 0x0018 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0076
        L_0x00a7:
            if (r9 == 0) goto L_0x00b6
            io.intercom.android.sdk.Intercom r1 = io.intercom.android.sdk.Intercom.client()     // Catch:{ Exception -> 0x0018 }
            r1.presentContent(r9)     // Catch:{ Exception -> 0x0018 }
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0018 }
            r10.resolve(r9)     // Catch:{ Exception -> 0x0018 }
            goto L_0x00d2
        L_0x00b6:
            java.lang.String r9 = "Invalid content type"
            r10.reject((java.lang.String) r0, (java.lang.String) r9)     // Catch:{ Exception -> 0x0018 }
            goto L_0x00d2
        L_0x00bc:
            java.lang.String r9 = "Intercom content must have a type"
            r10.reject((java.lang.String) r0, (java.lang.String) r9)     // Catch:{ Exception -> 0x0018 }
            goto L_0x00d2
        L_0x00c2:
            java.lang.String r1 = "IntercomModule"
            java.lang.String r2 = r9.toString()
            android.util.Log.e(r1, r2)
            java.lang.String r9 = r9.toString()
            r10.reject((java.lang.String) r0, (java.lang.String) r9)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.intercom.reactnative.IntercomModule.presentContent(com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void presentIntercom(Promise promise) {
        try {
            Intercom.client().present();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            Log.e(NAME, "presentMessenger error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.DISPLAY_MESSENGER, e10.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[Catch:{ Exception -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048 A[Catch:{ Exception -> 0x0022 }] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void presentIntercomSpace(java.lang.String r5, com.facebook.react.bridge.Promise r6) {
        /*
            r4 = this;
            io.intercom.android.sdk.IntercomSpace r0 = io.intercom.android.sdk.IntercomSpace.Home     // Catch:{ Exception -> 0x0022 }
            int r0 = r5.hashCode()     // Catch:{ Exception -> 0x0022 }
            r1 = -604994873(0xffffffffdbf082c7, float:-1.35395571E17)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L_0x002e
            r1 = 320532812(0x131af14c, float:1.9556501E-27)
            if (r0 == r1) goto L_0x0024
            r1 = 1250065171(0x4a827b13, float:4275593.5)
            if (r0 == r1) goto L_0x0018
            goto L_0x0038
        L_0x0018:
            java.lang.String r0 = "HELP_CENTER"
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x0022 }
            if (r5 == 0) goto L_0x0038
            r5 = r3
            goto L_0x0039
        L_0x0022:
            r5 = move-exception
            goto L_0x0057
        L_0x0024:
            java.lang.String r0 = "MESSAGES"
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x0022 }
            if (r5 == 0) goto L_0x0038
            r5 = r2
            goto L_0x0039
        L_0x002e:
            java.lang.String r0 = "TICKETS"
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x0022 }
            if (r5 == 0) goto L_0x0038
            r5 = 0
            goto L_0x0039
        L_0x0038:
            r5 = -1
        L_0x0039:
            if (r5 == 0) goto L_0x0048
            if (r5 == r2) goto L_0x0045
            if (r5 == r3) goto L_0x0042
            io.intercom.android.sdk.IntercomSpace r5 = io.intercom.android.sdk.IntercomSpace.Home     // Catch:{ Exception -> 0x0022 }
            goto L_0x004a
        L_0x0042:
            io.intercom.android.sdk.IntercomSpace r5 = io.intercom.android.sdk.IntercomSpace.HelpCenter     // Catch:{ Exception -> 0x0022 }
            goto L_0x004a
        L_0x0045:
            io.intercom.android.sdk.IntercomSpace r5 = io.intercom.android.sdk.IntercomSpace.Messages     // Catch:{ Exception -> 0x0022 }
            goto L_0x004a
        L_0x0048:
            io.intercom.android.sdk.IntercomSpace r5 = io.intercom.android.sdk.IntercomSpace.Tickets     // Catch:{ Exception -> 0x0022 }
        L_0x004a:
            io.intercom.android.sdk.Intercom r0 = io.intercom.android.sdk.Intercom.client()     // Catch:{ Exception -> 0x0022 }
            r0.present(r5)     // Catch:{ Exception -> 0x0022 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0022 }
            r6.resolve(r5)     // Catch:{ Exception -> 0x0022 }
            goto L_0x006e
        L_0x0057:
            java.lang.String r0 = "presentIntercomSpace error:"
            java.lang.String r1 = "IntercomModule"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "201"
            java.lang.String r5 = r5.toString()
            r6.reject((java.lang.String) r0, (java.lang.String) r5)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.intercom.reactnative.IntercomModule.presentIntercomSpace(java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void presentMessageComposer(String str, Promise promise) {
        if (str != null) {
            try {
                Intercom.client().displayMessageComposer(str);
            } catch (Exception e10) {
                Log.e(NAME, "presentMessageComposer error:");
                Log.e(NAME, e10.toString());
                promise.reject(IntercomErrorCodes.DISPLAY_MESSENGER_COMPOSER, e10.toString());
                return;
            }
        } else {
            Intercom.client().displayMessageComposer();
        }
        Log.d(NAME, "presentMessageComposer");
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void searchHelpCenter(String str, final Promise promise) {
        if (str.equals("")) {
            promise.reject(IntercomErrorCodes.SEARCH_HELP_CENTER, "searchTerm can't be empty");
            return;
        }
        try {
            AnonymousClass6 r12 = new SearchRequestCallback() {
                public void onComplete(List<HelpCenterArticleSearchResult> list) {
                    promise.resolve(IntercomHelpCenterHelpers.parseHelpCenterArticleSearchToReadableArray(list));
                }

                public void onError(int i10) {
                    Log.e(IntercomModule.NAME, "searchHelpCenter error");
                    promise.reject(String.valueOf(i10), "searchHelpCenter error");
                }

                public void onFailure() {
                    Log.e(IntercomModule.NAME, "searchHelpCenter failure");
                    promise.reject(IntercomErrorCodes.SEARCH_HELP_CENTER, "searchHelpCenter failure");
                }
            };
            Log.d(NAME, "searchHelpCenter");
            Intercom.client().searchHelpCenter(str, r12);
        } catch (Exception e10) {
            Log.e(NAME, "searchHelpCenter error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.SEARCH_HELP_CENTER, e10.toString());
        }
    }

    @ReactMethod
    public void setBottomPadding(int i10, Promise promise) {
        try {
            Intercom.client().setBottomPadding(i10);
            Log.d(NAME, "setBottomPadding");
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            Log.e(NAME, "setBottomPadding error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.SET_BOTTOM_PADDING, e10.toString());
        }
    }

    @ReactMethod
    public void setInAppMessageVisibility(String str, Promise promise) {
        try {
            Intercom.client().setInAppMessageVisibility(IntercomHelpers.stringToVisibility(str));
            Log.d(NAME, "setInAppMessageVisibility");
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            Log.e(NAME, "setInAppMessageVisibility error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.SET_IN_APP_MESSAGE_VISIBILITY, e10.toString());
        }
    }

    @ReactMethod
    public void setLauncherVisibility(String str, Promise promise) {
        try {
            Intercom.client().setLauncherVisibility(IntercomHelpers.stringToVisibility(str));
            Log.d(NAME, "setInAppMessageVisibility");
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            Log.e(NAME, "setInAppMessageVisibility error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.SET_LAUNCHER_VISIBILITY, e10.toString());
        }
    }

    @ReactMethod
    public void setLogLevel(String str, Promise promise) {
        try {
            Intercom.setLogLevel(IntercomHelpers.stringToLogLevel(str));
            Log.d(NAME, "setLogLevel");
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            Log.e(NAME, "setLogLevel error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.SET_LOG_LEVEL, e10.toString());
        }
    }

    @ReactMethod
    public void setUserHash(String str, Promise promise) {
        try {
            Intercom.client().setUserHash(str);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            Log.e(NAME, "setUserHash error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.SET_USER_HASH, e10.toString());
        }
    }

    @ReactMethod
    public void setUserJwt(String str, Promise promise) {
        try {
            Intercom.client().setUserJwt(str);
            Log.d(NAME, "Setting JWT");
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            Log.e(NAME, "Error Setting JWT:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.SET_USER_JWT, e10.toString());
        }
    }

    @ReactMethod
    public void updateUser(ReadableMap readableMap, final Promise promise) {
        Intercom.client().updateUser(IntercomHelpers.buildUserAttributes(readableMap), new IntercomStatusCallback() {
            public void onFailure(IntercomError intercomError) {
                Log.e("ERROR", intercomError.getErrorMessage());
                promise.reject(String.valueOf(intercomError.getErrorCode()), intercomError.getErrorMessage());
            }

            public void onSuccess() {
                promise.resolve(Boolean.TRUE);
            }
        });
    }

    @ReactMethod
    public void sendTokenToIntercom(String str, Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                intercomPushClient.sendTokenToIntercom(currentActivity.getApplication(), str);
                Log.d(NAME, "sendTokenToIntercom");
                promise.resolve(Boolean.TRUE);
                return;
            }
            Log.e(NAME, "sendTokenToIntercom");
            Log.e(NAME, "no current activity");
        } catch (Exception e10) {
            Log.e(NAME, "sendTokenToIntercom error:");
            Log.e(NAME, e10.toString());
            promise.reject(IntercomErrorCodes.SEND_TOKEN_TO_INTERCOM, e10.toString());
        }
    }
}
