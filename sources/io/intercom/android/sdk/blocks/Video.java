package io.intercom.android.sdk.blocks;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import rh.C6708e;
import rh.C6709f;
import rh.E;

class Video implements VideoBlock {
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;
    /* access modifiers changed from: private */
    public final Twig twig = LumberMill.getLogger();

    /* renamed from: io.intercom.android.sdk.blocks.Video$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.intercom.android.sdk.blocks.lib.VideoProvider[] r0 = io.intercom.android.sdk.blocks.lib.VideoProvider.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider = r0
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.WISTIA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider     // Catch:{ NoSuchFieldError -> 0x001d }
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.YOUTUBE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.VIMEO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.LOOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.Video.AnonymousClass5.<clinit>():void");
        }
    }

    Video(StyleType styleType, Api api2, Provider<AppConfig> provider) {
        this.style = styleType;
        this.api = api2;
        this.appConfigProvider = provider;
    }

    private void addClickListenerOnThumbnailView(final ImageView imageView, final String str) {
        if (this.style != StyleType.CHAT_FULL) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    IntentUtils.safelyOpenIntent(imageView.getContext(), intent);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getThumbnailUrlFromOembedResponse(rh.E r7) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001f, IOException -> 0x001d }
            rh.F r2 = r7.a()     // Catch:{ JSONException -> 0x001f, IOException -> 0x001d }
            java.lang.String r2 = r2.E()     // Catch:{ JSONException -> 0x001f, IOException -> 0x001d }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x001f, IOException -> 0x001d }
            rh.F r7 = r7.a()
            r7.close()
            r0 = r1
            goto L_0x0049
        L_0x001b:
            r0 = move-exception
            goto L_0x005d
        L_0x001d:
            r1 = move-exception
            goto L_0x0021
        L_0x001f:
            r1 = move-exception
            goto L_0x0045
        L_0x0021:
            com.intercom.twig.Twig r2 = r6.twig     // Catch:{ all -> 0x001b }
            java.lang.String r3 = "ErrorObject"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x001b }
            r4.<init>()     // Catch:{ all -> 0x001b }
            java.lang.String r5 = "Couldn't read response body: "
            r4.append(r5)     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x001b }
            r4.append(r1)     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x001b }
            r2.internal(r3, r1)     // Catch:{ all -> 0x001b }
        L_0x003d:
            rh.F r7 = r7.a()
            r7.close()
            goto L_0x0049
        L_0x0045:
            r1.printStackTrace()     // Catch:{ all -> 0x001b }
            goto L_0x003d
        L_0x0049:
            java.lang.String r7 = "thumbnail_url"
            java.lang.String r7 = r0.optString(r7)
            java.lang.String r0 = "?image_crop_resized"
            int r0 = r7.indexOf(r0)
            if (r0 <= 0) goto L_0x005c
            r1 = 0
            java.lang.String r7 = r7.substring(r1, r0)
        L_0x005c:
            return r7
        L_0x005d:
            rh.F r7 = r7.a()
            r7.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.Video.getThumbnailUrlFromOembedResponse(rh.E):java.lang.String");
    }

    public View addVideo(String str, VideoProvider videoProvider, String str2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        WebView webView = new WebView(viewGroup.getContext());
        BlockUtils.createLayoutParams(webView, -1, 480);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(VideoUrlUtilKt.getEmbedUrl(videoProvider, str2));
        return webView;
    }

    /* access modifiers changed from: package-private */
    public void createThumbnail(VideoPreviewView videoPreviewView, String str, String str2) {
        videoPreviewView.displayThumbnail(str2);
        addClickListenerOnThumbnailView(videoPreviewView.getThumbnailImageView(), str);
    }

    /* access modifiers changed from: package-private */
    public void fetchThumbnail(VideoProvider videoProvider, final String str, final VideoPreviewView videoPreviewView) {
        final ImageView thumbnailImageView = videoPreviewView.getThumbnailImageView();
        int i10 = AnonymousClass5.$SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[videoProvider.ordinal()];
        if (i10 == 1) {
            this.api.getVideo("https://fast.wistia.com/oembed?url=https://home.wistia.com/medias/" + str, new C6709f() {
                public void onFailure(C6708e eVar, IOException iOException) {
                    videoPreviewView.showFailedImage();
                }

                public void onResponse(C6708e eVar, E e10) {
                    if (e10.m0()) {
                        final String str = "https://fast.wistia.net/embed/iframe/" + str;
                        final String access$000 = Video.this.getThumbnailUrlFromOembedResponse(e10);
                        thumbnailImageView.post(new Runnable() {
                            public void run() {
                                AnonymousClass1 r02 = AnonymousClass1.this;
                                Video.this.createThumbnail(videoPreviewView, str, access$000);
                            }
                        });
                        return;
                    }
                    videoPreviewView.showFailedImage();
                }
            });
        } else if (i10 == 2) {
            createThumbnail(videoPreviewView, "https://www.youtube.com/watch?v=" + str, "https://img.youtube.com/vi/" + str + "/default.jpg");
        } else if (i10 == 3) {
            this.api.getVideo("https://vimeo.com/api/v2/video/" + str + ".json", new C6709f() {
                /* access modifiers changed from: private */
                public /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
                    Video video = Video.this;
                    video.createThumbnail(videoPreviewView, "https://player.vimeo.com/video/" + str, str2);
                }

                public void onFailure(C6708e eVar, IOException iOException) {
                    videoPreviewView.showFailedImage();
                }

                public void onResponse(C6708e eVar, E e10) {
                    if (e10.m0() && e10.a() != null) {
                        try {
                            thumbnailImageView.post(new b(this, videoPreviewView, str, new JSONArray(e10.a().E()).getJSONObject(0).getString("thumbnail_large")));
                        } catch (JSONException e11) {
                            e11.printStackTrace();
                        } catch (IOException e12) {
                            Twig access$100 = Video.this.twig;
                            access$100.internal("ErrorObject", "Couldn't read response body: " + e12.getMessage());
                        } catch (Throwable th2) {
                            e10.a().close();
                            throw th2;
                        }
                        e10.a().close();
                    }
                }
            });
        } else if (i10 == 4) {
            this.api.getVideo("https://www.useloom.com/v1/oembed?url=https://www.useloom.com/embed/" + str, new C6709f() {
                /* access modifiers changed from: private */
                public /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
                    Video.this.createThumbnail(videoPreviewView, str, str2);
                }

                public void onFailure(C6708e eVar, IOException iOException) {
                    videoPreviewView.showFailedImage();
                }

                public void onResponse(C6708e eVar, E e10) {
                    if (e10.m0()) {
                        thumbnailImageView.post(new c(this, videoPreviewView, "https://www.useloom.com/embed/" + str, Video.this.getThumbnailUrlFromOembedResponse(e10)));
                        return;
                    }
                    videoPreviewView.showFailedImage();
                }
            });
        }
    }
}
