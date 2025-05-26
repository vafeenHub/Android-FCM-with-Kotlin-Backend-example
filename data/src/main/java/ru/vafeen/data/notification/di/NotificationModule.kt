package ru.vafeen.data.notification.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import ru.vafeen.data.notification.NotificationBuilderImpl
import ru.vafeen.data.notification.NotificationServiceImpl
import ru.vafeen.domain.notificaion.NotificationBuilder
import ru.vafeen.domain.notificaion.NotificationService

@Module
@InstallIn(ServiceComponent::class)
internal class NotificationModule {
    @Provides
    fun provideNotificationBuilder(impl: NotificationBuilderImpl): NotificationBuilder = impl

    @Provides
    fun providesNotificationService(impl: NotificationServiceImpl): NotificationService = impl

}