package com.github.emiliero.twitchpeek

import com.github.emiliero.twitchpeek.authentication.login
import com.github.emiliero.twitchpeek.handler.commands

import discord4j.core.DiscordClient
import discord4j.core.DiscordClientBuilder


fun main(args: Array<String>) {
    val client: DiscordClient = DiscordClientBuilder(BuildConfig.TOKEN_KEY).build()

    login(client)
    commands(client)

    client.login().block()
}
