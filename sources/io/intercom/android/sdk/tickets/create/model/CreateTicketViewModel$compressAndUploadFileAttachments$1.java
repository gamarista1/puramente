package io.intercom.android.sdk.tickets.create.model;

import Ug.C5600w0;
import Ug.G;
import Ug.K;
import Ug.M;
import androidx.lifecycle.b0;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1", f = "CreateTicketViewModel.kt", l = {}, m = "invokeSuspend")
final class CreateTicketViewModel$compressAndUploadFileAttachments$1 extends l implements p {
    final /* synthetic */ List<Answer.MediaAnswer.MediaItem> $mediaItems;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1", f = "CreateTicketViewModel.kt", l = {358, 378}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass1(arrayList2, createTicketViewModel, dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ce A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0101  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r14.label
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L_0x003f
                if (r1 == r2) goto L_0x002c
                if (r1 != r3) goto L_0x0024
                java.lang.Object r1 = r14.L$3
                io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r1 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r1
                java.lang.Object r5 = r14.L$2
                io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem r5 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.MediaItem) r5
                java.lang.Object r6 = r14.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r14.L$0
                io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel r7 = (io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel) r7
                lf.w.b(r15)
                goto L_0x00cf
            L_0x0024:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x002c:
                java.lang.Object r1 = r14.L$2
                io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem r1 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.MediaItem) r1
                java.lang.Object r5 = r14.L$1
                java.util.Iterator r5 = (java.util.Iterator) r5
                java.lang.Object r6 = r14.L$0
                io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel r6 = (io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel) r6
                lf.w.b(r15)
                r7 = r6
                r6 = r5
                r5 = r1
                goto L_0x0075
            L_0x003f:
                lf.w.b(r15)
                java.util.List<io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem> r15 = r8
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel r1 = r0
                java.util.Iterator r15 = r15.iterator()
            L_0x004c:
                boolean r5 = r15.hasNext()
                if (r5 == 0) goto L_0x0124
                java.lang.Object r5 = r15.next()
                io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem r5 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.MediaItem) r5
                io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r6 = r5.getData()
                android.content.Context r7 = r1.applicationContext
                r14.L$0 = r1
                r14.L$1 = r15
                r14.L$2 = r5
                r14.L$3 = r4
                r14.label = r2
                java.lang.Object r6 = io.intercom.android.sdk.m5.utils.MediaCompressionKt.getCompressedMediaData(r6, r7, r14)
                if (r6 != r0) goto L_0x0071
                return r0
            L_0x0071:
                r7 = r1
                r13 = r6
                r6 = r15
                r15 = r13
            L_0x0075:
                r1 = r15
                io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r1 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r1
                boolean r15 = r7.isFileSizeExceeded(r1)
                if (r15 == 0) goto L_0x00ba
                io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Error r15 = new io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Error
                io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadError$FileTooLarge r1 = new io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadError$FileTooLarge
                io.intercom.android.sdk.ui.common.StringProvider$StringRes r8 = new io.intercom.android.sdk.ui.common.StringProvider$StringRes
                int r9 = io.intercom.android.sdk.R.string.intercom_upload_failed
                r8.<init>(r9, r4, r3, r4)
                io.intercom.android.sdk.ui.common.StringProvider$StringRes r9 = new io.intercom.android.sdk.ui.common.StringProvider$StringRes
                int r10 = io.intercom.android.sdk.R.string.intercom_upload_max_files_size
                io.intercom.android.sdk.identity.AppConfig r11 = r7.config
                io.intercom.android.sdk.models.AttachmentSettings r11 = r11.getAttachmentSettings()
                java.lang.String r11 = r11.getUploadSizeLimitMB()
                java.lang.String r12 = "limit"
                kotlin.Pair r11 = lf.C6502A.a(r12, r11)
                java.util.List r11 = mf.C6565s.e(r11)
                r9.<init>(r10, r11)
                io.intercom.android.sdk.ui.common.StringProvider$StringRes[] r8 = new io.intercom.android.sdk.ui.common.StringProvider.StringRes[]{r8, r9}
                java.util.List r8 = mf.C6565s.q(r8)
                r1.<init>(r8)
                r15.<init>(r1)
                r5.setUploadStatus(r15)
            L_0x00b7:
                r15 = r6
                r1 = r7
                goto L_0x004c
            L_0x00ba:
                io.intercom.android.sdk.tickets.create.data.TicketRepository r15 = r7.ticketRepository
                r14.L$0 = r7
                r14.L$1 = r6
                r14.L$2 = r5
                r14.L$3 = r1
                r14.label = r3
                java.lang.Object r15 = r15.uploadFile(r1, r14)
                if (r15 != r0) goto L_0x00cf
                return r0
            L_0x00cf:
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r15 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r15
                boolean r8 = r15 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
                if (r8 != 0) goto L_0x0101
                boolean r8 = r15 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
                if (r8 != 0) goto L_0x0101
                boolean r8 = r15 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
                if (r8 == 0) goto L_0x00de
                goto L_0x0101
            L_0x00de:
                boolean r8 = r15 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
                if (r8 == 0) goto L_0x00fb
                io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Success r8 = new io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Success
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r15 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r15
                java.lang.Object r15 = r15.getBody()
                io.intercom.android.sdk.models.Upload$Builder r15 = (io.intercom.android.sdk.models.Upload.Builder) r15
                io.intercom.android.sdk.models.Upload r15 = r15.build()
                int r15 = r15.getId()
                r8.<init>(r15)
                r5.setUploadStatus(r8)
                goto L_0x0119
            L_0x00fb:
                lf.s r15 = new lf.s
                r15.<init>()
                throw r15
            L_0x0101:
                io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Error r15 = new io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Error
                io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadError$UploadFailed r8 = new io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadError$UploadFailed
                io.intercom.android.sdk.ui.common.StringProvider$StringRes r9 = new io.intercom.android.sdk.ui.common.StringProvider$StringRes
                int r10 = io.intercom.android.sdk.R.string.intercom_upload_failed
                r9.<init>(r10, r4, r3, r4)
                java.util.List r9 = mf.C6565s.e(r9)
                r8.<init>(r9)
                r15.<init>(r8)
                r5.setUploadStatus(r15)
            L_0x0119:
                r7.updateCtaState()
                android.net.Uri r15 = r1.getUri()
                io.intercom.android.sdk.m5.utils.MediaCompressionKt.deleteCompressedMedia(r15)
                goto L_0x00b7
            L_0x0124:
                lf.M r15 = lf.C6514M.f71813a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$compressAndUploadFileAttachments$1(List<Answer.MediaAnswer.MediaItem> list, CreateTicketViewModel createTicketViewModel, C6658d<? super CreateTicketViewModel$compressAndUploadFileAttachments$1> dVar) {
        super(2, dVar);
        this.$mediaItems = list;
        this.this$0 = createTicketViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new CreateTicketViewModel$compressAndUploadFileAttachments$1(this.$mediaItems, this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((CreateTicketViewModel$compressAndUploadFileAttachments$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            ArrayList<Answer.MediaAnswer.MediaItem> arrayList = new ArrayList<>();
            for (Object next : this.$mediaItems) {
                if (C6496s.c(((Answer.MediaAnswer.MediaItem) next).getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE)) {
                    arrayList.add(next);
                }
            }
            final ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
            for (Answer.MediaAnswer.MediaItem mediaItem : arrayList) {
                mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE);
                arrayList2.add(mediaItem);
            }
            K a10 = b0.a(this.this$0);
            G access$getDispatcher$p = this.this$0.dispatcher;
            final CreateTicketViewModel createTicketViewModel = this.this$0;
            C5600w0 unused = C5576k.d(a10, access$getDispatcher$p, (M) null, new AnonymousClass1((C6658d<? super AnonymousClass1>) null), 2, (Object) null);
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
