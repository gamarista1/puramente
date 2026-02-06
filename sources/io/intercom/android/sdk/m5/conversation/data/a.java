package io.intercom.android.sdk.m5.conversation.data;

import Ug.K;
import io.intercom.android.nexus.NexusClient;
import yf.C6787a;

public final /* synthetic */ class a implements C6787a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NexusClient f68920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConversationRepository f68921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ K f68922c;

    public /* synthetic */ a(NexusClient nexusClient, ConversationRepository conversationRepository, K k10) {
        this.f68920a = nexusClient;
        this.f68921b = conversationRepository;
        this.f68922c = k10;
    }

    public final Object invoke() {
        return ConversationRepository.nexusEventsRepository_delegate$lambda$0(this.f68920a, this.f68921b, this.f68922c);
    }
}
